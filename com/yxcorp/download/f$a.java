package com.yxcorp.download.f$a;
import com.yxcorp.download.DownloadTask$DownloadRequest$CacheKeyGenStrategy;
import java.lang.Enum;

public class f$a	// class@0011bb
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DownloadTask$DownloadRequest$CacheKeyGenStrategy.values().length];
       try{
          f$a.a = ointArray;
          ointArray[DownloadTask$DownloadRequest$CacheKeyGenStrategy.OnlyUrlPath.ordinal()] = 1;
          try{
             f$a.a[DownloadTask$DownloadRequest$CacheKeyGenStrategy.UrlPathWithQuery.ordinal()] = 2;
             try{
                f$a.a[DownloadTask$DownloadRequest$CacheKeyGenStrategy.WholeUrl.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
