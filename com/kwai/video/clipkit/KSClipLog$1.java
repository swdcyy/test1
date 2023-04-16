package com.kwai.video.clipkit.KSClipLog$1;
import com.kwai.video.editorsdk2.logger.EditorSdkDebugLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.KSClipLogger;

public final class KSClipLog$1 implements EditorSdkDebugLogger	// class@001a3d
{

    public void KSClipLog$1(){
       super();
    }
    public void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSClipLog$1.class, "3")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.d(p0, p1);
       }
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSClipLog$1.class, "5")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.e(p0, p1, p2);
       }
       return;
    }
    public void i(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSClipLog$1.class, "2")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.i(p0, p1);
       }
       return;
    }
    public void v(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSClipLog$1.class, "1")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.v(p0, p1);
       }
       return;
    }
    public void w(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSClipLog$1.class, "4")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.w(p0, p1);
       }
       return;
    }
}
