package com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$tagController$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter;
import java.lang.Object;
import vx1.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hf3.a;
import v51.a;
import vx1.l;
import java.util.Objects;
import vx1.l$a;
import vx1.a;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService;
import vq5.d;
import xp5.i;

public final class LiveLiteTempPlayPresenter$tagController$2 extends Lambda implements a	// class@000b83
{
    public final LiveLiteTempPlayPresenter this$0;

    public void LiveLiteTempPlayPresenter$tagController$2(LiveLiteTempPlayPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       l$a a;
       a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, LiveLiteTempPlayPresenter$tagController$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       LiveLiteTempPlayPresenter y = this.this$0.y;
       if (y == null) {
          a.S("liveLongConnectManager");
       }
       a uoa = y.u();
       a.o(uoa, "liveLongConnectManager.liveLongConnection");
       a = l.a;
       LiveLiteTempPlayPresenter h = this.this$0.H;
       Objects.requireNonNull(a);
       c obj1 = PatchProxy.applyOneRefs(h, a, l$a.class, "2");
       if (obj1 != patchProxyRe) {
          uoa1 = obj1;
       }else {
          a.p(h, "liteTempPlayService");
          uoa1 = new a(h);
       }
       LiveLiteTempPlayPresenter z = this.this$0.z;
       if (z == null) {
          a.S("liveRouterManager");
       }
       LiveLiteTempPlayPresenter w = this.this$0.w;
       if (w == null) {
          a.S("logPackageProvider");
       }
       obj1 = new c(uoa, uoa1, z, w, false);
       return obj;
    }
}
