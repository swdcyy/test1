package com.kuaishou.live.preview.item.feedback.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.preview.item.feedback.c$a;
import com.kuaishou.live.preview.item.feedback.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import lnc.u1;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import cda.i;
import a43.m;
import tkd.b;
import tkd.d;
import nl9.u;

public class c extends PresenterV2	// class@000de6
{
    public QPhoto p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public boolean s;
    public final a t;
    public final ViewPager$i u;

    public void c(){
       super();
       this.t = new c$a(this);
       this.u = new c$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.r = slidePlayVie;
       slidePlayVie.P(this.q, this.t);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       u1.a(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       u1.b(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.r.D(this.q, this.t);
       this.r.g(this.u);
       this.r.d(true, 22);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       return;
    }
    public void onEventMainThread(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       if (p0.b != null && ((p0.a).equals(this.p.getPhotoId()) && m.d(p0.c))) {
          c tq = this.q;
          d.a(-1694791652).a60(this.p, tq, tq.f());
          this.s = true;
          this.r.i(this.u);
          this.r.Y(true);
       }
    label_0048 :
       return;
    }
}
