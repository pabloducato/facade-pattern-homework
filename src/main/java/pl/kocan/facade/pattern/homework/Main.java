package pl.kocan.facade.pattern.homework;

import pl.kocan.facade.pattern.homework.bank.AtmMachineFacade;

public class Main {

    public static void main(String[] args) {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();
    }
}
