package com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$AssetIdType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AudioAssetUtils$AssetIdType extends Enum	// class@001b61
{
    public static final AudioAssetUtils$AssetIdType[] $VALUES;
    public static final AudioAssetUtils$AssetIdType HIGHLIGHT_TIME_AUDIO_ASSET;
    public static final AudioAssetUtils$AssetIdType KUAISHAN_AUDIO_ASSET;
    public static final AudioAssetUtils$AssetIdType MUSIC_AUDIO_ASSET;
    public static final AudioAssetUtils$AssetIdType OPENING_SPEECH_AUDIO_ASSET;
    public static final AudioAssetUtils$AssetIdType RECORD_AUDIO_ASSET;
    public static final AudioAssetUtils$AssetIdType SPEECH_AUDIO_ASSET;

    static {
       AudioAssetUtils$AssetIdType uAssetIdType = new AudioAssetUtils$AssetIdType("RECORD_AUDIO_ASSET", 0);
       AudioAssetUtils$AssetIdType.RECORD_AUDIO_ASSET = uAssetIdType;
       AudioAssetUtils$AssetIdType uAssetIdType1 = new AudioAssetUtils$AssetIdType("MUSIC_AUDIO_ASSET", 1);
       AudioAssetUtils$AssetIdType.MUSIC_AUDIO_ASSET = uAssetIdType1;
       AudioAssetUtils$AssetIdType uAssetIdType2 = new AudioAssetUtils$AssetIdType("SPEECH_AUDIO_ASSET", 2);
       AudioAssetUtils$AssetIdType.SPEECH_AUDIO_ASSET = uAssetIdType2;
       AudioAssetUtils$AssetIdType uAssetIdType3 = new AudioAssetUtils$AssetIdType("KUAISHAN_AUDIO_ASSET", 3);
       AudioAssetUtils$AssetIdType.KUAISHAN_AUDIO_ASSET = uAssetIdType3;
       AudioAssetUtils$AssetIdType uAssetIdType4 = new AudioAssetUtils$AssetIdType("OPENING_SPEECH_AUDIO_ASSET", 4);
       AudioAssetUtils$AssetIdType.OPENING_SPEECH_AUDIO_ASSET = uAssetIdType4;
       AudioAssetUtils$AssetIdType uAssetIdType5 = new AudioAssetUtils$AssetIdType("HIGHLIGHT_TIME_AUDIO_ASSET", 5);
       AudioAssetUtils$AssetIdType.HIGHLIGHT_TIME_AUDIO_ASSET = uAssetIdType5;
       AudioAssetUtils$AssetIdType[] uAssetIdType6 = new AudioAssetUtils$AssetIdType[]{uAssetIdType,uAssetIdType1,uAssetIdType2,uAssetIdType3,uAssetIdType4,uAssetIdType5};
       AudioAssetUtils$AssetIdType.$VALUES = uAssetIdType6;
    }
    public void AudioAssetUtils$AssetIdType(String p0,int p1){
       super(p0, p1);
    }
    public static AudioAssetUtils$AssetIdType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AudioAssetUtils$AssetIdType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AudioAssetUtils$AssetIdType.class, p0);
    }
    public static AudioAssetUtils$AssetIdType[] values(){
       Object obj = PatchProxy.apply(null, null, AudioAssetUtils$AssetIdType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AudioAssetUtils$AssetIdType.$VALUES.clone();
    }
}
