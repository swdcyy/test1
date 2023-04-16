package com.kwai.video.westeros.models.CameraFacing;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.CameraFacing$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.CameraFacing$CameraFacingVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class CameraFacing extends Enum implements Internal$EnumLite	// class@000eea
{
    public final int value;
    public static final CameraFacing[] $VALUES;
    public static final CameraFacing UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final CameraFacing kCameraFacingBack;
    public static final CameraFacing kCameraFacingDefault;
    public static final CameraFacing kCameraFacingFront;

    static {
       CameraFacing uCameraFacin = new CameraFacing("kCameraFacingDefault", 0, 0);
       CameraFacing.kCameraFacingDefault = uCameraFacin;
       CameraFacing uCameraFacin1 = new CameraFacing("kCameraFacingFront", 1, 1);
       CameraFacing.kCameraFacingFront = uCameraFacin1;
       CameraFacing uCameraFacin2 = new CameraFacing("kCameraFacingBack", 2, 2);
       CameraFacing.kCameraFacingBack = uCameraFacin2;
       CameraFacing uCameraFacin3 = new CameraFacing("UNRECOGNIZED", 3, -1);
       CameraFacing.UNRECOGNIZED = uCameraFacin3;
       CameraFacing[] uCameraFacin4 = new CameraFacing[]{uCameraFacin,uCameraFacin1,uCameraFacin2,uCameraFacin3};
       CameraFacing.$VALUES = uCameraFacin4;
       CameraFacing.internalValueMap = new CameraFacing$1();
    }
    public void CameraFacing(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static CameraFacing forNumber(int p0){
       if (!p0) {
          return CameraFacing.kCameraFacingDefault;
       }
       if (p0 == 1) {
          return CameraFacing.kCameraFacingFront;
       }
       if (p0 != 2) {
          return null;
       }
       return CameraFacing.kCameraFacingBack;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return CameraFacing.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return CameraFacing$CameraFacingVerifier.INSTANCE;
    }
    public static CameraFacing valueOf(int p0){
       return CameraFacing.forNumber(p0);
    }
    public static CameraFacing valueOf(String p0){
       return Enum.valueOf(CameraFacing.class, p0);
    }
    public static CameraFacing[] values(){
       return CameraFacing.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != CameraFacing.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
