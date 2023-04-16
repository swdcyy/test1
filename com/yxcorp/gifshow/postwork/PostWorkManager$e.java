package com.yxcorp.gifshow.postwork.PostWorkManager$e;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Enum;

public class PostWorkManager$e	// class@0010b7
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PostStatus.values().length];
       try{
          PostWorkManager$e.a = ointArray;
          ointArray[PostStatus.ENCODE_PENDING.ordinal()] = 1;
          try{
             PostWorkManager$e.a[PostStatus.ENCODING.ordinal()] = 2;
             try{
                PostWorkManager$e.a[PostStatus.ENCODE_COMPLETE.ordinal()] = 3;
                try{
                   PostWorkManager$e.a[PostStatus.UPLOAD_PENDING.ordinal()] = 4;
                   try{
                      PostWorkManager$e.a[PostStatus.UPLOADING.ordinal()] = 5;
                      try{
                         PostWorkManager$e.a[PostStatus.ENCODE_FAILED.ordinal()] = 6;
                         try{
                            PostWorkManager$e.a[PostStatus.ENCODE_CANCELED.ordinal()] = 7;
                            try{
                               PostWorkManager$e.a[PostStatus.UPLOAD_COMPLETE.ordinal()] = 8;
                               try{
                                  PostWorkManager$e.a[PostStatus.UPLOAD_FAILED.ordinal()] = 9;
                                  try{
                                     PostWorkManager$e.a[PostStatus.UPLOAD_CANCELED.ordinal()] = 10;
                                     try{
                                        PostWorkManager$e.a[PostStatus.UPLOAD_SUCCEED.ordinal()] = 11;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
