package org.example;

public abstract class DiscLoadingVST implements VST{
    @Override
    public void loadFromDisk(String path) throws Exception {
        //citeste fisieru de la path, ia continutu (nr intreg) si cu nr asta intreg o sa apeleze loadPatch
        switch (path){
            case "1":
                loadPatch(OscillatorType.Sine);
                break;
            case "2":
                 loadPatch(OscillatorType.Triangle);
                break;
            default:
                System.out.println("error");
        }
    }
}
