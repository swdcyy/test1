package com.yxcorp.gifshow.ad.webview.RiskTipPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.webview.RiskTipPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.webview.RiskTipPresenter$mDispatchListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import sl9.d;
import tyc.k3;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.detail.view.RiskTipView;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.View;
import k59.k2;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tw.j;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption;
import android.widget.RelativeLayout;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import wkd.b;
import eyc.a;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.ad.webview.RiskTipPresenter$b;
import erd.g;
import com.yxcorp.gifshow.ad.webview.RiskTipPresenter$c;

public final class RiskTipPresenter extends PresenterV2	// class@0018a9
{
    public BaseFeed p;
    public String q;
    public RiskTipView r;
    public float s;
    public final p t;
    public static final RiskTipPresenter$a u;

    static {
       RiskTipPresenter.u = new RiskTipPresenter$a(null);
    }
    public void RiskTipPresenter(){
       super();
       this.t = s.c(new RiskTipPresenter$mDispatchListener$2(this));
    }
    public void E8(){
       PhotoAdvertisement$PrivacyOption mRiskTipText;
       RiskTipPresenter riskTipPrese = RiskTipPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, riskTipPrese, "3")) {
          return;
       }
       if (this.P8()) {
          Activity activity = this.getActivity();
          if (activity instanceof d) {
             activity.P0(this.R8());
          }
          if (!PatchProxy.applyVoid(objArray, this, riskTipPrese, "5") && this.getContext() != null) {
             RiskTipView riskTipView = PatchProxy.apply(objArray, this, riskTipPrese, "6");
             if (riskTipView != PatchProxyResult.class) {
             }else {
                Context context = this.getContext();
                a.m(context);
                a.o(context, "context!!");
                RiskTipView riskTipView1 = new RiskTipView(context, null, 0, 6, null);
                riskTipView.getIvClose().setOnClickListener(new k2(this, riskTipView));
             }
             this.r = riskTipView;
             RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, a1.d(0x7f0702fe));
             layoutParams.addRule(3, R.id.title_root);
             RiskTipPresenter tp = this.p;
             a.m(tp);
             PhotoAdvertisement photoAdverti = j.k(tp);
             if (photoAdverti != null) {
                photoAdverti = photoAdverti.mAdData;
                if (photoAdverti != null) {
                   PhotoAdvertisement$AdData mPrivacyOpti = photoAdverti.mPrivacyOption;
                   if (mPrivacyOpti != null) {
                      mRiskTipText = mPrivacyOpti.mRiskTipText;
                      if (mRiskTipText != null) {
                      label_0099 :
                         RiskTipPresenter tr = this.r;
                         a.m(tr);
                         a.o(mRiskTipText, "riskTipText");
                         tr.setRiskTipText(mRiskTipText);
                         if (this.m8() instanceof RelativeLayout) {
                            View view = this.m8();
                            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
                            view.addView(this.r, layoutParams);
                         }
                      }
                   }
                }
             }
             mRiskTipText = a1.p(R.string.arg_RES_7f1000ce);
             goto label_0099 ;
          }
       label_00be :
          this.V8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RiskTipPresenter.class, "4")) {
          return;
       }
       if (this.P8()) {
          Activity activity = this.getActivity();
          if (activity instanceof d) {
             activity.T(this.R8());
          }
       }
       return;
    }
    public final boolean P8(){
       RiskTipPresenter obj = PatchProxy.apply(null, this, RiskTipPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       boolean b = false;
       if (obj != null) {
          PhotoAdvertisement photoAdverti = j.k(obj);
          if (photoAdverti != null) {
             photoAdverti = photoAdverti.mAdData;
             if (photoAdverti != null) {
                PhotoAdvertisement$AdData mPrivacyOpti = photoAdverti.mPrivacyOption;
                if (mPrivacyOpti != null && (mPrivacyOpti.mShowH5RiskTip == 1 && !b.a(-1275906972).isKwaiUrl(this.q))) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
    public final k3 R8(){
       Object obj = PatchProxy.apply(null, this, RiskTipPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public final void S8(int p0){
       RiskTipPresenter riskTipPrese = RiskTipPresenter.class;
       if (PatchProxy.isSupport(riskTipPrese) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, riskTipPrese, "9")) {
          return;
       }
       int i = 78;
       if (p0 == 1) {
          i = 77;
       }
       RiskTipPresenter tp = this.p;
       if (tp != null) {
          i0.a().e(141, tp).d(new RiskTipPresenter$b(i)).a();
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, RiskTipPresenter.class, "8")) {
          return;
       }
       RiskTipPresenter tp = this.p;
       if (tp != null) {
          i0.a().e(140, tp).d(RiskTipPresenter$c.b).a();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, RiskTipPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(BaseFeed.class);
       this.q = this.r8("WEB_URL");
       return;
    }
}
