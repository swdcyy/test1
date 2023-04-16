package com.kwai.stentor.AsrProduct.Asr$PB$StentorASRStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Asr$PB$StentorASRStatus extends Enum	// class@0018fa
{
    public static final Asr$PB$StentorASRStatus[] $VALUES;
    public static final Asr$PB$StentorASRStatus ASR_RUNNING;
    public static final Asr$PB$StentorASRStatus ASR_SILENCE;
    public static final Asr$PB$StentorASRStatus ASR_STOPPED;
    public static final Asr$PB$StentorASRStatus ASR_UNKNOWN;

    static {
       Asr$PB$StentorASRStatus pB$StentorAS = new Asr$PB$StentorASRStatus("ASR_UNKNOWN", 0);
       Asr$PB$StentorASRStatus.ASR_UNKNOWN = pB$StentorAS;
       Asr$PB$StentorASRStatus pB$StentorAS1 = new Asr$PB$StentorASRStatus("ASR_RUNNING", 1);
       Asr$PB$StentorASRStatus.ASR_RUNNING = pB$StentorAS1;
       Asr$PB$StentorASRStatus pB$StentorAS2 = new Asr$PB$StentorASRStatus("ASR_STOPPED", 2);
       Asr$PB$StentorASRStatus.ASR_STOPPED = pB$StentorAS2;
       Asr$PB$StentorASRStatus pB$StentorAS3 = new Asr$PB$StentorASRStatus("ASR_SILENCE", 3);
       Asr$PB$StentorASRStatus.ASR_SILENCE = pB$StentorAS3;
       Asr$PB$StentorASRStatus[] pB$StentorAS4 = new Asr$PB$StentorASRStatus[]{pB$StentorAS,pB$StentorAS1,pB$StentorAS2,pB$StentorAS3};
       Asr$PB$StentorASRStatus.$VALUES = pB$StentorAS4;
    }
    public void Asr$PB$StentorASRStatus(String p0,int p1){
       super(p0, p1);
    }
    public static Asr$PB$StentorASRStatus valueOf(String p0){
       return Enum.valueOf(Asr$PB$StentorASRStatus.class, p0);
    }
    public static Asr$PB$StentorASRStatus[] values(){
       return Asr$PB$StentorASRStatus.$VALUES.clone();
    }
}
