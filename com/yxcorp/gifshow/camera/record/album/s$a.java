package com.yxcorp.gifshow.camera.record.album.s$a;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType;
import java.lang.Enum;

public class s$a	// class@001cc8
{
    public static final int[] a;

    static {
       int[] ointArray = new int[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.values().length];
       try{
          s$a.a = ointArray;
          ointArray[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Canceled.ordinal()] = 1;
          try{
             s$a.a[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Failed.ordinal()] = 2;
             try{
                s$a.a[MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Completed.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
