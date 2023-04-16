package com.kuaishou.commercial.tach.container.d;
import erd.g;
import java.lang.String;
import tx4.f;
import tx4.w;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import zp8.a;
import java.lang.Throwable;
import i00.e;
import com.kuaishou.tachikoma.api.d;
import com.kuaishou.commercial.tach.container.KwaiTKContainer;
import java.util.Objects;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$b;
import java.lang.Boolean;
import com.kuaishou.commercial.tach.container.KwaiTKContainer$c;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.gifshow.util.rx.RxBus;
import sx4.g;
import brd.t;
import com.kuaishou.commercial.tach.container.b;
import crd.b;

public final class d implements g	// class@001682
{
    public final String b;
    public final f c;
    public final w d;
    public final boolean e;

    public void d(String p0,f p1,w p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          StringBuilder str = "asyncCompileInner bundle load success: "+this.b+", bundleInfo:";
          boolean b = (p0 != null)? true: false;
          a.i("TKContainer", str+b);
          if (p0 == null) {
             p0 = this.c;
             if (p0 != null) {
                p0.a(this.d, new Throwable("loadBundleError, bundleInfo is null"));
             }
          }else {
             e h = e.h;
             if (h.d()) {
                if (h.e()) {
                   d.a(p0, this.e, this.c);
                }
             }else {
                KwaiTKContainer$b u0 = KwaiTKContainer.U0;
                d te = this.e;
                d tc = this.c;
                Objects.requireNonNull(u0);
                if (!PatchProxy.isSupport(KwaiTKContainer$b.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(te), tc, u0, KwaiTKContainer$b.class, "9")) {
                   KwaiTKContainer.X.add(new KwaiTKContainer$c(p0, te, tc));
                   if (!KwaiTKContainer.W) {
                      KwaiTKContainer.W = true;
                      RxBus.f.f(g.class).subscribe(b.b);
                   }
                }
             }
          }
       }
    label_009c :
       return;
    }
}
