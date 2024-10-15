public class SampleString {


    public static void helloBoss(String s){
        // if(s == "Boss"){
            if(s.equals("Boss")){
            System.out.println("Xin chao Sep");
        }else{
            System.out.println("Xin chao");
        }
    }
    public static void main(String[] args) {
    
        String s = "Hello World! 1 2 3";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c) == true){   
                System.out.print(c+" "); 
            }
        }   

        char myChar = 'B';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 48 && c <= 57){
                System.out.print(c+" ");
            }
        }
        System.out.println("\n"+myChar+" có ma ascii la: "+ (int)myChar);

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println("s1 == s2: "+(s1 == s2)); 
        System.out.println("s2 == s3: "+(s2 == s3)); 
        System.out.println("s1 == s3: "+(s1 == s3)); 
        System.out.println("\ns1 equals s2: "+(s1.equals(s2))); 
        System.out.println("s2 equals s3: "+(s2.equals(s3))); 
        System.out.println("s1 equals s3: "+(s1.equals(s3))); 

        String k1 = "Boss";
        String k2 = new String("Boss");
        helloBoss(k1);
        helloBoss(k2);

    }
}
