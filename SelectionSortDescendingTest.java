import java.util.Arrays;

public class SelectionSortDescendingTest {
    Integer[] a;

    public SelectionSortDescendingTest(Integer[] a) {
        this.a = a;
    }

    public void selectionSort() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) { 
            int max_idx = i; 
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[max_idx]) {
                    max_idx = j;
                }
                System.out.println(
                    "i = " + i +
                    "; j = " + j +
                    "; cur_max = " + a[max_idx] + 
                    "; " + Arrays.deepToString(a)
                );
            }
            swap(i, max_idx);  
        }
    }

    private void swap(int i, int j) { 
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = {76,6,107,92,21,23,5,9,8,8143};
        SelectionSortDescendingTest  sorter = new SelectionSortDescendingTest(array);
        sorter.selectionSort();
        System.out.println("Sorted array: " + Arrays.deepToString(sorter.a));
    }
}