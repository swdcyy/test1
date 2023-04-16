package com.yxcorp.gifshow.util.BitmapUtil$BitmapCropMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class BitmapUtil$BitmapCropMode extends Enum	// class@001ed0
{
    public static final BitmapUtil$BitmapCropMode[] $VALUES;
    public static final BitmapUtil$BitmapCropMode BOTTOM;
    public static final BitmapUtil$BitmapCropMode CENTER;
    public static final BitmapUtil$BitmapCropMode TOP;

    static {
       BitmapUtil$BitmapCropMode uBitmapCropM = new BitmapUtil$BitmapCropMode("TOP", 0);
       BitmapUtil$BitmapCropMode.TOP = uBitmapCropM;
       BitmapUtil$BitmapCropMode uBitmapCropM1 = new BitmapUtil$BitmapCropMode("CENTER", 1);
       BitmapUtil$BitmapCropMode.CENTER = uBitmapCropM1;
       BitmapUtil$BitmapCropMode uBitmapCropM2 = new BitmapUtil$BitmapCropMode("BOTTOM", 2);
       BitmapUtil$BitmapCropMode.BOTTOM = uBitmapCropM2;
       BitmapUtil$BitmapCropMode[] uBitmapCropM3 = new BitmapUtil$BitmapCropMode[]{uBitmapCropM,uBitmapCropM1,uBitmapCropM2};
       BitmapUtil$BitmapCropMode.$VALUES = uBitmapCropM3;
    }
    public void BitmapUtil$BitmapCropMode(String p0,int p1){
       super(p0, p1);
    }
    public static BitmapUtil$BitmapCropMode valueOf(String p0){
       return Enum.valueOf(BitmapUtil$BitmapCropMode.class, p0);
    }
    public static BitmapUtil$BitmapCropMode[] values(){
       return BitmapUtil$BitmapCropMode.$VALUES.clone();
    }
}
