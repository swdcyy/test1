package com.kuaishou.live.preview.item.presenter.g0;
import k51.c;
import tyc.q0;
import com.kuaishou.live.preview.item.presenter.g0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.preview.item.presenter.e0;
import crd.b;
import ok.h;
import lnc.b9;
import com.kuaishou.live.preview.item.presenter.d0;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.framework.model.user.UserVerifiedDetail;
import android.widget.ImageView;
import d61.i0;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;

public class g0 extends c	// class@000e24
{
    public QPhoto p;
    public PhotoDetailParam q;
    public BaseFragment r;
    public f s;
    public SlidePlayViewModel t;
    public b u;
    public boolean v;
    public View w;
    public KwaiImageView x;
    public final q0 y;
    public final a z;

    public void g0(){
       super();
       this.y = new q0();
       this.z = new g0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "3")) {
          return;
       }
       r1.q5(this.p.mEntity, 1);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.t = slidePlayVie;
       slidePlayVie.P(this.r, this.z);
       User user = this.p.getUser();
       this.u = b9.c(this.u, new e0(this, user));
       this.w.setOnClickListener(new d0(this));
       i0.a(user.mVerifiedDetail, this.x, false);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "4")) {
          return;
       }
       b9.a(this.u);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a4387);
       this.x = m1.f(p0, 0x7f0a2701);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g0.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.x8("LIVE_ANCHOR_END");
       return;
    }
}
