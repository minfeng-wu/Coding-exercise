public class SecondProblem {
    public static String RotateCharacter(String str, Integer number){
        if(str == null || str.length() == 0 || number > str.length() || number < 0){
            System.out.print("Invalid input!");
        }
        char[] chr = str.toCharArray();
        char[] answer = new char[str.length()];
        int counter = 0;

        for(int i = str.length() - number; i < str.length(); i++){
            answer[counter++] = chr[i];
        }

        for(int i = 0; i < str.length() - number; i++){
            answer[counter++] = chr[i];
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args){
        String test = "MyString";
        System.out.print(RotateCharacter(test, 2));
    }
}
