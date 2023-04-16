package com.google.android.material.tabs.KCubeTabLayout;
import com.google.android.material.tabs.TabLayout;
import android.content.Context;
import android.util.SparseArray;
import java.util.HashMap;
import xq6.a;
import com.google.android.material.tabs.KCubeTabLayout$a;
import com.google.android.material.tabs.KCubeTabLayout$b;
import com.google.android.material.tabs.KCubeTabLayout$c;
import java.lang.Boolean;
import java.lang.Runnable;
import java.lang.Object;
import com.google.android.material.tabs.NasaTabView;
import wq6.h;
import sn5.e;
import sn5.g;
import sn5.c;
import android.view.View;
import com.google.android.material.tabs.TabLayout$f;
import android.view.GestureDetector;
import android.view.MotionEvent;
import wn5.b;
import wq6.g;
import com.google.android.material.tabs.KCubeTabLayout$e;
import wq6.c;
import wq6.f;
import java.lang.CharSequence;
import java.lang.String;
import java.util.Map;
import com.google.android.material.tabs.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import zq6.b;
import rn5.a;
import zq6.p;
import com.yxcorp.utility.TextUtils;
import jk.x;
import gsa.i;
import android.widget.HorizontalScrollView;
import androidx.core.content.ContextCompat;
import sb5.e;
import com.google.android.material.tabs.KCubeTabLayout$f;
import com.google.android.material.tabs.a;
import com.google.android.material.tabs.TabLayout$TabView;
import android.widget.LinearLayout;
import a2.i0;
import android.widget.TextView;
import com.yxcorp.utility.RomUtils;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import android.text.TextPaint;
import crd.b;
import lnc.b9;
import fr6.i;
import com.google.android.material.tabs.TabLayout$c;
import sn5.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Math;
import java.lang.Double;
import jk.n;
import zq6.u;
import zq6.s;
import xq6.b;
import jk.r;
import jk.o;
import jk.p;
import jk.q;
import android.view.ViewGroup;
import jk.l;
import brd.t;
import com.kwai.framework.init.e;
import t45.d;
import brd.z;
import jk.k;
import erd.g;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.IllegalStateException;
import jk.g;
import android.view.View$OnClickListener;
import com.google.android.material.tabs.KCubeTabLayout$d;
import android.view.GestureDetector$OnGestureListener;
import jk.m;
import android.view.View$OnTouchListener;
import android.content.res.Resources;
import android.content.res.Configuration;
import lnc.a1;
import android.graphics.Canvas;
import com.kwai.kcube.TabIdentifier;
import jk.s;
import jk.j;
import java.util.Objects;
import jk.u;
import jk.t;
import jk.h;
import jk.i;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.graphics.PointF;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.widget.CheckedTextView;
import android.widget.LinearLayout$LayoutParams;

public class KCubeTabLayout extends TabLayout	// class@0016ba
{
    public int b;
    public int c;
    public boolean d;
    public ViewGroup e;
    public View f;
    public ImageView g;
    public ImageView h;
    public View i;
    public View j;
    public KwaiImageView k;
    public KwaiImageView l;
    public final SparseArray m;
    public boolean n;
    public int o;
    public KCubeTabLayout$f p;
    public a q;
    public f r;
    public KCubeTabLayout$e s;
    public final Map t;
    public final a u;
    public a v;
    public b w;
    public final c x;
    public final i y;
    public final TabLayout$d z;

    public void KCubeTabLayout(Context p0){
       super(p0);
       this.d = false;
       this.m = new SparseArray();
       this.o = -1;
       this.t = new HashMap();
       this.u = new a();
       this.v = new a();
       this.x = new KCubeTabLayout$a(this);
       this.y = new KCubeTabLayout$b(this);
       this.z = new KCubeTabLayout$c(this);
    }
    public static void N(KCubeTabLayout p0){
       p0.p0();
    }
    public static void O(KCubeTabLayout p0,Boolean p1){
       p0.v0(p1);
    }
    public static void P(Runnable p0,Object p1){
       KCubeTabLayout.q0(p0, p1);
    }
    public static void Q(KCubeTabLayout p0,int p1,NasaTabView p2,h p3,e p4){
       p0.r0(p1, p2, p3, p4);
    }
    public static void R(KCubeTabLayout p0,int p1,NasaTabView p2,h p3,g p4){
       p0.t0(p1, p2, p3, p4);
    }
    public static void S(KCubeTabLayout p0,c p1){
       p0.u0(p1);
    }
    public static void T(KCubeTabLayout p0,int p1,NasaTabView p2,View p3){
       p0.n0(p1, p2, p3);
    }
    public static void U(KCubeTabLayout p0,Boolean p1){
       p0.w0(p1);
    }
    public static boolean V(TabLayout$f p0,GestureDetector p1,View p2,MotionEvent p3){
       return KCubeTabLayout.o0(p0, p1, p2, p3);
    }
    public static void W(KCubeTabLayout p0,float p1){
       p0.f0(p1);
    }
    public static void X(TabLayout$f p0,boolean p1,b p2){
       KCubeTabLayout.s0(p0, p1, p2);
    }
    private void n0(int p0,NasaTabView p1,View p2){
       this.o = p0;
       this.s.b(p0, true, p1, this.r.U(p0));
    }
    public static boolean o0(TabLayout$f p0,GestureDetector p1,View p2,MotionEvent p3){
       boolean b = (p0.f() && p1.onTouchEvent(p3))? true: false;
       return b;
    }
    private void p0(){
       this.k0();
       this.r.v(this.x);
    }
    public static void q0(Runnable p0,Object p1){
       p0.run();
    }
    private void r0(int p0,NasaTabView p1,h p2,e p3){
       this.s.a(p0, p1, p2, p1.getCurrentBadgeStatus(), p1.getText(), p3);
       p1.d(p3);
    }
    public static void s0(TabLayout$f p0,boolean p1,b p2){
       p0.o(p2.d(p1));
    }
    private void t0(int p0,NasaTabView p1,h p2,g p3){
       this.s.e(p0, p1, p2, p3);
       this.t.get(p1).e(p3);
    }
    private void u0(c p0){
       if (p0.a != null) {
          this.D0(p0.b);
       }else {
          this.i0(p0.b);
       }
       return;
    }
    private void v0(Boolean p0){
       if (p0.booleanValue()) {
          this.E0();
       }else {
          this.j0();
       }
       return;
    }
    private void w0(Boolean p0){
       if (p0.booleanValue()) {
          this.i.setVisibility(0);
       }else {
          this.i.setVisibility(8);
       }
       return;
    }
    public void A0(f p0){
       this.z();
       this.B0();
       Log.g("KCubeTabLayout", "refreshWithTabData: mHasShootButton "+this.d);
       if (this.d != null) {
          this.d0(p0.h());
       }
       boolean b = p0.x("ato_operate");
       h oh = p0.j();
       b uob = this.r.y();
       int i = 0;
       while (i < p0.h()) {
          h oh1 = p0.U(i);
          TabLayout$f uof = this.z0(oh1, i);
          uof.n(oh1);
          this.b(uof);
          uof.o(uob.e(oh1, a.n).d(b));
          if (oh1 == oh && !uof.f()) {
             uof.h();
          }
          i = i + 1;
       }
       return;
    }
    public void B(int p0){
       super.B(p0);
       this.t.remove(this.m.get(p0)).g();
    }
    public final void B0(){
       this.v.c();
       this.v = new a();
    }
    public final void C0(TabLayout$f p0,String p1){
       if (!TextUtils.x(p1) && p0.a() instanceof NasaTabView) {
          p0.a().setIconConfig(new x(10, e.g(i.h(), ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061fcd)), p1));
       }
       return;
    }
    public void D(TabLayout$f p0,boolean p1){
       KCubeTabLayout tp = this.p;
       if (tp != null && tp.a(p0)) {
          return;
       }
       super.D(p0, p1);
       return;
    }
    public final void D0(boolean p0){
       this.q.r(p0);
    }
    public final void E0(){
       this.q.s();
    }
    public final TabLayout$f F0(h p0,int p1){
       TabLayout$f uof;
       boolean b = true;
       boolean b1 = false;
       if (this.n != null) {
          uof = this.o();
          uof.g = this;
          uof.k(this.y0(p0));
          TabLayout$TabView tabView = new TabLayout$TabView(this, this.getContext());
          tabView.setTab(uof);
          tabView.setFocusable(b);
          tabView.setClipChildren(b1);
          uof.h = tabView;
       }else {
          uof = this.w();
          uof.h.setClipChildren(b1);
          uof.k(this.y0(p0));
       }
       i0.J0(uof.h, b1, b1, b1, b1);
       TextView textView = uof.a().findViewById(0x1020014);
       if (RomUtils.u() && Build$VERSION.SDK_INT >= 30) {
          textView.setTypeface(Typeface.defaultFromStyle(b));
       }else {
          textView.getPaint().setFakeBoldText(b);
       }
       return uof;
    }
    public void G0(){
       if (this.r == null) {
          return;
       }
       boolean b = false;
       this.n = b;
       b9.a(this.w);
       this.u.c();
       this.r.w(this.x);
       this.r.b(this.y);
       this.A(this.z);
       for (; b < this.m.size(); b = b + 1) {
          this.t.get(this.m.get(b)).g();
       }
       this.B0();
       return;
    }
    public void H0(a p0){
       int i2;
       int i3;
       KCubeTabLayout tj = this.j;
       if (tj != null) {
          tj.setBackgroundColor(p0.a);
       }
       int i = 0;
       if (this.k != null && this.l != null) {
          int i1 = 8;
          if (i.a() && p0.o != -683789590297399530000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f) {
             if (TextUtils.x(p0.m)) {
                this.k.setVisibility(i1);
             }else {
                this.k.setVisibility(i);
                this.k.setAlpha(p0.k);
                this.x0(this.k, p0.m);
             }
             if (TextUtils.x(p0.n)) {
                this.l.setVisibility(i1);
             }else {
                this.l.setVisibility(i);
                this.l.setAlpha(p0.j);
                this.x0(this.l, p0.n);
             }
          }else {
             this.k.setVisibility(i1);
             this.l.setVisibility(i1);
          }
       }
       this.i.setBackgroundColor(p0.b);
       if (this.d != null) {
          this.g.setAlpha(p0.j);
          this.h.setAlpha(p0.k);
       }
       float f = this.r.m();
       float f1 = (float)this.r.getCurrentPosition() + f;
       double d = (double)f1;
       double d1 = Math.floor(d);
       if (!Double.compare(d1, Math.ceil(d))) {
          i2 = (int)d1;
          i3 = i2;
       }else {
          f1 = f1 + 0x3f800000;
          i3 = (int)Math.floor((double)f1);
          i2 = (int)d1;
       }
       while (i < this.m.size()) {
          NasaTabView nasaTabView = this.m.get(i);
          nasaTabView.setLoadingView(p0.i);
          nasaTabView.setTextShadow(p0.f);
          if (i < i2 || i > i3) {
             nasaTabView.setTextColor(p0.d);
             nasaTabView.setTextSizeScale(0x3f800000);
          }else if(i2 == i3){
             nasaTabView.setTextColor(p0.c);
             nasaTabView.setTextSizeScale(0);
          }else if(i == i2){
             nasaTabView.setTextColor(p0.g);
             nasaTabView.setTextSizeScale(f);
          }else {
             nasaTabView.setTextColor(p0.h);
             float f2 = 0x3f800000 - f;
             nasaTabView.setTextSizeScale(f2);
          }
          i = i + 1;
       }
       return;
    }
    public final void I0(){
       b uob = this.r.y();
       this.u.a(uob.b(a.b, new n(this)));
       this.u.a(uob.b(a.c, new r(this)));
       this.u.a(uob.b(a.d, new o(this)));
       this.u.a(uob.b(a.f, new p(this)));
       this.u.a(uob.b(a.e, new q(this)));
    }
    public void Y(){
       for (int i = 0; i < this.m.size(); i = i + 1) {
          this.m.get(i).t();
       }
       return;
    }
    public void Z(View p0){
       this.e = p0;
       this.f = p0.findViewById(0x7f0a0475);
       this.i = p0.findViewById(0x7f0a047d);
       this.j = p0.findViewById(0x7f0a0474);
       this.k = p0.findViewById(0x7f0a0480);
       this.l = p0.findViewById(0x7f0a047f);
       this.q = new a(this);
    }
    public void a0(f p0,KCubeTabLayout$e p1){
       this.b0(p0, p1, false);
    }
    public void b0(f p0,KCubeTabLayout$e p1,boolean p2){
       this.n = p2;
       this.G0();
       this.r = p0;
       this.s = p1;
       this.A0(p0);
       this.a(this.z);
       this.r.W(this.y);
       this.I0();
       Log.g("KCubeTabLayout", "enableTabViewWatchDelay, watch after launch finish");
       this.w = e.b().observeOn(d.a).subscribe(new k(new l(this)));
       if (i.l()) {
          i.k();
       }
       return;
    }
    public void c0(View p0){
       if (this.d != null) {
          throw new IllegalStateException("already bindShootContainer");
       }
       this.g = p0.findViewById(0x7f0a056b);
       this.h = p0.findViewById(0x7f0a0569);
       this.d = true;
       if (this.getTabCount() > 0) {
          Log.g("KCubeTabLayout", "bindShootContainer");
          this.d0(this.getTabCount());
          int i = 0;
          while (i < this.getTabCount()) {
             ViewGroup$MarginLayoutParams layoutParams = this.v(i).h.getLayoutParams();
             layoutParams.leftMargin = (i == this.b)? this.c: 0;
             i = i + 1;
          }
          this.invalidate();
       }
       return;
    }
    public void d(TabLayout$f p0,int p1,boolean p2){
       NasaTabView nasaTabView = p0.a();
       h oh = this.r.U(p1);
       p0.h.setOnClickListener(new g(this, p1, nasaTabView));
       if (Boolean.TRUE.equals(this.r.y().e(oh, a.h))) {
          p0.h.setOnTouchListener(new m(p0, new GestureDetector(this.getContext(), new KCubeTabLayout$d(this, p0, oh))));
       }
       this.m.put(p1, nasaTabView);
       this.t.put(nasaTabView, new b(p0.d(), nasaTabView, this.q));
       super.d(p0, p1, p2);
       if (this.d != null && p1 == this.b) {
          p0.leftMargin = this.c;
       }
       return;
    }
    public final void d0(int p0){
       this.b = p0 / 2;
       int i = a1.e((float)this.getContext().getResources().getConfiguration().screenWidthDp);
       this.c = i / (p0 + 1);
       Log.g("KCubeTabLayout", "caculateShootButtonPosition: tabCount "+p0+", screenWidth "+i+", mCenterMargin "+this.c);
    }
    public void draw(Canvas p0){
       super.draw(p0);
    }
    public final void e0(float p0){
       this.f.setAlpha(p0);
       boolean b = false;
       if (!p0) {
          this.i0(b);
          this.f.setVisibility(8);
       }else {
          this.D0(b);
          this.f.setVisibility(b);
       }
       return;
    }
    public final void f0(float p0){
       this.e0(Math.max(0, (0x3f800000 - ((0x3f800000 - p0) / 0x3f19999a))));
    }
    public NasaTabView g0(int p0){
       return this.m.get(p0);
    }
    public View getContainer(){
       return this.e;
    }
    public int getTabViewBadgeColor(){
       return ContextCompat.getColor(this.getContext(), 0x7f061fcd);
    }
    public int getTabViewBadgeStrokeColor(){
       return ContextCompat.getColor(this.getContext(), 0x7f061fcd);
    }
    public int getTabViewBadgeTextColor(){
       return ContextCompat.getColor(this.getContext(), 0x7f061c32);
    }
    public NasaTabView h0(TabIdentifier p0){
       int i = 0;
       while (true) {
          if (i >= this.m.size()) {
             return null;
          }
          NasaTabView h = this.m.get(i).H;
          if (h != null && h.M2().equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return this.m.get(i);
    }
    public final void i0(boolean p0){
       this.q.i(p0);
    }
    public final void j0(){
       this.q.j();
    }
    public void k0(){
       boolean b = this.r.x("ato_operate");
       b uob = this.r.y();
       int i = 0;
       while (i < this.r.h()) {
          h oh = this.r.U(i);
          TabLayout$f uof = this.v(i);
          NasaTabView nasaTabView = uof.a();
          this.v.a(uob.g(oh, a.i, new s(this, i, nasaTabView, oh)));
          this.v.a(uob.g(oh, a.n, new j(uof, b)));
          Objects.requireNonNull(nasaTabView);
          this.v.a(uob.g(oh, a.j, new u(nasaTabView)));
          this.v.a(uob.g(oh, a.k, new t(this, i, nasaTabView, oh)));
          this.v.a(uob.g(oh, a.l, new h(nasaTabView)));
          this.v.a(uob.g(oh, a.m, new i(nasaTabView)));
          List list = this.s.g(uob, oh, nasaTabView);
          if (!q.f(list)) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                this.v.a(iterator.next());
             }
          }
          i = i + 1;
       }
       return;
    }
    public boolean l0(NasaTabView p0){
       boolean b = (p0 != null && p0.getCurrentBadgeStatus())? true: false;
       return b;
    }
    public boolean m0(TabIdentifier p0){
       return this.l0(this.h0(p0));
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       if (this.d == null) {
          return;
       }
       Log.g("KCubeTabLayout", "onConfigurationChanged");
       this.d0(this.getTabCount());
       TabLayout$f uof = this.v(this.b);
       if (uof != null) {
          TabLayout$f h = uof.h;
          if (h != null) {
             ViewGroup$MarginLayoutParams layoutParams = h.getLayoutParams();
             layoutParams.leftMargin = this.c;
             uof.h.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
    }
    public void setNasaTabSelectInterceptor(KCubeTabLayout$f p0){
       this.p = p0;
    }
    public TabLayout$f w(){
       return super.w();
    }
    public final void x0(KwaiImageView p0,String p1){
       p0.getHierarchy().x(0);
       p0.getHierarchy().u(t$b.j);
       p0.getHierarchy().t(new PointF(0x3f000000, 0));
       i.j(p0, p1, null);
    }
    public final NasaTabView y0(h p0){
       NasaTabView nasaTabView = this.s.f(this.getContext(), p0);
       nasaTabView.setClipChildren(false);
       nasaTabView.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       nasaTabView.M(this.getTabViewBadgeColor());
       nasaTabView.N(this.getTabViewBadgeStrokeColor());
       nasaTabView.O(this.getTabViewBadgeTextColor());
       LinearLayout linearLayout = new LinearLayout(this.getContext());
       linearLayout.setId(R.id.tab_layout);
       linearLayout.setOrientation(1);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
       layoutParams.gravity = 17;
       linearLayout.setLayoutParams(layoutParams);
       CheckedTextView uCheckedText = new CheckedTextView(this.getContext());
       uCheckedText.setId(0x1020014);
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(-2, -2);
       layoutParams1.topMargin = a1.e(0x3f800000);
       layoutParams1.gravity = 17;
       uCheckedText.setIncludeFontPadding(false);
       uCheckedText.setLayoutParams(layoutParams1);
       uCheckedText.setSingleLine(1);
       if (this.n == null) {
          linearLayout.addView(nasaTabView.i());
       }
       linearLayout.addView(uCheckedText);
       nasaTabView.addView(linearLayout);
       return nasaTabView;
    }
    public void z(){
       super.z();
       for (int i = 0; i < this.m.size(); i = i + 1) {
          this.t.get(this.m.get(i)).g();
       }
       this.m.clear();
       this.t.clear();
       return;
    }
    public final TabLayout$f z0(h p0,int p1){
       boolean b = this.r.x("ato_operate");
       int i = (i.a() && this.r.h() <= i.c())? 1: 0;
       TabLayout$f uof = this.F0(p0, p1);
       NasaTabView nasaTabView = uof.a();
       if (i) {
          this.C0(uof, i.g(p1));
       }else if(b){
          nasaTabView.setTextSize(NasaTabView.getRealTextSize());
       }
       return uof;
    }
}
