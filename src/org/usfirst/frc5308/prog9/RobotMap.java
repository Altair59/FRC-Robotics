// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5308.prog9;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivertrainmotor0;
    public static SpeedController drivertrainmotor1;
    public static SpeedController drivertrainmotor2;
    public static SpeedController drivertrainmotor3;
    public static RobotDrive drivertrainRobotDrive41;
    public static SpeedController shootershooter;
    public static SpeedController lifterlifter;
    public static Solenoid stretcherstrentcher;
    public static Solenoid stretcherstrentcher2;
    public static SpeedController blenderblender;
    public static SpeedController loaderloader;
	public static SpeedController passerpasser;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivertrainmotor0 = new Spark(0);
        LiveWindow.addActuator("drivertrain", "motor0", (Spark) drivertrainmotor0);
        
        drivertrainmotor1 = new Spark(1);
        LiveWindow.addActuator("drivertrain", "motor1", (Spark) drivertrainmotor1);
        
        drivertrainmotor2 = new Spark(2);
        LiveWindow.addActuator("drivertrain", "motor2", (Spark) drivertrainmotor2);
        
        drivertrainmotor3 = new Spark(3);
        LiveWindow.addActuator("drivertrain", "motor3", (Spark) drivertrainmotor3);
        
        drivertrainRobotDrive41 = new RobotDrive(drivertrainmotor2, drivertrainmotor3,
              drivertrainmotor1, drivertrainmotor0);
        
        drivertrainRobotDrive41.setSafetyEnabled(false);
        drivertrainRobotDrive41.setExpiration(0.1);
        drivertrainRobotDrive41.setSensitivity(0.5);
        drivertrainRobotDrive41.setMaxOutput(1.0);
        drivertrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        drivertrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        drivertrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drivertrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        shootershooter = new Victor(4);
        LiveWindow.addActuator("shooter", "shooter", (Victor) shootershooter);
        
        lifterlifter = new Spark(6);
        LiveWindow.addActuator("lifter", "lifter", (Spark) lifterlifter);
        
        stretcherstrentcher = new Solenoid(2);
        LiveWindow.addActuator("stretcher", "strentcher", stretcherstrentcher);
        
        stretcherstrentcher2 = new Solenoid(0);
        LiveWindow.addActuator("stretcher", "strentcher2", stretcherstrentcher2);
        
        blenderblender = new Victor(8);
        LiveWindow.addActuator("blender", "blender", (Victor) blenderblender);
        
        passerpasser = new Spark(7);
        LiveWindow.addActuator("passer", "passer", (Spark) passerpasser);
        
        
        loaderloader = new Victor(5);
        LiveWindow.addActuator("loader", "loader", (Victor) loaderloader);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

	
}
