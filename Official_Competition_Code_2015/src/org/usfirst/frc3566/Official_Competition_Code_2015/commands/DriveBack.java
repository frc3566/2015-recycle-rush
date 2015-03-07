// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.Official_Competition_Code_2015.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc3566.Official_Competition_Code_2015.Robot;
import org.usfirst.frc3566.Official_Competition_Code_2015.RobotConstants;
import org.usfirst.frc3566.Official_Competition_Code_2015.RobotMap;

/**
 *
 */
public class  DriveBack extends Command {
	double initialAngle;
	double timeout;
	double currentAngle;
    double diffAngle;
    public DriveBack() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.mecanum);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.setTimeout(2.5);
    	initialAngle = RobotMap.gyro1.getAngle();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	currentAngle = RobotMap.gyro1.getAngle();
    	diffAngle = initialAngle-currentAngle;
    	RobotMap.mecanumMecanum_Control.mecanumDrive_Polar(-RobotConstants.Robot_Autonomous_DriveSpeed, 0, -(diffAngle*RobotConstants.Robot_Gyro_Constant));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.mecanumMecanum_Control.mecanumDrive_Polar(0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
