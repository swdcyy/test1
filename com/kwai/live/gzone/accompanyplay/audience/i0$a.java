package com.kwai.live.gzone.accompanyplay.audience.i0$a;
import com.kwai.live.gzone.accompanyplay.audience.q;
import com.kwai.live.gzone.accompanyplay.audience.i0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Boolean;
import brd.y;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;
import mrd.c;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading$STYLE;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import lnc.a1;
import java.lang.CharSequence;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import mkc.b;
import mkc.c;
import e17.i;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAudienceAccompanyState$State;
import io.reactivex.subjects.PublishSubject;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import java.lang.Throwable;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import f37.n0;
import com.kwai.live.gzone.accompanyplay.audience.i0$a$a;
import android.view.View$OnClickListener;

public class i0$a implements q	// class@000b83
{
    public final i0 a;

    public void i0$a(i0 p0){
       this.a = p0;
       super();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "7")) {
          return;
       }
       this.a.E.performClick();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "6")) {
          return;
       }
       this.a.K.onNext(Boolean.TRUE);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "5")) {
          return;
       }
       this.a.J.l1(p0);
       return;
    }
    public c f(){
       return this.a.H;
    }
    public void g(LiveGzoneAccompanyLoading p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "2")) {
          return;
       }
       LiveGzoneAccompanyLoading mStyle = p0.mStyle;
       if (mStyle == LiveGzoneAccompanyLoading$STYLE.NON) {
          return;
       }
       Set set = this.a.F.get(mStyle);
       if (set == null) {
          set = new HashSet();
          this.a.F.put(p0.mStyle, set);
       }
       if (set.isEmpty()) {
          i0$a ta = this.a;
          LiveGzoneAccompanyLoading mStyle1 = p0.mStyle;
          Objects.requireNonNull(ta);
          i0 oi0 = i0.class;
          if (!PatchProxy.applyVoidOneRefs(mStyle1, ta, oi0, "4")) {
             if (mStyle1 == LiveGzoneAccompanyLoading$STYLE.FLOAT_LOADING) {
                if (!PatchProxy.applyVoid(null, ta, oi0, "7")) {
                   i0 g = ta.G;
                   if (g == null || !g.isAdded()) {
                      ProgressFragment progressFrag = new ProgressFragment();
                      ta.G = progressFrag;
                      progressFrag.Jh(a1.p(R.string.arg_RES_7f103667));
                      ta.G.Cb(ta.getActivity().getSupportFragmentManager(), "gzone-loading");
                   }
                }
             }else if(mStyle1 != LiveGzoneAccompanyLoading$STYLE.INNER_LOADING || PatchProxy.applyVoid(null, ta, oi0, "6")){
                c.h(ta.A, b.d);
             }
          }
       }
       set.add(p0);
       return;
    }
    public void h(LiveGzoneAccompanyLoading p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "3")) {
          return;
       }
       LiveGzoneAccompanyLoading mStyle = p0.mStyle;
       if (mStyle == LiveGzoneAccompanyLoading$STYLE.NON) {
          return;
       }
       Set set = this.a.F.get(mStyle);
       if (set != null && !set.isEmpty()) {
          set.remove(p0);
          if (set.isEmpty()) {
             this.a.R8(p0.mStyle);
             if (p0 == LiveGzoneAccompanyLoading.GET_ON_REFRESH_LOADING) {
                i.a(R.style.arg_RES_7f110669, 0x7f102364);
             }else if(p0 == LiveGzoneAccompanyLoading.BIND_ACCOUNT_REFRESH_LOADING){
                i.a(R.style.arg_RES_7f110669, 0x7f1003ac);
             }else if(p0 == LiveGzoneAccompanyLoading.UNBIND_ACCOUNT_REFRESH_LOADING){
                i.a(R.style.arg_RES_7f110669, 0x7f104ef8);
             }
          }
       }
       return;
    }
    public void i(LiveGzoneAudienceAccompanyState$State p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "11")) {
          return;
       }
       this.a.S8(p0, false);
       return;
    }
    public void j(LiveGzoneAudienceAccompanyState$State p0,LiveGzoneAudienceAccompanyState$State p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i0$a.class, "9")) {
          return;
       }
       this.a.H.onNext(p1);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, i0$a.class, "1")) {
          return;
       }
       this.a.I.k(0, LiveGzoneAccompanyLoading.INIT_LOADING);
       return;
    }
    public void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "4")) {
          return;
       }
       i.d(R.style.arg_RES_7f110668, p0);
       return;
    }
    public void m(LiveGzoneAudienceAccompanyState$State p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "10")) {
          return;
       }
       this.a.S8(p0, true);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$a.class, "8")) {
          return;
       }
       this.a.P8();
       View view = c.h(this.a.A, b.g);
       if (view != null) {
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.i(n0.b(p0));
          uoa.j(n0.a(p0));
          uoa.p(new i0$a$a(this));
          uoa.q(3);
          uoa.a(view);
       }
       return;
    }
}
