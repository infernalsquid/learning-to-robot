// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.revrobotics.CANSparkMax;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class whir extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  public final SwerveDrive m_swerveDrive;
  public Timer timer;
  public boolean finished;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public whir(SwerveDrive subsystem) {
    m_swerveDrive = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_swerveDrive.leftFront_r.set(0.5);
    m_swerveDrive.leftFront_d.set(0.0);
    timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (timer.get() >= 250 && timer.get() <= 1250) {
      m_swerveDrive.leftFront_r.set(0.0);
      m_swerveDrive.leftFront_d.set(0.2);
    } 
    if (timer.get() > 1250 && timer.get() <= 1500) {
      m_swerveDrive.leftFront_r.set(0.0);
      m_swerveDrive.leftFront_d.set(0.0);
      finished = true;
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    finished = true;
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return finished;
  }
}
