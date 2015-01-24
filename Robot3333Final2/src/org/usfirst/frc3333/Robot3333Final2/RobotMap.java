// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3333.Robot3333Final2;
    
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
    public static SpeedController driveTrainSpeedController0;
    public static SpeedController driveTrainSpeedController1;
    public static RobotDrive driveTrainRobotDrive10;
    public static SpeedController lifterLifterWindowMotor_PWM2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static double LIFTERSPEED = -0.90; 

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainSpeedController0 = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 0", (Talon) driveTrainSpeedController0);
        
        driveTrainSpeedController1 = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 1", (Talon) driveTrainSpeedController1);
        
        driveTrainRobotDrive10 = new RobotDrive(driveTrainSpeedController1, driveTrainSpeedController0);
        
        driveTrainRobotDrive10.setSafetyEnabled(true);
        driveTrainRobotDrive10.setExpiration(0.1);
        driveTrainRobotDrive10.setSensitivity(0.5);
        driveTrainRobotDrive10.setMaxOutput(1.0);
        driveTrainRobotDrive10.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveTrainRobotDrive10.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);        

        lifterLifterWindowMotor_PWM2 = new Talon(2);
        LiveWindow.addActuator("Lifter", "LifterWindowMotor_PWM2", (Talon) lifterLifterWindowMotor_PWM2);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
