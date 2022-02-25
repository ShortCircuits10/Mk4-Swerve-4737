// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Index;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class IndexSub extends SubsystemBase {
  /** Creates a new IndexSub. */
  private CANSparkMax IndexMotor;

  public IndexSub() {
    IndexMotor = new CANSparkMax(Constants.INDEX_MOTOR, MotorType.kBrushed);
  }

  public void setSpeed(double speed){
    IndexMotor.set(speed);
  }

  public void IndexUp(){
    setSpeed(1);
  }

  public void IndexDown(){
    setSpeed(-1);
  }

  public void IndexOff(){
    setSpeed(0);
  }

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
