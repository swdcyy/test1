package com.yxcorp.gifshow.util.resource.g$c;
import com.kwai.feature.post.api.model.DownloadStatus;
import java.lang.Enum;

public class g$c	// class@000ce9
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DownloadStatus.values().length];
       try{
          g$c.a = ointArray;
          ointArray[DownloadStatus.DOWNLOAD_SUCCESS.ordinal()] = 1;
          try{
             g$c.a[DownloadStatus.DOWNLOAD_FAILED.ordinal()] = 2;
             try{
                g$c.a[DownloadStatus.DOWNLOADING.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
