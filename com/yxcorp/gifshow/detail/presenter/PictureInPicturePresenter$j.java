package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$j;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import rd5.a;
import com.kwai.robust.PatchProxyResult;
import m3a.s$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.SmallWindowFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.i;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$onBind$5$1$smallWindowParamBuilder$1;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import m3a.a;
import android.graphics.Bitmap;
import m3a.u;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import m3a.s;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public final class PictureInPicturePresenter$j implements g	// class@0016bb
{
    public final PictureInPicturePresenter b;

    public void PictureInPicturePresenter$j(PictureInPicturePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s$a uoa = s$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureInPicturePresenter$j.class, "1")) {
       }else if(p0.a() == null || (a.g(p0.a(), this.b.getActivity()) ^ 1)){
          Object[] objArray = new Object[0];
          o.C().w("PictureInPicturePresent", "mPipModeObservable: "+p0.b(), objArray);
          if (p0.b()) {
             if (!this.b.S8()) {
                p0 = this.b;
                p0.G = false;
                p0.W8(1);
                p0 = new SmallWindowFragment();
                PictureInPicturePresenter x = this.b.x;
                if (x != null) {
                   QPhoto currentPhoto = x.getCurrentPhoto();
                   if (currentPhoto != null) {
                      a.o(currentPhoto, "it");
                      Object[] objArray1 = new Object[0];
                      o.C().w("PictureInPicturePresent", "current photo: "+currentPhoto.getUserName(), objArray1);
                      s$a uoa1 = new s$a();
                      PictureInPicturePresenter x1 = this.b.x;
                      a.m(x1);
                      i oi = x1.X0();
                      a.o(oi, "mSlidePlayViewModel!!.pageList");
                      a obj = PatchProxy.applyOneRefs(oi, uoa1, uoa, "9");
                      if (obj != patchProxyRe) {
                         uoa1 = obj;
                      }else {
                         a.p(oi, "pageList");
                         uoa1.a = oi;
                      }
                      PictureInPicturePresenter$onBind$5$1$smallWindowParamBuilder$1 oonBind$5$1$ = new PictureInPicturePresenter$onBind$5$1$smallWindowParamBuilder$1(this.b);
                      Objects.requireNonNull(uoa1);
                      obj = PatchProxy.applyOneRefs(oonBind$5$1$, uoa1, uoa, "10");
                      if (obj != patchProxyRe) {
                         uoa1 = obj;
                      }else {
                         a.p(oonBind$5$1$, "dismissListener");
                         uoa1.b = oonBind$5$1$;
                      }
                      BaseFragment uBaseFragmen = PictureInPicturePresenter.P8(this.b);
                      Objects.requireNonNull(uoa1);
                      obj = PatchProxy.applyOneRefs(uBaseFragmen, uoa1, uoa, "12");
                      if (obj != patchProxyRe) {
                         uoa1 = obj;
                      }else {
                         a.p(uBaseFragmen, "logPage");
                         uoa1.c = uBaseFragmen;
                      }
                      PictureInPicturePresenter$j tb = this.b;
                      uoa1.e = tb.F;
                      PictureInPicturePresenter c = tb.C;
                      x1 = tb.w;
                      Bitmap uBitmap = (x1 != null)? x1.a(): null;
                      PictureInPicturePresenter w = this.b.w;
                      PhotoDetailLogger photoDetailL = (w != null)? w.c(): null;
                      obj = new a(currentPhoto, c, uBitmap, photoDetailL);
                      if (PatchProxy.applyOneRefs(obj, uoa1, uoa, "11") != patchProxyRe) {
                      }else {
                         a.p(obj, "currentPhotoInfo");
                         uoa1.d = obj;
                      }
                      s os = PatchProxy.apply(null, uoa1, uoa, "13");
                      if (os != patchProxyRe) {
                      }else {
                         os = new s(uoa1);
                      }
                      if (!PatchProxy.applyVoidOneRefs(os, p0, SmallWindowFragment.class, "3")) {
                         a.p(os, "param");
                         p0.j = os;
                      }
                      FragmentActivity activity = PictureInPicturePresenter.P8(this.b).getActivity();
                      if (activity != null) {
                         Object[] objArray2 = new Object[0];
                         o.C().w("PictureInPicturePresent", "add small window fragment", objArray2);
                         e uoe = activity.getSupportFragmentManager().beginTransaction();
                         uoe.f(0x1020002, p0);
                         uoe.m();
                         PictureInPicturePresenter$j tb1 = this.b;
                         tb1.y = p0;
                         tb1.D = true;
                      }
                   }
                }
             }
          }else {
             p0 = this.b;
             if (p0.D != null) {
                p0.V8();
             }
          }
       }
       return;
    }
}
