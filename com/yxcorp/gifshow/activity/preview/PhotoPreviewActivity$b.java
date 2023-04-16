package com.yxcorp.gifshow.activity.preview.PhotoPreviewActivity$b;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.lang.Enum;

public class PhotoPreviewActivity$b	// class@00135d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TakePictureType.values().length];
       try{
          PhotoPreviewActivity$b.a = ointArray;
          ointArray[TakePictureType.LIVE_AUTHENTICATE.ordinal()] = 1;
          try{
             PhotoPreviewActivity$b.a[TakePictureType.SHARE.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
