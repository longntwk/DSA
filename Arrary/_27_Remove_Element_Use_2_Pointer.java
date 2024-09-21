public class _27_Remove_Element_Use_2_Pointer {
    public static int removeElement(int[] a, int x) {
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != x){
                a[k] = a[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 4};
        int newLength = removeElement(a, 2);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nDone");
    }
}
