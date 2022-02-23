// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new IntakeSubsystem. */
  private DoubleSolenoid solenoid;
  private CANSparkMax intakeMotor;


  public IntakeSubsystem() {
      solenoid = new DoubleSolenoid(Constants.FORWARD_INTAKEMOTOR, Constants.FORWARD_INTAKEMOTOR);
      intakeMotor = new CANSparkMax(Constants.INTAKE_MOTOR, MotorType.kBrushed);
      }

  public void extendo(){
    solenoid.set(Value.kForward);
  }

  public void retractoyo(){
    solenoid.set(Value.kReverse);
  }

  public void asphyxiate(){
    solenoid.set(Value.kOff);
  }

  public void setSpeed(double speed){
    intakeMotor.set(speed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
