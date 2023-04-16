package com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils$a;
import com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils$KtvAssetIdType;
import java.lang.Enum;

public class KtvEditUtils$a	// class@001b65
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KtvEditUtils$KtvAssetIdType.values().length];
       try{
          KtvEditUtils$a.a = ointArray;
          ointArray[KtvEditUtils$KtvAssetIdType.KTV_RECORD_AUDIO_ASSET.ordinal()] = 1;
          try{
             KtvEditUtils$a.a[KtvEditUtils$KtvAssetIdType.KTV_MUSIC_AUDIO_ASSET.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
