package com.kwai.stentor.AsrProduct.AsrListener$ASRStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AsrListener$ASRStatus extends Enum	// class@0018ff
{
    public static final AsrListener$ASRStatus[] $VALUES;
    public static final AsrListener$ASRStatus ASR_RUNNING;
    public static final AsrListener$ASRStatus ASR_SILENCE;
    public static final AsrListener$ASRStatus ASR_STOPPED;
    public static final AsrListener$ASRStatus ASR_UNKNOWN;

    static {
       AsrListener$ASRStatus uASRStatus = new AsrListener$ASRStatus("ASR_UNKNOWN", 0);
       AsrListener$ASRStatus.ASR_UNKNOWN = uASRStatus;
       AsrListener$ASRStatus uASRStatus1 = new AsrListener$ASRStatus("ASR_RUNNING", 1);
       AsrListener$ASRStatus.ASR_RUNNING = uASRStatus1;
       AsrListener$ASRStatus uASRStatus2 = new AsrListener$ASRStatus("ASR_STOPPED", 2);
       AsrListener$ASRStatus.ASR_STOPPED = uASRStatus2;
       AsrListener$ASRStatus uASRStatus3 = new AsrListener$ASRStatus("ASR_SILENCE", 3);
       AsrListener$ASRStatus.ASR_SILENCE = uASRStatus3;
       AsrListener$ASRStatus[] uASRStatusAr = new AsrListener$ASRStatus[]{uASRStatus,uASRStatus1,uASRStatus2,uASRStatus3};
       AsrListener$ASRStatus.$VALUES = uASRStatusAr;
    }
    public void AsrListener$ASRStatus(String p0,int p1){
       super(p0, p1);
    }
    public static AsrListener$ASRStatus valueOf(String p0){
       return Enum.valueOf(AsrListener$ASRStatus.class, p0);
    }
    public static AsrListener$ASRStatus[] values(){
       return AsrListener$ASRStatus.$VALUES.clone();
    }
}
