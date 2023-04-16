package com.yxcorp.gifshow.camerasdk.j$f;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import java.lang.Enum;
import com.kwai.video.westeros.models.CameraFacing;

public class j$f	// class@00101f
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[TakePictureSource.values().length];
       j$f.b = ointArray;
       try{
          int i = 1;
          ointArray[TakePictureSource.SOURCE_CAMERA_SHOOT.ordinal()] = i;
          int i1 = 2;
          try{
             j$f.b[TakePictureSource.SOURCE_PREVIEW_FRAME.ordinal()] = i1;
             int i2 = 3;
             try{
                j$f.b[TakePictureSource.SOURCE_UNDEFINE.ordinal()] = i2;
                int[] ointArray1 = new int[CameraFacing.values().length];
                try{
                   j$f.a = ointArray1;
                   ointArray1[CameraFacing.UNRECOGNIZED.ordinal()] = i;
                   try{
                      j$f.a[CameraFacing.kCameraFacingBack.ordinal()] = e0;
                      try{
                         j$f.a[CameraFacing.kCameraFacingFront.ordinal()] = i2;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
