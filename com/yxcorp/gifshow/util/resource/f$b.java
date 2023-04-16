package com.yxcorp.gifshow.util.resource.f$b;
import com.kwai.feature.post.api.model.DownloadStatus;
import java.lang.Enum;

public class f$b	// class@000ce4
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DownloadStatus.values().length];
       try{
          f$b.a = ointArray;
          ointArray[DownloadStatus.DOWNLOADING.ordinal()] = 1;
          try{
             f$b.a[DownloadStatus.DOWNLOAD_USE_MOBILE_NET_PROMPT.ordinal()] = 2;
             try{
                f$b.a[DownloadStatus.DOWNLOAD_FAILED.ordinal()] = 3;
                try{
                   f$b.a[DownloadStatus.DOWNLOAD_NETWORK_UNCONNECTED.ordinal()] = 4;
                   try{
                      f$b.a[DownloadStatus.DOWNLOAD_SUCCESS.ordinal()] = 5;
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
