package e0b.j;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import e0b.d;
import e0b.c;
import e0b.c$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import com.yxcorp.gifshow.lelink.ScreencastManager$a;
import java.util.ArrayList;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import b0b.a;
import e0b.h$a;
import java.util.List;
import java.util.Collection;
import e0b.j$e;
import java.lang.Runnable;
import a97.h;
import android.view.View;
import ekd.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.Button;
import android.view.ViewStub;
import e0b.j$b;
import android.view.View$OnClickListener;
import e0b.j$c;
import e0b.j$d;
import zf6.k;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import d0b.d;
import android.app.Activity;
import android.content.res.Resources;
import java.lang.CharSequence;
import e0b.p;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import e0b.k;
import e0b.l;
import e0b.m;
import java.util.Iterator;
import cgc.a;
import com.yxcorp.utility.n;
import lnc.a1;
import e0b.n;
import e0b.j$a;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import e0b.j$f;
import e0b.j$g;

public final class j extends c implements PopupInterface$h, d	// class@0025d3
{
    public TextView A;
    public TextView B;
    public Button C;
    public ViewStub D;
    public View E;
    public LinearLayout F;
    public View G;
    public View H;
    public View I;
    public int J;
    public Drawable K;
    public h$a L;
    public int M;
    public int N;
    public View O;
    public final ScreencastManager P;
    public List Q;
    public List R;
    public final String r;
    public final String s;
    public final int t;
    public ConstraintLayout u;
    public ImageView v;
    public ImageView w;
    public LinearLayout x;
    public ImageView y;
    public LottieAnimationView z;

    public void j(c$a p0){
       a.p(p0, "build");
       super(p0);
       this.r = "LelinkSearchDevicesView";
       this.s = "https://ppg.viviv.com/doodle/JVbptVyO.html?hyId=jimu_JVbptVyO";
       this.t = 1;
       this.M = 0x7f0d0fea;
       this.N = -1;
       this.P = ScreencastManager.A.a();
       this.Q = new ArrayList();
       this.R = new ArrayList();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oj, "19")) {
          return;
       }
       a.p(p0, "popup");
       this.P.j().m();
       j tL = this.L;
       if (tL != null) {
          boolean b = (p1 == this.t)? true: false;
          tL.b(b);
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
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "9")) {
          return;
       }
       a.p(p0, "devicesInfos");
       this.Q = p0;
       this.P.j().i((p0.isEmpty() ^ 0x01));
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(p0);
       this.k0();
       h.a(new j$e(this, uArrayList));
       return;
    }
    public int d0(){
       return this.M;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.search_layout_container);
       a.o(view, "bindWidget\(rootView, R.id.search_layout_container\)");
       this.u = view;
       view = m1.f(p0, R.id.connect_tv_text);
       a.o(view, "bindWidget\(rootView, R.id.connect_tv_text\)");
       this.B = view;
       view = m1.f(p0, R.id.connect_tv_tip_iv);
       a.o(view, "bindWidget\(rootView, R.id.connect_tv_tip_iv\)");
       this.v = view;
       view = m1.f(p0, R.id.connect_tv_back_iv);
       a.o(view, "bindWidget\(rootView, R.id.connect_tv_back_iv\)");
       this.w = view;
       view = m1.f(p0, R.id.device_search_layout);
       a.o(view, "bindWidget\(rootView, R.id.device_search_layout\)");
       this.x = view;
       view = m1.f(p0, R.id.device_search_image);
       a.o(view, "bindWidget\(rootView, R.id.device_search_image\)");
       this.y = view;
       view = m1.f(p0, R.id.loading_lottie);
       a.o(view, "bindWidget\(rootView, R.id.loading_lottie\)");
       this.z = view;
       view = m1.f(p0, R.id.device_search_tip);
       a.o(view, "bindWidget\(rootView, R.id.device_search_tip\)");
       this.A = view;
       view = m1.f(p0, R.id.re_device_search_btn);
       a.o(view, "bindWidget\(rootView, R.id.re_device_search_btn\)");
       this.C = view;
       this.D = m1.f(p0, 0x7f0a1754);
       j tv = this.v;
       if (tv == null) {
          a.S("mConnectTipIv");
       }
       tv.setOnClickListener(new j$b(this));
       tv = this.w;
       if (tv == null) {
          a.S("mConnectBackIv");
       }
       tv.setOnClickListener(new j$c(this));
       tv = this.C;
       if (tv == null) {
          a.S("mReSearchButton");
       }
       tv.setOnClickListener(new j$d(this));
       String str = "mLoadingLottie";
       if (k.d()) {
          tv = this.z;
          if (tv == null) {
             a.S(str);
          }
          tv.setAnimation(R.raw.arg_RES_7f0f0035);
       }else {
          tv = this.z;
          if (tv == null) {
             a.S(str);
          }
          tv.setAnimation(R.raw.arg_RES_7f0f0036);
       }
       tv = this.u;
       str = "mContainerLayout";
       if (tv == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tv.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       layoutParams.topMargin = this.J;
       j tu = this.u;
       if (tu == null) {
          a.S(str);
       }
       tu.setLayoutParams(layoutParams);
       tv = this.K;
       if (tv != null) {
          tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          tu.setBackground(tv);
       }
       this.f0(this);
       TextView[] textViewArra = new TextView[1];
       int i = 0;
       tu = this.B;
       if (tu == null) {
          a.S("mConnectTvText");
       }
       textViewArra[i] = tu;
       d.a("sans-serif-medium", textViewArra);
       return;
    }
    public void e(){
       Object[] objArray1;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "4")) {
          return;
       }
       this.P.j().i(false);
       if (this.H == null) {
          oj = this.E;
          if (oj != null) {
             oj.setVisibility(8);
          }
          oj = this.x;
          if (oj == null) {
             a.S("mSearchDevicesLayout");
          }
          oj.setVisibility(false);
          oj = this.y;
          String str = "mSearchTipImageView";
          if (oj == null) {
             a.S(str);
          }
          oj.setVisibility(false);
          oj = this.y;
          if (oj == null) {
             a.S(str);
          }
          oj.setImageResource(R.drawable.arg_RES_7f081686);
          oj = this.z;
          if (oj == null) {
             a.S("mLoadingLottie");
          }
          oj.setVisibility(8);
          oj = this.C;
          if (oj == null) {
             a.S("mReSearchButton");
          }
          oj.setVisibility(false);
          oj = this.A;
          if (oj == null) {
             a.S("mSearchTipTv");
          }
          Activity uActivity = this.u();
          a.o(uActivity, "context");
          oj.setText(uActivity.getResources().getText(R.string.arg_RES_7f103952));
       }else if(PatchProxy.applyVoid(objArray, this, oj, "16")){
          oj = this.H;
          if (oj != null) {
             LinearLayout linearLayout = oj.findViewById(R.id.device_layout);
             if (linearLayout != null) {
                linearLayout.removeAllViews();
             }
             if (linearLayout != null) {
                linearLayout.setVisibility(8);
             }
             oj = this.H;
             linearLayout = (oj != null)? oj.findViewById(R.id.search_view): objArray;
             if (linearLayout != null) {
                linearLayout.setVisibility(false);
             }
             if (linearLayout != null) {
                ImageView imageView = linearLayout.findViewById(R.id.normal_device_search_image);
                if (imageView != null) {
                   imageView.setImageResource(R.drawable.arg_RES_7f081686);
                }
             }
             LottieAnimationView lottieAnimat = (linearLayout != null)? linearLayout.findViewById(R.id.normal_loading_lottie): objArray;
             if (lottieAnimat != null) {
                lottieAnimat.setVisibility(8);
             }
             if (lottieAnimat != null) {
                lottieAnimat.clearAnimation();
             }
             TextView textView = (linearLayout != null)? linearLayout.findViewById(R.id.normal_device_search_tip): objArray;
             if (textView != null) {
                Activity uActivity1 = this.u();
                a.o(uActivity1, "context");
                textView.setText(uActivity1.getResources().getText(R.string.arg_RES_7f103952));
             }
             oj = this.H;
             Button uButton = (oj != null)? oj.findViewById(R.id.re_device_search_btn): objArray;
             j tH = this.H;
             if (tH != null) {
                objArray = tH.findViewById(R.id.device_search_fresh_btn);
             }
             if (uButton != null) {
                uButton.setVisibility(false);
             }
             if (uButton != null) {
                uButton.setOnClickListener(new p(this, uButton, objArray));
             }
          }
       }
       return;
    }
    public void f(){
       j tF1;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "5")) {
          return;
       }
       this.P.j().h(false);
       j tF = this.F;
       if (tF != null) {
          tF.removeView(this.O);
       }
       tF = this.G;
       if (tF != null) {
          tF1 = this.F;
          if (tF1 != null) {
             tF1.removeView(tF);
          }
       }
       tF = this.I;
       if (tF != null) {
          tF1 = this.F;
          if (tF1 != null) {
             tF1.removeView(tF);
          }
       }
       View view = PatchProxy.apply(objArray, this, oj, "12");
       if (view != PatchProxyResult.class) {
       }else {
          view = a.c(LayoutInflater.from(this.u()), R.layout.arg_RES_7f0d0fe8, this.F, false);
          ImageView imageView = (view != null)? view.findViewById(R.id.download_view): objArray;
          if (imageView != null) {
             imageView.setOnClickListener(new k(this));
          }
          if (view != null) {
             objArray = view.findViewById(R.id.device_search_fresh_btn);
          }
          if (objArray != null) {
             objArray.setOnClickListener(new l(this));
          }
          a.o(view, "view");
       }
       this.G = view;
       j tF2 = this.F;
       if (tF2 != null) {
          tF2.addView(view, false);
       }
       return;
    }
    public void g(h$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       this.L = p0;
       return;
    }
    public final void g0(List p0){
       View view2;
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, "11")) {
          return;
       }
       j tI = this.I;
       if (tI != null) {
          j tF = this.F;
          if (tF != null) {
             tF.removeView(tI);
          }
       }
       View view = PatchProxy.applyOneRefs(p0, this, oj, "17");
       ImageView imageView = null;
       if (view != PatchProxyResult.class) {
       }else {
          this.R = p0;
          view = a.c(LayoutInflater.from(this.u()), R.layout.arg_RES_7f0d0feb, this.F, 0);
          int i = 0x7f0a2c57;
          View view1 = (view != null)? view.findViewById(i): imageView;
          LinearLayout linearLayout = view.findViewById(R.id.device_layout);
          view.findViewById(i).setImageResource(R.drawable.arg_RES_7f080d52);
          if (view1 != null) {
             view1.setOnClickListener(new m(this));
          }
          String str = "view.findViewById<View>\(R.id.search_view\)";
          int i1 = 0x7f0a37da;
          int i2 = 8;
          String str1 = "deviceLayout";
          if (p0.isEmpty() ^ 0x01) {
             a.o(linearLayout, str1);
             linearLayout.setVisibility(0);
             view2 = view.findViewById(i1);
             a.o(view2, str);
             view2.setVisibility(i2);
          }else {
             a.o(linearLayout, str1);
             linearLayout.setVisibility(i2);
             view2 = view.findViewById(i1);
             a.o(view2, str);
             view2.setVisibility(0);
          }
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             view1 = a.c(LayoutInflater.from(this.u()), R.layout.arg_RES_7f0d0fec, linearLayout, 0);
             TextView textView = view1.findViewById(R.id.device_name_tv);
             if (textView != null) {
                textView.setText(uoa.b());
                i2 = n.z(textView.getContext()) - a1.d(0x7f0702a0);
                textView.setMaxWidth(i2);
             }
             linearLayout.addView(view1);
             view1.setOnClickListener(new n(this, uoa));
          }
          a.o(view, "view");
       }
       this.I = view;
       if (view != null) {
          imageView = view.findViewById(0x7f0a0b51);
       }
       if (imageView != null) {
          imageView.setOnClickListener(new j$a(this, imageView));
       }
       j tF1 = this.F;
       if (tF1 != null) {
          tF1.addView(this.I, 0);
       }
       return;
    }
    public final String h0(){
       String obj = PatchProxy.apply(null, this, j.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().c("tvDownloadCourseUrl", this.s);
       a.o(obj, "SwitchConfigManager.getI¡­WNLOAD_URL, DOWNLOAD_URL\)");
       return obj;
    }
    public void i(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "10")) {
          return;
       }
       a.p(p0, "devicesInfos");
       int i = 1;
       this.P.j().h((p0.isEmpty() ^ i));
       a uoa = this.P.j();
       int i1 = p0.isEmpty() ^ i;
       int i2 = this.Q.isEmpty() ^ i;
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i1), Boolean.valueOf(i2), uoa, uoa1, "8") && (uoa.g == null || i1 != uoa.h))) {
          uoa.g = i;
          uoa.h = i1;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PROJECTION_SCREEN_POPUP_BANNER";
          i3 oi3 = i3.f();
          oi3.d("is_find_kstv", uoa.j(i1));
          oi3.d("is_find_normal_tv", uoa.j(i2));
          uElementPack.params = oi3.e();
          u1.D0("", null, 3, uElementPack, null, null);
       }
       h.a(new j$f(this, p0));
       return;
    }
    public final void i0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "15")) {
          return;
       }
       j tI = this.I;
       if (tI != null) {
          LinearLayout linearLayout = (tI != null)? tI.findViewById(R.id.device_layout): objArray;
          if (linearLayout != null) {
             linearLayout.setVisibility(8);
          }
          tI = this.I;
          View view = (tI != null)? tI.findViewById(R.id.search_view): objArray;
          if (view != null) {
             view.setVisibility(0);
          }
          tI = this.I;
          if (tI != null) {
             objArray = tI.findViewById(0x7f0a2c57);
          }
          if (objArray != null) {
             objArray.setImageResource(R.drawable.arg_RES_7f080d53);
          }
          if (objArray != null) {
             objArray.setOnClickListener(new j$g(this));
          }
       }
       return;
    }
    public void j(int p0){
       this.J = p0;
    }
    public final void j0(){
       j tH;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "14")) {
          return;
       }
       int i = 8;
       boolean b = false;
       if (this.H == null) {
          View view = a.c(LayoutInflater.from(this.u()), R.layout.arg_RES_7f0d10a8, this.F, b);
          this.H = view;
          j tF = this.F;
          if (tF != null) {
             tF.addView(view);
          }
          tH = this.H;
          if (tH != null) {
             ImageView imageView = tH.findViewById(R.id.device_search_fresh_btn);
             if (imageView != null) {
                imageView.setVisibility(i);
             }
          }
       }
    label_003f :
       tH = this.H;
       LinearLayout linearLayout = (tH != null)? tH.findViewById(R.id.device_layout): objArray;
       if (linearLayout != null) {
          linearLayout.removeAllViews();
       }
       if (linearLayout != null) {
          linearLayout.setVisibility(i);
       }
       tH = this.H;
       linearLayout = (tH != null)? tH.findViewById(R.id.search_view): objArray;
       if (linearLayout != null) {
          linearLayout.setVisibility(b);
       }
       if (linearLayout != null) {
          ImageView imageView1 = linearLayout.findViewById(R.id.normal_device_search_image);
          if (imageView1 != null) {
             imageView1.setImageResource(R.drawable.arg_RES_7f081683);
          }
       }
       LottieAnimationView lottieAnimat = (linearLayout != null)? linearLayout.findViewById(R.id.normal_loading_lottie): objArray;
       if (lottieAnimat != null) {
          lottieAnimat.setVisibility(b);
       }
       if (k.d()) {
          if (lottieAnimat != null) {
             lottieAnimat.setAnimation(R.raw.arg_RES_7f0f0035);
          }
       }else if(lottieAnimat != null){
          lottieAnimat.setAnimation(R.raw.arg_RES_7f0f0036);
       }
       if (lottieAnimat != null) {
          lottieAnimat.s();
       }
       if (linearLayout != null) {
          objArray = linearLayout.findViewById(0x7f0a2e03);
       }
       if (objArray != null) {
          Activity uActivity = this.u();
          a.o(uActivity, "context");
          objArray.setText(uActivity.getResources().getText(R.string.arg_RES_7f1045e6));
       }
       return;
    }
    public final void k0(){
       j tD;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "18")) {
          return;
       }
       if (this.E == null) {
          tD = this.D;
          if (tD != null) {
             View view = (tD != null)? tD.inflate(): objArray;
             this.E = view;
             this.F = m1.f(view, 0x7f0a16d8);
             tD = this.E;
             if (tD != null) {
                objArray = tD.findViewById(R.id.search_view_frist);
             }
             this.O = objArray;
          }
       }
       tD = this.x;
       if (tD == null) {
          a.S("mSearchDevicesLayout");
       }
       tD.setVisibility(8);
       tD = this.E;
       if (tD != null) {
          tD.setVisibility(0);
       }
       if (this.Q.isEmpty()) {
          this.j0();
       }
       return;
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
