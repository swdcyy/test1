package com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragmentV2;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment$a;
import k59.t2;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import k59.e2;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.ad.webview.half.d;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.ad.webview.o;
import java.lang.Boolean;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.View;
import n59.m;
import lnc.c3$a;
import lnc.c3;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import yx.j0;
import q2b.i;
import k2b.k2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Throwable;
import n59.p;
import msd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n59.l;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.utility.n;
import n59.a;
import n59.u;

public class AdHalfWebFragmentV2 extends DialogContainerFragment	// class@0018c0
{
    public final AdHalfWebFragment$a H;
    public final e2 I;
    public final AdYodaConfig J;
    public o K;
    public k2 L;
    public QPhoto M;
    public PresenterV2 N;
    public a O;
    public static final int P;

    public void AdHalfWebFragmentV2(AdHalfWebFragment$a p0){
       super();
       t2 ot2 = new t2();
       this.I = ot2;
       AdYodaConfig uAdYodaConfi = new AdYodaConfig();
       this.J = uAdYodaConfi;
       this.H = p0;
       if (PatchProxy.applyVoidTwoRefs(uAdYodaConfi, p0, this, AdHalfWebFragmentV2.class, "11")) {
       }else {
          uAdYodaConfi.mFeed = p0.e;
          uAdYodaConfi.mUrl = p0.a;
          uAdYodaConfi.mIsPreload = p0.h;
          uAdYodaConfi.mAdPosition = p0.g;
          uAdYodaConfi.mLogParamAppender = p0.j;
          uAdYodaConfi.mWebSource = 1;
          uAdYodaConfi.mWebViewType = 2;
          uAdYodaConfi.mEntrySource = 1;
          uAdYodaConfi.mAdClickTime = k1.i();
          uAdYodaConfi.mEnterTime = k1.i();
          uAdYodaConfi.mAutoRegisterFragmentLifecycle = false;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, AdHalfWebFragmentV2.class, "10") && p0 != null) {
          this.M = new QPhoto(p0.e);
          if (p0.h != null) {
             ot2.a();
          }
          this.nh(p0.d);
          this.Lh(new d(this, p0));
          this.Cb(p0.c, "AdHalfDialogWebV2");
       }
       return;
    }
    public e2 Nh(){
       return this.I;
    }
    public void Oh(){
       if (PatchProxy.applyVoid(null, this, AdHalfWebFragmentV2.class, "14")) {
          return;
       }
       this.Ph(true);
       AdHalfWebFragmentV2 tK = this.K;
       if (tK != null) {
          tK.h();
       }
       return;
    }
    public final void Ph(boolean p0){
       if (PatchProxy.isSupport(AdHalfWebFragmentV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AdHalfWebFragmentV2.class, "3")) {
          return;
       }
       Dialog dialog = this.getDialog();
       View view = null;
       Window window = (dialog != null)? dialog.getWindow(): view;
       if (window != null) {
          view = window.getDecorView();
       }
       c3.c(view, new m(p0));
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0072;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdHalfWebFragmentV2.class, "7")) {
          return;
       }
       super.onDestroy();
       if (!PatchProxy.applyVoid(objArray, this, AdHalfWebFragmentV2.class, "8")) {
          AdHalfWebFragmentV2 tK = this.L;
          String str = "AdHalfDialogWebV2";
          if (tK == null) {
             Object[] objArray1 = new Object[0];
             j0.c(str, "mPageRecord is null", objArray1);
          }else {
             try{
                i oi = tK.d();
                if (!TextUtils.n(oi.p(), "UNKNOWN2") && oi.b()) {
                   b.a(0x4b316083).Y0(this.L.d());
                }
             }catch(java.lang.Exception e0){
                j0.b(str, "setCurrentPage error", e0);
             }
          }
       }
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AdHalfWebFragmentV2.class, "9")) {
          return;
       }
       super.onResume();
       AdHalfWebFragmentV2 tK = this.K;
       if (tK != null) {
          tK.c();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, AdHalfWebFragmentV2.class, "2")) {
          return;
       }
       super.onStart();
       if (this.I.j()) {
          this.Ph(false);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdHalfWebFragmentV2.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.getActivity() instanceof GifshowActivity) {
          this.L = b.a(0x4b316083).f();
       }
       p0.setOnClickListener(new l(this));
       ViewGroup$LayoutParams layoutParams = p0.findViewById(R.id.content_fragment).getLayoutParams();
       if (layoutParams != null) {
          AdHalfWebFragmentV2 tH = this.H;
          Object obj = PatchProxy.applyOneRefs(tH, this, AdHalfWebFragmentV2.class, "12");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             float f = 0x3f4ccccd;
             AdHalfWebFragment$a i1 = tH.i;
             if (i1 > 0 && i1 - 0x3f800000 <= 0) {
                f = i1;
             }
             i = (int)((float)n.j(tH.f) * f);
          }
          layoutParams.height = i;
       }
       this.Mh(this.H.k);
       AdHalfWebFragmentV2 tM = this.M;
       if (tM != null && tM.mEntity != null) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, AdHalfWebFragmentV2.class, "5")) {
             this.O = new a();
          }
          if (!PatchProxy.applyVoid(objArray, this, AdHalfWebFragmentV2.class, "6") && this.N == null) {
             PresenterV2 presenterV2 = new PresenterV2();
             this.N = presenterV2;
             presenterV2.U7(new u());
             this.N.f(this.getView());
          }
          objArray = new Object[]{this.M,this.O,this.getActivity(),this};
          this.N.i(objArray);
       }
       return;
    }
}
