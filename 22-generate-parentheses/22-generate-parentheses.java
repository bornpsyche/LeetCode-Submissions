class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> strlist = new ArrayList<>();
        generate("", n, n, strlist);
        return strlist;
        
    }
    static void generate(String str, int open, int close, List<String> list){
		if(close == 0){
			list.add(str);
			return;
		}
		if(close > open){
			generate(str+')',open, close-1, list);
		} 
		if (open > 0){
			generate(str+'(',open-1, close, list);
		}
	}
}