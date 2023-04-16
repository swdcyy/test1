package com.yxcorp.gifshow.detail.fragments.milano.profile.l$c;
import df5.b;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import df5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.slide.base.pagelist.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.q;
import qvb.a;
import c95.c;
import android.view.ViewGroup;
import android.view.View;

public class l$c implements b	// class@001556
{
    public final l a;

    public void l$c(l p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       a.a(this, p0);
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$c.class, "1")) {
          return;
       }
       l$c ta = this.a;
       ta.v = p0;
       ta.C = true;
       if (ta.E == null) {
          ta.G = ta.B.H0();
          ta = this.a;
          ta.G.h(ta.N);
          this.a.E = true;
       }
       return;
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$c.class, "2")) {
          return;
       }
       l$c ta = this.a;
       ta.C = false;
       ta.x = true;
       if (ta.B.C()) {
          ta = this.a;
          if (ta.z.g != null) {
             ta.p.removeAllViews();
             ta = this.a;
             ta.t = 0;
             ta.r.setAlpha(0);
             this.a.r.setVisibility(8);
             this.a.X8(false);
          }
       }
       return;
    }
}
