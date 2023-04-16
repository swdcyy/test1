package com.kwai.sdk.kbar.qrdetection.KBarConfig$InputImgType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KBarConfig$InputImgType extends Enum	// class@001624
{
    public final int val;
    public static final KBarConfig$InputImgType[] $VALUES;
    public static final KBarConfig$InputImgType INPUT_IMG_BGR;
    public static final KBarConfig$InputImgType INPUT_IMG_BGRA;
    public static final KBarConfig$InputImgType INPUT_IMG_NV12;
    public static final KBarConfig$InputImgType INPUT_IMG_NV21;

    static {
       KBarConfig$InputImgType inputImgType = new KBarConfig$InputImgType("INPUT_IMG_BGR", 0, 0);
       KBarConfig$InputImgType.INPUT_IMG_BGR = inputImgType;
       KBarConfig$InputImgType inputImgType1 = new KBarConfig$InputImgType("INPUT_IMG_NV12", 1, 1);
       KBarConfig$InputImgType.INPUT_IMG_NV12 = inputImgType1;
       KBarConfig$InputImgType inputImgType2 = new KBarConfig$InputImgType("INPUT_IMG_NV21", 2, 2);
       KBarConfig$InputImgType.INPUT_IMG_NV21 = inputImgType2;
       KBarConfig$InputImgType inputImgType3 = new KBarConfig$InputImgType("INPUT_IMG_BGRA", 3, 3);
       KBarConfig$InputImgType.INPUT_IMG_BGRA = inputImgType3;
       KBarConfig$InputImgType[] inputImgType4 = new KBarConfig$InputImgType[]{inputImgType,inputImgType1,inputImgType2,inputImgType3};
       KBarConfig$InputImgType.$VALUES = inputImgType4;
    }
    public void KBarConfig$InputImgType(String p0,int p1,int p2){
       super(p0, p1);
       this.val = p2;
    }
    public static KBarConfig$InputImgType valueOf(String p0){
       return Enum.valueOf(KBarConfig$InputImgType.class, p0);
    }
    public static KBarConfig$InputImgType[] values(){
       return KBarConfig$InputImgType.$VALUES.clone();
    }
    public int val(){
       return this.val;
    }
}
