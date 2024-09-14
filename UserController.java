import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

public class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;

        //click confirm button
        this.view.confirmButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String ID = view.getTextFieldValue();
                List<String[]> data = model.getData();
                String[] check = {"brown", "white"};
                if (checkData(ID)) {
                    boolean found = false;
                    for (String[] row : data) {
                        int idx = 0;
                        if (ID.equals(row[idx])) {
                            if (row[1].equals(check[0])) {
                                BrownCowView brownCowView = new BrownCowView(row);
                            }
                            if (row[1].equals(check[1])) {
                                WhiteCowView whiteCowView = new WhiteCowView(row);
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        view.notFound();
                    }
                } else {
                    view.invalidID();
                }
            }
        });
    }

    //check input data
    public boolean checkData(String ID) {
        boolean isNumeric = ID.matches("\\d+");
        boolean isEightDigits = ID.length() == 8;
        boolean notStartWithZero = !ID.startsWith("0");
        return isNumeric && isEightDigits && notStartWithZero;
    }
}
