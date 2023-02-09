package bit_vector;

import java.util.HashMap;

/*
when creating bit_vector.BitVector user should be able to set size of it
newly created BV elements all should have 0 values
BV b(100)
b.set(42) receives index of element which we want to change from 0 to 1
b.reset(34) receives index of element which we want to change from 1 to 0 (if it's 1)
 */
public class BitVector32 {
    int data;

    public BitVector32(){
        data = 0;
    }

    public void set(int indexOfBitToSet){
        int mask = maskForSet(indexOfBitToSet);
        data |= mask;
    }

    public void reset(int indexOfBitToReset){
        int mask = maskForReset(indexOfBitToReset);
        data &= mask;
    }

    public int maskForSet(int index){
        int mask = 1 << index;
        return mask;
    }
    public int maskForReset(int index){
        int mask = ~(1 << index);
        return mask;
    }

//    public HashMap<Integer, Integer> maskForSet(){
//        HashMap<Integer, Integer> maskForSet = new HashMap<>();
//        for (int i = 0; i < 32; i++){
//            Integer key = i;
//            Integer value = 1 << i;
//            maskForSet.put(key, value);
//        }
//        return maskForSet;
//    }
//
//    public HashMap<Integer, Integer> maskForReset(){
//        HashMap<Integer, Integer> maskForReset = new HashMap<>();
//        for (int i = 0; i < 32; i++){
//            Integer key = i;
//            Integer value = ~(1<<i);
//            maskForReset.put(key, value);
//        }
//        return maskForReset;
//    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < 32; i++){
            char symbol = '0';
            if ((data & (1 << (31 - i))) != 0)
                symbol = '1';
            result.append(symbol);
        }
        return result.toString();
    }
}
