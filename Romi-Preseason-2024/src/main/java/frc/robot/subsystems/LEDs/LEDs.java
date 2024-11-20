package frc.robot.subsystems.LEDs;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.LEDs.LEDsIO.LEDsIOInputs;

public class LEDs extends SubsystemBase {

  private LEDsIO io;
  private LEDsIOInputs inputs;

  public LEDs(LEDsIO io) {
    this.io = io;
    this.inputs = new LEDsIOInputs();
  }

  @Override
  public void periodic() {
    io.updateInputs(inputs);
  }

  public boolean getGreen() {
    return inputs.greenOn;
  }

  public void greenOn() {
    io.setGreen(true);
  }

}