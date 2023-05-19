package org.example;

import java.nio.file.Path;

public class Synthesizer extends DiscLoadingVST implements VST {
    private Oscillator oscillator;

    public Synthesizer() {
        oscillator = new SineOsc();
    }

    public String getShape() {
        return oscillator.getShape();
    }

    public void setOscillator(OscillatorType type) throws Exception {
        switch(type) {
            case Sine:
                oscillator = new SineOsc();
                break;

            case Triangle:
                oscillator = new TriangleOsc();
                break;

            default: throw new Exception("Unsupported oscillator type");
        }
    }

    @Override
    public void loadPatch(OscillatorType osc) throws Exception {
        setOscillator(osc);
    }

    @Override
    public void loadFromDisk(Path path) throws Exception {
        super.loadFromDisk(path);
    }
}
