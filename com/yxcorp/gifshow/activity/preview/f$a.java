package com.yxcorp.gifshow.activity.preview.f$a;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import java.lang.Enum;

public class f$a	// class@001364
{
    public static final int[] a;

    static {
       int[] ointArray = new int[EncodeInfo$Status.values().length];
       try{
          f$a.a = ointArray;
          ointArray[EncodeInfo$Status.COMPLETE.ordinal()] = 1;
          try{
             f$a.a[EncodeInfo$Status.FAILED.ordinal()] = 2;
             try{
                f$a.a[EncodeInfo$Status.CANCELED.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
