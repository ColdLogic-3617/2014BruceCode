/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.gappleto.common;

import edu.wpi.first.wpilibj.DriverStation;

/**
 * This is a custom logging tool, which will include timestamp and voltage.
 * @author Gabe
 * @since Bruce (2.2.2)
 */
public class Log
{
    private static final DriverStation Station = DriverStation.getInstance();
    
    /**
     * This custom logging tool will add the timestamp* and battery voltage to
     * any logging message for the robot.
     * *Note: on teleop, the time will start at 15 seconds.  This is not
     * necessarily the actual time.
     * @author Gabe
     * @param message	String—the message to be logged
     * @see PrintStream
     * @see DriverStation
     * @since Bruce (2.2.2)
     * @deprecated
     */
    public void printlnDep(String message)
    {
	double v = Station.getBatteryVoltage();
	double t = Station.getMatchTime();
	v = (double)(((int)(v * 10000))/10000.0);
	t = (double)(((int)(t * 10000))/10000.0);
	System.out.println("[" + t + "] v=" + v + ": " + message);
    }
    
    /**
     * This custom logging tool will add the timestamp* and battery voltage to
     * any logging message for the robot.
     * *Note: on teleop, the time will start at 15 seconds.  This is not
     * necessarily the actual time.
     * @author Gabe
     * @param message	String—the message to be logged
     * @see PrintStream
     * @see DriverStation
     * @since Bruce (2.4.2)
     */
    public static void println(String message)
    {
	double v = Station.getBatteryVoltage();
	double t = Station.getMatchTime();
	v = (double)(((int)(v * 10000))/10000.0);
	t = (double)(((int)(t * 10000))/10000.0);
	System.out.println("[" + t + "] v=" + v + ": " + message);
    }
}