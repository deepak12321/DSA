class Solution {
    public String intToRoman(int num) {
        String ones[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String tens[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String hundred[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String thousand[] = { "", "M", "MM", "MMM" };

        String solution = "";
        int place = 0;
        while (num != 0) {
            int digit = num % 10;
            switch (place) {
                case 0:
                    solution = ones[digit] + solution;
                    break;
                case 1:
                    solution = tens[digit] + solution;
                    break;
                case 2:
                    solution = hundred[digit] + solution;
                    break;
                case 3:
                    solution = thousand[digit] + solution;
                    break;
            }
            num = num / 10;
            place++;
        }

        return solution;
    }
}