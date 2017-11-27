package controller;

import controller.exception.WrongInputException;
import model.DataBaseAlbums;
import model.DataBaseDiscs;
import model.entity.Disc;
import service.DiscCreator;
import service.DiscManager;
import view.View;

import java.util.InputMismatchException;
import java.util.Scanner;

import static controller.Menu.*;
import static view.constants.Constant.*;


public class MainController {
    private View view;
    private DataBaseAlbums data = DataBaseAlbums.INSTANCE;
    private DataBaseDiscs discs = DataBaseDiscs.INSTANCE;

    public MainController(View view) {
        this.view = view;
    }

    public void run() {
        while (true)
            try {
                switch (buildMenu(BURN, OPEN, EXIT)) {
                    case BURN:
                        DiscCreator creator = new DiscCreator(view);
                        view.showMessage(BURN_DISK_NAME);
                        discs.addDisc(creator.create(data.getAllAlbums(), new Scanner(System.in).nextLine()));
                        view.showMessage(BURNED_SUCCESSFULLY);
                        break;

                    case OPEN:
                        view.showMessage(discs.getAllDiscs());
                        Disc disc = discs.getAllDiscs().get(processEnter(discs.getAllDiscs().size()));
                        DiscManager manager = new DiscManager(disc);

                        switch (buildMenu(TOTAL_DURATION, SORT_BY_STYLE, GET_BY_DURATION, BACK)) {
                            case TOTAL_DURATION:
                                view.showMessage(manager.getTotalDuration());
                                break;
                            case SORT_BY_STYLE:
                                view.showMessage(manager.sortByStyleAndGet());
                                break;
                            case GET_BY_DURATION:
                                view.showMessage(ENTER_DURATION);
                                view.showMessage(manager.getMusicsBetweenDuration(new Scanner(System.in).next("[0-9]{3}-[0-9]{3}")));
                            case BACK:
                                break;
                        }
                        break;

                    case EXIT:
                        System.exit(0);
                }
            } catch (InputMismatchException | WrongInputException e) {
                view.showMessage(IO_ERROR);
            }
    }

    private Menu buildMenu(Menu... elements) throws WrongInputException {
        for (Menu menu : elements) {
            view.showMessage(menu.toString());
        }
        int i = processEnter(elements.length + 1);
        return elements[i - 1];
    }

    private int processEnter(int maxSize) throws WrongInputException {
        int i = new Scanner(System.in).nextInt();
        if(i > maxSize - 1 || i < 0) {
            throw new WrongInputException();
        }
        return i;
    }


}
