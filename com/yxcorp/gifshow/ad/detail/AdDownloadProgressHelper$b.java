package com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$b;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import java.lang.Enum;

public class AdDownloadProgressHelper$b	// class@00153e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[APKDownloadTask$DownloadStatus.values().length];
       try{
          AdDownloadProgressHelper$b.a = ointArray;
          ointArray[APKDownloadTask$DownloadStatus.INITIALIZED.ordinal()] = 1;
          try{
             AdDownloadProgressHelper$b.a[APKDownloadTask$DownloadStatus.STARTED.ordinal()] = 2;
             try{
                AdDownloadProgressHelper$b.a[APKDownloadTask$DownloadStatus.PAUSED.ordinal()] = 3;
                try{
                   AdDownloadProgressHelper$b.a[APKDownloadTask$DownloadStatus.COMPLETED.ordinal()] = 4;
                   try{
                      AdDownloadProgressHelper$b.a[APKDownloadTask$DownloadStatus.INSTALLED.ordinal()] = 5;
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
