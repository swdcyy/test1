package com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$a;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$Status;
import java.lang.Enum;

public class KSResourceDownloader$a	// class@0019f5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KSResourceDownloader$Status.values().length];
       try{
          KSResourceDownloader$a.a = ointArray;
          ointArray[KSResourceDownloader$Status.SUCCESS.ordinal()] = 1;
          try{
             KSResourceDownloader$a.a[KSResourceDownloader$Status.FAILED.ordinal()] = 2;
             try{
                KSResourceDownloader$a.a[KSResourceDownloader$Status.DOWNLOADING.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
