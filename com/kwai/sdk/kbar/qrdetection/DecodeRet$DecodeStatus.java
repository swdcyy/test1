package com.kwai.sdk.kbar.qrdetection.DecodeRet$DecodeStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DecodeRet$DecodeStatus extends Enum	// class@001619
{
    public static final DecodeRet$DecodeStatus[] $VALUES;
    public static final DecodeRet$DecodeStatus DECODE_BAD_PATTERN;
    public static final DecodeRet$DecodeStatus DECODE_FAIL;
    public static final DecodeRet$DecodeStatus DECODE_SUCCESS;

    static {
       DecodeRet$DecodeStatus uDecodeStatu = new DecodeRet$DecodeStatus("DECODE_SUCCESS", 0);
       DecodeRet$DecodeStatus.DECODE_SUCCESS = uDecodeStatu;
       DecodeRet$DecodeStatus uDecodeStatu1 = new DecodeRet$DecodeStatus("DECODE_BAD_PATTERN", 1);
       DecodeRet$DecodeStatus.DECODE_BAD_PATTERN = uDecodeStatu1;
       DecodeRet$DecodeStatus uDecodeStatu2 = new DecodeRet$DecodeStatus("DECODE_FAIL", 2);
       DecodeRet$DecodeStatus.DECODE_FAIL = uDecodeStatu2;
       DecodeRet$DecodeStatus[] uDecodeStatu3 = new DecodeRet$DecodeStatus[]{uDecodeStatu,uDecodeStatu1,uDecodeStatu2};
       DecodeRet$DecodeStatus.$VALUES = uDecodeStatu3;
    }
    public void DecodeRet$DecodeStatus(String p0,int p1){
       super(p0, p1);
    }
    public static DecodeRet$DecodeStatus valueOf(String p0){
       return Enum.valueOf(DecodeRet$DecodeStatus.class, p0);
    }
    public static DecodeRet$DecodeStatus[] values(){
       return DecodeRet$DecodeStatus.$VALUES.clone();
    }
}
