public class _1672_Richest_Customer_Wealth {

    public static int maximumWealth(int[][] a) {

        int soKhachhang = a.length;
        int soNganhang = a[0].length;
        int[] tongTaiSan = new int[soKhachhang];
        for (int i = 0; i < soKhachhang; i++) {
            int tinhTongHangI = 0;
            for (int j = 0; j < soNganhang; j++) {
                tinhTongHangI +=a[i][j];
            }
            tongTaiSan[i] = tinhTongHangI;
        }
        int max = 0; //max phải đc gắn giá trị nhỏ nhất
        for (int i = 0; i < soKhachhang; i++) {
            // System.out.println("Tong tai san cua khách hang " + i + " : "+ tongTaiSan[i] );
            if(tongTaiSan[i] > max){
                max = tongTaiSan[i];   
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[][] a = { {1,2,3} , {3,2,1} };
        int[][] b = { {1,5},{7,3},{3,5} };
        System.out.println(maximumWealth(b));
        // maximumWealth(b);
        // int[][] b = new int[2][3];

        // int soHang = a.length; //2
        // int soCot =  a[0].length; //3
        // System.out.println("Số hang:"+soHang);
        // System.out.println("Số cot:"+soCot);

        // for (int i = 0; i < soHang; i++) {
        //     for (int j = 0; j < soCot; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }

    }

}
