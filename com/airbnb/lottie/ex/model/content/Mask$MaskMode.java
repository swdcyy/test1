package com.airbnb.lottie.ex.model.content.Mask$MaskMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Mask$MaskMode extends Enum	// class@000daa
{
    public static final Mask$MaskMode[] $VALUES;
    public static final Mask$MaskMode MASK_MODE_ADD;
    public static final Mask$MaskMode MASK_MODE_INTERSECT;
    public static final Mask$MaskMode MASK_MODE_SUBTRACT;

    static {
       Mask$MaskMode maskMode = new Mask$MaskMode("MASK_MODE_ADD", 0);
       Mask$MaskMode.MASK_MODE_ADD = maskMode;
       Mask$MaskMode maskMode1 = new Mask$MaskMode("MASK_MODE_SUBTRACT", 1);
       Mask$MaskMode.MASK_MODE_SUBTRACT = maskMode1;
       Mask$MaskMode maskMode2 = new Mask$MaskMode("MASK_MODE_INTERSECT", 2);
       Mask$MaskMode.MASK_MODE_INTERSECT = maskMode2;
       Mask$MaskMode[] maskModeArra = new Mask$MaskMode[]{maskMode,maskMode1,maskMode2};
       Mask$MaskMode.$VALUES = maskModeArra;
    }
    public void Mask$MaskMode(String p0,int p1){
       super(p0, p1);
    }
    public static Mask$MaskMode valueOf(String p0){
       return Enum.valueOf(Mask$MaskMode.class, p0);
    }
    public static Mask$MaskMode[] values(){
       return Mask$MaskMode.$VALUES.clone();
    }
}
