class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> strlist = new ArrayList<>();
        generate("", 0, 0, n, strlist);
        return strlist;
        
    }
    static void generate(String str, int open, int close, int n, List<String> list){
		if(close == n){
			list.add(str);
			return;
		}
		if(close<open){
			generate(str+')',open, close+1, n, list);
		} 
		if (open < n){
			generate(str+'(',open+1, close, n, list);
		}
	}
}