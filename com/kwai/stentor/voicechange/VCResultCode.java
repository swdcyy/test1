package com.kwai.stentor.voicechange.VCResultCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class VCResultCode extends Enum	// class@00190c
{
    public int value;
    public static final VCResultCode[] $VALUES;
    public static final VCResultCode VCResultCodeContinue;
    public static final VCResultCode VCResultCodeEnd;
    public static final VCResultCode VCResultCodeOutOfTime;
    public static final VCResultCode VCResultCodeServerError;
    public static final VCResultCode VCResultCodeUnknown;

    static {
       VCResultCode vCResultCode = new VCResultCode("VCResultCodeEnd", 0, 0);
       VCResultCode.VCResultCodeEnd = vCResultCode;
       VCResultCode vCResultCode1 = new VCResultCode("VCResultCodeContinue", 1, 1);
       VCResultCode.VCResultCodeContinue = vCResultCode1;
       VCResultCode vCResultCode2 = new VCResultCode("VCResultCodeOutOfTime", 2, 2);
       VCResultCode.VCResultCodeOutOfTime = vCResultCode2;
       VCResultCode vCResultCode3 = new VCResultCode("VCResultCodeServerError", 3, 3);
       VCResultCode.VCResultCodeServerError = vCResultCode3;
       VCResultCode vCResultCode4 = new VCResultCode("VCResultCodeUnknown", 4, -1);
       VCResultCode.VCResultCodeUnknown = vCResultCode4;
       VCResultCode[] vCResultCode5 = new VCResultCode[]{vCResultCode,vCResultCode1,vCResultCode2,vCResultCode3,vCResultCode4};
       VCResultCode.$VALUES = vCResultCode5;
    }
    public void VCResultCode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static VCResultCode valueOf(String p0){
       return Enum.valueOf(VCResultCode.class, p0);
    }
    public static VCResultCode[] values(){
       return VCResultCode.$VALUES.clone();
    }
    public VCResultCode fromValue(int p0){
       if (!p0) {
          return VCResultCode.VCResultCodeEnd;
       }
       if (p0 == 1) {
          return VCResultCode.VCResultCodeContinue;
       }
       if (p0 == 2) {
          return VCResultCode.VCResultCodeOutOfTime;
       }
       if (p0 != 3) {
          return VCResultCode.VCResultCodeUnknown;
       }
       return VCResultCode.VCResultCodeServerError;
    }
    public int value(){
       return this.value;
    }
}
