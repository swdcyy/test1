package com.kuaishou.live.preview.item.winter.a;
import k51.c;
import lnc.a1;
import com.kuaishou.live.preview.item.winter.a$a;
import com.kuaishou.live.preview.item.winter.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ql3.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import le5.f;
import uh5.e;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ql3.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h61.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import android.os.Bundle;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.kuaishou.live.preview.item.winter.a$c;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.Objects;
import com.kuaishou.live.preview.item.winter.LivePreviewMultiColorGradientView;
import java.util.Map;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends c	// class@000e63
{
    public QPhoto p;
    public FrameLayout q;
    public BaseFragment r;
    public LivePreviewMultiColorGradientView s;
    public SlidePlayViewModel t;
    public boolean u;
    public final a v;
    public final WebViewFragment$b w;
    public static final int[] x;
    public static final float[] y;

    static {
       int[] ointArray = new int[]{a1.a(0x7f060245),a1.a(0x7f060245),a1.a(0x7f06024b),a1.a(0x7f06024a),a1.a(0x7f060249)};
       a.x = ointArray;
       a.y = new float[5]{0,0x3e99999a,0x3ecccccd,0x3f19999a,0x3f800000};
    }
    public void a(){
       super();
       this.v = new a$a(this);
       this.w = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.t = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.r, this.v);
       }
       this.X7(this.r.m().subscribe(new a(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       int i = 0;
       int i1 = (f.b())? 0: e.c();
       a tq = this.q;
       tq.setPadding(i, i, i, (tq.getPaddingBottom() + i1));
       ConstraintLayout$LayoutParams layoutParams = this.s.getLayoutParams();
       layoutParams.bottomMargin = layoutParams.bottomMargin + i1;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tt = this.t;
       if (tt != null) {
          tt.D(this.r, this.v);
       }
       return;
    }
    public void P8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "6")) {
          return;
       }
       LiveStreamModel$WinterOlympicSimpleLive obj = PatchProxy.apply(objArray, objArray, b.class, "1");
       int i = 0;
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("disableLoadWebViewInPreviewLive", i);
       if (b) {
          return;
       }else {
          this.R8();
          obj = r1.X1(this.p.mEntity);
          if (obj != null && !TextUtils.x(obj.mWebUrl)) {
             a.f("OLYMPIC_PREVIEW_LOAD_FINISH");
             this.q.setVisibility(i);
             KwaiYodaWebViewFragment kwaiYodaWebV = new KwaiYodaWebViewFragment();
             KwaiYodaWebViewActivity$c uoc = KwaiYodaWebViewActivity.G3(this.getContext(), obj.mWebUrl).e("KEY_THEME", "3");
             uoc.h(new LaunchModel$a(obj.mWebUrl).m(i).g(i).a());
             kwaiYodaWebV.setArguments(uoc.i("none").a().getExtras());
             kwaiYodaWebV.lh(this.w);
             kwaiYodaWebV.ch(new a$c(this, obj));
             e uoe = this.r.getChildFragmentManager().beginTransaction();
             uoe.f(R.id.web_view_container, kwaiYodaWebV);
             uoe.m();
             this.s.setVisibility(i);
             a ts = this.s;
             int[] x = a.x;
             float[] y = a.y;
             Objects.requireNonNull(ts);
             if (!PatchProxy.applyVoidTwoRefs(x, y, ts, LivePreviewMultiColorGradientView.class, "5")) {
                ts.i = x;
                ts.j = y;
                ts.a();
                ts.invalidate();
             }
          }else {
             this.s.setVisibility(8);
          }
          return;
       }
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       c childFragmen = this.r.getChildFragmentManager();
       Fragment uFragment = childFragmen.findFragmentById(R.id.web_view_container);
       if (uFragment != null) {
          e uoe = childFragmen.beginTransaction();
          uoe.u(uFragment);
          uoe.m();
       }
       this.q.setVisibility(8);
       if (!PatchProxy.applyVoidOneRefs("OLYMPIC_PREVIEW_LOAD_FINISH", objArray, a.class, "8")) {
          a.a.remove("OLYMPIC_PREVIEW_LOAD_FINISH");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a456d);
       this.s = p0.findViewById(0x7f0a45a3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
