package frc.robot.subsystems;

import java.nio.channels.Channel;

import com.fasterxml.jackson.annotation.JacksonInject .Value;

import edu.wpi.first.util.function.BooleanConsumer;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LED extends SubsystemBase {
    
    private DigitalOutput greenLED;
    boolean greenon;
    private DigitalOutput redLED;
    boolean redon;
    private DigitalOutput yellowLED;
    boolean yellowon;
    
    public LED() {
    this.greenLED=new DigitalOutput(1);
    this.redLED=new DigitalOutput(2);
    this.yellowLED=new DigitalOutput(3);
 }
     public void turnongreen(){
     this.greenon = true;
     greenLED.set(true);
    }
     public void turnoffgreen(){
     this.greenon = false;
     greenLED.set(false);
    }
      public void turnonred(){
     this.redon = true;
     redLED.set(true);
    }
     public void turnoffred(){
     this.redon = false;
     redLED.set(false);
    }
     public void turnonyellow(){
     this.yellowon = true;
     yellowLED.set(true);
    }
     public void turnoffyellow(){
     this.yellowon = false;
     yellowLED.set(false);
    }
    //getter method
    public Boolean getGreenStatus(){
        return greenon;
    }
    public Boolean getredStatus(){
        return redon;
    }
    public Boolean getyellowStatus(){
        return yellowon;
    }
}

