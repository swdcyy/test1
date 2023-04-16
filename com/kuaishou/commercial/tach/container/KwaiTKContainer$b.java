package com.kuaishou.commercial.tach.container.KwaiTKContainer$b;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Integer;
import tx4.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import wz.a;
import zw4.a;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$b$a;
import zw4.a$a;
import bx4.a;
import android.os.SystemClock;
import bx4.h;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$b$b;
import tx4.w;
import com.kuaishou.tachikoma.api.TachikomaBundleApi;
import com.kuaishou.commercial.tach.container.c;
import oo8.h;
import brd.a0;
import com.kuaishou.commercial.tach.container.d;
import com.kuaishou.commercial.tach.container.e;
import erd.g;
import crd.b;
import i00.e;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.commercial.tach.container.KwaiTKContainer;
import qrd.p;

public final class KwaiTKContainer$b	// class@00167a
{

    public void KwaiTKContainer$b(){
       super();
    }
    public void KwaiTKContainer$b(u p0){
       super();
    }
    public final void a(String p0,Integer p1,boolean p2,f p3){
       if (PatchProxy.isSupport(KwaiTKContainer$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, KwaiTKContainer$b.class, "5")) {
          return;
       }
       a uoa = new a();
       if (uoa.e(p0)) {
          uoa.c(null, p0, new KwaiTKContainer$b$a(p0, p1, p2, p3));
       }else {
          this.b(p0, p1, p2, p3);
       }
       return;
    }
    public final void b(String p0,Integer p1,boolean p2,f p3){
       if (PatchProxy.isSupport(KwaiTKContainer$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, KwaiTKContainer$b.class, "6")) {
          return;
       }
       a uoa = new a();
       uoa.a = SystemClock.elapsedRealtime();
       ConcurrentHashMap a = h.A;
       a.o(a, "TKTraceReporter.sPreloadTimeMap");
       a.put(p0, uoa);
       KwaiTKContainer$b$b uob$b = new KwaiTKContainer$b$b(p0, p3);
       if (!PatchProxy.isSupport(KwaiTKContainer$b.class) || !PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), uob$b, this, KwaiTKContainer$b.class, "7")) {
          w ow = new w("", p0, "", -1, "", -1, "", "");
          TachikomaBundleApi tachikomaBun = TachikomaBundleApi.c();
          int i = (p1 != null)? p1.intValue(): -1;
          tachikomaBun.g(p0, i, new c(uob$b, v12)).R(new d(p0, uob$b, v12, p2), new e(uob$b, v12));
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, KwaiTKContainer$b.class, "13")) {
          return;
       }
       e h = e.h;
       Objects.requireNonNull(h);
       if (!e.f) {
          e.g();
       }
       if (!h.d()) {
          e.b();
       }
       return;
    }
    public final String[] d(){
       Object obj = PatchProxy.apply(null, this, KwaiTKContainer$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiTKContainer.V.getValue();
    }
}
