package com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$a;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$AssetIdType;
import java.lang.Enum;

public class AudioAssetUtils$a	// class@001b62
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AudioAssetUtils$AssetIdType.values().length];
       try{
          AudioAssetUtils$a.a = ointArray;
          ointArray[AudioAssetUtils$AssetIdType.MUSIC_AUDIO_ASSET.ordinal()] = 1;
          try{
             AudioAssetUtils$a.a[AudioAssetUtils$AssetIdType.RECORD_AUDIO_ASSET.ordinal()] = 2;
             try{
                AudioAssetUtils$a.a[AudioAssetUtils$AssetIdType.SPEECH_AUDIO_ASSET.ordinal()] = 3;
                try{
                   AudioAssetUtils$a.a[AudioAssetUtils$AssetIdType.OPENING_SPEECH_AUDIO_ASSET.ordinal()] = 4;
                   try{
                      AudioAssetUtils$a.a[AudioAssetUtils$AssetIdType.HIGHLIGHT_TIME_AUDIO_ASSET.ordinal()] = 5;
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
