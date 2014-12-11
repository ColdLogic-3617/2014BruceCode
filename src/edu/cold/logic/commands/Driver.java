/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cold.logic.commands;

import edu.cold.logic.commands.*;

/**
 *
 * @author Thayer
 */
public class Driver extends CommandBase {
    
    public Driver() {
        // Use requires() here to declare subsystem dependencies
          requires(drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drive.JoyDrive();
        if (oi.getDB2())
            drive.ShiftHigh();
        if (oi.getDB3())
            drive.ShiftLow();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        log.println("Driver was interrupted"); 
    }
}