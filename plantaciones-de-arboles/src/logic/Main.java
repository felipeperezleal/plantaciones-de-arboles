package logic;

import UI.GUI;

public class Main {
    static GUI screen = new GUI();

    public static void main(String[] args) {
        screen.setVisible(true);
    }
    
    public static GUI getGUI(){
        return screen;
    }
}
