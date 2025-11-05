class Solution {
    public boolean isPalindrome(int x) {

     String number = Integer.toString(x);
        StringBuilder str = new StringBuilder(number);
     return number.equals(str.reverse().toString());  

    }
}