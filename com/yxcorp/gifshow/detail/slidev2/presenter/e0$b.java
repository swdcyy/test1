package com.yxcorp.gifshow.detail.slidev2.presenter.e0$b;
import jta.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import android.view.View;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import b8a.n2;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import k2b.n;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import jta.b;
import java.lang.Math;

public class e0$b implements c	// class@0018fd
{
    public final e0 a;

    public void e0$b(e0 p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       e0$b uob = e0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       uob = this.a;
       e0 p = uob.p;
       int i = (!(v2 = p0 - 0x3f800000))? 8: 0;
       uob.P8(p, i);
       if (!v2) {
          this.a.R8();
       }else {
          this.a.X8();
       }
       if (!this.a.J.getVisibility() && !p0) {
          uob = this.a;
          if (uob.H.mVerifiedDetail != null) {
             n.a(uob.E, new n2(this));
          }
       }
       Object[] objArray = new Object[0];
       o.C().w("SlidePlayGlobalUserInfo", "mGlobalUserInfoLayout: "+p0+", "+this.a.p.getTranslationX()+", "+this.a.p.getVisibility()+", "+this.a.p.getAlpha()+", "+this.a.p.getLeft()+", "+this.a.p.getTop()+", "+this.a.p.getWidth()+", "+this.a.p.getHeight(), objArray);
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
       e0$b uob = e0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.a.p.setAlpha(Math.max(0, (0x3f800000 - (p0 / 0x3f19999a))));
       return;
    }
    public void d(float p0){
       e0$b uob = e0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       e0$b ta = this.a;
       ta.P8(ta.p, 0);
       return;
    }
}
