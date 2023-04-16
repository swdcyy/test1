package com.kwai.library.widget.edittext.VerificationCodeView$VCInputType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class VerificationCodeView$VCInputType extends Enum	// class@00092d
{
    public static final VerificationCodeView$VCInputType[] $VALUES;
    public static final VerificationCodeView$VCInputType NUMBER;
    public static final VerificationCodeView$VCInputType NUMBERPASSWORD;
    public static final VerificationCodeView$VCInputType TEXT;
    public static final VerificationCodeView$VCInputType TEXTPASSWORD;

    static {
       VerificationCodeView$VCInputType vCInputType = new VerificationCodeView$VCInputType("NUMBER", 0);
       VerificationCodeView$VCInputType.NUMBER = vCInputType;
       VerificationCodeView$VCInputType vCInputType1 = new VerificationCodeView$VCInputType("NUMBERPASSWORD", 1);
       VerificationCodeView$VCInputType.NUMBERPASSWORD = vCInputType1;
       VerificationCodeView$VCInputType vCInputType2 = new VerificationCodeView$VCInputType("TEXT", 2);
       VerificationCodeView$VCInputType.TEXT = vCInputType2;
       VerificationCodeView$VCInputType vCInputType3 = new VerificationCodeView$VCInputType("TEXTPASSWORD", 3);
       VerificationCodeView$VCInputType.TEXTPASSWORD = vCInputType3;
       VerificationCodeView$VCInputType[] vCInputTypeA = new VerificationCodeView$VCInputType[]{vCInputType,vCInputType1,vCInputType2,vCInputType3};
       VerificationCodeView$VCInputType.$VALUES = vCInputTypeA;
    }
    public void VerificationCodeView$VCInputType(String p0,int p1){
       super(p0, p1);
    }
    public static VerificationCodeView$VCInputType valueOf(String p0){
       return Enum.valueOf(VerificationCodeView$VCInputType.class, p0);
    }
    public static VerificationCodeView$VCInputType[] values(){
       return VerificationCodeView$VCInputType.$VALUES.clone();
    }
}
