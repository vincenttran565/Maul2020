/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class Drive 
{
    private boolean highGear = false;
    private CANSparkMax left_1 = new CANSparkMax(1, MotorType.kBrushless);
    private CANSparkMax left_2 = new CANSparkMax(2, MotorType.kBrushless);
    private CANSparkMax left_3 = new CANSparkMax(3, MotorType.kBrushless);
    private CANSparkMax right_1 = new CANSparkMax(4, MotorType.kBrushless);
    private CANSparkMax right_2 = new CANSparkMax(5, MotorType.kBrushless);
    private CANSparkMax right_3 = new CANSparkMax(6, MotorType.kBrushless);
    private DoubleSolenoid shiftPistonOne;
    private DoubleSolenoid shiftPistonTwo;

    private DifferentialDrive robotDrive;

    public void driveInit()
    {
        left_1.setSmartCurrentLimit(40);
        left_2.setSmartCurrentLimit(40);
        left_3.setSmartCurrentLimit(40);
        right_1.setSmartCurrentLimit(40);
        right_2.setSmartCurrentLimit(40);
        right_3.setSmartCurrentLimit(40);
        
        left_2.follow(left_1);
        left_3.follow(left_1);
        right_2.follow(right_1);
        right_3.follow(right_1);

        shiftPistonOne = new DoubleSolenoid(4,5);
        shiftPistonTwo = new DoubleSolenoid(6,7);

        robotDrive = new DifferentialDrive(left_1, right_1);
    }

    public void drive(double leftSpeed, double rightSpeed)
    {
       // robotDrive.tankDrive(-driveJoystick.getRawAxis(1), -driveJoystick.getRawAxis(5));
       robotDrive.tankDrive(leftSpeed, rightSpeed);
    }
    public void shift(){
        if(highGear){
            shiftPistonOne.set(Value.kForward);
            shiftPistonTwo.set(Value.kForward);
            highGear = false;

        } else {
            shiftPistonOne.set(Value.kReverse);
            shiftPistonTwo.set(Value.kReverse);
            highGear = true;
        }
   }
}
