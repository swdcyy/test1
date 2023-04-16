package p80.f;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Boolean;
import com.kuaishou.webkit.extension.KsCoreInitSettings;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import t80.a;

public final class f implements KwSdk$CoreInitCallback	// class@0028ce
{
    public final KwSdk$CoreInitCallback a;

    public void f(KwSdk$CoreInitCallback p0){
       this.a = p0;
       super();
    }
    public void onCoreLoadFailed(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "3")) {
          return;
       }
       KsWebViewInitModule.A.g(true);
       Log.g("KsWebView", "kswebview loaded error "+p0+", "+p1);
       this.a.onCoreLoadFailed(p0, p1);
       return;
    }
    public void onCoreLoadFinished(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "2")) {
          return;
       }
       Log.g("KsWebView", "use kswebview "+p0);
       KsWebViewInitModule$a a = KsWebViewInitModule.A;
       a.g(true);
       a.i(p0);
       this.a.onCoreLoadFinished(p0);
       return;
    }
    public void onPreLoadCore(KsCoreInitSettings p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.enableMultiProcess(false);
       p0.disableHiddenApiUnseal();
       this.a.onPreLoadCore(p0);
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (uoc.c()) {
          if (a.a("KEY_ENABLE_DEV_MODE")) {
             p0.setDevMode(2);
          }
       }else {
          p0.ignoreDataDirLockFailure();
       }
       return;
    }
}
