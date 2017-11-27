package controller;

public enum Menu {
    BURN("1. Записать на диск сборку"),

    OPEN("2. Открыть диск"),
    TOTAL_DURATION("1. Посчитать продолжительность композицей в альбоме"),
    SORT_BY_STYLE("2. Показать все композиции отсориртированые по принадлежности к стилю"),
    GET_BY_DURATION("3. Найти композицию(и), соответствующую заданному диапазону длины треков"),
    BACK("4. Назад к меню"),

    EXIT("3. Выйти");


    private String text;

    Menu(String string) {
        this.text = string;
    }

    @Override
    public String toString() {
        return text;
    }
}
