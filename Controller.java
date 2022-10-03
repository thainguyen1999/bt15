package javafx;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.nio.charset.StandardCharsets;

public class Controller {

    public TextArea resul;
    public TextField name;
    public TextField email;
    public TextField age;

    public TextField address;
    public Text noticeName;
    public Text noticeMail;
    public Text noticeAge;
    public Text noticeAdd;

    public void handlePrint() {
        String Name = name.getText();
        String Email = email.getText();
        String Age = age.getText();
        String Address = address.getText();
        String Resul="FullName:"+name.getText()+    "Email:"+email.getText()+
                "Tuổi:"+age.getText()+   "Địa chỉ:"+address.getText();
        resul.setText(Resul);
        if (Name.isEmpty() || Email.isEmpty()|| Age.isEmpty()|| Address.isEmpty()){

        }

    }
}


