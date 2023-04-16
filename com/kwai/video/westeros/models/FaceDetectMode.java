package com.kwai.video.westeros.models.FaceDetectMode;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.FaceDetectMode$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.FaceDetectMode$FaceDetectModeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class FaceDetectMode extends Enum implements Internal$EnumLite	// class@000f62
{
    public final int value;
    public static final FaceDetectMode[] $VALUES;
    public static final FaceDetectMode UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final FaceDetectMode kDetectTrack;
    public static final FaceDetectMode kNormal;
    public static final FaceDetectMode kTracking;
    public static final FaceDetectMode kTrackingFast;
    public static final FaceDetectMode kTrackingRect;
    public static final FaceDetectMode kTrackingRobust;

    static {
       FaceDetectMode uFaceDetectM = new FaceDetectMode("kNormal", 0, 0);
       FaceDetectMode.kNormal = uFaceDetectM;
       FaceDetectMode uFaceDetectM1 = new FaceDetectMode("kTracking", 1, 1);
       FaceDetectMode.kTracking = uFaceDetectM1;
       FaceDetectMode uFaceDetectM2 = new FaceDetectMode("kTrackingFast", 2, 2);
       FaceDetectMode.kTrackingFast = uFaceDetectM2;
       FaceDetectMode uFaceDetectM3 = new FaceDetectMode("kTrackingRobust", 3, 3);
       FaceDetectMode.kTrackingRobust = uFaceDetectM3;
       FaceDetectMode uFaceDetectM4 = new FaceDetectMode("kDetectTrack", 4, 4);
       FaceDetectMode.kDetectTrack = uFaceDetectM4;
       FaceDetectMode uFaceDetectM5 = new FaceDetectMode("kTrackingRect", 5, 5);
       FaceDetectMode.kTrackingRect = uFaceDetectM5;
       FaceDetectMode uFaceDetectM6 = new FaceDetectMode("UNRECOGNIZED", 6, -1);
       FaceDetectMode.UNRECOGNIZED = uFaceDetectM6;
       FaceDetectMode[] uFaceDetectM7 = new FaceDetectMode[]{uFaceDetectM,uFaceDetectM1,uFaceDetectM2,uFaceDetectM3,uFaceDetectM4,uFaceDetectM5,uFaceDetectM6};
       FaceDetectMode.$VALUES = uFaceDetectM7;
       FaceDetectMode.internalValueMap = new FaceDetectMode$1();
    }
    public void FaceDetectMode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static FaceDetectMode forNumber(int p0){
       if (!p0) {
          return FaceDetectMode.kNormal;
       }
       if (p0 == 1) {
          return FaceDetectMode.kTracking;
       }
       if (p0 == 2) {
          return FaceDetectMode.kTrackingFast;
       }
       if (p0 == 3) {
          return FaceDetectMode.kTrackingRobust;
       }
       if (p0 == 4) {
          return FaceDetectMode.kDetectTrack;
       }
       if (p0 != 5) {
          return null;
       }
       return FaceDetectMode.kTrackingRect;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return FaceDetectMode.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return FaceDetectMode$FaceDetectModeVerifier.INSTANCE;
    }
    public static FaceDetectMode valueOf(int p0){
       return FaceDetectMode.forNumber(p0);
    }
    public static FaceDetectMode valueOf(String p0){
       return Enum.valueOf(FaceDetectMode.class, p0);
    }
    public static FaceDetectMode[] values(){
       return FaceDetectMode.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != FaceDetectMode.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
