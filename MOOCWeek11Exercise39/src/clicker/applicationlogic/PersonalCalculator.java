/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

import java.util.*;

/**
 *
 * @author Trigg
 */
public class PersonalCalculator implements Calculator{
    private int value;
    
    public PersonalCalculator(){
        this.value = 0;
    }

    @Override
    public void increase() {
        this.value++;
    }
    
    @Override
    public String giveValue(){
        return this.value + "";
    }
    
}