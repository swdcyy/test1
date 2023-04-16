package com.kwai.stentor.Audio.AudioCallback$DebugLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AudioCallback$DebugLevel extends Enum	// class@001902
{
    public static final AudioCallback$DebugLevel[] $VALUES;
    public static final AudioCallback$DebugLevel DEBUG;
    public static final AudioCallback$DebugLevel ERROR;
    public static final AudioCallback$DebugLevel INFO;

    static {
       AudioCallback$DebugLevel uDebugLevel = new AudioCallback$DebugLevel("DEBUG", 0);
       AudioCallback$DebugLevel.DEBUG = uDebugLevel;
       AudioCallback$DebugLevel uDebugLevel1 = new AudioCallback$DebugLevel("INFO", 1);
       AudioCallback$DebugLevel.INFO = uDebugLevel1;
       AudioCallback$DebugLevel uDebugLevel2 = new AudioCallback$DebugLevel("ERROR", 2);
       AudioCallback$DebugLevel.ERROR = uDebugLevel2;
       AudioCallback$DebugLevel[] uDebugLevelA = new AudioCallback$DebugLevel[]{uDebugLevel,uDebugLevel1,uDebugLevel2};
       AudioCallback$DebugLevel.$VALUES = uDebugLevelA;
    }
    public void AudioCallback$DebugLevel(String p0,int p1){
       super(p0, p1);
    }
    public static AudioCallback$DebugLevel valueOf(String p0){
       return Enum.valueOf(AudioCallback$DebugLevel.class, p0);
    }
    public static AudioCallback$DebugLevel[] values(){
       return AudioCallback$DebugLevel.$VALUES.clone();
    }
}
