public class MultiTon {
    private static MultiTon instance = null;
    private static int created_instance_counter = 0;

    private MultiTon(){}

    public static MultiTon createMultiTonInstance(){
        if (created_instance_counter < 3){
            instance = new MultiTon();
            ++created_instance_counter;
        }
        return instance;
    }

    public static void printInstanceCounter(){
        System.out.println(created_instance_counter);
    }

}
