/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */

import edu.wpi.first.wpilibj.SerialPort;

public class Arduino 
{
    SerialPort arduino = new SerialPort(9600,SerialPort.Port.kUSB1);

    public String arduinoRead()
    {
        return arduino.readString();
    }
    public void arduinoWrite(String string)
    {
        arduino.writeString(string);
    }
}
