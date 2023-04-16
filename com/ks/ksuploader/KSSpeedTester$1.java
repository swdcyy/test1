package com.ks.ksuploader.KSSpeedTester$1;
import com.ks.ksuploader.KSUploader$KSUploaderSpeedTestListener;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.ks.ksuploader.KSSpeedTester;
import com.ks.ksuploader.KSUploader;
import com.ks.ksuploader.KSUploaderLogLevel;
import java.lang.StringBuilder;

public final class KSSpeedTester$1 implements KSUploader$KSUploaderSpeedTestListener	// class@000759
{

    public void KSSpeedTester$1(){
       super();
    }
    public void onSpeedTestComplete(int p0,int p1,long p2){
       if (PatchProxy.isSupport(KSSpeedTester$1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, KSSpeedTester$1.class, "1")) {
          return;
       }
       _monitor_enter(KSSpeedTester.class);
       KSSpeedTester.mLastSpeedTestResult = p0;
       KSSpeedTester.uploader.release();
       KSSpeedTester.uploader = null;
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "KSSpeedTester onSpeedTestComplete "+p0);
       _monitor_exit(KSSpeedTester.class);
       return;
    }
}
