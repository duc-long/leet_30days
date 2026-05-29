class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){ //check length equal or not
            return false;
        }
        //HashMap save Char to compare with char convert from String
        HashMap<Character, Integer> map = new HashMap<>(); 
    //once loop to put key and value to map key is char, value is count exist of char
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i); //i=0 => c = 'a'
            map.put(c,map.getOrDefault(c,0)+1); // => put to map key: 'a' value: 0
        }
        //second loop to compare after that minus value of key if attribute in map equal char d in this time, minus after check key in map has value equal zero so that map is empty so can conclusion there are anagram.  
        for(int j=0;j<t.length();j++){ 
            char d = t.charAt(j);
            if(!map.containsKey(d)){
                return false;
            }
            map.put(d,map.get(d)-1);
            if(map.get(d)==0){
                map.remove(d);
            }
        }
        return map.isEmpty();
    }
}