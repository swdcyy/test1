package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import g99.a0;
import g99.p;
import n5a.b;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.d;
import g99.a;
import com.yxcorp.gifshow.entity.QPhoto;
import g99.n;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.a;
import wh5.c;
import d3a.b;
import com.yxcorp.gifshow.detail.nonslide.toolbar.follow.a;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import zf6.l;
import zf6.j;
import com.yxcorp.gifshow.detail.helper.FollowView;
import b3a.h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import g99.w;
import androidx.lifecycle.ViewModel;
import g99.x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import g99.y;
import g99.z;

public class f extends PresenterV2	// class@001bac
{
    public final BaseFragment p;
    public final a0 q;
    public QPhoto r;

    public void f(BaseFragment p0,PhotoDetailParam p1){
       super();
       a0 uoa0 = new a0();
       this.q = uoa0;
       this.p = p0;
       p op = new p();
       op.b = uoa0;
       op.a(this);
       this.r = p1.mPhoto;
       this.U7(new d());
       this.U7(new a());
       if (this.r.isLongPhotos()) {
          this.U7(new n());
       }else {
          this.U7(new g());
       }
       boolean b = w.k0(this.r.getEntity());
       this.U7(new a());
       if (!c.h()) {
          this.U7(new b());
       }else if(!b){
          this.U7(new a());
       }
       if (!c.b() && !b) {
          this.U7(new c());
       }
       return;
    }
    public void F8(){
       a0 uoa0 = a0.class;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, f.class, str)) {
          return;
       }
       f tq = this.q;
       View view = this.m8();
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoidTwoRefs(view, this.r, tq, uoa0, str)) {
          tq.a = view.findViewById(0x7f0a3b45);
          tq.b = view.findViewById(0x7f0a3f4a);
          tq.c = view.findViewById(0x7f0a3f50);
          tq.d = view.findViewById(0x7f0a3034);
          tq.j = j.d(view, l.n(0x7f061d74, 0x7f061e52));
          FollowView uFollowView = view.findViewById(R.id.follow);
          if (uFollowView != null) {
             uFollowView.setNeedDrawBG(false);
             tq.a(uFollowView);
          }
       }
       tq = this.q;
       f tp = this.p;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoidOneRefs(tp, tq, uoa0, "2")) {
          tq.e = tp;
          w ow = ViewModelProviders.of(tp).get(w.class);
          ow.a.observe(tp, new x(tq));
          ow.s0().observe(tp, new y(tq));
          ow.c.observe(tp, new z(tq, tp));
       }
       return;
    }
}
