package org.example;

import java.nio.file.Files;
import java.nio.file.Path;

public abstract class DiscLoadingVST implements VST{
    @Override
    public void loadFromDisk(Path path) throws Exception {
        String fileContents = Files.readString(path);
        int oscType = Integer.parseInt(fileContents);

        switch (oscType){
            case 1:
                loadPatch(OscillatorType.Sine);
                break;
            case 2:
                 loadPatch(OscillatorType.Triangle);
                break;
            default:
                System.out.println("error");
        }
    }
}
