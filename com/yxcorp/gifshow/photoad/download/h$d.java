package com.yxcorp.gifshow.photoad.download.h$d;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import java.lang.Enum;

public class h$d	// class@000f83
{
    public static final int[] a;

    static {
       int[] ointArray = new int[APKDownloadTask$DownloadStatus.values().length];
       try{
          h$d.a = ointArray;
          ointArray[APKDownloadTask$DownloadStatus.STARTED.ordinal()] = 1;
          try{
             h$d.a[APKDownloadTask$DownloadStatus.ERROR.ordinal()] = 2;
             try{
                h$d.a[APKDownloadTask$DownloadStatus.PAUSED.ordinal()] = 3;
                try{
                   h$d.a[APKDownloadTask$DownloadStatus.COMPLETED.ordinal()] = 4;
                   try{
                      h$d.a[APKDownloadTask$DownloadStatus.INSTALLED.ordinal()] = 5;
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
