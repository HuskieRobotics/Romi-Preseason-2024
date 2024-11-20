package frc.robot.subsystems.LEDs;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.LEDs.LEDsIO.LEDsIOInputs;

public class LEDs extends SubsystemBase {
  private LEDsIO  io;
  private LEDsIOInputs inputs;

  public LEDs(LEDsIO io){
    this.io=io;
    this.inputs=new LEDsIOInputs();
  }

  @Override
  public void periodic() {
    io.updateInputs(inputs);

  }
  public boolean getgreen() {
    return inputs.greenOn;
  }
  public boolean getred() {
    return inputs.redOn;
  }
  public boolean getyellow() {
    return inputs.yellowOn;
  }
  public void greenOn(){
    io.setGreen(true);
  }
  public void redOn(){
    io.setred(true);
  }
  public void yellowOn(){
    io.setyellow(true);
  }
  public void greenOff(){
    io.setGreen(false);
  }
  public void redOff(){
    io.setred(false);
  }
  public void yellowOff(){
    io.setyellow(false);
  }
}