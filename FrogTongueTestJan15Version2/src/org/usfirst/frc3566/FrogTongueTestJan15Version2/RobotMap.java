// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.FrogTongueTestJan15Version2;
    
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
    public static RobotDrive driveTrainRobotDrive01;
    public static SpeedController frogtongueSpeedController3;
    public static SpeedController frogtongueSpeedController2;
    public static RobotDrive frogtongueFrogTongueDrive23;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static double FROG_TONGUE_DRIVE_NUMBER = 0.85;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainSpeedController0 = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 0", (Talon) driveTrainSpeedController0);
        
        driveTrainSpeedController1 = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Speed Controller 1", (Talon) driveTrainSpeedController1);
        
        driveTrainRobotDrive01 = new RobotDrive(driveTrainSpeedController1, driveTrainSpeedController0);
        
        driveTrainRobotDrive01.setSafetyEnabled(true);
        driveTrainRobotDrive01.setExpiration(0.1);
        driveTrainRobotDrive01.setSensitivity(0.5);
        driveTrainRobotDrive01.setMaxOutput(1.0);
        

        frogtongueSpeedController3 = new Talon(3);
        LiveWindow.addActuator("Frogtongue", "Speed Controller 3", (Talon) frogtongueSpeedController3);
        
        frogtongueSpeedController2 = new Talon(2);
        LiveWindow.addActuator("Frogtongue", "Speed Controller 2", (Talon) frogtongueSpeedController2);
        
        frogtongueFrogTongueDrive23 = new RobotDrive(frogtongueSpeedController2, frogtongueSpeedController3);
        
        frogtongueFrogTongueDrive23.setSafetyEnabled(true);
        frogtongueFrogTongueDrive23.setExpiration(0.1);
        frogtongueFrogTongueDrive23.setSensitivity(0.5);
        frogtongueFrogTongueDrive23.setMaxOutput(1.0);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
