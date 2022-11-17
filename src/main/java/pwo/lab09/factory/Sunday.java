/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author pidoras
 */
public class Sunday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Praca w niedziele? Nieeeeeeeeeeeeeeeeeeeeeee";
    }

    @Override
    public String createClosingMessage() {
        return "Siódmy dzień w tym tygodniu minął";
    }
}
