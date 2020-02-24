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
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Shooter {
    CANSparkMax shooterRight;
    CANSparkMax shooterLeft;
    WPI_VictorSPX turret;
    DoubleSolenoid ballRelease;
   
    Shooter() {
        shooterRight = new CANSparkMax(9,MotorType.kBrushed);
        shooterLeft = new CANSparkMax(10,MotorType.kBrushed);
        turret = new WPI_VictorSPX(10);
        ballRelease = new DoubleSolenoid(2,3);
    }
    void shootPercentage(Double power) {
        shooterRight.set(power);
        shooterLeft.set(-power);
    }
    void turretPercentage(Double power){
        turret.set(ControlMode.PercentOutput,power);
    }
    void releaseBalls(boolean nut){
        
        if(nut) {
            ballRelease.set(Value.kForward);
        
        }
        else{
            ballRelease.set(Value.kReverse);
        }
    }

}
