import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    //Khởi tạo mảng lúc bắt đầu chương trình
    ArrayList<String> arrStudentName = new ArrayList<>();

    //Khai báo hàm thêm phần tử vào mảng
    public void addStudentName(String studentName){
        //Gọi ra phương thức add để add phần tử vào mảng với parameter truyền vào
        arrStudentName.add(studentName);
    }

    //Khai báo hàm in ra tất cả các phần tử trong mảng
    public void showStudentName(){
        //Kiểm tra nếu mảng chưa có phần tử nào được thêm vào
        if(arrStudentName.size() == 0){
            System.out.println("Please add student before show");
        }else {
            System.out.println("List all student name");
            //Khai báo vòng lặp, duyệt từ 0 tới vị trí cuối cùng trong mảng
            for (int i = 0; i < arrStudentName.size() ; i++) {
                int count = i + 1;
                //In ra phần tử trong mảng
                System.out.println(count +": " + arrStudentName.get(i));
            }
        }

    }

    //Khai báo hàm xóa phần tử trong mảng
    public void deleteStudentName(String studentName){
        if (arrStudentName.size() == 0 ){
            System.out.println("Please add student before delete");
        }else {
            //Khai báo biến điều kiện
            boolean condition = false;
            //Duyệt tất cả các phần tử trong mảng
            for (int i = 0; i < arrStudentName.size() ; i++) {
                //Nếu phần tử trong mảng trùng với tham số truyền vào, sẽ chạy vào bên trong if
                if(arrStudentName.get(i).equals(studentName)){
                    //Xóa một phần tử trong mảng
                    arrStudentName.remove(arrStudentName.get(i));
                    //Thay đổi giá trị của biến điều kiện
                    condition = true;
                }
            }
            //Nếu sau khi duyệt tất cả các phần tử trong mảng, tham số truyền vào không giống với bất kỳ
            //phần tử nào trong mảng, thì biến điều kiện "condition" sẽ không được thay đổi giá trị
            if(condition == false){
                //Không tìm được phần tử trong mảng giống với tham số truyền vào
                System.out.println("Cannot find student : " + studentName );
            }else{
                //Tìm được và xóa thành công, và đã sửa đổi giá trị của biến điều kiện "condition"
                System.out.println("Delete student : " + studentName + " success");
            }
        }
    }

    //Phương thức get, trả ra thuộc tính ArrayList<String> của mảng
    public ArrayList<String> getArrStudentName() {
        return arrStudentName;
    }

    //Phương thức set, gán giá trị cho thuộc tính ArrayList<String> của mảng, truyền vào 1 ArrayList<String> khác
    public void setArrStudentName(ArrayList<String> arrStudentName) {
        this.arrStudentName = arrStudentName;
    }
}

class TestStudent{
    public static void main(String[] args){
        //Khởi tạo đối tượng Scanner, dùng cho nhập dữ liệu từ màn hình console
        Scanner s = new Scanner(System.in);
        //Khởi tạo đối tượng Student bên trên, để sử dụng các phương thức của đối tượng
        Student a = new Student();
        //Khai báo biến điều kiện, sử dụng cho vòng lặp while để ứng dụng có thể chạy nhiều lần
        boolean condition = true;
        //Khai báo vòng lặp
        while (condition == true){
            System.out.println("+++++++++Student Management v1.0+++++++++");
            System.out.println("Please input your select:");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit Application");
            System.out.println("You select : ");
            //Scan ký tự được nhập vào từ user
            String select = s.nextLine();
            //Sử dụng switch-case, truyền vào tham số vừa được nhập vào từ user
            switch (select){
                case "1":
                    System.out.println("Input Student Name : ");
                    //Scan ký tự được nhập vào từ user
                    String studentName = s.nextLine();
                    //Gọi đến phương thức addStudentName() trong class Student
                    a.addStudentName(studentName);
                    break;
                case "2":
                    //Gọi đến phương thức showStudentName() trong class Student
                    a.showStudentName();
                    break;
                case "3":
                    //Gọi đến thuộc tính mảng ở bên trong class Student, cách này không được reccomend, nên sử dụng
                    // thông qua getter / setter của mảng, mọi thuộc tính nên khai báo theo phạm vi truy cập : private
                    //Kiểm tra xem kích thước của mảng
                    if(a.arrStudentName.size() == 0){
                        System.out.println("Please add student before delete");
                        break;
                    }else {
                        System.out.println("Input student name to delete: ");
                        //Scan ký tự được nhập vào từ user
                        String deleteStudentName = s.nextLine();
                        //Gọi đến phương thức deleteStudentName() trong class Student
                        a.deleteStudentName(deleteStudentName);
                        break;
                    }
                case "4":
                    //Thay đổi giá trị biến điều kiện, để phá vỡ vòng lặp và kết thúc chương trình
                    condition = false;
                    System.out.println("Bye Bye :D");
            }
        }
    }
}

