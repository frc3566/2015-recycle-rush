// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.ArduinoCommunicationsTest3566.subsystems;

import org.usfirst.frc3566.ArduinoCommunicationsTest3566.Robot;
import org.usfirst.frc3566.ArduinoCommunicationsTest3566.RobotMap;
import org.usfirst.frc3566.ArduinoCommunicationsTest3566.commands.runSerialForSwitches;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class ArduinoSerialSwitchInterface extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput limitSwitch1 = RobotMap.arduinoSerialSwitchInterfaceLimitSwitch1;
    DigitalInput limitSwitch2 = RobotMap.arduinoSerialSwitchInterfaceLimitSwitch2;
    DigitalInput limitSwitch3 = RobotMap.arduinoSerialSwitchInterfaceLimitSwitch3;
    DigitalInput limitSwitch4 = RobotMap.arduinoSerialSwitchInterfaceLimitSwitch4;
    AnalogInput valueFromArduino_Analog = RobotMap.arduinoSerialSwitchInterfaceValueFromArduino_Analog;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    
   // public I2C rrI2C;
   // public I2C rrI2CMXP;
    
    
    private SerialPort rrToArduino; 
    byte[] inBox = new byte[1]; //2 bytes right now...one whole int...
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new runSerialForSwitches());
    }
    
    public void arduinoReadIT(){
    	
    	//rrI2C = Robot.myRoboRioI2C;
    	//rrI2C.read(registerAddress, count, buffer);
    	//rrI2C.read(registerAddress, count, buffer);
    	//rrI2CMXP = Robot.myRobotRioI2CMXP;
    	rrToArduino = Robot.RS232toArduino;
    	
    	//System.out.println("in arduinoReadIT...Trying to Read...");
    	
    	try {
    	//rrI2CMXP.read(168, 1, inBox); // this could be 84  don't know...
    		inBox=rrToArduino.read(1);
    		
    		
    		
    	
    	//System.out.println("inBox: " + inBox[0] + " and " + inBox[1] + inBox[2] + " and " + inBox[3]);
    	System.out.println("inBox: " + inBox[0]);
    	} catch (Error e) {
    		System.out.println("Error in reading.."+ e.getMessage());
    	}
    	
    	
    	
    	
   
    
}
}

