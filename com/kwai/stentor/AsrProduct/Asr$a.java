package com.kwai.stentor.AsrProduct.Asr$a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus;
import java.lang.Enum;

public class Asr$a	// class@0018fc
{
    public static final int[] a;

    static {
       int[] ointArray = new int[StentorMMU$RtAsrStatus.values().length];
       try{
          Asr$a.a = ointArray;
          ointArray[StentorMMU$RtAsrStatus.ASR_SILENCE.ordinal()] = 1;
          try{
             Asr$a.a[StentorMMU$RtAsrStatus.ASR_STOPPED.ordinal()] = 2;
             try{
                Asr$a.a[StentorMMU$RtAsrStatus.ASR_RUNNING.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
