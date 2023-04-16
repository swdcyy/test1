package com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory$a;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory$Type;
import java.lang.Enum;

public class VideoSourceLayoutFactory$a	// class@001051
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VideoSourceLayoutFactory$Type.values().length];
       try{
          VideoSourceLayoutFactory$a.a = ointArray;
          ointArray[VideoSourceLayoutFactory$Type.LeftCameraRightVideoLayout.ordinal()] = 1;
          try{
             VideoSourceLayoutFactory$a.a[VideoSourceLayoutFactory$Type.RightCameraLeftVideoLayout.ordinal()] = 2;
             try{
                VideoSourceLayoutFactory$a.a[VideoSourceLayoutFactory$Type.TopCameraBottomVideoLayout.ordinal()] = 3;
                try{
                   VideoSourceLayoutFactory$a.a[VideoSourceLayoutFactory$Type.BottomCameraTopVideoLayout.ordinal()] = 4;
                   try{
                      VideoSourceLayoutFactory$a.a[VideoSourceLayoutFactory$Type.LeftTopVideoLayout.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
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
