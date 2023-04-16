package com.yxcorp.gifshow.ad.detail.presenter.log.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y09.d;
import com.yxcorp.gifshow.ad.detail.presenter.log.a$a;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.yxcorp.gifshow.ad.detail.presenter.log.a$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;

public class a extends PresenterV2	// class@00165e
{
    public final a A;
    public QPhoto p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public a s;
    public List t;
    public MilanoContainerEventBus u;
    public int v;
    public boolean w;
    public final IMediaPlayer$OnInfoListener x;
    public final e y;
    public final WeakReference z;

    public void a(){
       super();
       this.v = 0;
       this.w = false;
       this.x = new d(this);
       a$a uoa = new a$a(this);
       this.y = uoa;
       this.z = new WeakReference(uoa);
       this.A = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a ts = this.s;
       if (ts != null && ts.getPlayer() != null) {
          this.s.getPlayer().addOnInfoListener(this.x);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.q.getParentFragment());
       this.r = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.q, this.A);
       }else {
          ts = this.t;
          if (ts != null) {
             ts.add(this.A);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a ts = this.s;
       if (ts != null && ts.getPlayer() != null) {
          this.s.getPlayer().removeOnInfoListener(this.x);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.s = this.s8(a.class);
       this.t = this.t8("DETAIL_ATTACH_LISTENERS");
       this.u = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
