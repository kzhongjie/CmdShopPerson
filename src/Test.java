import com.sun.deploy.security.SelectableSecurityManager;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        File file=new File("src/users.xlsx");
        ReadExcel readExcel = new ReadExcel();
        User users[] = readExcel.readExcel(file);
        ShowPage showPage = new ShowPage();

        for(User user:users){
            System.out.println("用户名:" + user.getUsername());
            System.out.println("密码:" + user.getPassword());
        }
        System.out.print("请输入用户名:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.print("请输入密码:");
        String pass=sc.next();

        for(int i=0;i<users.length;i++){
            if(name.equals(users[i].getUsername())){
                if(pass.equals(users[i].getPassword())){
                    System.out.println("登陆成功");
                }else{
                    System.out.println("密码错误");
                    return;
                }
                break;
            }else if(!(name.equals(users[i].getUsername())) && i==users.length-1){
                System.out.println("无此用户");
                return;
            }
        }
        while(true) {
            showPage.mainPage();
            String temp = sc.next();
            if (temp == "1") {

            } else if (temp == "2") {

            } else break;
        }
    }
}
