package frc.robot.subsystems.LEDs;

public interface LEDsIO {
    
    public static  class LEDsIOInputs{
        boolean greenOn = false;
        boolean redOn = false;
        Boolean yellowOn = false;
    }
    public default void setGreen(boolean on){}
    public default void setred(boolean on){}
    public default void setyellow(boolean on){}

    public  default void updateInputs(LEDsIOInputs inputs) {}
}

