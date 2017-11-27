package view;

import java.util.List;

public class ViewImpl implements View {

    @Override
    public void showMessage(String string) {
        System.out.println(string);
    }

    @Override
    public void showMessage(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ". " + list.get(i));
        }
    }
}
