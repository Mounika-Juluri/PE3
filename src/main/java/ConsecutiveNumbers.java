public class ConsecutiveNumbers {
    public String checkConsecutive(String str){
        String[] separateNumbers=str.split(",");
        int a =Integer.parseInt(separateNumbers[0]);
        String compare=a+","+(a+1)+","+(a+2)+","+(a+3)+","+(a+4)+","+(a+5)+","+(a+6);

        if (str.equals(compare)){
            return "Consecutive";
        }else{
            return "not consecutive";
        }

    }
}
