package dev.Marcin.HeavenApp;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyType;
    public enum BodyTypes{
        STAR,PLANET,DAWRF_PLANET, MOON, COMET, ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);

    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }



    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
    System.out.println("obj.getClass() is " + obj.getClass());
    System.out.println("this.getClass() is " + this.getClass());
    if((obj==null) || (obj.getClass() != this.getClass())){
        return false;
    }
    String objName = ((HeavenlyBody) obj).getName();
    return this.name.equals(objName);

}

    @Override
    public int hashCode() {

       int i = this.name.hashCode();
        System.out.println("Hash code called and is " + i+ " name is: " + this.name);

        return i;
    }
}
