package com.kwai.video.clipkit.KSUploaderKitLoggerImpl$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitLogger;
import com.kwai.video.clipkit.KSClipLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;

public final class KSUploaderKitLoggerImpl$1 implements KSUploaderKitLogger	// class@001a42
{
    public final KSClipLogger val$clipLogger;

    public void KSUploaderKitLoggerImpl$1(KSClipLogger p0){
       this.val$clipLogger = p0;
       super();
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploaderKitLoggerImpl$1.class, "2")) {
          return;
       }
       KSUploaderKitLoggerImpl$1 tval$clipLog = this.val$clipLogger;
       if (tval$clipLog != null) {
          tval$clipLog.d(p0, p1);
       }
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSUploaderKitLoggerImpl$1.class, "5")) {
          return;
       }
       KSUploaderKitLoggerImpl$1 tval$clipLog = this.val$clipLogger;
       if (tval$clipLog != null) {
          tval$clipLog.e(p0, p1, p2);
       }
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploaderKitLoggerImpl$1.class, "3")) {
          return;
       }
       KSUploaderKitLoggerImpl$1 tval$clipLog = this.val$clipLogger;
       if (tval$clipLog != null) {
          tval$clipLog.i(p0, p1);
       }
       return;
    }
    public void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploaderKitLoggerImpl$1.class, "1")) {
          return;
       }
       KSUploaderKitLoggerImpl$1 tval$clipLog = this.val$clipLogger;
       if (tval$clipLog != null) {
          tval$clipLog.v(p0, p1);
       }
       return;
    }
    public void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploaderKitLoggerImpl$1.class, "4")) {
          return;
       }
       KSUploaderKitLoggerImpl$1 tval$clipLog = this.val$clipLogger;
       if (tval$clipLog != null) {
          tval$clipLog.w(p0, p1);
       }
       return;
    }
}
