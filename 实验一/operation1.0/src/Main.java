//对B3的文件进行修改
//对C4的文件修改
D:\软件过程与工具\lab2\克隆仓库\RJGC-2\实验一\operation1.0\src\main.java
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage arg0) throws Exception {
    // TODO Auto-generated method stub
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Main.class.getResource("prac.fxml"));
    AnchorPane login = (AnchorPane) loader.load();
    pracController controller = loader.getController();
    Scene scene = new Scene(login);
    arg0.setScene(scene);
    arg0.show();
  }

  public static void main(String[] args) {
    launch(args);
  }


}
