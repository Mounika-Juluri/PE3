public class RemoveVowels {
   public String checkVowels(String str){
       String combine="";

           String[] splitVowels=str.split("a|e|i|o|u");
           for (String b:splitVowels){
               combine=combine+b;
           }
           return combine;
    }
}
