package com.kwai.sdk.kbar.qrdetection.KBarConfig$CameraPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KBarConfig$CameraPosition extends Enum	// class@001621
{
    public final int val;
    public static final KBarConfig$CameraPosition[] $VALUES;
    public static final KBarConfig$CameraPosition CAMERA_POSITION_BACK;
    public static final KBarConfig$CameraPosition CAMERA_POSITION_FRONT;

    static {
       KBarConfig$CameraPosition uCameraPosit = new KBarConfig$CameraPosition("CAMERA_POSITION_FRONT", 0, 0);
       KBarConfig$CameraPosition.CAMERA_POSITION_FRONT = uCameraPosit;
       KBarConfig$CameraPosition uCameraPosit1 = new KBarConfig$CameraPosition("CAMERA_POSITION_BACK", 1, 1);
       KBarConfig$CameraPosition.CAMERA_POSITION_BACK = uCameraPosit1;
       KBarConfig$CameraPosition[] uCameraPosit2 = new KBarConfig$CameraPosition[]{uCameraPosit,uCameraPosit1};
       KBarConfig$CameraPosition.$VALUES = uCameraPosit2;
    }
    public void KBarConfig$CameraPosition(String p0,int p1,int p2){
       super(p0, p1);
       this.val = p2;
    }
    public static KBarConfig$CameraPosition valueOf(String p0){
       return Enum.valueOf(KBarConfig$CameraPosition.class, p0);
    }
    public static KBarConfig$CameraPosition[] values(){
       return KBarConfig$CameraPosition.$VALUES.clone();
    }
    public int val(){
       return this.val;
    }
}
