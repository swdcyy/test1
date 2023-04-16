package com.kwai.stentor.SoundHound.SoundHound$PB$StentorSoundhoundStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SoundHound$PB$StentorSoundhoundStatus extends Enum	// class@001906
{
    public static final SoundHound$PB$StentorSoundhoundStatus[] $VALUES;
    public static final SoundHound$PB$StentorSoundhoundStatus SoundHound_RUNNING;
    public static final SoundHound$PB$StentorSoundhoundStatus SoundHound_STOPPED;
    public static final SoundHound$PB$StentorSoundhoundStatus SoundHound_UNKNOWN;

    static {
       SoundHound$PB$StentorSoundhoundStatus pB$StentorSo = new SoundHound$PB$StentorSoundhoundStatus("SoundHound_UNKNOWN", 0);
       SoundHound$PB$StentorSoundhoundStatus.SoundHound_UNKNOWN = pB$StentorSo;
       SoundHound$PB$StentorSoundhoundStatus pB$StentorSo1 = new SoundHound$PB$StentorSoundhoundStatus("SoundHound_RUNNING", 1);
       SoundHound$PB$StentorSoundhoundStatus.SoundHound_RUNNING = pB$StentorSo1;
       SoundHound$PB$StentorSoundhoundStatus pB$StentorSo2 = new SoundHound$PB$StentorSoundhoundStatus("SoundHound_STOPPED", 2);
       SoundHound$PB$StentorSoundhoundStatus.SoundHound_STOPPED = pB$StentorSo2;
       SoundHound$PB$StentorSoundhoundStatus[] pB$StentorSo3 = new SoundHound$PB$StentorSoundhoundStatus[]{pB$StentorSo,pB$StentorSo1,pB$StentorSo2};
       SoundHound$PB$StentorSoundhoundStatus.$VALUES = pB$StentorSo3;
    }
    public void SoundHound$PB$StentorSoundhoundStatus(String p0,int p1){
       super(p0, p1);
    }
    public static SoundHound$PB$StentorSoundhoundStatus valueOf(String p0){
       return Enum.valueOf(SoundHound$PB$StentorSoundhoundStatus.class, p0);
    }
    public static SoundHound$PB$StentorSoundhoundStatus[] values(){
       return SoundHound$PB$StentorSoundhoundStatus.$VALUES.clone();
    }
}
