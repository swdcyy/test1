package com.yxcorp.gifshow.camera.record.magic.d;
import uyb.c$a;
import com.yxcorp.gifshow.camera.record.magic.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import t4b.t;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.model.WishMagicInfo;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import java.lang.Float;
import java.lang.Boolean;
import xi9.j;
import xi9.n;
import vm6.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ce9.i;
import com.yxcorp.gifshow.camerasdk.p$b;
import com.yxcorp.gifshow.camerasdk.q;
import java.util.concurrent.TimeUnit;
import brd.t;
import ce9.j;
import com.yxcorp.gifshow.camera.record.magic.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.camera.record.magic.l;
import n5b.o;

public class d implements c$a	// class@000e2a
{
    public final e a;

    public void d(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MagicController", "onMultiInputTextRequest", objArray);
       this.a.d.m(new t());
       return;
    }
    public WishMagicInfo b(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d.c(WishMagicInfo.class);
    }
    public void c(float p0,MagicEmoji$SeekBarType p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), p1, Boolean.valueOf(p2), this, d.class, "1")) {
          return;
       }
       if (p1 == MagicEmoji$SeekBarType.LOOKUP && (!p2 || (this.a.g.a() && !this.a.g.Q()))) {
          this.a.g.O(p0, p1);
       }else {
          this.a.d.m(new c(p0));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d ta = this.a;
       ta.s = false;
       if (ta.h != null) {
          ta.u = ta.E();
          ta = this.a;
          ta.h.u0(new i(ta));
          this.a.t = t.timer(500, TimeUnit.MILLISECONDS).subscribe(new j(this.a), c.b);
          ta = this.a;
          ta.Y1(ta.t);
       }else {
          ta.r.e1(-1);
       }
       return;
    }
    public void e(WishMagicInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       this.a.d.m(new o(p0));
       return;
    }
}
