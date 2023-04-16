package com.yxcorp.gifshow.encode.EncodeManager$b;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import java.lang.Enum;

public class EncodeManager$b	// class@000d02
{
    public static final int[] a;

    static {
       int[] ointArray = new int[EncodeInfo$Status.values().length];
       try{
          EncodeManager$b.a = ointArray;
          ointArray[EncodeInfo$Status.ENCODING.ordinal()] = 1;
          try{
             EncodeManager$b.a[EncodeInfo$Status.COMPLETE.ordinal()] = 2;
             try{
                EncodeManager$b.a[EncodeInfo$Status.FAILED.ordinal()] = 3;
                try{
                   EncodeManager$b.a[EncodeInfo$Status.CANCELED.ordinal()] = 4;
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
