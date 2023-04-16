package com.kwai.stentor.AsrProduct.AsrListener$ASRResultCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AsrListener$ASRResultCode extends Enum	// class@0018fe
{
    public static final AsrListener$ASRResultCode[] $VALUES;
    public static final AsrListener$ASRResultCode ASR_CONTINUE;
    public static final AsrListener$ASRResultCode ASR_END;
    public static final AsrListener$ASRResultCode ASR_OUT_OF_TIME;

    static {
       AsrListener$ASRResultCode uASRResultCo = new AsrListener$ASRResultCode("ASR_CONTINUE", 0);
       AsrListener$ASRResultCode.ASR_CONTINUE = uASRResultCo;
       AsrListener$ASRResultCode uASRResultCo1 = new AsrListener$ASRResultCode("ASR_END", 1);
       AsrListener$ASRResultCode.ASR_END = uASRResultCo1;
       AsrListener$ASRResultCode uASRResultCo2 = new AsrListener$ASRResultCode("ASR_OUT_OF_TIME", 2);
       AsrListener$ASRResultCode.ASR_OUT_OF_TIME = uASRResultCo2;
       AsrListener$ASRResultCode[] uASRResultCo3 = new AsrListener$ASRResultCode[]{uASRResultCo,uASRResultCo1,uASRResultCo2};
       AsrListener$ASRResultCode.$VALUES = uASRResultCo3;
    }
    public void AsrListener$ASRResultCode(String p0,int p1){
       super(p0, p1);
    }
    public static AsrListener$ASRResultCode valueOf(String p0){
       return Enum.valueOf(AsrListener$ASRResultCode.class, p0);
    }
    public static AsrListener$ASRResultCode[] values(){
       return AsrListener$ASRResultCode.$VALUES.clone();
    }
}
