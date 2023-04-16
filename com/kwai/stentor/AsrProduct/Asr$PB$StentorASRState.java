package com.kwai.stentor.AsrProduct.Asr$PB$StentorASRState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Asr$PB$StentorASRState extends Enum	// class@0018f9
{
    public static final Asr$PB$StentorASRState[] $VALUES;
    public static final Asr$PB$StentorASRState ASRContinue;
    public static final Asr$PB$StentorASRState ASREnd;
    public static final Asr$PB$StentorASRState ASROutOfTime;

    static {
       Asr$PB$StentorASRState pB$StentorAS = new Asr$PB$StentorASRState("ASRContinue", 0);
       Asr$PB$StentorASRState.ASRContinue = pB$StentorAS;
       Asr$PB$StentorASRState pB$StentorAS1 = new Asr$PB$StentorASRState("ASREnd", 1);
       Asr$PB$StentorASRState.ASREnd = pB$StentorAS1;
       Asr$PB$StentorASRState pB$StentorAS2 = new Asr$PB$StentorASRState("ASROutOfTime", 2);
       Asr$PB$StentorASRState.ASROutOfTime = pB$StentorAS2;
       Asr$PB$StentorASRState[] pB$StentorAS3 = new Asr$PB$StentorASRState[]{pB$StentorAS,pB$StentorAS1,pB$StentorAS2};
       Asr$PB$StentorASRState.$VALUES = pB$StentorAS3;
    }
    public void Asr$PB$StentorASRState(String p0,int p1){
       super(p0, p1);
    }
    public static Asr$PB$StentorASRState valueOf(String p0){
       return Enum.valueOf(Asr$PB$StentorASRState.class, p0);
    }
    public static Asr$PB$StentorASRState[] values(){
       return Asr$PB$StentorASRState.$VALUES.clone();
    }
}
