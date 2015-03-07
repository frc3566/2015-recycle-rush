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

/**
 *
 */
public class  RaiseHookDistance extends Command {
	double raiseDistance=0;
	double currentPosition;
    double initialPosition;
    double distance=0;
    boolean distanceReached;
    public RaiseHookDistance(double dist){
    	raiseDistance=dist; 
    	requires(Robot.elevator);
    }
    public RaiseHookDistance() {
        this(0);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.setTimeout(4);
    	distanceReached=false;
    	initialPosition = Robot.elevator.getPositionPotentiometer();
    	distance = 0;
    	currentPosition = Robot.elevator.getPositionPotentiometer();
    	Robot.elevator.raiseElevator(-1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	currentPosition = Robot.elevator.getPositionPotentiometer();
    	distance = currentPosition-initialPosition;
    	if (distance>=raiseDistance){
    		distanceReached = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return distanceReached||this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.stopElevator();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
