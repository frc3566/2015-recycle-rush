// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.TestRobot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainFront1;
    public static SpeedController driveTrainFront2;
    public static RobotDrive driveTrainFrontWheels;
    public static AnalogInput driveTrainUltrasonicAnalog;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainFront1 = new Jaguar(0);
        LiveWindow.addActuator("DriveTrain", "Front1", (Jaguar) driveTrainFront1);
        
        driveTrainFront2 = new Jaguar(1);
        LiveWindow.addActuator("DriveTrain", "Front2", (Jaguar) driveTrainFront2);
        
        driveTrainFrontWheels = new RobotDrive(driveTrainFront1, driveTrainFront2);
        
        driveTrainFrontWheels.setSafetyEnabled(true);
        driveTrainFrontWheels.setExpiration(0.1);
        driveTrainFrontWheels.setSensitivity(0.5);
        driveTrainFrontWheels.setMaxOutput(1.0);
        

        driveTrainUltrasonicAnalog = new AnalogInput(0);
        LiveWindow.addSensor("DriveTrain", "UltrasonicAnalog", driveTrainUltrasonicAnalog);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}