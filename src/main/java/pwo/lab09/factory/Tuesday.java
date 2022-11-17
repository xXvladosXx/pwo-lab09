/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author pidoras
 */
public class Tuesday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Wtorek.";
    }

    @Override
    public String createMainMessage() {
        return "Wtorkowa praca idzie lepiej";
    }

    @Override
    public String createClosingMessage() {
        return "Drugi dzień pracy w tym tygodniu minął";
    }
}
