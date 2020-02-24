/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

/**
 * Add your docs here.
 */
public class ColorWheel {
    private boolean lifted = false;
    private WPI_VictorSPX colorWheelDrive;
    //private DoubleSolenoid colorLift;
    public ColorWheel(){
        colorWheelDrive = new WPI_VictorSPX(12);
        //colorLift = new DoubleSolenoid(0,1);
     }
     public void drive(double power){
        colorWheelDrive.set(ControlMode.PercentOutput,power);
     }
     public void lift(){
        //  if (lifted){
        //      colorLift.set(Value.kReverse);
        //      lifted = false;
        //  } else {
        //      colorLift.set(Value.kForward);
        //      lifted = true;
        //  }
     }
}