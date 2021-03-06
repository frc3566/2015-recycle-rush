// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.SecondRobot;
    
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
    public static SpeedController driveTrainTalon1;
    public static SpeedController driveTrainTalon2;
    public static SpeedController driveTrainTalon3;
    public static SpeedController driveTrainTalon4;
    public static RobotDrive driveTrainMecanum;
    public static AnalogInput driveTrainUltrasonic;
    public static Gyro driveTrainGyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainTalon1 = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Talon1", (Talon) driveTrainTalon1);
        
        driveTrainTalon2 = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "Talon2", (Talon) driveTrainTalon2);
        
        driveTrainTalon3 = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "Talon3", (Talon) driveTrainTalon3);
        
        driveTrainTalon4 = new Talon(4);
        LiveWindow.addActuator("DriveTrain", "Talon4", (Talon) driveTrainTalon4);
        
        driveTrainMecanum = new RobotDrive(driveTrainTalon1, driveTrainTalon3,
              driveTrainTalon2, driveTrainTalon4);
        
        driveTrainMecanum.setSafetyEnabled(true);
        driveTrainMecanum.setExpiration(0.1);
        driveTrainMecanum.setSensitivity(0.5);
        driveTrainMecanum.setMaxOutput(1.0);

        driveTrainMecanum.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainMecanum.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveTrainUltrasonic = new AnalogInput(0);
        LiveWindow.addSensor("DriveTrain", "Ultrasonic", driveTrainUltrasonic);
        
        driveTrainGyro = new Gyro(1);
        LiveWindow.addSensor("DriveTrain", "Gyro", driveTrainGyro);
        driveTrainGyro.setSensitivity(0.007);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
