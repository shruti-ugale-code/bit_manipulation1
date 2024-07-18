public class to_check_no_is_power_of_2 {
    public static void main(String[] args) {
        int n=17;



        boolean ans=(n&(n-1))==0;
        System.out.println(ans);
    }
}
