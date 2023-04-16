package com.yxcorp.gifshow.postwork.e$a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import java.lang.Enum;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;

public class e$a	// class@0010c6
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[IUploadInfo$Status.values().length];
       e$a.b = ointArray;
       try{
          int i = 1;
          ointArray[IUploadInfo$Status.PENDING.ordinal()] = i;
          int i1 = 2;
          try{
             e$a.b[IUploadInfo$Status.UPLOADING.ordinal()] = i1;
             int i2 = 3;
             try{
                e$a.b[IUploadInfo$Status.COMPLETE.ordinal()] = i2;
                int i3 = 4;
                try{
                   e$a.b[IUploadInfo$Status.FAILED.ordinal()] = i3;
                   int i4 = 5;
                   try{
                      e$a.b[IUploadInfo$Status.CANCELED.ordinal()] = i4;
                      int[] ointArray1 = new int[EncodeInfo$Status.values().length];
                      try{
                         e$a.a = ointArray1;
                         ointArray1[EncodeInfo$Status.PENDING.ordinal()] = i;
                         try{
                            e$a.a[EncodeInfo$Status.ENCODING.ordinal()] = e0;
                            try{
                               e$a.a[EncodeInfo$Status.COMPLETE.ordinal()] = i2;
                               try{
                                  e$a.a[EncodeInfo$Status.FAILED.ordinal()] = i3;
                                  try{
                                     e$a.a[EncodeInfo$Status.CANCELED.ordinal()] = i4;
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
