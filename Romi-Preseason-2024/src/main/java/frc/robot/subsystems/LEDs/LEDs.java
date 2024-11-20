package frc.robot.subsystems.LEDs;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.LEDs.LEDsIO.LEDsIOInputs;

public class LEDs extends SubsystemBase {
    
    private LEDsIO io;
    private LEDsIOInputs inputs;

    public LEDs(LEDsIO io){
        this.io = io;
        this.inputs = new LEDsIOInputs();
    }

    @Override
    public void periodic(){
        io.updateInputs(inputs);
    }

    public boolean getGreen(){
        return inputs.greenOn;
    }

    public boolean getRed(){
        return inputs.redOn;
    }

    public boolean getYellow(){
        return inputs.yellowOn;
    }

    public void greenOn(){
        io.setGreen(true);
    }
    
    public void greenOff(){
        io.setGreen(false);
    }

    public void redOn(){
        io.setRed(true);
    }
    
    public void redOff(){
        io.setRed(false);
    }

    public void yellowOn(){
        io.setYellow(true);
    }
    
    public void yellowOff(){
        io.setYellow(false);
    }
}
