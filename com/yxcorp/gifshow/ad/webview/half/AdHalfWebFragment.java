package com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import com.yxcorp.gifshow.ad.webview.half.AdHalfWebFragment$a;
import k59.t2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import k59.e2;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.ad.webview.half.a;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import androidx.fragment.app.c;
import java.lang.System;
import k59.j2;
import mxb.j0;
import mxb.i0;
import n59.h;
import erd.g;
import n59.f;
import o49.d;
import r59.d;
import r59.c;
import m59.o;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler;
import n59.g;
import java.lang.Boolean;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.View;
import n59.c;
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
import n59.i;
import msd.a;
import p59.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n59.b;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.utility.n;
import n59.a;
import n59.u;

public class AdHalfWebFragment extends DialogContainerFragment	// class@0018bf
{
    public k2 H;
    public final AdHalfWebFragment$a I;
    public t J;
    public j2 K;
    public o L;
    public g M;
    public final e2 N;
    public b O;
    public i P;
    public RegisterWebViewDidShowHandler Q;
    public d R;
    public QPhoto S;
    public PresenterV2 T;
    public a U;
    public static final int V;

    public void AdHalfWebFragment(AdHalfWebFragment$a p0){
       super();
       t2 ot2 = new t2();
       this.N = ot2;
       this.I = p0;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdHalfWebFragment.class, "10")) {
       }else if(p0 != null){
          this.S = new QPhoto(p0.e);
          if (p0.h != null) {
             ot2.a();
          }
          this.nh(p0.d);
          this.Lh(new a(this, p0));
          this.Cb(p0.c, "AdHalfDialogWeb");
       }
       return;
    }
    public final int Nh(){
       AdHalfWebFragment tI = this.I;
       if (tI != null) {
          return tI.g;
       }
       return 0;
    }
    public e2 Oh(){
       return this.N;
    }
    public final void Ph(){
       if (PatchProxy.applyVoid(null, this, AdHalfWebFragment.class, "16")) {
          return;
       }
       AdHalfWebFragment tI = this.I;
       if (tI != null && tI.e != null) {
          tI = this.K;
          if (tI != null) {
             tI.e(System.currentTimeMillis());
             h oh = new h(this, this.K.b(), this.K.a(), this.K.c());
             i0.a().e(52, this.I.e).d(v8).a();
          }
       }
       return;
    }
    public final void Qh(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdHalfWebFragment.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       i0.a().e(50, p0).d(new f(this)).a();
       d.b(p0, p1);
       return;
    }
    public void Rh(){
       if (PatchProxy.applyVoid(null, this, AdHalfWebFragment.class, "18")) {
          return;
       }
       this.Th(true);
       if (this.L != null) {
          d uod = new d();
          this.R = uod;
          uod.k(this.O.i());
          this.R.k(this.P.i());
          this.L.M(this.R);
          this.Q.a();
       }
       return;
    }
    public void Sh(){
       if (PatchProxy.applyVoid(null, this, AdHalfWebFragment.class, "15")) {
          return;
       }
       AdHalfWebFragment tI = this.I;
       if (tI != null && tI.e != null) {
          i0.a().e(59, this.I.e).d(new g(this)).a();
       }
       return;
    }
    public final void Th(boolean p0){
       if (PatchProxy.isSupport(AdHalfWebFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AdHalfWebFragment.class, "3")) {
          return;
       }
       Dialog dialog = this.getDialog();
       View view = null;
       Window window = (dialog != null)? dialog.getWindow(): view;
       if (window != null) {
          view = window.getDecorView();
       }
       c3.c(view, new c(p0));
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0072;
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdHalfWebFragment.class, "7")) {
          return;
       }
       super.onDestroy();
       if (!PatchProxy.applyVoid(objArray, this, AdHalfWebFragment.class, "8")) {
          AdHalfWebFragment tJ = this.H;
          String str = "AdHalfDialogWeb";
          if (tJ == null) {
             Object[] objArray1 = new Object[0];
             j0.c(str, "mPageRecord is null", objArray1);
          }else {
             try{
                i oi = tJ.d();
                if (!TextUtils.n(oi.p(), "UNKNOWN2") && oi.b()) {
                   b.a(0x4b316083).Y0(this.H.d());
                }
             }catch(java.lang.Exception e0){
                j0.b(str, "setCurrentPage error", e0);
             }
          }
       }
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AdHalfWebFragment.class, "9")) {
          return;
       }
       super.onResume();
       AdHalfWebFragment tJ = this.J;
       if (tJ != null) {
          tJ.c();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, AdHalfWebFragment.class, "2")) {
          return;
       }
       super.onStart();
       if (this.N.j()) {
          this.Th(false);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdHalfWebFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.getActivity() instanceof GifshowActivity) {
          this.H = b.a(0x4b316083).f();
       }
       p0.setOnClickListener(new b(this));
       ViewGroup$LayoutParams layoutParams = p0.findViewById(R.id.content_fragment).getLayoutParams();
       if (layoutParams != null) {
          AdHalfWebFragment tI = this.I;
          Object obj = PatchProxy.applyOneRefs(tI, this, AdHalfWebFragment.class, "11");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             float f = 0x3f4ccccd;
             AdHalfWebFragment$a i1 = tI.i;
             if (i1 > 0 && i1 - 0x3f800000 <= 0) {
                f = i1;
             }
             i = (int)((float)n.j(tI.f) * f);
          }
          layoutParams.height = i;
       }
       AdHalfWebFragment tS = this.S;
       if (tS != null && tS.mEntity != null) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, AdHalfWebFragment.class, "5")) {
             this.U = new a();
          }
          if (!PatchProxy.applyVoid(objArray, this, AdHalfWebFragment.class, "6") && this.T == null) {
             PresenterV2 presenterV2 = new PresenterV2();
             this.T = presenterV2;
             presenterV2.U7(new u());
             this.T.f(this.getView());
          }
          objArray = new Object[]{this.S,this.U,this.getActivity(),this};
          this.T.i(objArray);
       }
       return;
    }
}
