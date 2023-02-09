package bit_vector;

public class BitVector {
    int[] words;
    final int wordSizeInBits = 32;
    int sizeInBits;

    public BitVector(int size){
        this.sizeInBits = size;
        this.words = new int[size / wordSizeInBits + 1];
    }

    public void set(int index) {
        if(index < 0)
            return;
        if(index >= sizeInBits)
            return;
        int indexContainingWordIndex = index / wordSizeInBits;
        words[indexContainingWordIndex] |= maskForSet(index - indexContainingWordIndex * wordSizeInBits);
    }

    public void reset(int index){
        if(index < 0)
            return;
        if(index >= sizeInBits)
            return;
        int indexContainingWordIndex = index / wordSizeInBits;
        words[indexContainingWordIndex] &= maskForReset(index - indexContainingWordIndex * wordSizeInBits);
    }

    public int get(int index){
        if(index < 0)
            return -1;
        if(index >= sizeInBits)
            return -1;
        int indexContainingWordIndex = index / wordSizeInBits;
        int mask = maskForSet(index - indexContainingWordIndex * wordSizeInBits);
        if((words[indexContainingWordIndex] & mask) != 0)
            return 1;
        else
            return 0;
    }

    public int maskForSet(int index){
        int mask = 1 << index;
        return mask;
    }
    public int maskForReset(int index){
        int mask = ~(1 << index);
        return mask;
    }

    public void printBits(){
        for (int i = sizeInBits - 1; i >= 0; i--){
            System.out.print(get(i));
        }
        System.out.println();
    }

}
