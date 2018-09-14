package com.mycompany.ThinkInJava4;

class WaterSource {
    private String s;

    WaterSource() {
        Print.print("WaterSource()");
        s = "Constructed";
    }

    public String toString() {return s;}
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return "valve1 = " + valve1 + " valve2 = " + valve2 + " valve3 = " + valve3 + " valve4 = " + valve4 + "\n" +
                "i = " + i + " f = " + f + " source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem ss = new SprinklerSystem();
        Print.print(ss);
    }

}
