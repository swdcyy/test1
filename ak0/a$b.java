package ak0.a$b;
import java.util.concurrent.Callable;
import com.facebook.react.bridge.ReactContext;
import fk0.a;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ak0.a;
import java.util.Objects;
import ekd.k1;
import com.facebook.react.bridge.CatalystInstance;
import java.io.File;
import com.kuaishou.krn.experiment.ExpConfigKt;
import qrd.p;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import java.lang.StringBuilder;
import ek0.d;
import qrd.l1;
import jk0.b;
import jk0.c;
import com.kuaishou.krn.instance.JsFramework;
import com.kuaishou.krn.c;
import android.content.Context;
import android.content.res.AssetManager;
import com.kuaishou.krn.exception.KrnException;
import com.kuaishou.krn.exception.KrnExceptionType;
import java.lang.Enum;
import java.lang.Throwable;

public final class a$b implements Callable	// class@0000b6
{
    public final ReactContext b;
    public final a c;
    public final Runnable d;

    public void a$b(ReactContext p0,a p1,Runnable p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Boolean uBoolean = PatchProxy.apply(objArray, this, a$b.class, "1");
       if (uBoolean != patchProxyRe) {
       }else {
          a a = a.a;
          a$b tb = this.b;
          a$b tc = this.c;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(tb, tc, a, a.class, "4")) {
             k1.c();
             if (tb != null) {
                CatalystInstance catalystInst = tb.getCatalystInstance();
                if (catalystInst != null) {
                   a a1 = tc.a;
                   if (a1 != null && a1.isFile()) {
                      String absolutePath = a1.getAbsolutePath();
                      String str = a.a(tc.bundleId, String.valueOf(tc.versionCode));
                      Boolean uBoolean1 = PatchProxy.apply(objArray, objArray, ExpConfigKt.class, "66");
                      if (uBoolean1 == patchProxyRe) {
                         uBoolean1 = ExpConfigKt.j0.getValue();
                      }
                      if (uBoolean1.booleanValue()) {
                         _monitor_enter(catalystInst);
                         if (a.g(catalystInst.getSourceURL(), str) ^ 0x01) {
                            catalystInst.loadScriptFromFile(absolutePath, str, false);
                            d.e("load script success: "+absolutePath);
                         }else {
                            d.e("load script skipped: "+absolutePath);
                         }
                         _monitor_exit(catalystInst);
                      }else {
                         catalystInst.loadScriptFromFile(absolutePath, str, false);
                         d.e("load script success: "+absolutePath);
                      }
                      if (c.a().f0() && tc.platform != JsFramework.VUE) {
                         c uoc = c.b();
                         a.o(uoc, "KrnManager.get\(\)");
                         Context uContext = uoc.d();
                         a.o(uContext, "KrnManager.get\(\).context");
                         catalystInst.loadScriptFromAssets(uContext.getAssets(), "assets://wt_console.bundle", a.a("wt_console", "1"), false);
                      }
                   }else {
                      throw new KrnException(KrnExceptionType.LOAD_JS_ERROR.name()+", bundle 文件不存在");
                   }
                }else {
                   throw new KrnException(KrnExceptionType.LOAD_JS_ERROR.name()+", CatalystInstance is null");
                }
             }else {
                throw new KrnException(KrnExceptionType.LOAD_JS_ERROR.name()+", ReactContext is null");
             }
          }
          a$b td = this.d;
          if (td != null) {
             td.run();
          }
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
