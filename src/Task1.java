public class Task1 {
    public static void shortNumbDividedSeven(){
        //Написать цикл, который перебирает все возможные числа типа short и выписывает в консоль только те, которые делятся на 7 без остатка.

        for (int i = Short.MIN_VALUE; i <= Short.MAX_VALUE;i++){
            if(i%7 ==0){
                System.out.print(i + " ");
            }
        }
    }

    public static void getWordWithMinLength(String str){
        String temp = str.replaceAll("[.,!?:;]","");
        String []res = temp.split(" ");
        int min= 10;
        for ( int i =0; i < res.length; i++){
            String tempWord = res[i];
            if(tempWord.length() < min){
                min = tempWord.length();
            }
        }
       StringBuffer sb = new StringBuffer();
        for (int i =0; i < res.length; i++) {
            if(res[i].length() == min){
                sb.append(res[i]+", ");


        }

        }
        sb.setLength(sb.length()-2);

        System.out.println(sb.toString());
    }

    public static void changeWordsOrder(String str){
        String temp = str.replaceAll("[.,!?:;]","");
        String []res = temp.split(" ");



        StringBuffer sb = new StringBuffer();
        for (int i =res.length-1; i >= 0; i--) {
            sb.append(res[i] + " ");


        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println("First task:");
        shortNumbDividedSeven();

        System.out.println("\n\n");
        System.out.println("Second task:");
        String str = "Get the latest BBC World News: international news, " +
                "features and analysis from Africa!";
        getWordWithMinLength(str);
        System.out.println("\n\n");
        System.out.println("Third task:");
        changeWordsOrder(str);


    }
}
