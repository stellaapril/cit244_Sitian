/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmodelspractice;

import inheritancepractice.CrashTestable;
import inheritancepractice.DrivingMode;

/**
 *
 * @author cst
 */
public abstract class Vehicle implements CrashTestable{ 
    String name;
    String vin;
    String color;
    String brand;
    String fuelType;
    int totalkm;
    int year;
    int speed;
    int max_speed;
    int numOfdoors;
    double headingInDeg;
    
    
    double weight;
    double frontBumberHeight;
    String frameMaterial;
    boolean airbagPresent;
    double lengthOfWheelBase;
    double frontWeightlevelWeight;
    double frontWeightwhenRase;
    DrivingMode drivingmode;
    
    
    public Vehicle(){
        
    }
    
    public Vehicle(String carname,int caryear,double carweight,double bumperheight,boolean airbag,double lengthofwheelbase,DrivingMode dm){
        name=carname;
        year=caryear;
        weight=carweight;
        frontBumberHeight=bumperheight;
        airbagPresent = airbag;
        lengthOfWheelBase = lengthofwheelbase;
        drivingmode=dm;
     
    }

    @Override
    public int getVehicleYear() {
        return year;
    }

    @Override
    public DrivingMode getDrivingMode() {
        return DrivingMode.SNOW;
    }

    @Override
    public double getVehicleWeight() {
        return weight;
    }

    @Override
    public double getFrontBumberHeight() {
        return frontBumberHeight;
    }

    @Override
    public String frameMaterialIdentifer() {
        return frameMaterial;
    }

    @Override
    public boolean driverAirbagPresent() {
        return airbagPresent;
    }

    @Override
    public double getLengthOfWheelBase() {
        return lengthOfWheelBase;
    }

    @Override
    public double getFrontWeightLevelWeight() {
        return frontWeightlevelWeight;
    }

    @Override
    public double getFrontWeightWhenRaised() {
        return frontWeightwhenRase;
    }
    
    
}
