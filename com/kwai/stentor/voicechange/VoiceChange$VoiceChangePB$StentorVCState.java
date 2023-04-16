package com.kwai.stentor.voicechange.VoiceChange$VoiceChangePB$StentorVCState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class VoiceChange$VoiceChangePB$StentorVCState extends Enum	// class@00190f
{
    public static final VoiceChange$VoiceChangePB$StentorVCState[] $VALUES;
    public static final VoiceChange$VoiceChangePB$StentorVCState VCOutOfTime;
    public static final VoiceChange$VoiceChangePB$StentorVCState VCServerError;
    public static final VoiceChange$VoiceChangePB$StentorVCState VCSuccess;

    static {
       VoiceChange$VoiceChangePB$StentorVCState voiceChangeP = new VoiceChange$VoiceChangePB$StentorVCState("VCSuccess", 0);
       VoiceChange$VoiceChangePB$StentorVCState.VCSuccess = voiceChangeP;
       VoiceChange$VoiceChangePB$StentorVCState voiceChangeP1 = new VoiceChange$VoiceChangePB$StentorVCState("VCOutOfTime", 1);
       VoiceChange$VoiceChangePB$StentorVCState.VCOutOfTime = voiceChangeP1;
       VoiceChange$VoiceChangePB$StentorVCState voiceChangeP2 = new VoiceChange$VoiceChangePB$StentorVCState("VCServerError", 2);
       VoiceChange$VoiceChangePB$StentorVCState.VCServerError = voiceChangeP2;
       VoiceChange$VoiceChangePB$StentorVCState[] voiceChangeP3 = new VoiceChange$VoiceChangePB$StentorVCState[]{voiceChangeP,voiceChangeP1,voiceChangeP2};
       VoiceChange$VoiceChangePB$StentorVCState.$VALUES = voiceChangeP3;
    }
    public void VoiceChange$VoiceChangePB$StentorVCState(String p0,int p1){
       super(p0, p1);
    }
    public static VoiceChange$VoiceChangePB$StentorVCState valueOf(String p0){
       return Enum.valueOf(VoiceChange$VoiceChangePB$StentorVCState.class, p0);
    }
    public static VoiceChange$VoiceChangePB$StentorVCState[] values(){
       return VoiceChange$VoiceChangePB$StentorVCState.$VALUES.clone();
    }
}
