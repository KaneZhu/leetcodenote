public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int l = s.length();
        char ch[] = s.toCharArray();
        int pre = 4000;
        int total = 0;
        for (int x = 0; x<l; x++) {
            int n = roman.get(ch[x]);
            if (pre>=n){
                total += n;
            }else{
                total = total - 2*pre + n;
            }
            pre = n;
        }
        
        return total;
    }
}