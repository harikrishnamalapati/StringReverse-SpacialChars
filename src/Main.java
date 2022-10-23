public class Main {


    public static void main(String[] args) {

        String name = ",yvyc3207733%&^*(()";


        char[] nameArray = name.toCharArray();
        char[] nameReverse = new char[nameArray.length];
        int x = 0;

        for (int i = nameReverse.length - 1; i >= 0; i--) {
//            if (!(new String(nameReverse).(nameArray[i])))
            if ((Character.isLetter(nameArray[i]) || Character.isDigit(nameArray[i]))) {

                nameReverse[x] = nameArray[i];
                x++;
            }

        }
        int b=0;
        for (int i = 0; i < nameArray.length;i++) {

            if((Character.isLetter(nameArray[i]) || Character.isDigit(nameArray[i]))){

                nameArray[i] =nameReverse[b];
                b++;
            }
        }


        for (char c : nameArray) System.out.print(c);
    }

}
