package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d$b;
import cl1.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a;
import uz0.d;
import java.lang.Runnable;
import e93.f;
import java.lang.Boolean;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.FrameLayout;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView;
import cl1.b;
import android.database.Observable;

public class d$b implements c	// class@000b4b
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void c(int p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       uob = this.a;
       d w = uob.w;
       int i = uob.P8();
       Objects.requireNonNull(w);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(i), w, uoa, "3")) {
          f.h("GiftBatchSendCountVC.setBatchCount", new d(w, p0, i));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "7")) {
          return;
       }
       this.a.S8();
       return;
    }
    public void e(boolean p0,String p1){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "3")) {
          return;
       }
       f.h("setHandleViewVisibility", new e(this, p0, p1));
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "2")) {
          return;
       }
       this.a.w.c(false, p0);
       return;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.w.a();
    }
    public boolean h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d$b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a.w;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a.class, "7");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.c.isEnabled();
       return b;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$b.class, "9")) {
          return;
       }
       d w = this.a.w;
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoid(objArray, w, a.class, "16")) {
          w.c.c();
       }
       return;
    }
    public void j(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$b.class, "10")) {
          return;
       }
       d w = this.a.w;
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoid(objArray, w, a.class, "17")) {
          w.c.a();
       }
       return;
    }
    public void k(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "6")) {
          return;
       }
       d w = this.a.w;
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoidOneRefs(p0, w, a.class, "14")) {
          w.e.unregisterObserver(p0);
       }
       return;
    }
    public void l(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "5")) {
          return;
       }
       this.a.w.b(p0);
       return;
    }
}
