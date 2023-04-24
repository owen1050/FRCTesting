package frc.GlobalVariables;

import frc.robot.Robot;

public class Variables {

    Robot thisRobot;

    public Variables(Robot _thisRobot){
        thisRobot = _thisRobot;
    }

    //Logging-Debug Mode (0 - None, 1 - Warnings, 2 - Debug)
    public int debugMode = 1;

    //PID Constants
    public double testPID_P = 1;
    public double testPID_I = 1;
    public double testPID_D = 1;
    
}
