package com.horcrux.svg.Brush$BrushUnits;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Brush$BrushUnits extends Enum	// class@00059b
{
    public static final Brush$BrushUnits[] $VALUES;
    public static final Brush$BrushUnits OBJECT_BOUNDING_BOX;
    public static final Brush$BrushUnits USER_SPACE_ON_USE;

    static {
       Brush$BrushUnits uBrushUnits = new Brush$BrushUnits("OBJECT_BOUNDING_BOX", 0);
       Brush$BrushUnits.OBJECT_BOUNDING_BOX = uBrushUnits;
       Brush$BrushUnits uBrushUnits1 = new Brush$BrushUnits("USER_SPACE_ON_USE", 1);
       Brush$BrushUnits.USER_SPACE_ON_USE = uBrushUnits1;
       Brush$BrushUnits[] uBrushUnitsA = new Brush$BrushUnits[]{uBrushUnits,uBrushUnits1};
       Brush$BrushUnits.$VALUES = uBrushUnitsA;
    }
    public void Brush$BrushUnits(String p0,int p1){
       super(p0, p1);
    }
    public static Brush$BrushUnits valueOf(String p0){
       return Enum.valueOf(Brush$BrushUnits.class, p0);
    }
    public static Brush$BrushUnits[] values(){
       return Brush$BrushUnits.$VALUES.clone();
    }
}
