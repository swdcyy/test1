package com.yxcorp.gifshow.camera.record.photo.TakePictureFragment$a;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.lang.Enum;

public class TakePictureFragment$a	// class@000ea1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TakePictureType.values().length];
       try{
          TakePictureFragment$a.a = ointArray;
          ointArray[TakePictureType.LIVE_AVATAR.ordinal()] = 1;
          try{
             TakePictureFragment$a.a[TakePictureType.LIVE_ENTRY.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
