package com.kuaishou.commercial.tach.container.KwaiTKContainer$b$b;
import tx4.f;
import java.lang.String;
import java.lang.Object;
import tx4.w;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bx4.h;
import java.util.concurrent.ConcurrentHashMap;
import bx4.a;
import android.os.SystemClock;
import java.lang.Boolean;
import com.kuaishou.commercial.tach.container.KwaiTKContainer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$b;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.StringBuilder;
import zp8.a;
import com.kuaishou.tachikoma.api.TachikomaBundleApi;
import tw4.o;
import java.util.Map;
import java.lang.Long;
import qrd.p;
import java.lang.Number;
import brd.a0;
import com.kuaishou.commercial.tach.container.f;
import com.kuaishou.commercial.tach.container.g;
import erd.g;
import crd.b;

public final class KwaiTKContainer$b$b implements f	// class@001679
{
    public final String a;
    public final f b;

    public void KwaiTKContainer$b$b(String p0,f p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(w p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiTKContainer$b$b.class, "2")) {
          return;
       }
       a.p(p1, "e");
       a uoa = h.A.get(this.a);
       if (uoa != null) {
          uoa.c = SystemClock.elapsedRealtime();
       }
       KwaiTKContainer$b$b tb = this.b;
       if (tb != null) {
          tb.a(p0, p1);
       }
       return;
    }
    public void b(boolean p0){
       KwaiTKContainer$b$b uob$b = KwaiTKContainer$b$b.class;
       if (PatchProxy.isSupport(uob$b) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob$b, "3")) {
          return;
       }
       uob$b = this.b;
       if (uob$b != null) {
          uob$b.b(p0);
       }
       return;
    }
    public void c(w p0){
       boolean b1;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTKContainer$b$b.class, str)) {
          return;
       }
       a.p(p0, "tkBundleInfo");
       a uoa = h.A.get(this.a);
       if (uoa != null) {
          uoa.b = SystemClock.elapsedRealtime();
       }
       KwaiTKContainer$b$b tb = this.b;
       if (tb != null) {
          tb.c(p0);
       }
       KwaiTKContainer$b u0 = KwaiTKContainer.U0;
       tb = this.a;
       Objects.requireNonNull(u0);
       if (!PatchProxy.applyVoidOneRefs(tb, u0, KwaiTKContainer$b.class, "8")) {
          Long obj = PatchProxy.applyOneRefs(tb, u0, KwaiTKContainer$b.class, "12");
          boolean b = true;
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(u0.d() != null){
             String[] stringArray = (!u0.d().length)? 1: null;
             if (!stringArray && ArraysKt___ArraysKt.P7(u0.d(), tb)) {
                a.i("TKContainer", "remote bundle list contains bundle "+tb);
                b1 = true;
             }
          }
       label_0084 :
          b1 = false;
          if (b1) {
             obj = PatchProxy.applyOneRefs(tb, u0, KwaiTKContainer$b.class, "11");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
                TachikomaBundleApi tachikomaBun = TachikomaBundleApi.c();
                Objects.requireNonNull(tachikomaBun);
                TachikomaBundleApi obj1 = PatchProxy.applyOneRefs(tb, tachikomaBun, TachikomaBundleApi.class, "14");
                if (obj1 != PatchProxyResult.class) {
                   b1 = obj1.booleanValue();
                }else {
                   obj1 = tachikomaBun.a;
                   if (obj1 == null) {
                      tachikomaBun.h();
                      b1 = false;
                   }else {
                      b1 = obj1.i(tb);
                   }
                }
                a.i("TKContainer", tb+" has newer bundle on network res: "+b1);
             }
             if (b1) {
                obj = PatchProxy.applyOneRefs(tb, u0, KwaiTKContainer$b.class, "10");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(!KwaiTKContainer.Z.containsKey(tb)){
                   KwaiTKContainer.Z.put(tb, Long.valueOf(SystemClock.elapsedRealtime()));
                }else {
                   obj = KwaiTKContainer.Z.get(tb);
                   long l = SystemClock.elapsedRealtime();
                   if (obj == null) {
                      KwaiTKContainer.Z.put(tb, Long.valueOf(l));
                   }else {
                      long l1 = l - obj.longValue();
                      Number number = PatchProxy.apply(null, u0, KwaiTKContainer$b.class, str);
                      if (number == PatchProxyResult.class) {
                         number = KwaiTKContainer.U.getValue();
                      }
                      if (l1 - number.longValue() > 0) {
                         KwaiTKContainer.Z.put(tb, Long.valueOf(l));
                      }else {
                         a.i("TKContainer", tb+" check request time false");
                         b = false;
                      }
                   }
                }
                if (b) {
                   a.i("TKContainer", tb+" begin load remote bundle");
                   TachikomaBundleApi.c().f(tb).R(new f(tb), g.b);
                }
             }
          }
       }
    label_0176 :
       return;
    }
}
