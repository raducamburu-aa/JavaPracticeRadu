package org.example;

public interface VST {

    public void loadPatch(OscillatorType osc);
    //sintetizatoru implemeteaza interfata VST si la loadPatch o sa apeleze setOscillator
    //mai faci o clasa abstracta DiscLoadingVST implements VST care sa aiba o metoda loadFromDisk(String path) - are implementare - citeste fisieru de la path, ia continutu (nr intreg) si cu nr asta intreg o sa apeleze loadPatch
}
