package frc.PIDControllers;

import edu.wpi.first.math.controller.PIDController;
import frc.robot.Robot;

public class PIDControllers {

    Robot thisRobot;
    public PIDController testPidController;


    public PIDControllers(Robot _thisRobot){
        thisRobot = _thisRobot;
    }

    public boolean initPIDControllers(){
        try{
            thisRobot.pidControllers.testPidController = new PIDController(
                thisRobot.variables.testPID_P, 
                thisRobot.variables.testPID_I, 
                thisRobot.variables.testPID_D);
            return true;
        }
        catch (Exception e){
            System.out.println("PIDController init failed" + e.toString());
            return false;
        }
    }
}
