// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import frc.GlobalVariables.Variables;
import frc.PIDControllers.PIDControllers;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {

  //global cariables
  public Variables variables = new Variables(this);
  public PIDControllers pidControllers = new PIDControllers(this);
  public Logging logger = new Logging(this);
  public SmartDashboardInterface smartDashboardInterface = new SmartDashboardInterface(this);


  //timers
  public Timer keepAliveTimer = new Timer();

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    //init PID controllers
    pidControllers.initPIDControllers();

    //start timers
    keepAliveTimer.start();
  }

  /** This function is run once each time the robot enters autonomous mode. */
  @Override
  public void autonomousInit() {
  }

  @Override
  public void robotPeriodic() {
    //call logging
    logger.robotLogging();

    //put on SD
    smartDashboardInterface.updateSmartDashboard();
  }

  @Override
  /** This function is called periodically when robot is disabeled. */
  public void disabledPeriodic() {

  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {

  }

  /** This function is called once each time the robot enters teleoperated mode. */
  @Override
  public void teleopInit() {

  }

  /** This function is called periodically during teleoperated mode. */
  @Override
  public void teleopPeriodic() {
  }

  /** This function is called once each time the robot enters test mode. */
  @Override
  public void testInit() {
    
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {

  }

  /** This function is called periodically during simulations. */
  @Override
  public void simulationPeriodic() {

  }
}
