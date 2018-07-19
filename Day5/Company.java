import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Department> _myDepartments = new ArrayList<>();
        boolean condition = true;

        int _tempId;
        String _tempName;
        String _tempDes;
        String _tempStr;
        int _numberEmployee;
        int sizeDepartment;

        boolean isExistDepartment;
        //Khai báo vòng lặp
        while (condition == true) {
            System.out.println("------------------------------------------");
            System.out.println("+++++++++Employee Management v1.0+++++++++");
            System.out.println("Please input your select:");
            System.out.println("1. Add Department");
            System.out.println("2. Select Department");
            System.out.println("3. Remove Department");
            System.out.println("4. Exit!");
            System.out.println("You select : ");
            //Scan ký tự được nhập vào từ user
            String select = s.nextLine();
            //Sử dụng switch-case, truyền vào tham số vừa được nhập vào từ user
            switch (select) {
                case "1":
                    System.out.println("Input Id of New Department : ");
                    _tempStr = s.nextLine();
                    if (isNum(_tempStr)) {
                        _tempId = Integer.parseInt(_tempStr);
                        isExistDepartment = false;
                        for (Department _department : _myDepartments) {
                            if (_department.getId() == _tempId) {
                                isExistDepartment = true;
                                break;
                            }
                        }
                        if (isExistDepartment) {
                            System.out.println("ID Department " + _tempId + " is exist!");
                        } else {
                            System.out.println("Input Name of New Department : ");
                            _tempName = s.nextLine();
                            System.out.println("Input Description of New Department : ");
                            _tempDes = s.nextLine();
                            _myDepartments.add(new Department(_tempId, _tempName, _tempDes));
                            System.out.println("Add Department " + _tempName + " success!");
                        }
                    } else {
                        System.out.println("Wrong format!");
                    }

                    break;
                case "2":
                    sizeDepartment = _myDepartments.size();
                    if (sizeDepartment == 0) {
                        System.out.println("No department in your company");
                    } else {
                        System.out.println("Please enter Id department to select:");
                        for (int i = 0; i < sizeDepartment; i++) {
                            System.out.println(_myDepartments.get(i).ShowInfor());
                        }
                        System.out.println("0. Back");
                        System.out.println("You select : ");
                        //Scan ký tự được nhập vào từ user
                        _tempStr = s.nextLine();
                        if (isNum(_tempStr)) {
                            _tempId = Integer.parseInt(_tempStr);
                            if (_tempId == 0) {
                                System.out.println("Get back!");
                            } else {

                                int currentIdDepartment = 0;
                                isExistDepartment = false;
                                for (int i = 0; i < sizeDepartment; i++) {
                                    if (_myDepartments.get(i).getId() == _tempId) {
                                        isExistDepartment = true;
                                        currentIdDepartment = i;
                                        break;
                                    }
                                }
                                if (isExistDepartment) {
                                    boolean isInDepartment = true;
                                    while (isInDepartment == true) {
                                        System.out.println("***Welcome to department " + _myDepartments.get(currentIdDepartment).getName() + "***");
                                        System.out.println("1. Add Employee");
                                        System.out.println("2. Show all Employee");
                                        System.out.println("3. Delete Employee");
                                        System.out.println("4. Back!");
                                        System.out.println("You select : ");
                                        _tempStr = s.nextLine();
                                        switch (_tempStr) {
                                            case "1":
                                                System.out.println("Input Id Employee:");
                                                _tempStr = s.nextLine();
                                                if (isNum(_tempStr)) {
                                                    _tempId = Integer.parseInt(_tempStr);
                                                    boolean isExistEmployee = false;

                                                    for (int i = 0; i < sizeDepartment; i++) {
                                                        if (_myDepartments.get(i).ContainEmployee(_tempId)) {
                                                            isExistEmployee = true;
                                                            System.out.println("Employee with Id:" + _tempId + " is existed!");
                                                            break;
                                                        }
                                                    }
                                                    if (!isExistEmployee) {
                                                        System.out.println("Input Name Employee:");
                                                        _tempName = s.nextLine();
                                                        System.out.println("Input Description Employee:");
                                                        _tempDes = s.nextLine();
                                                        _myDepartments.get(currentIdDepartment).addEmployeeName(new Employee(_tempId, _tempName, _tempDes));
                                                        System.out.println("Add new Employee success!");
                                                    }
                                                } else {
                                                    System.out.println("Wrong format!");
                                                }
                                                break;
                                            case "2":
                                                _myDepartments.get(currentIdDepartment).showEmployee();
                                                break;
                                            case "3":
                                                System.out.println("Input Id Employee:");
                                                _tempStr = s.nextLine();
                                                if (isNum(_tempStr)) {
                                                    _tempId = Integer.parseInt(_tempStr);
                                                    if (_myDepartments.get(currentIdDepartment).ContainEmployee(_tempId)) {
                                                        _myDepartments.get(currentIdDepartment).deleteEmployeeName(_tempId);
                                                    } else {
                                                        System.out.println("Can't find Employee with Id: " + _tempId + " in department");
                                                    }
                                                } else {
                                                    System.out.println("Wrong format!");
                                                }
                                                break;
                                            default:
                                                isInDepartment = false;
                                                System.out.println("Get Back!");
                                                break;
                                        }
                                    }


                                } else {
                                    System.out.println("Can't find department Id: " + _tempId + " !");
                                }
                            }

                        } else {
                            System.out.println("Wrong format. Get back!");
                        }
                    }
                    break;
                case "3":
                    sizeDepartment = _myDepartments.size();
                    if (sizeDepartment == 0) {
                        System.out.println("No department in your company");
                    } else {
                        System.out.println("Please enter Id department to delete:");
                        for (int i = 0; i < sizeDepartment; i++) {
                            System.out.println(_myDepartments.get(i).ShowInfor());
                        }
                        System.out.println("0. Back");
                        System.out.println("You select : ");
                        //Scan ký tự được nhập vào từ user
                        _tempStr = s.nextLine();
                        if (isNum(_tempStr)) {
                            _tempId = Integer.parseInt(_tempStr);
                            if (_tempId == 0) {
                                System.out.println("Get back!");
                            } else {
                                isExistDepartment = false;
                                for (Department _department : _myDepartments) {
                                    if (_department.getId() == _tempId) {
                                        isExistDepartment = true;
                                        _myDepartments.remove(_department);
                                        break;
                                    }
                                }
                                if (isExistDepartment) {
                                    System.out.println("Delete department Id: " + _tempId + " success!");
                                } else {
                                    System.out.println("Can't find department Id: " + _tempId + " !");
                                }
                            }

                        } else {
                            System.out.println("Wrong format. Get back!");
                        }
                    }
                    break;

                case "4":
                    //Thay đổi giá trị biến điều kiện, để phá vỡ vòng lặp và kết thúc chương trình
                    condition = false;
                    System.out.println("Bye Bye :D");
            }
        }
    }

    static boolean isNum(String strNum) {
        boolean ret = true;
        try {

            Double.parseDouble(strNum);

        } catch (NumberFormatException e) {
            ret = false;
        }
        return ret;
    }
}

class Employee {
    int Id;
    String Name;
    String Description;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String ShowInfor() {
        return "Id: " + Id + ". Name: " + Name + ". Description: " + Description;
    }

    public Employee(int id, String name, String description) {
        setId(id);
        setName(name);
        setDescription(description);
    }
}

class Department {
    public int Id;
    public String Name;
    public String Description;
    ArrayList<Employee> arrEmployee = new ArrayList<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


    public Department(int id, String name, String description) {
        setId(id);
        setName(name);
        setDescription(description);
    }

    public String ShowInfor() {
        return Id + ". " + Name;
    }

    public void addEmployeeName(Employee employee) {
        //Gọi ra phương thức add để add phần tử vào mảng với parameter truyền vào
        arrEmployee.add(employee);
    }

    //Khai báo hàm in ra tất cả các phần tử trong mảng
    public void showEmployee() {
        //Kiểm tra nếu mảng chưa có phần tử nào được thêm vào
        if (arrEmployee.size() == 0) {
            System.out.println("Please add Employee before show");
        } else {
            System.out.println("List all Employee");
            //Khai báo vòng lặp, duyệt từ 0 tới vị trí cuối cùng trong mảng
            for (int i = 0; i < arrEmployee.size(); i++) {
                System.out.println(arrEmployee.get(i).ShowInfor());
            }
        }
    }

    public boolean ContainEmployee(int id) {
        for (int i = 0; i < arrEmployee.size(); i++) {
            if (arrEmployee.get(i).getId() == id) return true;
        }
        return false;
    }

    //Khai báo hàm xóa phần tử trong mảng
    public void deleteEmployeeName(int IdEmployee) {
        if (arrEmployee.size() == 0) {
            System.out.println("Please add Employee before delete");
        } else {
            //Khai báo biến điều kiện
            boolean condition = false;
            //Duyệt tất cả các phần tử trong mảng
            for (int i = 0; i < arrEmployee.size(); i++) {
                //Nếu phần tử trong mảng trùng với tham số truyền vào, sẽ chạy vào bên trong if
                if (arrEmployee.get(i).getId() == IdEmployee) {
                    //Xóa một phần tử trong mảng
                    arrEmployee.remove(arrEmployee.get(i));
                    //Thay đổi giá trị của biến điều kiện
                    condition = true;
                }
            }
            //Nếu sau khi duyệt tất cả các phần tử trong mảng, tham số truyền vào không giống với bất kỳ
            //phần tử nào trong mảng, thì biến điều kiện "condition" sẽ không được thay đổi giá trị
            if (condition == false) {
                //Không tìm được phần tử trong mảng giống với tham số truyền vào
                System.out.println("Cannot find Employee with Id " + IdEmployee);
            } else {
                //Tìm được và xóa thành công, và đã sửa đổi giá trị của biến điều kiện "condition"
                System.out.println("Delete Employee with Id " + IdEmployee + " success");
            }
        }
    }

    //Phương thức get, trả ra thuộc tính ArrayList<String> của mảng
    public ArrayList<Employee> getArrEmployee() {
        return arrEmployee;
    }

    //Phương thức set, gán giá trị cho thuộc tính ArrayList<String> của mảng, truyền vào 1 ArrayList<String> khác
    public void setArrEmployeeName(ArrayList<Employee> arrEmployee) {
        this.arrEmployee = arrEmployee;
    }

}
