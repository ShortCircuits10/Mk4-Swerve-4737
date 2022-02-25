// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Elevator;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ElevatorSub extends SubsystemBase {
  /** Creates a new ElevatorSub. */
  private CANSparkMax elevatorMotor;
  
  
  public ElevatorSub() {
    elevatorMotor = new CANSparkMax(Constants.ELEVATOR_MOTOR, MotorType.kBrushless);
  }

  public void setSpeed(double speed){
    elevatorMotor.set(speed);
  }

  public void ElevatorUp(){
    setSpeed(1);
  }

  public void ElevatorDown(){
    setSpeed(-1);
  }

  public void ElevatorOff(){
    
    setSpeed(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
