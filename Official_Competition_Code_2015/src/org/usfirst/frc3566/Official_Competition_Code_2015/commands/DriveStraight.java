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
public class  DriveStraight extends Command {
	double initialAngle;
	double timeout;
    public DriveStraight() {
    	this(10);
    }
    
    public DriveStraight(double timeout) {
    	requires(Robot.mecanum);
    	this.timeout = timeout;
    }

    // Called just before this Command runs the first time
    double currentAngle;
    double diffAngle;
    protected void initialize() {
    	this.setTimeout(timeout);
    	initialAngle = RobotMap.gyro1.getAngle();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	currentAngle = RobotMap.gyro1.getAngle();
    	diffAngle = initialAngle-currentAngle;
    	RobotMap.mecanumMecanum_Control.mecanumDrive_Polar(RobotConstants.Robot_Autonomous_DriveSpeed, 0, -(diffAngle*RobotConstants.Robot_Gyro_Constant));
    	//currentPosition=Robot.mecanum.findRange();
    	//if (Math.abs(initialPosition-currentPosition)>2){
    		//RobotMap.mecanumMecanum_Control.arcadeDrive(RobotConstants.Robot_Mecanum_RunSpeed_Coefficient, (currentPosition-initialPosition)/20);
    	//}
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() { 
        return (Robot.bottomSwitches.getB2()||Robot.bottomSwitches.getB3())||this.isTimedOut();
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
