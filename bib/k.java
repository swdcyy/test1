package bib.k;
import mw5.e;
import dib.a;
import android.content.Context;
import java.lang.Object;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import com.yxcorp.gifshow.message_camera.effect.IMEffectManager;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import bib.g;
import java.lang.Runnable;
import mw5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lw5.b;
import dib.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import dc5.c;
import com.kwai.camerasdk.videoCapture.CameraController;
import java.util.Objects;
import bib.f;
import bib.d;
import bib.e;
import bib.c;

public class k implements e, a	// class@0003d9
{
    public final Handler a;
    public Daenerys b;
    public CameraController c;
    public DataExtractProcessor d;
    public e e;
    public final Set f;
    public final b g;
    public boolean h;
    public boolean i;

    public void k(Context p0){
       super();
       this.f = Collections.synchronizedSet(new HashSet());
       this.g = new IMEffectManager();
       this.h = false;
       this.i = false;
       HandlerThread handlerThrea = new HandlerThread("IMRTC-Camera");
       handlerThrea.start();
       Handler handler = new Handler(handlerThrea.getLooper());
       this.a = handler;
       handler.post(new g(this, p0));
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "11")) {
          return;
       }
       if (!this.f.contains(p0)) {
          return;
       }
       this.f.remove(p0);
       return;
    }
    public b b(){
       return this.g;
    }
    public e c(){
       return this.e;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "10")) {
          return;
       }
       if (this.f.contains(p0)) {
          return;
       }
       this.f.add(p0);
       return;
    }
    public boolean isCameraRunning(){
       Object obj = PatchProxy.apply(null, this, k.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       c.g("IMRTCVideoWrapper", "isCameraRunning="+this.h);
       return this.h;
    }
    public boolean isFrontCamera(){
       k obj = PatchProxy.apply(null, this, k.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       if (obj != null) {
          return obj.isFrontCamera();
       }
       c.c("IMRTCVideoWrapper", "mCameraController is null");
       return false;
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "12")) {
          return;
       }
       c.g("IMRTCVideoWrapper", "release");
       boolean b = true;
       this.i = b;
       this.a.removeCallbacksAndMessages(objArray);
       k te = this.e;
       if (te != null) {
          Objects.requireNonNull(te);
          if (!PatchProxy.applyVoid(objArray, te, e.class, "8")) {
             c.g("IMMagicSDK", "prepareToRelease");
             te.q = b;
          }
       }
       this.g.release();
       this.a.post(new f(this));
       return;
    }
    public void stopCapture(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       String str = "IMRTCVideoWrapper";
       c.g(str, "stopCapture");
       if (this.h == null) {
          c.c(str, "stopCapture, camera is not running, return");
          return;
       }else {
          this.h = false;
          this.a.post(new d(this));
          return;
       }
    }
    public void switchCamera(){
       if (PatchProxy.applyVoid(null, this, k.class, "7")) {
          return;
       }
       c.g("IMRTCVideoWrapper", "switchCamera");
       this.a.post(new e(this));
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       String str = "IMRTCVideoWrapper";
       c.g(str, "startCapture");
       if (this.h != null) {
          c.c(str, "startCapture, camera is running now, return");
          return;
       }else {
          this.h = true;
          this.a.post(new c(this));
          return;
       }
    }
}
