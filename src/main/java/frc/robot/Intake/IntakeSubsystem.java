// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;



public class IntakeSubsystem extends SubsystemBase {

  private DoubleSolenoid intakeSolenoid;
  private CANSparkMax intakeMotor;

  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {
    intakeSolenoid = new DoubleSolenoid(Constants.INTAKEPNEUMATIC_FORWARD, Constants.INTAKEPNEUMATIC_REVERSE);
    intakeMotor = new CANSparkMax(Constants.INTAKE_MOTOR, MotorType.kBrushed);
  }



  public void extendo(){
    intakeSolenoid.set(Value.kForward);
  }

  public void retractoyo(){
    intakeSolenoid.set(Value.kReverse);
  }

  public void asphyxiate(){
    intakeSolenoid.set(Value.kOff);
  }

  public void setSpeed(double speed){
    intakeMotor.set(speed);
  }

 
 
  public void IntakeForward(){
    setSpeed(1);
  }

  public void IntakeReverse(){
    setSpeed(-1);
  }

  public void IntakeOff(){
    
    setSpeed(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  
}
