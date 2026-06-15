public class Palindrome {
    static int countDigit(int n){
             int count=0;
        while(n!=0){
            count ++;
            n/=10;
        }
        return count;
    }
 
    public static void main(String[] args) {
        int n=1221;
        int rev=0;
        int count = countDigit(n);
        int temp=n;
        while(n>0){
           int digit=n%10;
           rev*=10+(int)Math.pow(digit,count);
           n/=10;
        }
        if(temp==n){
            System.out.println(temp + " is Palindrome");
        }else{
            System.out.println(temp + " is not a palindrome");
        }
    }
}
    

