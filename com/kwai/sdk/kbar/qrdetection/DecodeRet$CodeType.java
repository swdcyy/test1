package com.kwai.sdk.kbar.qrdetection.DecodeRet$CodeType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DecodeRet$CodeType extends Enum	// class@001618
{
    public static final DecodeRet$CodeType[] $VALUES;
    public static final DecodeRet$CodeType CODE_BAR;
    public static final DecodeRet$CodeType CODE_NONE;
    public static final DecodeRet$CodeType CODE_QR;

    static {
       DecodeRet$CodeType uCodeType = new DecodeRet$CodeType("CODE_BAR", 0);
       DecodeRet$CodeType.CODE_BAR = uCodeType;
       DecodeRet$CodeType uCodeType1 = new DecodeRet$CodeType("CODE_QR", 1);
       DecodeRet$CodeType.CODE_QR = uCodeType1;
       DecodeRet$CodeType uCodeType2 = new DecodeRet$CodeType("CODE_NONE", 2);
       DecodeRet$CodeType.CODE_NONE = uCodeType2;
       DecodeRet$CodeType[] uCodeTypeArr = new DecodeRet$CodeType[]{uCodeType,uCodeType1,uCodeType2};
       DecodeRet$CodeType.$VALUES = uCodeTypeArr;
    }
    public void DecodeRet$CodeType(String p0,int p1){
       super(p0, p1);
    }
    public static DecodeRet$CodeType valueOf(String p0){
       return Enum.valueOf(DecodeRet$CodeType.class, p0);
    }
    public static DecodeRet$CodeType[] values(){
       return DecodeRet$CodeType.$VALUES.clone();
    }
}
