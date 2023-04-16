package com.kwai.sdk.kbar.qrdetection.DecodeRet$a;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$DecodeStatus;
import java.lang.Enum;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$CodeType;

public class DecodeRet$a	// class@00161a
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[DecodeRet$DecodeStatus.values().length];
       DecodeRet$a.b = ointArray;
       try{
          int i = 1;
          ointArray[DecodeRet$DecodeStatus.DECODE_SUCCESS.ordinal()] = i;
          int i1 = 2;
          try{
             DecodeRet$a.b[DecodeRet$DecodeStatus.DECODE_BAD_PATTERN.ordinal()] = i1;
             int i2 = 3;
             try{
                DecodeRet$a.b[DecodeRet$DecodeStatus.DECODE_FAIL.ordinal()] = i2;
                int[] ointArray1 = new int[DecodeRet$CodeType.values().length];
                try{
                   DecodeRet$a.a = ointArray1;
                   ointArray1[DecodeRet$CodeType.CODE_BAR.ordinal()] = i;
                   try{
                      DecodeRet$a.a[DecodeRet$CodeType.CODE_QR.ordinal()] = e0;
                      try{
                         DecodeRet$a.a[DecodeRet$CodeType.CODE_NONE.ordinal()] = i2;
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
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
