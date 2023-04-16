package com.yxcorp.gifshow.commercial.model.PhotoAdDownloadCenterItemModel$a;
import com.yxcorp.gifshow.commercial.model.PhotoAdDownloadCenterItemModel$ItemType;
import java.lang.Enum;

public class PhotoAdDownloadCenterItemModel$a	// class@001144
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PhotoAdDownloadCenterItemModel$ItemType.values().length];
       try{
          PhotoAdDownloadCenterItemModel$a.a = ointArray;
          ointArray[PhotoAdDownloadCenterItemModel$ItemType.H5_GAME.ordinal()] = 1;
          try{
             PhotoAdDownloadCenterItemModel$a.a[PhotoAdDownloadCenterItemModel$ItemType.DOWNLOAD_TASK.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
