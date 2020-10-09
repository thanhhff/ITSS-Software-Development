package connectSQL;

import javax.swing.*;
import java.sql.*;

public class connectSQL {
    Connection connect;

    public connectSQL() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe-manager?useUnicode=true&characterEncoding=utf8", "root", "");
            System.out.println("Kết nối SQL thành công !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ConnectSQL: kết nối tới SQL thất bại !");
        }
    }
}
