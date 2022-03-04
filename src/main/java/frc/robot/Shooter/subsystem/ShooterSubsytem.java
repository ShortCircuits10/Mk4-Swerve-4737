// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Shooter.subsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ShooterSubsytem extends SubsystemBase {
  /** Creates a new ShooterSubsytem. */
  private CANSparkMax shooterMotor;
  public ShooterSubsytem() {
    shooterMotor = new CANSparkMax(Constants.SHOOTER_MOTOR, MotorType.kBrushed);
  }

  public void setSpeed(double speed){
    shooterMotor.set(speed);
  }
  
  public void Green(){
    setSpeed(1);
  }

  public void Lime(){
    setSpeed(0.75);
  }

  public void Yellow(){
    setSpeed(0.5);
  }

  public void Red(){
    setSpeed(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}