package Utility;

import java.awt.*;

public enum Season{
    SUMMER(Color.red.toString(), "SUMMER"),
    WINTER(Color.white.toString(), "WINTER"),
    AUTUMN(Color.orange.toString(),"AUTUMN"),
    SPRING(Color.green.toString(),"SPRING");
    private String color;
    private String name;


    Season(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public String getColor(){
        return this.color;
    }
    @Override
    public String toString(){
        return name+" "+color.substring(14);
    }
}
