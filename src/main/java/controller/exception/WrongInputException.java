package controller.exception;

import java.io.IOException;

public class WrongInputException extends IOException {
    @Override
    public String getMessage() {
        return "Не правильный ввод !";
    }
}
