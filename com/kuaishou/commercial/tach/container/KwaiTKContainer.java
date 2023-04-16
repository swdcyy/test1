package com.kuaishou.commercial.tach.container.KwaiTKContainer;
import com.kuaishou.tachikoma.api.container.TKContainer;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$b;
import nsd.u;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$Companion$mUpdateDuration$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$Companion$mRemoteUpdateFirstBundleList$2;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.view.ViewGroup;
import java.lang.String;
import bx4.h;
import i00.e;
import zb6.d;
import c00.d;
import tx4.q;
import d00.a;
import vz.a;
import wz.a;
import zw4.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ww4.b;
import crd.b;
import java.lang.Long;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.util.rx.RxBus;
import sx4.g;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$d;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$e;
import erd.g;
import java.lang.Throwable;

public final class KwaiTKContainer extends TKContainer	// class@00167e
{
    public static final p U;
    public static final KwaiTKContainer$b U0;
    public static final p V;
    public static boolean W;
    public static CopyOnWriteArrayList X;
    public static CopyOnWriteArrayList Y;
    public static Map Z;

    static {
       KwaiTKContainer.U0 = new KwaiTKContainer$b(null);
       KwaiTKContainer.U = s.c(KwaiTKContainer$Companion$mUpdateDuration$2.INSTANCE);
       KwaiTKContainer.V = s.c(KwaiTKContainer$Companion$mRemoteUpdateFirstBundleList$2.INSTANCE);
       KwaiTKContainer.X = new CopyOnWriteArrayList();
       KwaiTKContainer.Y = new CopyOnWriteArrayList();
       KwaiTKContainer.Z = new HashMap();
    }
    public void KwaiTKContainer(Activity p0,ViewGroup p1,String p2,String p3,h p4,u p5){
       super(p0, p1, p2, p3, p4);
       KwaiTKContainer.U0.c();
       p4.m(p3);
       p4.r("0.9.26");
       p4.d = e.h.a();
       p4.e = d.a();
       this.j(new d());
       if (this.P() != null) {
          this.p = new a(this.P());
       }
       this.m = new a();
       this.g0(new a());
       return;
    }
    public boolean W(){
       Object obj = PatchProxy.apply(null, this, KwaiTKContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.h.d();
    }
    public b b0(long p0,b p1){
       e obj;
       KwaiTKContainer kwaiTKContai = KwaiTKContainer.class;
       if (PatchProxy.isSupport(kwaiTKContai)) {
          obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, kwaiTKContai, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = e.h;
       if (obj.d() || p0 - null <= 0) {
          if (obj.e()) {
             if (p1 != null) {
                p1.a();
             }
          }else if(p1 != null){
             p1.b(2001, new Throwable("load V8 failed"));
          }
          return null;
       }else {
          Log.g("TKContainer", "registerTKInitListener: "+p0);
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = null;
          objectRef.element = RxBus.f.f(g.class).timeout(p0, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new KwaiTKContainer$d(objectRef, p1), new KwaiTKContainer$e(p1));
          if (obj.e()) {
             Ref$ObjectRef element = objectRef.element;
             if (element != null) {
                element.dispose();
             }
             if (p1 != null) {
                p1.a();
             }
             return null;
          }else {
             return objectRef.element;
          }
       }
    }
}
