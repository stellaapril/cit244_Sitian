/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmodelspractice;

import inheritancepractice.DrivingMode;



/**
 *
 * @author cst
 */
public class Convertible extends Vehicle{
    public Convertible(){
        
    }
    
    public Convertible(String carname,int caryear,double carweight,double bumperheight,boolean airbag,double lengthofwheelbase,DrivingMode dm){
        super(carname,caryear,carweight,bumperheight,airbag,lengthofwheelbase,dm);
    }

    
    
}
