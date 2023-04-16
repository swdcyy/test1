package com.kwai.sharelib.a$f;
import erd.o;
import com.kwai.sharelib.a;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.String;
import uo7.h0;
import java.lang.Object;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import uo7.k;
import uo7.u;
import java.lang.Throwable;
import java.util.Objects;
import uo7.d0;
import uo7.c0;
import uo7.f0;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import uo7.e0;
import brd.t;

public final class a$f implements o	// class@0016a9
{
    public final a b;
    public final ShareInitResponse$SharePanelElement c;
    public final String d;
    public final h0 e;

    public void a$f(a p0,ShareInitResponse$SharePanelElement p1,String p2,h0 p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, a$f.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "it");
          a$f tb = this.b;
          tb.h.d(tb.g, this.c);
          tb = this.b;
          tb.h(tb.g, this.c, true, null);
          a = this.b.a;
          a$f td = this.d;
          a.m(td);
          p0 = p0.mShareAnyData;
          a g = this.b.g;
          a$f te = this.e;
          Objects.requireNonNull(a);
          c0 uoc0 = PatchProxy.applyFourRefs(td, p0, g, te, a, d0.class, "7");
          if (uoc0 != patchProxyRe) {
          }else {
             a.p(td, "actionPath");
             a.p(g, "conf");
             a.p(te, "urlMgr");
             f0 uof0 = a.d(td);
             if (uof0 != null) {
                uoc0 = e0.a(uof0, p0, g, te);
                if (uoc0 == null) {
                }
             }else {
             }
          }
       label_007b :
          ot = (uoc0 != null)? uoc0.s(): null;
          a.m(ot);
       }
       return ot;
    }
}
