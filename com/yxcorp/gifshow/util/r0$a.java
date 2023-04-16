package com.yxcorp.gifshow.util.r0$a;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType;
import java.lang.Enum;

public class r0$a	// class@001f99
{
    public static final int[] a;

    static {
       int[] ointArray = new int[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.values().length];
       try{
          r0$a.a = ointArray;
          ointArray[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Prepared.ordinal()] = 1;
          try{
             r0$a.a[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Completed.ordinal()] = 2;
             try{
                r0$a.a[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Canceled.ordinal()] = 3;
                try{
                   r0$a.a[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Failed.ordinal()] = 4;
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
