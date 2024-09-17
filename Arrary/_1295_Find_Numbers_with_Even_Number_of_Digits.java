public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int bienDem = 0;
        for(int a: nums){
             // kiểm tra chữ số chữ số của  
             // Nếu số chữ số là chữ số chẵn => tăng biến đếm lên 1
            int soLuongChoSo = tinhSoChuSo(a);
            if(soLuongChoSo % 2 == 0){
                bienDem ++;
            }
        }
        return bienDem;
    }
    private static int tinhSoChuSo(int a) {
        int biendem = 0;
        while(a != 0){ 
            a = a / 10;
            biendem++;
        }
        return biendem;
    }
    
    public static void main(String[] args) {
        int[] nums  = {1, 22, 33, 4444};
        System.out.println(findNumbers(nums));
    }

    
}
 