public class VarArgs_Demo {
    static int varArgs(int k, int ... a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(varArgs(2,3,4,5,6,7,8,9));

    }
}
