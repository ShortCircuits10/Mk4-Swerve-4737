// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Turret;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class TurretSub extends SubsystemBase {

  private CANSparkMax turretMotor;
  /** Creates a new TurretSub. */
  public TurretSub() {
    turretMotor = new CANSparkMax(Constants.TURRET_MOTOR, MotorType.kBrushed);
  }

  public void setSpeed(double speed){
    turretMotor.set(speed);
  }

  public void TurretLeft(){
    setSpeed(1);
  }

  public void TurretRight(){
    setSpeed(-1);
  }

  public void TurretOff(){
    //setSpeed(0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
