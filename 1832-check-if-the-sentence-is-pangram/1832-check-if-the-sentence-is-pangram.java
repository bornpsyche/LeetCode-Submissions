class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(int i = 0; i < sentence.length(); i++) {
            int x = sentence.charAt(i) - 'a';
            freq[x]++;
        }
        for(int a : freq) {
            if(a==0) return false;
        }
        return true;
    }
}