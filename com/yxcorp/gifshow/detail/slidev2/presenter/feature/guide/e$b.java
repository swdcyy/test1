package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.e$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.e;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import j8a.s;
import java.lang.Runnable;
import java.lang.Boolean;
import im8.f;
import oe6.a;
import j8a.r;
import android.view.View$OnTouchListener;
import java.lang.Integer;
import o07.o;

public class e$b implements PopupInterface$h	// class@00198b
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       View view = p0.z();
       if (view == null) {
          return;
       }
       view.postDelayed(new s(this), 200);
       this.b.r.set(Boolean.FALSE);
       this.b.q.set(Boolean.TRUE);
       a.d0(false);
       view.setOnTouchListener(new r(this, view));
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(e$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, e$b.class, "2")) {
          return;
       }
       this.b.q.set(Boolean.FALSE);
       this.b.r.set(Boolean.TRUE);
       p0.v = true;
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
