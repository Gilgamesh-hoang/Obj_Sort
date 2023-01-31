import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("123CAC", "Nguyen A", "2000",7.3,7.8,9.4);
        Student s2 = new Student("849FEV", "Nguyen B", "2000",5.6,4.6,7);
        Student s3 = new Student("849EFV", "Nguyen Phi", "2000",7.1,5.3,1);
        Student s4 = new Student("123CAB", "Hoang Phi", "2000",4.0,1.6,7);
        Student s5 = new Student("751VSD", "Bui Van Nam", "2000",7.3,7.8,4.7);
        Student s6 = new Student("831ZCA", "Nguyen Han", "2000",4.7,8.9,9);
        Student s7 = new Student("164RGR", "Dao Duy Hung", "2000",5.9,8.4,7);
        Student s8 = new Student("820KTN", "Phung Khai", "2000",8.4,1.5,7.2);
        Student s9 = new Student("730EAD", "Vu Thi Anh Nguyet", "2000",7.3,7.7,9.8);

        Student[] arrStudent = {s1,s2,s3,s4,s5,s6,s7,s8,s9};

        Class_Room room = new Class_Room("3", "room", arrStudent);

        /*Sap xep SelectionSort theo diem trung binh
        System.out.println("Truoc khi sap xep");
        System.out.println(room.toString());
        System.out.println("sau khi sap xep");
        System.out.println(Arrays.toString(room.getArrayStudent_Sort_SelectionSort_ByDTB()));
        */

        /*sap xep BubbleSort theo IdStudent
        System.out.println("Truoc khi sap xep");
        System.out.println(room.toString());
        System.out.println("sau khi sap xep");
        System.out.println(Arrays.toString(room.getArrayStudent_Sort_BubbleSort_ByIdStudent()));
        */

        /*sap xep InsertSort theo NameStudent
        System.out.println("Truoc khi sap xep");
        System.out.println(room.toString());
        System.out.println("sau khi sap xep");
        System.out.println(Arrays.toString(room.getArrayStudent_Sort_InsertSort_ByNameStudent()));
        */

        /*sap xep quickSort theo math
        System.out.println("Truoc khi sap xep");
        System.out.println(room.toString());
        System.out.println("sau khi sap xep");
        System.out.println(Arrays.toString(room.getArrayStudent_QuickSort_ByMath()));
        */

        /*sap xep mergeSort theo physic
        System.out.println("Truoc khi sap xep");
        System.out.println(room.toString());
        System.out.println("sau khi sap xep");
        System.out.println(Arrays.toString(room.getArrayStudent_MergeSort_ByPhysic()));
        */
    }

}
