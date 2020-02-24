/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class Intake {
    WPI_TalonSRX flipOut;
    WPI_VictorSPX intakeWheels;
    Intake() {
        flipOut = new WPI_TalonSRX(8);
        intakeWheels = new WPI_VictorSPX(9);
    }
    void intakeWheelsDrive(Double power) {
        intakeWheels.set(ControlMode.PercentOutput,power);
    
    }
    void flipOutDrive(Double power){
        flipOut.set(ControlMode.PercentOutput,power);
    }
}

