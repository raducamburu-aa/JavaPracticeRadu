package org.example;

import java.nio.file.Files;
import java.nio.file.Path;

public abstract class DiscLoadingVST implements VST{
    @Override
    public void loadFromDisk(Path path) throws Exception {
        String fileContents = Files.readString(path);
         OscillatorType oscType = OscillatorType.valueOf(fileContents);

        switch (oscType){
            case Sine:
                loadPatch(OscillatorType.Sine);
                break;
            case Triangle:
                 loadPatch(OscillatorType.Triangle);
                break;
            default:
                System.out.println("Invalid Oscillator type");
        }
    }
}
