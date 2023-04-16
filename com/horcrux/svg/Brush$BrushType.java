package com.horcrux.svg.Brush$BrushType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Brush$BrushType extends Enum	// class@00059a
{
    public static final Brush$BrushType[] $VALUES;
    public static final Brush$BrushType LINEAR_GRADIENT;
    public static final Brush$BrushType PATTERN;
    public static final Brush$BrushType RADIAL_GRADIENT;

    static {
       Brush$BrushType uBrushType = new Brush$BrushType("LINEAR_GRADIENT", 0);
       Brush$BrushType.LINEAR_GRADIENT = uBrushType;
       Brush$BrushType uBrushType1 = new Brush$BrushType("RADIAL_GRADIENT", 1);
       Brush$BrushType.RADIAL_GRADIENT = uBrushType1;
       Brush$BrushType uBrushType2 = new Brush$BrushType("PATTERN", 2);
       Brush$BrushType.PATTERN = uBrushType2;
       Brush$BrushType[] uBrushTypeAr = new Brush$BrushType[]{uBrushType,uBrushType1,uBrushType2};
       Brush$BrushType.$VALUES = uBrushTypeAr;
    }
    public void Brush$BrushType(String p0,int p1){
       super(p0, p1);
    }
    public static Brush$BrushType valueOf(String p0){
       return Enum.valueOf(Brush$BrushType.class, p0);
    }
    public static Brush$BrushType[] values(){
       return Brush$BrushType.$VALUES.clone();
    }
}
