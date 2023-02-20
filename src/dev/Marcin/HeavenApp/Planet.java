package dev.Marcin.HeavenApp;

public class Planet extends  HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getBodyType() == BodyTypes.MOON){
            return super.addSatellite(moon);
        } else{
            System.out.println("it is not a moon! Only moon allowed");
            return false;
        }
    }
}
