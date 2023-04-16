package com.kuaishou.tuna_core.multi_web_page.logger.TunaMultiWebLoggerHelper;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.multi_web_page.logger.TunaMultiWebLoggerHelper$mActivity$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;

public final class TunaMultiWebLoggerHelper	// class@0010ed
{
    public final p a;

    public void TunaMultiWebLoggerHelper(Activity p0){
       a.p(p0, "activity");
       super();
       this.a = s.c(new TunaMultiWebLoggerHelper$mActivity$2(p0));
    }
    public final Activity a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TunaMultiWebLoggerHelper tunaMultiWeb = TunaMultiWebLoggerHelper.class;
       Object obj = PatchProxy.apply(null, this, tunaMultiWeb, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, tunaMultiWeb, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.a.getValue();
       }
       return obj1.get();
    }
}
