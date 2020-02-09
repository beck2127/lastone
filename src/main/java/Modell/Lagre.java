package Modell;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lagre extends Lagring_til_fil{

    @Override
    public void Lagre_csv(List<Object> list) {
        List<String>veiw=new ArrayList<>();
        list.forEach(l -> veiw.add(l.toString()));
        String veiwdata="";
        for(int i=0;i<list.size();i++){
            veiwdata+=veiw.get(i)+",";
        }
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Lagre til File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "Save.csv"));
        Stage stage = new Stage();
        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {

            String filepath = file.getPath();
            try {

                FileOutputStream fos = new FileOutputStream(filepath, true);

                OutputStreamWriter osw = new OutputStreamWriter(fos);

                BufferedWriter bw = new BufferedWriter(osw);

                bw.write(veiwdata);
                bw.newLine();
                bw.close();

            } catch (IOException ioe) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("ERORR");
                alert.setHeaderText("OPPS.. FEIL");
                alert.setContentText(ioe.getMessage());
                alert.show();
            }
        }

    }

    @Override
    public void Lagre_jobj ( Object f ) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Lagre til File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.jobj"));
        Stage stage = new Stage();
        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {

            String filepath = file.getPath();

            ObservableList<Object> list = FXCollections.observableArrayList();
            try (
                    FileOutputStream fos = new FileOutputStream(filepath);
                    ObjectOutputStream out = new ObjectOutputStream(fos);) {
                out.writeObject(new ArrayList<Object>(list));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}