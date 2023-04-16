package lu1.q;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import hu1.c;
import du1.d;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ut1.b;
import ekd.k1;
import com.airbnb.lottie.LottieAnimationView;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ju1.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import zs1.b;
import android.view.View;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.LayoutInflater;
import ag6.a;
import ec3.f;
import ha1.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import lu1.q$d;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.widget.ImageView;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import xh3.g;
import com.kuaishou.live.common.core.component.follow.cache.c;
import lu1.g;
import android.view.View$OnClickListener;
import lu1.h;
import androidx.lifecycle.Observer;
import lu1.i;
import androidx.lifecycle.Transformations;
import lu1.j;
import lu1.k;
import d61.j0;
import lu1.n;
import xh3.l;
import lu1.o;
import lu1.p;
import android.view.GestureDetector;
import android.app.Activity;
import lu1.l;
import android.view.GestureDetector$OnGestureListener;
import lu1.m;
import android.view.View$OnTouchListener;
import lu1.q$a;
import lu1.q$b;
import java.lang.Runnable;
import androidx.lifecycle.MutableLiveData;
import lu1.q$c;
import lu1.d;
import lu1.f;
import java.lang.Number;
import android.view.MotionEvent;
import lu1.v$a;
import lu1.v;
import java.lang.Integer;
import android.text.TextPaint;
import java.lang.CharSequence;
import d61.f0;
import cu1.d;
import usd.q;
import lu1.v$c;

public class q extends LiveMultiPkRenderChildViewController	// class@00304d
{
    public b A;
    public b B;
    public final int C;
    public final int D;
    public int E;
    public GestureDetector F;
    public final LiveMultiPkViewStyle G;
    public final c H;
    public final d I;
    public final a J;
    public final boolean q;
    public ViewGroup r;
    public View s;
    public KwaiImageView t;
    public View u;
    public TextView v;
    public LiveLottieAnimationView w;
    public LiveMediumTextView x;
    public ViewStub y;
    public LiveMultiVideoSceneAudioWidget z;

    public void q(LiveMultiPkLayoutViewType p0,LiveMultiPkViewStyle p1,c p2,d p3,a p4){
       a.p(p0, "viewType");
       a.p(p1, "viewStyle");
       a.p(p2, "renderModel");
       a.p(p3, "renderDelegate");
       a.p(p4, "logDelegate");
       super();
       this.G = p1;
       this.H = p2;
       this.I = p3;
       this.J = p4;
       boolean b = (p0 == LiveMultiPkLayoutViewType.MULTI_PK_SELF_CELL || p0 == LiveMultiPkLayoutViewType.MULTI_PK_SELF_SIMPLE_CELL)? true: false;
       this.q = b;
       if (p1 == LiveMultiPkViewStyle.SIMPLE) {
          this.C = 3;
          this.D = 2;
       }else {
          this.C = 5;
          this.D = 3;
       }
       return;
    }
    public static final LiveMediumTextView e3(q p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("multiPkUserTagView");
       }
       return p0;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, q.class, "11")) {
          return;
       }
       this.B = this.g3();
       super.F2();
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, q.class, "34")) {
          return;
       }
       k1.n(this);
       q tw = this.w;
       if (tw != null) {
          tw.t();
          tw.j(true);
       }
       tw = this.A;
       if (tw != null) {
          tw.dispose();
       }
       return;
    }
    public boolean S(){
       Object obj = PatchProxy.apply(null, this, q.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.I.S();
    }
    public void V2(a p0){
       this.f3(p0);
    }
    public a W2(b p0){
       LiveMultiPkRenderCellViewModel liveMultiPkR = PatchProxy.applyOneRefs(p0, this, q.class, "13");
       if (liveMultiPkR != PatchProxyResult.class) {
       }else {
          a.p(p0, "pkCoreModel");
          LiveMultiPkRenderCellViewModel liveMultiPkR1 = new LiveMultiPkRenderCellViewModel(this.G, p0, this.H, this.b3(), this.I, this.J);
       }
       return liveMultiPkR;
    }
    public View X2(){
       q obj = PatchProxy.apply(null, this, q.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("pkCellView");
       }
       return obj;
    }
    public void d3(ViewGroup p0){
       int i2;
       ViewGroup$LayoutParams layoutParams1;
       View view3;
       q oq = q.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oq, "12")) {
          return;
       }
       a.p(p0, "root");
       b.Z(LiveCommonLogTag.MULTI_PK, "init cell, viewKey: "+this.b3()+", viewStyle: "+this.G);
       View view = PatchProxy.applyOneRefs(p0, this, oq, "28");
       if (view != PatchProxyResult.class) {
       }else if(this.I.e()){
          view = a.c(LayoutInflater.from(this.D2()), R.layout.arg_RES_7f0d0cb6, p0, false);
          a.o(view, "LayoutInflater.from\(cont¡­      root, false\n      \)");
       }else {
          i2 = 0x7f0d0cb8;
          if (f.b()) {
             view3 = b.c(this.D2(), i2, p0, false);
             a.o(view3, "LiteLayoutInflater.infla¡­          false\n        \)");
          }else {
             view3 = a.c(LayoutInflater.from(this.D2()), i2, p0, false);
             a.o(view3, "LayoutInflater.from\(cont¡­dget_layout, root, false\)");
          }
          view = view3;
       }
       this.s = view;
       if (view == null) {
          a.S("pkCellView");
       }
       view = view.findViewById(R.id.live_multi_pk_info_container);
       a.o(view, "pkCellView.findViewById\(¡­_multi_pk_info_container\)");
       this.r = view;
       String str = "pkUserInfoContainer";
       if (view == null) {
          a.S(str);
       }
       LayoutInflater layoutInflat = LayoutInflater.from(view.getContext());
       int i = this.n3();
       q tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       view = a.c(layoutInflat, i, tr, false);
       View view1 = view.findViewById(R.id.live_multi_pk_mute_icon);
       a.o(view1, "userView.findViewById\(R.¡­.live_multi_pk_mute_icon\)");
       this.t = view1;
       view1 = view.findViewById(R.id.live_multi_pk_info_layout);
       a.o(view1, "userView.findViewById\(R.¡­ive_multi_pk_info_layout\)");
       this.u = view1;
       view1 = view.findViewById(R.id.live_multi_pk_user_name);
       a.o(view1, "userView.findViewById\(R.¡­.live_multi_pk_user_name\)");
       this.v = view1;
       LiveLottieAnimationView liveLottieAn = view.findViewById(R.id.live_multi_pk_peer_follow_button);
       this.w = liveLottieAn;
       if (liveLottieAn != null) {
          liveLottieAn.setCancelTaskOnDetachedFromWindow(false);
       }
       q tw = this.w;
       if (tw != null) {
          tw.a(new q$d(this));
       }
       tw = this.r;
       if (tw == null) {
          a.S(str);
       }
       tw.addView(view);
       q ts = this.s;
       if (ts == null) {
          a.S("pkCellView");
       }
       view = ts.findViewById(R.id.live_multi_pk_user_tag);
       a.o(view, "pkCellView.findViewById\(¡­d.live_multi_pk_user_tag\)");
       this.x = view;
       ts = this.B;
       if (ts == null) {
          a.S("cellUserInfoConfig");
       }
       str = "multiPkCellInfoLayout";
       if (!ts.c()) {
          oq = this.u;
          if (oq == null) {
             a.S(str);
          }
          oq.setVisibility(8);
       }else if(this.G != LiveMultiPkViewStyle.SIMPLE || PatchProxy.applyVoid(null, this, oq, "15")){
          oq = this.u;
          if (oq == null) {
             a.S(str);
          }
          int i1 = 0x7f07085e;
          oq.getLayoutParams().height = a1.d(i1);
          oq = this.t;
          if (oq == null) {
             a.S("multiPkMuteImageView");
          }
          i2 = (this.I.e())? a1.d(R.dimen.arg_RES_7f07085c): a1.d(R.dimen.arg_RES_7f07085d);
          oq.getLayoutParams().width = i2;
          oq.getLayoutParams().height = i2;
          if (!this.I.e()) {
             ViewGroup$LayoutParams layoutParams = oq.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams.leftMargin = a1.e(4.00f);
             layoutParams1 = oq.getLayoutParams();
             Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams1.rightMargin = - a1.e(2.00f);
          }else {
             layoutParams1 = oq.getLayoutParams();
             Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams1.leftMargin = a1.e(4.00f);
          }
          oq = this.v;
          if (oq == null) {
             a.S("multiPkUserNameTextView");
          }
          oq.setTextSize(false, (float)a1.d(R.dimen.arg_RES_7f070863));
          oq.getLayoutParams().height = a1.d(i1);
          if (!this.I.e()) {
             ViewGroup$LayoutParams layoutParams2 = oq.getLayoutParams();
             Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams2.leftMargin = a1.e(4.00f);
             layoutParams1 = oq.getLayoutParams();
             Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams1.rightMargin = a1.e(4.00f);
          }
          oq = this.w;
          if (oq != null) {
             i1 = a1.d(R.dimen.arg_RES_7f07085f);
             oq.getLayoutParams().width = i1;
             oq.getLayoutParams().height = i1;
             layoutParams1 = oq.getLayoutParams();
             Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams1.leftMargin = - a1.e(2.00f);
          }
       }
       oq = this.s;
       if (oq == null) {
          a.S("pkCellView");
       }
       View view2 = oq.findViewById(R.id.live_multi_pk_audio_widget_view_stub);
       a.o(view2, "pkCellView.findViewById\(¡­k_audio_widget_view_stub\)");
       this.y = view2;
       oq = this.s;
       if (oq == null) {
          a.S("pkCellView");
       }
       this.R2(oq);
       return;
    }
    public void f3(LiveMultiPkRenderCellViewModel p0){
       q oq1;
       LiveData liveData1;
       q oq = q.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oq, "14")) {
          return;
       }
       a.p(p0, "viewModel");
       q tv = this.v;
       if (tv == null) {
          a.S("multiPkUserNameTextView");
       }
       g.a(tv, this, p0.j);
       String str = null;
       String str1 = "cellUserInfoConfig";
       if (!PatchProxy.applyVoidOneRefs(p0, this, oq, "25")) {
          tv = this.B;
          if (tv == null) {
             a.S(str1);
          }
          if (tv.a()) {
             if (!c.b().c(this.b3())) {
                this.w3(str, str);
             }
             tv = this.w;
             if (tv != null) {
                tv.setOnClickListener(new g(p0));
             }
             p0.g.observe(this, new h(this));
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, oq, "24")) {
          boolean b = this.I.e();
          oq1 = this.B;
          if (oq1 == null) {
             a.S(str1);
          }
          if (oq1.b()) {
             String str3 = "multiPkMuteImageView";
             if (!this.I.e()) {
                oq1 = this.t;
                if (oq1 == null) {
                   a.S(str3);
                }
                oq1.setAlpha(0x3f000000);
             }
             oq1 = this.t;
             if (oq1 == null) {
                a.S(str3);
             }
             oq1.setOnClickListener(new i(b, p0));
             if (this.v3()) {
                tv = this.t;
                if (tv == null) {
                   a.S(str3);
                }
                tv.setBackgroundResource(R.drawable.arg_RES_7f0813a9);
             }
             liveData1 = Transformations.distinctUntilChanged(p0.r);
             a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
             liveData1.observe(this, new j(this));
             liveData1 = Transformations.distinctUntilChanged(p0.A0());
             a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
             liveData1.observe(this, new k(this));
             tv = this.t;
             if (tv == null) {
                a.S(str3);
             }
             j0.b(tv, a1.e(10.00f));
          }
       }
       oq1 = 1;
       Object[] objArray = null;
       if (!PatchProxy.applyVoidOneRefs(p0, this, oq, "23")) {
          String str2 = "multiPkUserTagView";
          if (this.q != null && this.I.e()) {
             tv = this.x;
             if (tv == null) {
                a.S(str2);
             }
             tv.setOnClickListener(new n(p0));
             tv = this.x;
             if (tv == null) {
                a.S(str2);
             }
             tv.setClickable(oq1);
          }else {
             tv = this.x;
             if (tv == null) {
                a.S(str2);
             }
             tv.setOnClickListener(objArray);
             tv = this.x;
             if (tv == null) {
                a.S(str2);
             }
             tv.setClickable(str);
          }
          q tx = this.x;
          if (tx == null) {
             a.S(str2);
          }
          l.e(tx, this, p0.p, false, 4, null);
          liveData1 = Transformations.distinctUntilChanged(p0.D0());
          a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
          liveData1.observe(this, new o(this));
          liveData1 = Transformations.distinctUntilChanged(p0.o);
          a.h(liveData1, "Transformations.distinctUntilChanged\(this\)");
          liveData1.observe(this, new p(this));
       }
       str = "pkCellView";
       if (!PatchProxy.applyVoid(objArray, this, oq, "21") && (a.g(this.I.d(), this.b3()) ^ oq1)) {
          tv = this.s;
          if (tv == null) {
             a.S(str);
          }
          tv.setClickable(oq1);
          this.F = new GestureDetector(this.B2(), new l(this));
          tv = this.s;
          if (tv == null) {
             a.S(str);
          }
          tv.setOnTouchListener(new m(this));
       }
       tv = this.B;
       if (tv == null) {
          a.S(str1);
       }
       if (tv.c()) {
          tv = this.u;
          if (tv == null) {
             a.S("multiPkCellInfoLayout");
          }
          tv.setOnClickListener(new q$a(p0));
       }
       oq1 = this.s;
       if (oq1 == null) {
          a.S(str);
       }
       l.e(oq1, this, p0.k, false, 4, null);
       k1.s(new q$b(this), this, 0);
       this.H.a().observe(this, new q$c(this));
       if (!PatchProxy.applyVoidOneRefs(p0, this, oq, "36")) {
          LiveData liveData = Transformations.distinctUntilChanged(p0.C0());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(this, new d(this));
          liveData = Transformations.distinctUntilChanged(p0.A);
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(this, new f(this, p0));
       }
       return;
    }
    public b g3(){
       Object obj = PatchProxy.apply(null, this, q.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.h1(false, this.q);
    }
    public final LiveLottieAnimationView h3(){
       return this.w;
    }
    public final KwaiImageView j3(){
       q obj = PatchProxy.apply(null, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("multiPkMuteImageView");
       }
       return obj;
    }
    public final TextView k3(){
       q obj = PatchProxy.apply(null, this, q.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("multiPkUserNameTextView");
       }
       return obj;
    }
    public final View l3(){
       q obj = PatchProxy.apply(null, this, q.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("pkCellView");
       }
       return obj;
    }
    public final ViewGroup m3(){
       q obj = PatchProxy.apply(null, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("pkUserInfoContainer");
       }
       return obj;
    }
    public int n3(){
       Object obj = PatchProxy.apply(null, this, q.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.I.e())? 0x7f0d0cb5: 0x7f0d0cb7;
       return i;
    }
    public int o3(){
       Object obj = PatchProxy.apply(null, this, q.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070859);
    }
    public int p3(){
       Object obj = PatchProxy.apply(null, this, q.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070864);
    }
    public final boolean q3(){
       return this.q;
    }
    public final void r3(boolean p0,MotionEvent p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oq, "22")) {
          return;
       }
       if (p0) {
          b.Z(LiveCommonLogTag.MULTI_PK, "do like");
          this.I.A(p1);
       }else {
          b.Z(LiveCommonLogTag.MULTI_PK, "cell click");
          this.c3().E0(v$a.a);
       }
       return;
    }
    public final void s3(int p0){
       boolean b1;
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq, "16")) {
          return;
       }
       boolean b = true;
       String str = "cellUserInfoConfig";
       if (a.g(this.c3().A0().getValue(), Boolean.TRUE)) {
          oq = this.B;
          if (oq == null) {
             a.S(str);
          }
          if (oq.b()) {
             b1 = true;
          label_0041 :
             if (!c.b().c(this.b3())) {
                q tB = this.B;
                if (tB == null) {
                   a.S(str);
                }
                if (tB.a()) {
                label_005e :
                   this.t3(p0, b1, b);
                   return;
                }
             }
             b = false;
             goto label_005e ;
          }
       }
       b1 = false;
       goto label_0041 ;
    }
    public void t3(int p0,boolean p1,boolean p2){
       q tv3;
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, q.class, "17")) {
          return;
       }
       q ts = this.s;
       if (ts == null) {
          a.S("pkCellView");
       }
       int i = (((ts.getMeasuredWidth() - p0) - this.o3()) - this.p3()) - a1.e(6.00f);
       q tv = this.v;
       if (tv == null) {
          a.S("multiPkUserNameTextView");
       }
       TextPaint paint = tv.getPaint();
       q tv1 = this.v;
       if (tv1 == null) {
          a.S("multiPkUserNameTextView");
       }
       CharSequence text = tv1.getText();
       Object[] objArray = null;
       String str = (text != null)? text.toString(): objArray;
       paint = (int)paint.measureText(f0.b(str, this.D));
       tv1 = this.t;
       if (tv1 == null) {
          a.S("multiPkMuteImageView");
       }
       int i1 = d.k(tv1);
       int i2 = d.k(this.w);
       int i3 = (i1 + i2) + paint;
       q tv2 = this.v;
       if (tv2 == null) {
          a.S("multiPkUserNameTextView");
       }
       i3 = i3 + d.j(tv2);
       Object obj = PatchProxy.apply(objArray, this, oq, "31");
       int b = (obj != PatchProxyResult.class)? obj.booleanValue(): this.I.e();
       int i4 = 8;
       if (b) {
          tv3 = this.v;
          if (tv3 == null) {
             a.S("multiPkUserNameTextView");
          }
          if (i >= i3) {
             i4 = 0;
          }
          tv3.setVisibility(i4);
       }else if(p1 && !this.I.e()){
          tv3 = this.t;
          if (tv3 == null) {
             a.S("multiPkMuteImageView");
          }
          b = (i < i3)? 8: 0;
          tv3.setVisibility(b);
       }
       if (p2) {
          i3 = i3 - i1;
          tv3 = this.w;
          if (tv3 != null) {
             if (i >= i3) {
                i4 = 0;
             }
             tv3.setVisibility(i4);
          }
       }
       this.u3(i, paint, i1, i2);
       tv = this.u;
       if (tv == null) {
          a.S("multiPkCellInfoLayout");
       }
       tv.requestLayout();
       return;
    }
    public final void u3(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(q.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, q.class, "18")) {
          return;
       }
       q tv = this.v;
       if (tv == null) {
          a.S("multiPkUserNameTextView");
       }
       if (tv.getVisibility()) {
          return;
       }else {
          tv = this.v;
          if (tv == null) {
             a.S("multiPkUserNameTextView");
          }
          TextPaint paint = tv.getPaint();
          q tv1 = this.v;
          if (tv1 == null) {
             a.S("multiPkUserNameTextView");
          }
          CharSequence text = tv1.getText();
          String str = (text != null)? text.toString(): null;
          int i = (int)paint.measureText(f0.b(str, this.C));
          tv1 = this.v;
          if (tv1 == null) {
             a.S("multiPkUserNameTextView");
          }
          p0 = p0 - d.j(tv1);
          tv1 = this.t;
          if (tv1 == null) {
             a.S("multiPkMuteImageView");
          }
          if (!tv1.getVisibility()) {
             p0 = p0 - p2;
          }
          q tw = this.w;
          if (tw != null && !tw.getVisibility()) {
             p0 = p0 - p3;
          }
          tw = this.v;
          if (tw == null) {
             a.S("multiPkUserNameTextView");
          }
          tw.setMaxWidth(q.n(p1, q.u(i, p0)));
          q tv2 = this.v;
          if (tv2 == null) {
             a.S("multiPkUserNameTextView");
          }
          tv2.setMinWidth(p1);
          return;
       }
    }
    public boolean v3(){
       Object obj = PatchProxy.apply(null, this, q.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.I.e();
    }
    public final void w3(int p0,boolean p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, oq, "35")) {
          return;
       }
       oq = this.w;
       if (oq != null) {
          oq.setVisibility(p0);
          if (!p0) {
             this.c3().E0(v$c.a);
          }
          if (p1) {
             q tE = this.E;
             if (tE != null) {
                this.s3(tE);
             }
          }
       }
    label_0036 :
       return;
    }
}
