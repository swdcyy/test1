package com.yxcorp.gifshow.detail.nonslide.toolbar.follow.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import az6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.detail.helper.FollowView;
import com.yxcorp.gifshow.detail.helper.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import im8.f;
import java.util.Objects;
import java.lang.Boolean;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import d3a.c;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class a extends PresenterV2	// class@0015f0
{
    public PhotoDetailParam p;
    public QPhoto q;
    public QPreInfo r;
    public User s;
    public BaseFragment t;
    public f u;
    public FollowView v;
    public c w;

    public void a(){
       super();
    }
    public void E8(){
       a tv;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tp = this.p;
       a uoa = (tp != null)? tp.mSource: 0;
       if (this.q.isMine()) {
          tv = this.v;
          if (tv != null) {
             tv.setVisibility(8);
             return;
          }
       }
       tv = this.v;
       if (tv != null) {
          tv.setAtlasNewStyle(true);
       }
       c uoc = new c(this.getActivity(), this.q, this.s, this.v, this.r, this.u, uoa);
       this.w = tv;
       Objects.requireNonNull(tv);
       uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tv, uoc, "11")) {
          tv.a.n(true);
       }
       b9.d(this.s, this.t).subscribe(new c(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a0f40);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.s8(QPreInfo.class);
       this.s = this.q8(User.class);
       this.t = this.r8("DETAIL_FRAGMENT");
       this.u = this.x8("LOG_LISTENER");
       this.p = this.s8(PhotoDetailParam.class);
       return;
    }
}
