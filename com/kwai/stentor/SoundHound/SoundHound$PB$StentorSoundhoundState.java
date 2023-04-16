package com.kwai.stentor.SoundHound.SoundHound$PB$StentorSoundhoundState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SoundHound$PB$StentorSoundhoundState extends Enum	// class@001905
{
    public static final SoundHound$PB$StentorSoundhoundState[] $VALUES;
    public static final SoundHound$PB$StentorSoundhoundState SoundHoundContinue;
    public static final SoundHound$PB$StentorSoundhoundState SoundHoundEnd;
    public static final SoundHound$PB$StentorSoundhoundState SoundHoundOutOfTime;

    static {
       SoundHound$PB$StentorSoundhoundState pB$StentorSo = new SoundHound$PB$StentorSoundhoundState("SoundHoundContinue", 0);
       SoundHound$PB$StentorSoundhoundState.SoundHoundContinue = pB$StentorSo;
       SoundHound$PB$StentorSoundhoundState pB$StentorSo1 = new SoundHound$PB$StentorSoundhoundState("SoundHoundEnd", 1);
       SoundHound$PB$StentorSoundhoundState.SoundHoundEnd = pB$StentorSo1;
       SoundHound$PB$StentorSoundhoundState pB$StentorSo2 = new SoundHound$PB$StentorSoundhoundState("SoundHoundOutOfTime", 2);
       SoundHound$PB$StentorSoundhoundState.SoundHoundOutOfTime = pB$StentorSo2;
       SoundHound$PB$StentorSoundhoundState[] pB$StentorSo3 = new SoundHound$PB$StentorSoundhoundState[]{pB$StentorSo,pB$StentorSo1,pB$StentorSo2};
       SoundHound$PB$StentorSoundhoundState.$VALUES = pB$StentorSo3;
    }
    public void SoundHound$PB$StentorSoundhoundState(String p0,int p1){
       super(p0, p1);
    }
    public static SoundHound$PB$StentorSoundhoundState valueOf(String p0){
       return Enum.valueOf(SoundHound$PB$StentorSoundhoundState.class, p0);
    }
    public static SoundHound$PB$StentorSoundhoundState[] values(){
       return SoundHound$PB$StentorSoundhoundState.$VALUES.clone();
    }
}
