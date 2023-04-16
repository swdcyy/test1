package com.yxcorp.gifshow.upload.r1$a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import java.lang.Enum;

public class r1$a	// class@001e9e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[IUploadInfo$Status.values().length];
       try{
          r1$a.a = ointArray;
          ointArray[IUploadInfo$Status.UPLOADING.ordinal()] = 1;
          try{
             r1$a.a[IUploadInfo$Status.FAILED.ordinal()] = 2;
             try{
                r1$a.a[IUploadInfo$Status.CANCELED.ordinal()] = 3;
                try{
                   r1$a.a[IUploadInfo$Status.COMPLETE.ordinal()] = 4;
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
