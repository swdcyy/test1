package com.kwai.library.widget.edittext.VerificationCodeView$b;
import com.kwai.library.widget.edittext.VerificationCodeView$VCInputType;
import java.lang.Enum;

public class VerificationCodeView$b	// class@00092f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VerificationCodeView$VCInputType.values().length];
       try{
          VerificationCodeView$b.a = ointArray;
          ointArray[VerificationCodeView$VCInputType.NUMBER.ordinal()] = 1;
          try{
             VerificationCodeView$b.a[VerificationCodeView$VCInputType.NUMBERPASSWORD.ordinal()] = 2;
             try{
                VerificationCodeView$b.a[VerificationCodeView$VCInputType.TEXT.ordinal()] = 3;
                try{
                   VerificationCodeView$b.a[VerificationCodeView$VCInputType.TEXTPASSWORD.ordinal()] = 4;
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
