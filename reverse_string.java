public class reverse_string {
    public static void main(String[] args) {
        String str="i am  sank sanket  ";
        String ans="";
        StringBuilder gtr=new StringBuilder(" ");
         for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                gtr.append(ch);

            }
            else{
                gtr.reverse();
                ans=ans+gtr;
                ans=ans+" ";
                gtr=new StringBuilder();

            }
             }
             System.out.println(gtr);
    }
    
}
 





