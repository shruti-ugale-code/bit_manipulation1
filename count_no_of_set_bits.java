public class count_no_of_set_bits {
    public static void main(String[] args) {
        int n=34;

        System.out.println(Integer.toBinaryString(n));
        System.out.println("setbit="+setbit(n));

    }
    public static int setbit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);


        }
        return count;
    }
}
