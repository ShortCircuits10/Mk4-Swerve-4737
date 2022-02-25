// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.ARCS;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ARCSSUB extends SubsystemBase {
  private CANSparkMax ARCMotor;
  /** Creates a new ARCSSUB. */
  public ARCSSUB() {
    ARCMotor = new CANSparkMax(Constants.ARCS_MOTOR, MotorType.kBrushed);
  }
  public void setSpeed(double speed) {
    ARCMotor.set(speed);
  }
  public void ArcUp() {
    setSpeed(100);
  }
  public void ArcDown() {
    setSpeed(-100);
  }
  public void ArcOff() {
    setSpeed(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
