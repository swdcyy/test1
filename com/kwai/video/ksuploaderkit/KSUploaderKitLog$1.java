package com.kwai.video.ksuploaderkit.KSUploaderKitLog$1;
import com.ks.ksuploader.KSUploaderLogListener;
import java.lang.Object;
import com.ks.ksuploader.KSUploaderLogLevel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import com.kwai.video.ksuploaderkit.KSUploaderKitLogger;

public final class KSUploaderKitLog$1 implements KSUploaderLogListener	// class@000979
{

    public void KSUploaderKitLog$1(){
       super();
    }
    public void onLog(KSUploaderLogLevel p0,String p1,long p2){
       if (PatchProxy.isSupport(KSUploaderKitLog$1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, KSUploaderKitLog$1.class, "1")) {
          return;
       }
       KSUploaderKitLog.sUploaderKitLogger.i("KSUploaderKit-RickonLog", p1);
       return;
    }
}
