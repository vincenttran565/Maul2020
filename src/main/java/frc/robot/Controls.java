/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
/**
 * Add your docs here.
 */
public class Controls 
{
    private Joystick dStick, oStick;
    // private Drive drive;
    // private Arduino arduino;
    private Climber climber;
    private Conveyor conveyor;
    private Intake intake;
    private Shooter shooter;
    private Limelight limelight;
    private ColorWheel colorWheel;

    public void controlsInit()
    {
        dStick = new Joystick(0);
        oStick = new Joystick(1);
        // drive = new Drive();
        // arduino = new Arduino();
        climber = new Climber();
        conveyor = new Conveyor();
        intake = new Intake();
        shooter = new Shooter();
        limelight = new Limelight();
        colorWheel = new ColorWheel();
        
        //drive.driveInit();
    }
    public void autoControls()
    {
        // if(arduino.arduinoRead().equals("Ball"))
        // {
        //     drive.drive(.2, .2);
        // }
        // else
        // {
        //     drive.drive(0, 0);
        // }
    }
    public void teleopControls()
    {
        //Normal drive
        //drive.drive(-dStick.getRawAxis(1), -dStick.getRawAxis(5));
        limelight.displayValues();

        //Operator available buttons

        //A Button
        if(oStick.getRawButtonPressed(1))
        {
            intake.intakeWheelsDrive(-.5);
        }
        
        //B Button
        if(oStick.getRawButtonPressed(2))
        {
            conveyor.conveyorDrive(1);
        }
        
        //X Button
        if(oStick.getRawButtonPressed(3))
        {
            colorWheel.drive(.3);
        }
        
        //Y Button
        if(oStick.getRawButtonPressed(4))
        {
            conveyor.conveyorDrive(1);
        }

        //Left Bumper
        if(oStick.getRawButtonPressed(5))
        {
            //colorWheel.lift();
        }

        //Right Bumper
        if(oStick.getRawButtonPressed(6))
        {
            //colorWheel.drive(.5);
        }

        intake.flipOutDrive(oStick.getRawAxis(1));
        shooter.turretPercentage(oStick.getRawAxis(4));
        shooter.shootPercentage(dStick.getRawAxis(1));
    }
}
