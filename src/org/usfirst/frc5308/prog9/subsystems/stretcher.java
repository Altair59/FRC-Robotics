// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5308.prog9.subsystems;

import org.usfirst.frc5308.prog9.Robot;
import org.usfirst.frc5308.prog9.RobotMap;
import org.usfirst.frc5308.prog9.commands.*;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class stretcher extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Solenoid strentcher = RobotMap.stretcherstrentcher;
    private final Solenoid strentcher2 = RobotMap.stretcherstrentcher2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void strentchIn(){
    	Robot.stretcher.strentcher.set(false);
    }
    public void strentchOut(){
    	Robot.stretcher.strentcher.set(true);
    }
    public boolean strentchStatus(){
    	return Robot.stretcher.strentcher.get();
    }
    public void strentchIn1(){
    	Robot.stretcher.strentcher2.set(false);
    }
    public void strentchOut1(){
    	Robot.stretcher.strentcher2.set(true);
    }
    public boolean strentchstatus1(){
    	return Robot.stretcher.strentcher2.get();
    }
}

