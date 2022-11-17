/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author pidoras
 */
public class Saturday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Sobota.";
    }

    @Override
    public String createMainMessage() {
        return "Pracy w sobote nie ma";
    }

    @Override
    public String createClosingMessage() {
        return "Szósty dzień w tym tygodniu minął";
    }
}
