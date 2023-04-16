package e0b.h;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import e0b.d;
import e0b.c;
import e0b.c$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import e0b.h$a;
import java.util.List;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import xza.a;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.util.Collection;
import q87.c;
import android.view.View;
import android.view.ViewStub;
import ekd.m1;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import d0b.d;
import zf6.k;
import android.app.Activity;
import android.content.res.Resources;
import e0b.i;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import e0b.f;
import e0b.h$e;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.Button;
import e0b.h$b;
import e0b.h$c;
import e0b.h$d;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import e0b.d$a;

public final class h extends c implements PopupInterface$h, d	// class@0025c9
{
    public TextView A;
    public TextView B;
    public Button C;
    public ViewStub D;
    public View E;
    public ImageView F;
    public RecyclerView G;
    public View H;
    public int I;
    public Drawable J;
    public h$a K;
    public f L;
    public int M;
    public int N;
    public final String r;
    public final int s;
    public ConstraintLayout t;
    public ImageView u;
    public ImageView v;
    public LinearLayout w;
    public ImageView x;
    public LottieAnimationView y;
    public TextView z;

    public void h(c$a p0){
       a.p(p0, "build");
       super(p0);
       this.r = "LelinkSearchDevicesView";
       this.s = 1;
       this.M = 0x7f0d08dd;
       this.N = -1;
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "10")) {
          return;
       }
       a.p(p0, "popup");
       h tK = this.K;
       if (tK != null) {
          boolean b = (p1 == this.s)? true: false;
          tK.b(b);
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void c(List p0){
       h tN;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "8")) {
          return;
       }
       a.p(p0, "devicesInfos");
       KLogLelink kLogLelink = KLogLelink.e.a();
       h tr = this.r;
       StringBuilder str = "devicesInfos: ";
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().a().getName());
       }
       Object[] objArray = new Object[0];
       kLogLelink.w(tr, str+uArrayList, objArray);
       if (!PatchProxy.applyVoid(null, this, oh, "9")) {
          if (this.E == null) {
             oh = this.D;
             if (oh == null) {
                a.S("mDevicesViewStub");
             }
             View view = oh.inflate();
             this.E = view;
             this.F = m1.f(view, 0x7f0a0b51);
             this.G = m1.f(this.E, 0x7f0a1751);
             view = m1.f(this.E, R.id.select_device_tip);
             a.o(view, "bindWidget\(mDevicesListL¡­, R.id.select_device_tip\)");
             this.B = view;
             this.H = m1.f(this.E, 0x7f0a1753);
             TextView[] textViewArra = new TextView[1];
             tN = this.B;
             if (tN == null) {
                a.S("mSelectTvTips");
             }
             textViewArra[0] = tN;
             d.a("sans-serif-medium", textViewArra);
             if (k.d()) {
                oh = this.H;
                if (oh != null) {
                   Activity uActivity = this.u();
                   a.o(uActivity, "context");
                   oh.setBackgroundColor(uActivity.getResources().getColor(R.color.arg_RES_7f060188));
                }
                oh = this.H;
                if (oh != null) {
                   oh.setAlpha(0.05f);
                }
             }
             oh = this.F;
             if (oh != null) {
                oh.setOnClickListener(new i(this));
             }
          }
          oh = this.w;
          if (oh == null) {
             a.S("mSearchDevicesLayout");
          }
          oh.setVisibility(8);
          oh = this.E;
          if (oh != null) {
             oh.setVisibility(0);
          }
       }
       if (this.L == null) {
          f uof = new f(p0);
          this.L = uof;
          tN = this.N;
          if (tN > null) {
             uof.f = tN;
          }
          uof.e = new h$e(this);
       }
       oh = this.L;
       if (oh != null && !PatchProxy.applyVoidOneRefs(p0, oh, f.class, "4")) {
          a.p(p0, "<set-?>");
          oh.g = p0;
       }
       h tG = this.G;
       if (tG != null) {
          tG.setLayoutManager(new LinearLayoutManager(this.u()));
       }
       tG = this.G;
       if (tG != null) {
          tG.setAdapter(this.L);
       }
       return;
    }
    public int d0(){
       return this.M;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.search_layout_container);
       a.o(view, "bindWidget\(rootView, R.id.search_layout_container\)");
       this.t = view;
       view = m1.f(p0, R.id.connect_tv_text);
       a.o(view, "bindWidget\(rootView, R.id.connect_tv_text\)");
       this.A = view;
       view = m1.f(p0, R.id.connect_tv_tip_iv);
       a.o(view, "bindWidget\(rootView, R.id.connect_tv_tip_iv\)");
       this.u = view;
       view = m1.f(p0, R.id.connect_tv_back_iv);
       a.o(view, "bindWidget\(rootView, R.id.connect_tv_back_iv\)");
       this.v = view;
       view = m1.f(p0, R.id.device_search_layout);
       a.o(view, "bindWidget\(rootView, R.id.device_search_layout\)");
       this.w = view;
       view = m1.f(p0, R.id.device_search_image);
       a.o(view, "bindWidget\(rootView, R.id.device_search_image\)");
       this.x = view;
       view = m1.f(p0, R.id.loading_lottie);
       a.o(view, "bindWidget\(rootView, R.id.loading_lottie\)");
       this.y = view;
       view = m1.f(p0, R.id.device_search_tip);
       a.o(view, "bindWidget\(rootView, R.id.device_search_tip\)");
       this.z = view;
       view = m1.f(p0, R.id.re_device_search_btn);
       a.o(view, "bindWidget\(rootView, R.id.re_device_search_btn\)");
       this.C = view;
       p0 = m1.f(p0, R.id.lelink_devices_list_viewstub);
       a.o(p0, "bindWidget\(rootView, R.i¡­nk_devices_list_viewstub\)");
       this.D = p0;
       h tu = this.u;
       if (tu == null) {
          a.S("mConnectTipIv");
       }
       tu.setOnClickListener(new h$b(this));
       tu = this.v;
       if (tu == null) {
          a.S("mConnectBackIv");
       }
       tu.setOnClickListener(new h$c(this));
       tu = this.C;
       if (tu == null) {
          a.S("mReSearchButton");
       }
       tu.setOnClickListener(new h$d(this));
       String str = "mLoadingLottie";
       if (k.d()) {
          tu = this.y;
          if (tu == null) {
             a.S(str);
          }
          tu.setAnimation(R.raw.arg_RES_7f0f0035);
       }else {
          tu = this.y;
          if (tu == null) {
             a.S(str);
          }
          tu.setAnimation(R.raw.arg_RES_7f0f0036);
       }
       tu = this.t;
       str = "mContainerLayout";
       if (tu == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tu.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       layoutParams.topMargin = this.I;
       h tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       tt.setLayoutParams(layoutParams);
       tu = this.J;
       if (tu != null) {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          tt.setBackground(tu);
       }
       this.f0(this);
       TextView[] textViewArra = new TextView[1];
       int i = 0;
       tt = this.A;
       if (tt == null) {
          a.S("mConnectTvText");
       }
       textViewArra[i] = tt;
       d.a("sans-serif-medium", textViewArra);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       h tE = this.E;
       int i = 8;
       if (tE != null) {
          tE.setVisibility(i);
       }
       tE = this.w;
       if (tE == null) {
          a.S("mSearchDevicesLayout");
       }
       int i1 = 0;
       tE.setVisibility(i1);
       tE = this.x;
       String str = "mSearchTipImageView";
       if (tE == null) {
          a.S(str);
       }
       tE.setVisibility(i1);
       tE = this.x;
       if (tE == null) {
          a.S(str);
       }
       tE.setImageResource(R.drawable.arg_RES_7f081686);
       tE = this.y;
       if (tE == null) {
          a.S("mLoadingLottie");
       }
       tE.setVisibility(i);
       tE = this.C;
       if (tE == null) {
          a.S("mReSearchButton");
       }
       tE.setVisibility(i1);
       tE = this.z;
       if (tE == null) {
          a.S("mSearchTipTv");
       }
       Activity uActivity = this.u();
       a.o(uActivity, "context");
       tE.setText(uActivity.getResources().getText(R.string.arg_RES_7f103952));
       return;
    }
    public void f(){
       PatchProxy.applyVoid(null, this, h.class, "11");
    }
    public void g(h$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       this.K = p0;
       return;
    }
    public final void g0(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       h tE = this.E;
       int i = 8;
       if (tE != null) {
          tE.setVisibility(i);
       }
       tE = this.w;
       if (tE == null) {
          a.S("mSearchDevicesLayout");
       }
       int i1 = 0;
       tE.setVisibility(i1);
       tE = this.x;
       String str = "mSearchTipImageView";
       if (tE == null) {
          a.S(str);
       }
       tE.setVisibility(i1);
       tE = this.x;
       if (tE == null) {
          a.S(str);
       }
       tE.setImageResource(R.drawable.arg_RES_7f081683);
       tE = this.y;
       if (tE == null) {
          a.S("mLoadingLottie");
       }
       tE.setVisibility(i1);
       if (k.d()) {
          tE = this.y;
          if (tE == null) {
             a.S("mLoadingLottie");
          }
          tE.setAnimation(R.raw.arg_RES_7f0f0035);
       }else {
          tE = this.y;
          if (tE == null) {
             a.S("mLoadingLottie");
          }
          tE.setAnimation(R.raw.arg_RES_7f0f0036);
       }
       tE = this.y;
       if (tE == null) {
          a.S("mLoadingLottie");
       }
       tE.s();
       tE = this.C;
       if (tE == null) {
          a.S("mReSearchButton");
       }
       tE.setVisibility(i);
       tE = this.z;
       if (tE == null) {
          a.S("mSearchTipTv");
       }
       Activity uActivity = this.u();
       a.o(uActivity, "context");
       tE.setText(uActivity.getResources().getText(R.string.arg_RES_7f1045e6));
       return;
    }
    public void i(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "12")) {
          return;
       }
       a.p(p0, "devices");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, d$a.class, "1")) {
          a.p(p0, "devices");
       }
       return;
    }
    public void j(int p0){
       this.I = p0;
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
