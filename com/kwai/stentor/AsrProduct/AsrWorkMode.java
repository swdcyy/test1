package com.kwai.stentor.AsrProduct.AsrWorkMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AsrWorkMode extends Enum	// class@001901
{
    public static final AsrWorkMode[] $VALUES;
    public static final AsrWorkMode AUDIO_FIX;
    public static final AsrWorkMode AUDIO_SEARCH;
    public static final AsrWorkMode COMMON;
    public static final AsrWorkMode SOUND_HOUND;

    static {
       AsrWorkMode uAsrWorkMode = new AsrWorkMode("COMMON", 0);
       AsrWorkMode.COMMON = uAsrWorkMode;
       AsrWorkMode uAsrWorkMode1 = new AsrWorkMode("SOUND_HOUND", 1);
       AsrWorkMode.SOUND_HOUND = uAsrWorkMode1;
       AsrWorkMode uAsrWorkMode2 = new AsrWorkMode("AUDIO_FIX", 2);
       AsrWorkMode.AUDIO_FIX = uAsrWorkMode2;
       AsrWorkMode uAsrWorkMode3 = new AsrWorkMode("AUDIO_SEARCH", 3);
       AsrWorkMode.AUDIO_SEARCH = uAsrWorkMode3;
       AsrWorkMode[] uAsrWorkMode4 = new AsrWorkMode[]{uAsrWorkMode,uAsrWorkMode1,uAsrWorkMode2,uAsrWorkMode3};
       AsrWorkMode.$VALUES = uAsrWorkMode4;
    }
    public void AsrWorkMode(String p0,int p1){
       super(p0, p1);
    }
    public static AsrWorkMode valueOf(String p0){
       return Enum.valueOf(AsrWorkMode.class, p0);
    }
    public static AsrWorkMode[] values(){
       return AsrWorkMode.$VALUES.clone();
    }
}
