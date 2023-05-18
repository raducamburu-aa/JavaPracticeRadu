package org.example;

public class Synthesizer {
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
}
