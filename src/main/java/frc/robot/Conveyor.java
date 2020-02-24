/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Conveyor {
    WPI_VictorSPX conveyorOne;
    WPI_VictorSPX conveyorTwo;
    Conveyor() {
        conveyorOne = new WPI_VictorSPX(13);
        conveyorTwo = new WPI_VictorSPX(11);
    }
    void conveyorDrive(double power) {
        conveyorOne.set(ControlMode.PercentOutput,power);
        conveyorTwo.set(ControlMode.PercentOutput,-power);
    }
}
