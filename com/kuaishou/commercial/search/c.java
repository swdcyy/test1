package com.kuaishou.commercial.search.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import py.i;
import com.kuaishou.commercial.search.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c extends PresenterV2	// class@00154d
{
    public QPhoto p;
    public a q;
    public PhotoDetailParam r;
    public BaseFragment s;
    public SlidePlayViewModel t;
    public boolean u;
    public final b$b v;
    public final a w;

    public void c(){
       super();
       this.v = new i(this);
       this.w = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.s.getParentFragment());
       this.t = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.s, this.w);
       }
       c tq = this.q;
       if (tq != null) {
          tq.getPlayer().w(this.v);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tt = this.t;
       if (tt != null) {
          tt.D(this.s, this.w);
       }
       tt = this.q;
       if (tt != null) {
          tt.getPlayer().O(this.v);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.s8(a.class);
       this.r = this.q8(PhotoDetailParam.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
