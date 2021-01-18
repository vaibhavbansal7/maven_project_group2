public class StringFunctions {
    public  String reverse(String str){
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int itr=ch.length-1;itr>=0;itr--){
            sb.append(ch[itr]);
        }
        return sb.toString();
    }

    public  int sizeOfString(String str){
        int size=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            size++;
        }
        return size;
    }
}
