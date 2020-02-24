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
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Climber {
    WPI_TalonSRX liftRight;
    WPI_VictorSPX liftLeft;
    DoubleSolenoid liftLock;
    Climber() {
        liftRight = new WPI_TalonSRX(1);
        liftLeft = new WPI_VictorSPX(2);
        liftLock = new DoubleSolenoid(0,1);
    }
    void climberDrive(Double power) {
        liftRight.set(ControlMode.PercentOutput,power);
        liftLeft.set(ControlMode.PercentOutput,power);
    }
    void lockLift(boolean lock){
        if(lock) {
            liftLock.set(Value.kForward);
        }
        else{
            liftLock.set(Value.kReverse);     }
    }
    
}
