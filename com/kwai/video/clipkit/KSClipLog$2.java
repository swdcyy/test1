package com.kwai.video.clipkit.KSClipLog$2;
import com.kwai.video.devicepersona.DevicePersonaLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.KSClipLogger;
import java.lang.Throwable;

public final class KSClipLog$2 implements DevicePersonaLogger	// class@001a3e
{

    public void KSClipLog$2(){
       super();
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSClipLog$2.class, "2")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.d(p0, p1);
       }
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSClipLog$2.class, "5")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.e(p0, p1, p2);
       }
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSClipLog$2.class, "3")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.i(p0, p1);
       }
       return;
    }
    public void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSClipLog$2.class, "1")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.v(p0, p1);
       }
       return;
    }
    public void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSClipLog$2.class, "4")) {
          return;
       }
       KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
       if (sKSClipLogge != null) {
          sKSClipLogge.w(p0, p1);
       }
       return;
    }
}
