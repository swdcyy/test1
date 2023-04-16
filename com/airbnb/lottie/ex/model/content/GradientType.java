package com.airbnb.lottie.ex.model.content.GradientType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class GradientType extends Enum	// class@000da9
{
    public static final GradientType[] $VALUES;
    public static final GradientType LINEAR;
    public static final GradientType RADIAL;

    static {
       GradientType gradientType = new GradientType("LINEAR", 0);
       GradientType.LINEAR = gradientType;
       GradientType gradientType1 = new GradientType("RADIAL", 1);
       GradientType.RADIAL = gradientType1;
       GradientType[] gradientType2 = new GradientType[]{gradientType,gradientType1};
       GradientType.$VALUES = gradientType2;
    }
    public void GradientType(String p0,int p1){
       super(p0, p1);
    }
    public static GradientType valueOf(String p0){
       return Enum.valueOf(GradientType.class, p0);
    }
    public static GradientType[] values(){
       return GradientType.$VALUES.clone();
    }
}
