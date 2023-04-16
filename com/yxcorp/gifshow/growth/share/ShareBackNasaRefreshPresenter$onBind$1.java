package com.yxcorp.gifshow.growth.share.ShareBackNasaRefreshPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.growth.share.ShareBackNasaRefreshPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qqa.d;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import com.yxcorp.gifshow.refresh.RefreshType;
import lnc.a1;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.nasa.NasaRefreshView;

public final class ShareBackNasaRefreshPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@0014bf
{

    public void ShareBackNasaRefreshPresenter$onBind$1(ShareBackNasaRefreshPresenter p0){
       super(1, p0, ShareBackNasaRefreshPresenter.class, "onShareBackEventMainThread", "onShareBackEventMainThread\(Lcom/yxcorp/gifshow/growth/share/ShareBackRefreshEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d p0){
       ShareBackNasaRefreshPresenter p;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareBackNasaRefreshPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, ShareBackNasaRefreshPresenter.class, "8")) {
          p0 = p0.a;
          int i = 1;
          if (p0 != i) {
             if (p0 == 2) {
                p = treceiver.p;
                if (p == null) {
                   a.S("mSlidePlayViewModel");
                }
                if (p.n1()) {
                   p = treceiver.p;
                   if (p == null) {
                      a.S("mSlidePlayViewModel");
                   }
                   if (!p.o1()) {
                      p = treceiver.p;
                      if (p == null) {
                         a.S("mSlidePlayViewModel");
                      }
                      if (p.x1()) {
                         p = treceiver.p;
                         if (p == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         if (p.V0() != null) {
                            p = treceiver.p;
                            if (p == null) {
                               a.S("mSlidePlayViewModel");
                            }
                            List list = p.V0();
                            a.m(list);
                            treceiver.q = list.size() - i;
                         }
                         p = treceiver.p;
                         if (p == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         p.V1(RefreshType.LOGIN_REFRESH);
                         p = treceiver.p;
                         if (p == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         p.v1();
                      }
                   }
                }
             }
          }else {
             p = treceiver.p;
             if (p == null) {
                a.S("mSlidePlayViewModel");
             }
             if (p.n1()) {
                p = treceiver.p;
                if (p == null) {
                   a.S("mSlidePlayViewModel");
                }
                if (!p.o1()) {
                   p = treceiver.p;
                   if (p == null) {
                      a.S("mSlidePlayViewModel");
                   }
                   p.V1(RefreshType.LOGIN_REFRESH);
                   p = treceiver.t;
                   if (p == null) {
                      a.S("mRefreshView");
                   }
                   p.setTargetOrRefreshViewOffsetY(a1.e(37.50f));
                   p = treceiver.t;
                   if (p == null) {
                      a.S("mRefreshView");
                   }
                   p.setRefreshing(i);
                   p = treceiver.p;
                   if (p == null) {
                      a.S("mSlidePlayViewModel");
                   }
                   p.T(false);
                }
             }
          }
       }
    label_00dc :
       return;
    }
}
