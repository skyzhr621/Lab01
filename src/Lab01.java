public class Lab01 {
    public static void main(String[] args) {

        String[] name = {"Jack", "Jake", "Jason", "Tim", "Tom"};

        for (int i = 0; i < args.length; i++) {
            try {
                int n = Integer.parseInt(args[i]);
                if(n<=0 || n>5){
                    System.out.println("Error occur at" + " " + (i+1));
                    break;
                }
                for (int j = 0; j < n; j++) {
                    System.out.println("Hello, " + name[j] + "!");
                }
            } catch (Exception e) {
                System.out.println("Error occur at" + " " + (i+1));
                break;
            }


        }
    }

}
