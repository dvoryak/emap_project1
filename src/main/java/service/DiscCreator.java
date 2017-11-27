package service;

import model.entity.Albums;
import model.entity.Disc;
import view.View;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static view.constants.Constant.*;

public class DiscCreator {
    private View view;

    public DiscCreator(View view) {
        this.view = view;
    }

    public Disc create(List<Albums> albums, String name) throws InputMismatchException {
        view.showMessage(BURN_SELECT_ALBUM);

        for (int i = 0; i < albums.size(); i++) {
            view.showMessage(i + ". " + albums.get(i));
        }

        int[] ints = parseString(new Scanner(System.in).next("[0-9,]*"));

        Disc disc = new Disc(name);

        for (int anInt : ints) {
            try {
                disc.addAlbum(albums.get(anInt));
            } catch (IndexOutOfBoundsException e) {
                view.showMessage(CANT_FIND_ALBUM + anInt);
            }
        }

        return disc;

    }

    private int[] parseString(String string) {
        String[] split = string.split(",");

        int[] out = new int[split.length];
        int index = 0;

        for (String s : split) {
            int i = Integer.parseInt(s);
            out[index++] = i;
        }

        return out;
    }




}
