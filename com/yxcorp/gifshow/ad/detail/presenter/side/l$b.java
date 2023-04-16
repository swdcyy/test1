package com.yxcorp.gifshow.ad.detail.presenter.side.l$b;
import jta.c;
import com.yxcorp.gifshow.ad.detail.presenter.side.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import android.view.View;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import g19.k0;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import k2b.n;
import java.lang.StringBuilder;
import yx.j0;
import jta.b;
import java.lang.Math;

public class l$b implements c	// class@0016b5
{
    public final l a;

    public void l$b(l p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       uob = this.a;
       l p = uob.p;
       int i = (!(v2 = p0 - 0x3f800000))? 8: 0;
       uob.P8(p, i);
       if (!v2) {
          this.a.R8();
       }else {
          this.a.X8();
       }
       if (!this.a.I.getVisibility() && (!p0 && this.a.S8().mVerifiedDetail != null)) {
          n.a(this.a.E, new k0(this));
       }
    label_0059 :
       Object[] objArray = new Object[0];
       j0.f("SlidePlayGlobalUserInfo", "mGlobalUserInfoLayout: "+p0+", "+this.a.p.getTranslationX()+", "+this.a.p.getVisibility()+", "+this.a.p.getAlpha()+", "+this.a.p.getLeft()+", "+this.a.p.getTop()+", "+this.a.p.getWidth()+", "+this.a.p.getHeight(), objArray);
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.a.p.setAlpha(Math.max(0, (0x3f800000 - (p0 / 0x3f19999a))));
       return;
    }
    public void d(float p0){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       l$b ta = this.a;
       ta.P8(ta.p, 0);
       return;
    }
}
