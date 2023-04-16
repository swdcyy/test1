package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement$b;
import qp7.y0;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.avatar.AdAvatarElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import n49.s;
import qp7.x0;
import qp7.b;
import os7.a;
import ekd.k1;
import tw.l;
import java.lang.Runnable;

public final class AdAvatarElement$b extends y0	// class@00170e
{
    public final AdAvatarElement a;

    public void AdAvatarElement$b(AdAvatarElement p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AdAvatarElement$b.class, "2")) {
          return;
       }
       if (c.b0(AdAvatarElement.n0(this.a).mEntity)) {
          this.a.u0(true, null);
       }
       if (s.t(AdAvatarElement.n0(this.a))) {
          AdAvatarElement$b ta = this.a;
          ta.F = true;
          ta.v0();
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, AdAvatarElement$b.class, "3")) {
          return;
       }
       AdAvatarElement$b ta = this.a;
       ta.D = false;
       ta.E = false;
       ta.F = false;
       if (ta.p0()) {
          this.a.E().k(false, null, null);
       }
       k1.n(this.a);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, AdAvatarElement$b.class, "1")) {
          return;
       }
       AdAvatarElement$b ta = this.a;
       ta.D = true;
       ta.x0();
       if (this.a.p0() && !l.j(AdAvatarElement.n0(this.a).mEntity)) {
          ta = this.a;
          k1.s(ta.O, ta, 1000);
       }
       return;
    }
}
