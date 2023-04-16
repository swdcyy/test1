package com.kwai.sharelib.KsShareDataEngine$b;
import erd.o;
import com.kwai.sharelib.KsShareDataEngine;
import uo7.h0;
import uo7.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import au6.e;
import java.lang.StringBuilder;
import com.kwai.sharelib.exception.ForwardToastException;
import brd.t;
import uo7.q;
import com.kwai.sharelib.model.ShareAnyResponse;
import java.lang.Exception;
import qrd.i;

public final class KsShareDataEngine$b implements o	// class@001697
{
    public final KsShareDataEngine b;
    public final h0 c;
    public final k d;

    public void KsShareDataEngine$b(KsShareDataEngine p0,h0 p1,k p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       e a;
       String str1;
       t ot = PatchProxy.applyOneRefs(p0, this, KsShareDataEngine$b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "throwable");
          a = e.a;
          e.b(a, null, "share any request error!! throwableClz:"+p0.getClass().getCanonicalName()+" msg:"+p0.getMessage(), p0, 1, null);
          if (p0 instanceof ForwardToastException) {
             p0 = t.error(p0);
          }else {
             q oq = this.b.a();
             if (oq != null) {
                String str = this.c.c();
                a.m(str);
                ShareAnyResponse shareAnyResp = oq.a(str);
                if (shareAnyResp != null) {
                   e.b(a, null, "share any request using default data: "+shareAnyResp, null, 5, null);
                   ot = t.just(shareAnyResp);
                   if (ot == null) {
                   }
                }else {
                }
             }else {
             }
          }
          ot = p0;
       }
       return ot;
    }
}
