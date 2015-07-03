/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processsimulation;

import java.awt.Color;

/**
 *
 * @author Yasiru
 */
public class Process {
    private String pid;
    private int at,st;
    private Color color;
    
    public Process(String pid,int at,int st,Color color){
        this.pid=pid;
        this.at=at;
        this.st=st;
        this.color=color;
    }
    
    public void getPID(String pid){
        this.pid=pid;
    }
    
}
