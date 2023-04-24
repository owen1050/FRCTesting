package frc.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Logging {

    Robot thisRobot;

    public Logging(Robot _thisRobot){
        thisRobot = _thisRobot;
    }

    public boolean robotLogging(){
        try{
            if(thisRobot.keepAliveTimer.advanceIfElapsed(1)){
                if(thisRobot.variables.debugMode > 1){
                  System.out.println("KeepAlive:" + (int)Timer.getFPGATimestamp());
                }
            }
            return true;
        }
        catch(Exception e){
            if(thisRobot.variables.debugMode > 0){
                System.out.println("robotLogging error:" + e);
            }
            return false;
        }
    }
    
}
