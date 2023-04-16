package com.kwai.video.westeros.models.Bitmap$Format;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.Bitmap$Format$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.Bitmap$Format$FormatVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Bitmap$Format extends Enum implements Internal$EnumLite	// class@000ebb
{
    public final int value;
    public static final Bitmap$Format[] $VALUES;
    public static final Bitmap$Format ALPHA_8;
    public static final Bitmap$Format RGBA_8888;
    public static final Bitmap$Format RGB_565;
    public static final Bitmap$Format RGB_888;
    public static final Bitmap$Format UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Bitmap$Format uFormat = new Bitmap$Format("ALPHA_8", 0, 0);
       Bitmap$Format.ALPHA_8 = uFormat;
       Bitmap$Format uFormat1 = new Bitmap$Format("RGB_565", 1, 1);
       Bitmap$Format.RGB_565 = uFormat1;
       Bitmap$Format uFormat2 = new Bitmap$Format("RGB_888", 2, 2);
       Bitmap$Format.RGB_888 = uFormat2;
       Bitmap$Format uFormat3 = new Bitmap$Format("RGBA_8888", 3, 3);
       Bitmap$Format.RGBA_8888 = uFormat3;
       Bitmap$Format uFormat4 = new Bitmap$Format("UNRECOGNIZED", 4, -1);
       Bitmap$Format.UNRECOGNIZED = uFormat4;
       Bitmap$Format[] uFormatArray = new Bitmap$Format[]{uFormat,uFormat1,uFormat2,uFormat3,uFormat4};
       Bitmap$Format.$VALUES = uFormatArray;
       Bitmap$Format.internalValueMap = new Bitmap$Format$1();
    }
    public void Bitmap$Format(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Bitmap$Format forNumber(int p0){
       if (!p0) {
          return Bitmap$Format.ALPHA_8;
       }
       if (p0 == 1) {
          return Bitmap$Format.RGB_565;
       }
       if (p0 == 2) {
          return Bitmap$Format.RGB_888;
       }
       if (p0 != 3) {
          return null;
       }
       return Bitmap$Format.RGBA_8888;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Bitmap$Format.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Bitmap$Format$FormatVerifier.INSTANCE;
    }
    public static Bitmap$Format valueOf(int p0){
       return Bitmap$Format.forNumber(p0);
    }
    public static Bitmap$Format valueOf(String p0){
       return Enum.valueOf(Bitmap$Format.class, p0);
    }
    public static Bitmap$Format[] values(){
       return Bitmap$Format.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Bitmap$Format.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
