package frc.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SmartDashboardInterface {

    Robot thisRobot;

    public SmartDashboardInterface(Robot _thisRobot){
        thisRobot = _thisRobot;
    }

    public boolean updateSmartDashboard(){
        try{
            
            if(thisRobot.variables.debugMode > 0){
                SmartDashboard.putNumber("RobotAlive", (int)Timer.getFPGATimestamp());
            }
            
            return true;
        } catch(Exception e){
            if(thisRobot.variables.debugMode > 0){
                System.out.println("Smart dashboard update:" + e);
            }
            return false;
        }
    }
}
