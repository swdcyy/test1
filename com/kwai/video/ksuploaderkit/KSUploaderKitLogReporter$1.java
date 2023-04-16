package com.kwai.video.ksuploaderkit.KSUploaderKitLogReporter$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.Enum;

public class KSUploaderKitLogReporter$1	// class@00097c
{
    public static final int[] $SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$Status;

    static {
       int[] ointArray = new int[KSUploaderKitCommon$Status.values().length];
       try{
          KSUploaderKitLogReporter$1.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$Status = ointArray;
          ointArray[KSUploaderKitCommon$Status.Fail.ordinal()] = 1;
          try{
             KSUploaderKitLogReporter$1.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$Status[KSUploaderKitCommon$Status.Cancel.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
