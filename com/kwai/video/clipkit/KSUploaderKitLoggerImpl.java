package com.kwai.video.clipkit.KSUploaderKitLoggerImpl;
import java.lang.Object;
import com.kwai.video.clipkit.KSClipLogger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.KSUploaderKitLoggerImpl$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitLogger;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;

public class KSUploaderKitLoggerImpl	// class@001a43
{

    public void KSUploaderKitLoggerImpl(){
       super();
    }
    public static void setUploaderKitLogger(KSClipLogger p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSUploaderKitLoggerImpl.class, "1")) {
          return;
       }
       KSUploaderKitLog.setKSUploaderKitLogger(new KSUploaderKitLoggerImpl$1(p0));
       return;
    }
}
