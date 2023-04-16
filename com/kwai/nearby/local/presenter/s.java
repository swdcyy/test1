package com.kwai.nearby.local.presenter.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.presenter.s$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import rw5.a;
import java.lang.Integer;
import com.yxcorp.gifshow.nearby.common.rubas.LocalDetailStageRubasHelper;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import vs5.i;
import brd.t;
import dd7.j0;
import erd.g;
import crd.b;
import java.util.Objects;
import xw6.a;
import bx6.d;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class s extends PresenterV2	// class@000fc9
{
    public PhotoDetailParam p;
    public boolean q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public final a$a t;

    public void s(){
       super();
       this.t = new s$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       PhotoDetailParam mPhoto = this.p.mPhoto;
       if (mPhoto != null && mPhoto.isVideoType()) {
          LocalDetailStageRubasHelper.b(a.a.intValue());
       }else {
          mPhoto = this.p.mPhoto;
          if (mPhoto != null && mPhoto.isLiveStream()) {
             LocalDetailStageRubasHelper.b(a.b.intValue());
          }
       }
       this.s = SlidePlayViewModel.B0(this.r);
       this.X7(RxBus.f.f(i.class).subscribe(new j0(this)));
       s ts = this.s;
       if (ts != null) {
          s tt = this.t;
          Objects.requireNonNull(ts);
          if (!PatchProxy.applyVoidOneRefs(tt, ts, SlidePlayViewModel.class, "184")) {
             SlidePlayViewModel h = ts.h;
             if (h != null && !PatchProxy.applyVoidOneRefs(tt, h, a.class, "25")) {
                a p = h.p;
                if (p == null || (!PatchProxy.applyVoidOneRefs(tt, p, d.class, "1") && !p.h.contains(tt))) {
                   p.h.add(tt);
                }
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       s ts = this.s;
       if (ts != null) {
          s tt = this.t;
          Objects.requireNonNull(ts);
          if (!PatchProxy.applyVoidOneRefs(tt, ts, SlidePlayViewModel.class, "185")) {
             SlidePlayViewModel h = ts.h;
             if (h != null && !PatchProxy.applyVoidOneRefs(tt, h, a.class, "26")) {
                a p = h.p;
                if (p != null && !PatchProxy.applyVoidOneRefs(tt, p, d.class, "2")) {
                   p.h.remove(tt);
                }
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.p = this.q8(PhotoDetailParam.class);
       this.r = this.r8("FRAGMENT");
       return;
    }
}
