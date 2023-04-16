package com.yxcorp.gifshow.camerasdk.videosourcelayout.b$a;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory$Type;
import java.lang.Enum;

public class b$a	// class@001054
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VideoSourceLayoutFactory$Type.values().length];
       try{
          b$a.a = ointArray;
          ointArray[VideoSourceLayoutFactory$Type.LeftCameraRightVideoLayout.ordinal()] = 1;
          try{
             b$a.a[VideoSourceLayoutFactory$Type.RightCameraLeftVideoLayout.ordinal()] = 2;
             try{
                b$a.a[VideoSourceLayoutFactory$Type.TopCameraBottomVideoLayout.ordinal()] = 3;
                try{
                   b$a.a[VideoSourceLayoutFactory$Type.BottomCameraTopVideoLayout.ordinal()] = 4;
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
