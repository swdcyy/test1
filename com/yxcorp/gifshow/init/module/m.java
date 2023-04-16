package com.yxcorp.gifshow.init.module.m;
import zf6.m;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.DayNightInitModule;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import zf6.h;
import com.yxcorp.gifshow.loading.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.config.KwaiRefreshManager;
import p17.c;
import com.kwai.library.widget.icon.b;

public final class m implements m	// class@0019cd
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final void a(boolean p0){
       e.v("dayNight", String.valueOf(p0));
       RxBus.f.b(new h(p0));
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoa, "4")) {
          p0 = a.a(p0);
          c d = KwaiRefreshManager.d;
          if (d != null) {
             d.a = p0;
          }
       }
       b.a();
       return;
    }
}
