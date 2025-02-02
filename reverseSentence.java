
class reverseSentence {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] word=s.trim().split("\\s+");
        for (int i=word.length-1;i>=0;i--){
            builder.append(word[i]);
            if(i!=0){
                builder.append(" ");
            }
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        reverseSentence ob = new reverseSentence();
        String s =ob.reverseWords("  h  ");
        System.out.println(s);
    }
}