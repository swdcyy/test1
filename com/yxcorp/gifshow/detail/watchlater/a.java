package com.yxcorp.gifshow.detail.watchlater.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import q9a.d;
import p5a.e;
import de5.a;
import com.yxcorp.gifshow.detail.watchlater.a$a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class a extends PresenterV2	// class@001a7a
{
    public a p;
    public QPhoto q;
    public BaseFragment r;
    public d s;
    public PhotoDetailParam t;
    public SlidePlayViewModel u;
    public IMediaPlayer$OnInfoListener v;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tr = this.r;
       if (tr != null) {
          this.u = SlidePlayViewModel.S0(tr.getParentFragment());
       }
       b uob = b.e(this.t.mSlidePlayId);
       if (uob == null) {
          return;
       }else {
          this.s = uob.M7();
          this.p.getPlayer().addOnInfoListener(new a$a(this));
          return;
       }
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, a.class, "2");
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tp = this.p;
       if (tp != null && this.v != null) {
          tp.getPlayer().removeOnInfoListener(this.v);
          this.v = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.q8(QPhoto.class);
       this.r = this.t8("DETAIL_FRAGMENT");
       this.t = this.q8(PhotoDetailParam.class);
       return;
    }
}
