// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveDrive extends SubsystemBase {
  // r denotes rotation. d denotes driving.
  public CANSparkMax leftFront_r, leftFront_d;
  public CANSparkMax rightFront_r, rightFront_d;
  public CANSparkMax leftBack_r, leftBack_d;
  public CANSparkMax rightBack_r, rightBack_d;

  /** Creates a new ExampleSubsystem. */
  public SwerveDrive() {
    leftFront_r = new CANSparkMax(12, MotorType.kBrushless);
    leftFront_d = new CANSparkMax(13, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
