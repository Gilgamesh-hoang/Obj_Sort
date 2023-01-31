import java.util.Arrays;

public class Class_Room {
    private String id;
    private String name;
    private Student[] arrStudent;

    public Class_Room(String id, String name, Student[] arrStudent) {
        this.id = id;
        this.name = name;
        this.arrStudent = arrStudent;
    }
    public void swap(Student[] arr, int i, int j) {
        Student temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public Student[] getArrayStudent_Sort_SelectionSort_ByDTB() {
        Student[] arr = this.arrStudent;
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex].getDTB() > arr[j].getDTB())
                    minIndex =j;
            }
            swap(arr, i, minIndex);
        }

        return arr;
    }

    public Student[] getArrayStudent_Sort_BubbleSort_ByIdStudent() {
        Student[] arr = this.arrStudent;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j].getId().compareTo(arr[j+1].getId()) > 0)
                    swap(arr, j, j+1);
            }
        }

        return arr;
    }

    public Student[] getArrayStudent_Sort_InsertSort_ByNameStudent() {
        Student[] arr = this.arrStudent;
        int n = arr.length;
        for (int k = 1; k < n; k++) {
            Student temp = arr[k];
            int j=k;
            while (j>0 && (arr[j-1].getFirstNameStd().compareTo(temp.getFirstNameStd()) > 0)) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
    public Student[] getArrayStudent_QuickSort_ByMath() {
        Student[] arr = this.arrStudent;
        quickSort(arr, 0, arr.length-1);
        return arr;
    }
    public void quickSort(Student[] arr, int l , int r) {
        Student p = arr[(l+r)/2]; // lay ra phan tu o giua
        int i =l;
        int j=r;
        while (i<j) {
            while (arr[i].getMath() < p.getMath()) i++; // neu phan tu ben trai cua p be hon p thi tang i
            while (arr[j].getMath() > p.getMath()) j--;// neu phan tu ben phai cua p lop hon p thi giam j
            if(i<=j) {
                swap(arr, i , j);
                i++;j--;
            }
        }
        if(i<r)
            quickSort(arr, i ,r);
        if(l<j)
            quickSort(arr, l ,j);
    }

    public Student[] getArrayStudent_MergeSort_ByPhysic() {
        Student[] result = mergeSort(this.arrStudent, 0, this.arrStudent.length-1);
        return result;
    }

    //method nay dung de chia doi arr thanh 2 phan cho den khi mang chi con 1 phan tu
    // sau khi chia mang xong thi se gop arr lai dong thoi sap xep cac phan tu
    public Student[] mergeSort(Student[] arr, int l, int r) {
        if(l==r) {
            Student[] singleElement = {arr[l]};
            return singleElement;
        }
        int mid = (l+r)/2;
        Student[] arr1 = mergeSort(arr,l,mid);
        Student[] arr2 = mergeSort(arr,mid+1, r);
        return merge(arr1, arr2);
    }

    // method nay dung de gop 2 arr
    public Student[] merge(Student[] arr1, Student[] arr2) {
        int n = arr1.length + arr2.length;
        Student[] result = new Student[n];
        int i = 0, i1 =0, i2 =0;
        while (i<n) {
            if(i1 < arr1.length && i2 < arr2.length) {
                if(arr1[i1].getPhysic() < arr2[i2].getPhysic())
                    result[i++] = arr1[i1++];
                else result[i++] = arr2[i2++];
            }else {
                if(i1 < arr1.length)
                    result[i++] = arr1[i1++];
                else if(i2 < arr2.length)
                    result[i++] = arr2[i2++];
            }
        }
        return result;

    }

    @Override
    public String toString() {
        return "{" + id + '\'' + name + '\''  + Arrays.toString(arrStudent) +
                '}';
    }
}
