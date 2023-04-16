package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFragment;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import crd.b;
import lnc.b9;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.corona.model.CoronaMeta$VideoWatchedRecord;
import ul5.c;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Boolean;
import tl5.a;
import qi5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uw9.o;
import q87.c;
import java.lang.System;
import com.yxcorp.gifshow.detail.presenter.landscape.helper.LandscapePhotoShareStateHelper;
import f5a.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.j;
import z85.a;
import w85.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.component.detail.launcher.api.model.detail.DetailParamCreator;
import kotlin.jvm.internal.a;
import im8.f;

public final class LandscapeEntranceVMPresenter$b extends a	// class@0016e1
{
    public final LandscapeEntranceVMPresenter b;

    public void LandscapeEntranceVMPresenter$b(LandscapeEntranceVMPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LandscapeEntranceVMPresenter$b.class, "2")) {
          return;
       }
       LandscapeEntranceVMPresenter$b tb = this.b;
       tb.O = false;
       String str = "";
       if (LandscapeEntranceVMPresenter.P8(tb) instanceof SlidePlayFragment) {
          SlidePlayFragment slidePlayFra = LandscapeEntranceVMPresenter.P8(this.b);
          if (slidePlayFra != null) {
             slidePlayFra.q = str;
          }
       }else if(LandscapeEntranceVMPresenter.P8(this.b) instanceof GrootBaseFragment){
          GrootBaseFragment grootBaseFra = LandscapeEntranceVMPresenter.P8(this.b);
          if (grootBaseFra != null) {
             grootBaseFra.u = str;
          }
       }
       b9.a(this.b.S);
       tb = 1;
       if (LandscapeEntranceVMPresenter.P8(this.b).getParentFragment() instanceof BaseFragment) {
          Fragment parentFragme = LandscapeEntranceVMPresenter.P8(this.b).getParentFragment();
          Objects.requireNonNull(parentFragme, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.BaseFragment");
          b = parentFragme.Vg().c();
       }
       LandscapeEntranceVMPresenter$b tb1 = this.b;
       if (tb1.R == null && b) {
          c.x(LandscapeEntranceVMPresenter.R8(tb1).getEntity(), objArray);
          CommonMeta commonMeta = LandscapeEntranceVMPresenter.R8(this.b).getCommonMeta();
          if (commonMeta != null) {
             a.d(commonMeta, Boolean.FALSE);
          }
       }
       a.a.a(this.b.getActivity(), false);
       return;
    }
    public void i2(){
       boolean b1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LandscapeEntranceVMPresenter$b.class, "1")) {
          return;
       }
       LandscapeEntranceVMPresenter$b tb = this.b;
       tb.O = true;
       boolean b = false;
       tb.R = b;
       Object[] objArray1 = new Object[b];
       o.C().w("LandscapeEntrancePresenter", "attach...", objArray1);
       this.b.X = System.currentTimeMillis();
       b uob = LandscapePhotoShareStateHelper.b.b(LandscapeEntranceVMPresenter.R8(this.b));
       if (uob != null) {
          this.b.V8(uob);
          RxBus.f.b(new j(LandscapeEntranceVMPresenter.R8(this.b), b, uob.d()));
          LandscapeEntranceVMPresenter x = this.b.x;
          if (x != null) {
             a uoa = x.i();
             if (uoa != null) {
                Object obj = PatchProxy.apply(objArray, uoa, a.class, "7");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(uoa.k != null){
                   b1 = uoa.g;
                }else {
                   b1 = DetailParamCreator.g(uoa.n);
                }
                if (b1 == true) {
                   x = this.b.r;
                   if (x == null) {
                      a.S("mHasLandscapeChangePhotoRef");
                   }
                   x.set(Boolean.TRUE);
                }
             }
          }
       }
       tb = this.b;
       tb.d9(LandscapeEntranceVMPresenter.R8(tb));
       a.a.a(this.b.getActivity(), true);
       return;
    }
}
