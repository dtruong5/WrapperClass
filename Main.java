public class Main {
    public static void main(String[] args) {
        int a = 12;
        double b = 21.3;

        // converts Primitive Types into wrapper objects
        Integer aObject = Integer.valueOf(a);
        Double bObject = Double.valueOf(b);

        if(aObject instanceof Integer){
            System.out.println("An object type integer is created.");
        }
        if(bObject instanceof Double){
            System.out.println("An object type double is created.");
        }
    }
}
