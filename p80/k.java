package p80.k;
import com.kwai.plugin.dva.work.c$c;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p80.j;
import qrd.l1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kuaishou.gifshow.kswebview.KsWebViewInstallException;
import java.lang.Float;
import sj7.d;
import p80.b;

public final class k implements c$c	// class@0028d3
{
    public final KsWebViewInstaller2 a;

    public void k(KsWebViewInstaller2 p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       KsWebViewInstaller2 a = this.a.a;
       _monitor_enter(a);
       if (!this.a.a.d()) {
          _monitor_exit(a);
          return;
       }else {
          _monitor_exit(a);
          Log.g("KsWebView", "downloadDvaPlugin failed: "+p0);
          this.a.d(false, new KsWebViewInstallException(0x30da5, "Pre-download failed"));
          return;
       }
    }
    public void onProgress(float p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ok, "3")) {
          return;
       }
       KsWebViewInstaller2 a = this.a.a;
       _monitor_enter(a);
       if (!this.a.a.d()) {
          _monitor_exit(a);
          return;
       }else {
          _monitor_exit(a);
          Log.b("KsWebView", "downloadDvaPlugin onProgress: "+p0);
          this.a.b(p0);
          return;
       }
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          KsWebViewInstaller2 a = this.a.a;
          _monitor_enter(a);
          if (!this.a.a.d()) {
             _monitor_exit(a);
          }else {
             _monitor_exit(a);
             Log.g("KsWebView", "downloadDvaPlugin successful: "+p0);
             this.a.a(null, false);
          }
       }
       return;
    }
}
