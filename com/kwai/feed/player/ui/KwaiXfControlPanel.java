package com.kwai.feed.player.ui.KwaiXfControlPanel;
import sc6.e;
import android.widget.FrameLayout;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashSet;
import b56.g;
import com.kwai.feed.player.ui.KwaiXfControlPanel$b;
import java.util.LinkedHashSet;
import java.util.BitSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import crd.a;
import com.kwai.feed.player.ui.GestureView;
import b56.i;
import com.kwai.feed.player.ui.GestureView$f;
import b56.f0;
import b56.j;
import b56.h0;
import b56.h;
import b56.a;
import b56.d;
import b56.j0;
import com.kwai.framework.player.helper.f;
import brd.t;
import b56.m;
import com.kwai.feed.player.ui.a;
import erd.g;
import crd.b;
import sc6.d;
import com.kwai.feed.player.ui.c;
import sc6.d$a;
import android.widget.ImageView;
import b56.f;
import android.view.View$OnClickListener;
import lnc.a1;
import b56.p;
import c56.b$a;
import com.kwai.feed.player.ui.d;
import c56.b$b;
import com.kwai.framework.player.core.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.Log;
import y46.b;
import android.widget.TextView;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.n;
import java.util.Objects;
import java.lang.Runnable;
import android.widget.ProgressBar;
import com.kwai.framework.player.helper.f$a;
import java.lang.Number;
import com.kwai.feed.player.ui.f;
import java.util.List;
import a56.c;
import com.kwai.feed.player.ui.g;
import java.util.Iterator;
import java.util.Set;
import b56.y;
import java.lang.Long;
import java.lang.Math;
import com.kwai.feed.player.ui.KwaiXfControlPanel$e;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.feed.player.ui.KwaiXfControlPanel$i;
import android.view.View$MeasureSpec;
import y46.a;
import y46.c;
import java.util.Arrays;
import b56.z;
import b56.e;
import b56.n;
import com.kwai.feed.player.ui.b;
import b56.k;
import gc6.o;
import com.kwai.framework.player.core.b$b;
import b56.l;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import z46.b;
import b56.o;
import android.animation.AnimatorSet;
import ekd.k1;
import b56.e0;

public class KwaiXfControlPanel extends FrameLayout implements e	// class@0014b7
{
    public boolean A;
    public boolean A1;
    public final Runnable B;
    public e B1;
    public IMediaPlayer$OnBufferingUpdateListener C;
    public a C1;
    public b$b D;
    public a D1;
    public Set E;
    public GestureView F;
    public boolean G;
    public boolean H;
    public Set I;
    public Set J;
    public b K;
    public final KwaiXfControlPanel$b L;
    public View M;
    public ImageView N;
    public View O;
    public View P;
    public View Q;
    public BitSet R;
    public final Set S;
    public int T;
    public int U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X0;
    public c Y0;
    public final Set Z0;
    public final Set a1;
    public long b;
    public List b1;
    public b c;
    public o c1;
    public boolean d;
    public f d1;
    public boolean e;
    public TextView e1;
    public f0 f;
    public Runnable f1;
    public d g;
    public View$OnClickListener g1;
    public j0 h;
    public Runnable h1;
    public a i;
    public String i1;
    public f j;
    public String j1;
    public f$a k;
    public String k1;
    public long l;
    public final Set l1;
    public BitSet m;
    public List m1;
    public FrameLayout n;
    public g n1;
    public int o;
    public b o1;
    public View p;
    public final Set p1;
    public View q;
    public View$OnClickListener q1;
    public BitSet r;
    public Runnable r1;
    public Set s;
    public TextView s1;
    public final Set t;
    public View t1;
    public FrameLayout u;
    public ProgressBar u1;
    public float v;
    public final BitSet v1;
    public KwaiXfControlPanel$e w;
    public FrameLayout w1;
    public long x;
    public boolean x1;
    public boolean y;
    public boolean y1;
    public boolean z;
    public boolean z1;
    public static final long E1;
    public static final long F1;
    public static final boolean G1;

    static {
       TimeUnit sECONDS = TimeUnit.SECONDS;
       KwaiXfControlPanel.E1 = sECONDS.toMillis(2);
       KwaiXfControlPanel.F1 = sECONDS.toMillis(4);
    }
    public void KwaiXfControlPanel(Context p0){
       super(p0, null);
    }
    public void KwaiXfControlPanel(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiXfControlPanel(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 200;
       boolean b = true;
       this.d = b;
       this.l = -1;
       this.t = new HashSet();
       this.v = 0x3fe38e39;
       this.B = new g(this);
       this.L = new KwaiXfControlPanel$b(this);
       this.S = new HashSet();
       this.Z0 = new HashSet();
       this.a1 = new LinkedHashSet();
       this.l1 = new HashSet();
       this.p1 = new HashSet();
       this.v1 = new BitSet();
       this.x1 = b;
       this.y1 = false;
       this.z1 = b;
       this.A1 = false;
       this.B1 = null;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfControlPanel.class, "84")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d0776, this);
          this.i = new a();
          this.q = this.findViewById(0x7f0a45d5);
          this.x = KwaiXfControlPanel.E1;
          this.u = this.findViewById(0x7f0a45d2);
          this.p = this.findViewById(0x7f0a45d3);
          this.r = new BitSet();
          this.n = this.findViewById(0x7f0a45db);
          this.m = new BitSet();
          this.w1 = this.findViewById(0x7f0a45c7);
          GestureView gestureView = this.findViewById(R.id.xf_touch_handle_view);
          this.F = gestureView;
          gestureView.a(new i(this));
          this.F.setEnableContinuousTap(b);
          f0 uof0 = new f0(this.u);
          this.f = uof0;
          uof0.r = new j(this);
          this.k();
          h0 oh0 = new h0(this);
          this.g = oh0;
          oh0.g(this.b);
          this.g.f(new h(this));
          this.h = new j0(this);
          f uof = new f();
          this.j = uof;
          this.i.c(uof.a().subscribe(new m(this), a.b));
          this.f.c().j(new c(this));
          if (!PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "88")) {
             this.M = this.findViewById(0x7f0a45ca);
             this.N = this.findViewById(0x7f0a45cb);
             this.M.setOnClickListener(new f(this));
             this.R = new BitSet();
             this.V = a1.d(0x7f07032a);
             this.W = a1.d(0x7f07032a);
             this.T = a1.d(0x7f07030d);
             this.U = a1.d(0x7f07030d);
             this.U0 = a1.d(0x7f07031d);
             this.V0 = a1.d(0x7f07031d);
             this.W0 = a1.d(0x7f070335);
             this.X0 = a1.d(0x7f070335);
          }
          if (!PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "104")) {
             this.F.setEnableHorizontalSwipe(false);
             this.F.setHorizontalSwipeListener(new p(this));
             this.F.setEnableVerticalSwipe(false);
             this.F.setVerticalSwipeListener(new d(this));
          }
          this.w(false, false);
       }
       return;
    }
    public static boolean h(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiXfControlPanel.class, "123");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          return true;
       }
       Log.n("KwaiXfControlPanel", "no player attach");
       return false;
    }
    public void a(boolean p0){
       boolean b;
       KwaiXfControlPanel tt1;
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "12")) {
          return;
       }
       this.e = p0;
       this.b();
       if (!PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "115")) {
          tt1 = this.Q;
          if (tt1 != null) {
             int i = -2;
             if (this.e != null) {
                b.a(tt1, a1.d(R.dimen.arg_RES_7f071115), i);
                b.a(this.O, this.W0, this.X0);
                b.a(this.P, this.W0, this.X0);
             }else {
                b.a(tt1, a1.d(R.dimen.arg_RES_7f071116), i);
                b.a(this.O, this.U0, this.V0);
                b.a(this.P, this.U0, this.V0);
             }
          }
       }
       this.m(this.s1, p0);
       b = false;
       if (this.e != null && this.t1 == null) {
          View view = a.d(this.getContext(), R.layout.arg_RES_7f0d1719, this.u, b);
          this.t1 = view;
          this.u.addView(view);
       }
       tt1 = this.t1;
       if (tt1 != null) {
          if (p0) {
             tt1.setVisibility(b);
          }else {
             tt1.setVisibility(8);
          }
       }
       tt1 = this.f;
       if (tt1 != null) {
          tt1.a(p0);
       }
       tt1 = this.g;
       if (tt1 instanceof e) {
          tt1.a(p0);
       }
       this.g(1, (p0 ^ 1));
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "114")) {
          return;
       }
       if (this.e != null) {
          b.a(this.M, this.V, this.W);
          b.a(this.N, this.V, this.W);
       }else {
          b.a(this.M, this.T, this.U);
          b.a(this.N, this.T, this.U);
       }
       return;
    }
    public final void c(int p0,boolean p1){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, KwaiXfControlPanel.class, "120")) {
          return;
       }
       this.p.setBackgroundResource(this.o);
       if (p1) {
          this.r.set(p0);
       }else {
          this.r.clear(p0);
       }
       this.n("changeMainControlShader "+this.r);
       if (this.r.cardinality() > 0) {
          n.W(this.p, 8, this.b);
       }else {
          n.W(this.p, 0, this.b);
       }
       return;
    }
    public final void d(int p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, KwaiXfControlPanel.class, "121")) {
          return;
       }
       KwaiXfControlPanel kwaiXfContro = null;
       if (p2) {
          kwaiXfContro = this.b;
       }
       if (p1) {
          this.m.set(p0);
       }else {
          this.m.clear(p0);
       }
       this.n("changeNoControlPanel "+this.m);
       if (this.m.cardinality() > 0) {
          n.W(this.n, 8, kwaiXfContro);
       }else {
          n.W(this.n, 0, kwaiXfContro);
       }
       return;
    }
    public final void e(int p0,boolean p1,boolean p2,boolean p3,boolean p4){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Boolean.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, KwaiXfControlPanel.class, "118")) {
             return;
          }
       }
       KwaiXfControlPanel kwaiXfContro = null;
       if (p2) {
          if (this.y != null) {
             KwaiXfControlPanel tf = this.f;
             Objects.requireNonNull(tf);
             Object obj = PatchProxy.apply(null, tf, f0.class, "2");
             if (obj != PatchProxyResult.class) {
                tf = obj.booleanValue();
             }else {
                f0 f = tf.f;
                f = (f == null)? false: f.isEnabled();
             }
             if (!tf) {
                kwaiXfContro = 100;
                p3 = false;
             }
          }
          kwaiXfContro = this.b;
       }
       if (p1) {
          this.R.set(p0);
       }else {
          this.R.clear(p0);
       }
       this.removeCallbacks(this.L);
       KwaiXfControlPanel tL = this.L;
       tL.b = p3;
       tL.c = kwaiXfContro;
       if (p4) {
          tL.run();
       }else {
          this.postDelayed(tL, 20);
       }
       return;
    }
    public final void f(int p0,boolean p1){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, KwaiXfControlPanel.class, "117")) {
          return;
       }
       this.e(p0, p1, false, false, true);
       return;
    }
    public void g(int p0,boolean p1){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, KwaiXfControlPanel.class, "58")) {
          return;
       }
       this.v1.set(p0, (p1 ^ 0x01));
       if (this.u1 != null) {
          if (this.v1.cardinality() > 0) {
             this.u1.setVisibility(8);
          }else {
             this.u1.setVisibility(0);
          }
       }
       return;
    }
    public f0 getBottomProgressView(){
       return this.f;
    }
    public FrameLayout getBusinessContainerPanel(){
       return this.w1;
    }
    public View getCenterPlayBtn(){
       return this.M;
    }
    public d getCenterProgressView(){
       return this.g;
    }
    public t getEventObservable(){
       Object obj = PatchProxy.apply(null, this, KwaiXfControlPanel.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.a();
    }
    public View getFullScreenBackView(){
       return this.t1;
    }
    public View getNextPlayBtn(){
       return this.P;
    }
    public long getPanelDisplayDurationMs(){
       KwaiXfControlPanel tl = this.l;
       if (tl > 0) {
          return tl;
       }
       tl = this.k;
       if (tl == null) {
          return 0;
       }
       return tl.b;
    }
    public j0 getPanoramaDirectionViewHolder(){
       return this.h;
    }
    public View getPrevPlayBtn(){
       return this.O;
    }
    public int getQualitySelectIndex(){
       KwaiXfControlPanel obj = PatchProxy.apply(null, this, KwaiXfControlPanel.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d1;
       if (obj != null) {
          return obj.e;
       }
       return -1;
    }
    public List getQualityUiModels(){
       return this.b1;
    }
    public c getSelectedSpeedModel(){
       Object[] objArray = null;
       KwaiXfControlPanel obj = PatchProxy.apply(objArray, this, KwaiXfControlPanel.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.n1 != null) {
          obj = this.m1;
          if (obj != null && obj.size() > 0) {
             g d = this.n1.d;
             if (d >= null && d < this.m1.size()) {
                objArray = this.m1.get(d);
             }
          }
       }
       if (objArray == null) {
          obj = this.m1;
          if (obj != null && obj.size() > 0) {
             objArray = this.m1.get(0);
          }
       }
       return objArray;
    }
    public ProgressBar getSmallBottomProgress(){
       return this.u1;
    }
    public GestureView getTouchHandleView(){
       return this.F;
    }
    public final void i(boolean p0,View p1){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, KwaiXfControlPanel.class, "89")) {
          return;
       }
       Iterator iterator = this.S.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       if (p0 && (this.z1 != null || this.y != null)) {
          this.w(false, true);
       }
       return;
    }
    public void j(long p0,long p1){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, KwaiXfControlPanel.class, "112")) {
          return;
       }
       p0 = Math.min(p0, (p1 - 50));
       KwaiXfControlPanel tw = this.w;
       if (tw != null && tw.a(p0)) {
          return;
       }
       tw = this.c;
       if (tw != null) {
          tw.seekTo(p0);
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "77")) {
          return;
       }
       int i = 0;
       if (this.x1 != null) {
          this.o = 0x7f08257c;
          this.f.d(i);
       }else {
          this.o = i;
          this.f.d(R.drawable.arg_RES_7f080745);
       }
       KwaiXfControlPanel tp = this.p;
       if (tp != null) {
          tp.setBackgroundResource(this.o);
       }
       return;
    }
    public void l(int p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiXfControlPanel.class, "111")) {
          return;
       }
       if (p0 == 1) {
          this.s();
       }
       return;
    }
    public final void m(TextView p0,boolean p1){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, KwaiXfControlPanel.class, "116")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.gravity = 51;
       if (p1) {
          p0.setMaxLines(1);
          layoutParams.topMargin = a1.d(0x7f070295);
          layoutParams.rightMargin = a1.d(0x7f07028d);
          layoutParams.leftMargin = a1.d(0x7f070317);
       }else {
          p0.setMaxLines(2);
          layoutParams.topMargin = a1.d(0x7f070267);
          layoutParams.leftMargin = a1.d(0x7f070295);
          layoutParams.rightMargin = a1.d(0x7f070295);
       }
       p0.setLayoutParams(layoutParams);
       return;
    }
    public final void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfControlPanel.class, "122")) {
          return;
       }
       Log.g("KwaiXfControlPanel", this.hashCode()+" "+this.c+" "+p0);
       return;
    }
    public void o(int p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiXfControlPanel.class, "110")) {
          return;
       }
       this.g.d(p0);
       this.t();
       if (this.y1 != null) {
          this.f(5, true);
       }
       KwaiXfControlPanel tE = this.E;
       if (tE != null) {
          Iterator iterator = tE.iterator();
          while (iterator.hasNext()) {
             iterator.next().onSeekStart();
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int size;
       KwaiXfControlPanel obj;
       c c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiXfControlPanel.class, "79")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.u.getLayoutParams();
       c uoc = -1;
       if (this.e != null) {
          size = View$MeasureSpec.getSize(p0);
          int i = (int)(this.v * (float)View$MeasureSpec.getSize(p1));
          if (i <= 0 || i >= size) {
             i = -1;
          }
          layoutParams.width = i;
       }else {
          layoutParams.width = uoc;
       }
       String str = "1";
       size = 1;
       boolean b = false;
       if (this.e == null && this.Y0 != null) {
          obj = PatchProxy.apply(null, this, KwaiXfControlPanel.class, "7");
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): this.R.get(b) ^ size;
          if (b1) {
             obj = this.Y0;
             int size1 = View$MeasureSpec.getSize(p0);
             int size2 = View$MeasureSpec.getSize(p1);
             Objects.requireNonNull(obj);
             c uoc1 = c.class;
             if (!PatchProxy.isSupport(uoc1) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(size1), Integer.valueOf(size2), obj, uoc1, str) && (obj.f != size2 || obj.e != size1))) {
                obj.f = size2;
                obj.e = size1;
                c a = obj.a;
                size2 = Arrays.binarySearch(a, size2);
                if (size2 >= 0) {
                   obj.h = obj.d[size2];
                   obj.g = obj.c[size2];
                }else {
                   size2 = - (size2 + size);
                   if (!size2) {
                      obj.h = obj.d[b];
                      obj.g = obj.c[b];
                   }else if(size2 == a.length){
                      obj.h = obj.d[(a.length + uoc)];
                      obj.g = obj.c[(a.length + uoc)];
                   }else {
                      p0 = size2 - 1;
                      c = obj.c;
                      throw null;
                   }
                }
             }
             obj = this.Y0;
             this.U = obj.h;
             this.T = obj.g;
             this.b();
          }
       }
    label_00f1 :
       obj = this.h;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, j0.class, str);
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          j0 b2 = obj.b;
          if (b2 != null) {
             if (b2.getVisibility()) {
                size = 0;
             }
             b = size;
          }
       }
       if (b) {
          this.h.b.getLayoutParams().width = this.u.getLayoutParams().width;
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "83")) {
          return;
       }
       this.n("onLoadingHide");
       this.e(1, false, false, false, false);
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "16")) {
          return;
       }
       if (this.c != null) {
          long panelDisplay = this.getPanelDisplayDurationMs();
          this.f.f(this.c.getCurrentPosition(), panelDisplay);
          KwaiXfControlPanel tu1 = this.u1;
          if (tu1 != null) {
             tu1.setProgress(z.a(this.c.getCurrentPosition(), panelDisplay, this.u1.getMax()));
          }
       }
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "93")) {
          return;
       }
       this.t();
       this.s();
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "96")) {
          return;
       }
       this.n("startSchedule");
       if (!KwaiXfControlPanel.h(this.c)) {
          return;
       }
       if (this.z != null) {
          return;
       }
       this.postDelayed(this.B, this.x);
       return;
    }
    public void setAnimationDelegation(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfControlPanel.class, "1")) {
          return;
       }
       KwaiXfControlPanel tB1 = this.B1;
       if (tB1 != null) {
          tB1.a();
       }
       this.B1 = p0;
       return;
    }
    public void setClickScreenPlayAndPauseModeEnabled(boolean p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "26")) {
          return;
       }
       boolean b = true;
       boolean b1 = false;
       if (p0) {
          this.y = b;
          this.y1 = b1;
          this.b = 150;
          this.M.setSelected(b);
          this.setEnableSeekPlayImprove(b1);
          ViewGroup$LayoutParams layoutParams = this.M.getLayoutParams();
          layoutParams.width = a1.e(72.00f);
          layoutParams.height = a1.e(72.00f);
          this.M.requestLayout();
       }else {
          this.y = b1;
          this.b = 200;
          if (KwaiXfControlPanel.h(this.c)) {
             this.M.setSelected((b ^ this.c.isPlaying()));
          }
       }
       return;
    }
    public void setControlPanelScheduleDisable(boolean p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "95")) {
          return;
       }
       this.n("setControlPanelScheduleDisable:"+p0);
       this.z = p0;
       if (p0) {
          this.t();
       }else {
          this.r();
       }
       return;
    }
    public void setCustomCenterProgressView(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfControlPanel.class, "85")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       KwaiXfControlPanel tg = this.g;
       if (tg != null) {
          Iterator iterator = tg.b().iterator();
          while (iterator.hasNext()) {
             p0.f(iterator.next());
          }
       }
       this.g = p0;
       return;
    }
    public void setCustomPanelHideInternalMs(long p0){
       this.x = p0;
    }
    public void setEnablePlayBtnSeekOpt(boolean p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "23")) {
          return;
       }
       this.y1 = p0;
       this.n("setEnablePlayBtnSeekOpt "+p0);
       return;
    }
    public void setEnableSeekPlayImprove(boolean p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "24")) {
          return;
       }
       this.n("setEnableSeekPlayImprove "+p0);
       this.z1 = p0;
       this.x = (p0)? KwaiXfControlPanel.E1: KwaiXfControlPanel.F1;
       return;
    }
    public void setEnableSmallBottomProgress(boolean p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "57")) {
          return;
       }
       int i = 0;
       if (this.u1 != null) {
          this.g(i, p0);
       }else if(!p0 || (!PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "87") && this.u1 == null)){
          ProgressBar progressBar = a.d(this.getContext(), R.layout.arg_RES_7f0d171d, this.n, i);
          this.n.addView(progressBar);
          progressBar.setMax(0x2710);
          this.u1 = progressBar;
          n on = new n(this, progressBar);
          this.i.c(this.getEventObservable().subscribe(on, b.b));
          this.g(1, (this.e ^ 1));
       }
       return;
    }
    public void setEnableWholePanelShader(boolean p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "72")) {
          return;
       }
       this.n("setEnableWholePanelShader "+p0);
       this.x1 = p0;
       this.k();
       return;
    }
    public void setMainPanelLandscapeMaxWidthRatio(float p0){
       this.v = p0;
    }
    public void setOverrideDisplayDurationMs(long p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, KwaiXfControlPanel.class, "8")) {
          return;
       }
       this.n("setOverrideDisplayDurationMs "+p0);
       this.l = p0;
       return;
    }
    public void setPlayBtnSizeProvider(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfControlPanel.class, "14")) {
          return;
       }
       this.n("setPlayBtnSizeProvider");
       if (this.Y0 != p0) {
          this.Y0 = p0;
          this.requestLayout();
       }
       return;
    }
    public void setPlayer(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfControlPanel.class, "13")) {
          return;
       }
       this.y(this.c);
       this.c = p0;
       KwaiXfControlPanel tj = this.j;
       if (tj != null) {
          tj.d(p0);
       }
       KwaiXfControlPanel tc = this.c;
       if (!PatchProxy.applyVoidOneRefs(tc, this, KwaiXfControlPanel.class, "97") && tc != null) {
          if (this.y != null && tc.b() == 4) {
             boolean b = (this.u.getVisibility())? true: false;
             this.w(true, b);
          }
          this.x(tc.b());
          if (this.D == null) {
             this.D = new k(this);
          }
          tj = this.c1;
          if (tj != null) {
             tc.u(tj);
          }
          tc.w(this.D);
          l ol = new l(this);
          this.C = ol;
          tc.addOnBufferingUpdateListener(ol);
          if (this.k == null) {
             long currentPosit = tc.getCurrentPosition();
             long duration = tc.getDuration();
             String str = null;
             if (duration - str > 0 && currentPosit - str >= 0) {
                this.k = new f$a(currentPosit, duration);
             }else {
                Log.g("KwaiXfControlPanel", "simply skip bad case:"+duration+","+currentPosit);
             }
          }
          this.q();
       }
       return;
    }
    public void setPlayerSeekInterceptor(KwaiXfControlPanel$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfControlPanel.class, "9")) {
          return;
       }
       this.n("setPlayerSeekInterceptor "+p0);
       this.w = p0;
       return;
    }
    public void setQualitySwitchClickListener(View$OnClickListener p0){
       this.g1 = p0;
    }
    public void setSpeedSwitchClickListener(View$OnClickListener p0){
       this.q1 = p0;
    }
    public void setTitleText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfControlPanel.class, "36")) {
          return;
       }
       if (TextUtils.x(p0)) {
          KwaiXfControlPanel ts1 = this.s1;
          if (ts1 != null) {
             ts1.setText("");
          }
          return;
       }else if(this.s1 == null){
          TextView textView = a.d(this.getContext(), R.layout.arg_RES_7f0d171e, this.u, false);
          this.s1 = textView;
          this.m(textView, this.e);
          this.u.addView(this.s1);
       }
       this.s1.setText(p0);
       return;
    }
    public final void t(){
       if (PatchProxy.applyVoid(null, this, KwaiXfControlPanel.class, "94")) {
          return;
       }
       this.n("stopSchedule");
       this.removeCallbacks(this.B);
       return;
    }
    public final void u(boolean p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "99")) {
          return;
       }
       KwaiXfControlPanel tK = this.K;
       if (tK != null) {
          tK.a();
       }
       if (this.M.isShown()) {
          if (!PatchProxy.isSupport(KwaiXfControlPanel.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "101")) {
             if (this.K == null) {
                b uob = new b(this.M, this.N);
                this.K = uob;
                uob.d = new o(this);
             }
             tK = this.K;
             Objects.requireNonNull(tK);
             b uob1 = b.class;
             if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tK, uob1, "3")) {
                uob1 = tK.c;
                if (uob1 != null && uob1.isRunning()) {
                   tK.c.end();
                }
                tK.e = p0;
                b c = tK.c;
                if (c != null) {
                   c.start();
                }
             }
          }
       }else {
          this.M.setSelected(p0);
       }
       return;
    }
    public void v(boolean p0){
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiXfControlPanel.class, "90")) {
          return;
       }
       this.w(p0, true);
       return;
    }
    public final void w(boolean p0,boolean p1){
       KwaiXfControlPanel tB11;
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, KwaiXfControlPanel.class, "91")) {
          return;
       }
       this.n("switchPanel "+p0);
       KwaiXfControlPanel th1 = this.h1;
       if (th1 != null) {
          k1.m(th1);
       }
       th1 = null;
       if (p1) {
          th1 = this.b;
       }
       KwaiXfControlPanel tB1 = this.B1;
       if (tB1 != null) {
          tB1.a();
       }
       int visibility = this.u.getVisibility();
       boolean b = true;
       if (p0) {
          this.s();
          this.c(0, 0);
          if (p1) {
             tB11 = this.B1;
             if (tB11 != null) {
                tB11.b(this.u, th1);
             }else {
                n.W(this.u, 0, th1);
             }
          }else {
             View[] viewArray = new View[b];
             viewArray[0] = this.u;
             n.Z(0, viewArray);
          }
          this.d(0, b, p1);
          if (this.A1 != null) {
             this.f(4, 0);
          }
       }else {
          this.t();
          this.c(0, b);
          tB11 = 8;
          if (p1) {
             KwaiXfControlPanel tB12 = this.B1;
             if (tB12 != null) {
                tB12.c(this.u, th1);
             }else {
                n.W(this.u, tB11, th1);
             }
          }else {
             View[] viewArray1 = new View[b];
             viewArray1[0] = this.u;
             n.Z(tB11, viewArray1);
          }
          this.d(0, 0, p1);
       }
       if (!PatchProxy.isSupport(KwaiXfControlPanel.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(visibility), this, KwaiXfControlPanel.class, "92") && visibility != this.u.getVisibility())) {
          Iterator iterator = this.t.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this.u);
          }
          if (this.y1 != null && this.u.isShown()) {
             this.f(5, 0);
          }
       }
       return;
    }
    public final void x(int p0){
       KwaiXfControlPanel tf;
       if (PatchProxy.isSupport(KwaiXfControlPanel.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiXfControlPanel.class, "98")) {
          return;
       }
       boolean b = true;
       if (this.y != null) {
          if (!PatchProxy.isSupport(KwaiXfControlPanel.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiXfControlPanel.class, "100")) {
             if (p0 == 3) {
                this.e(3, true, true, this.y, false);
                tf = this.Q;
                if (tf != null) {
                   n.W(tf, 4, (this.b + 20));
                }
             }else if(p0 == 4){
                this.e(3, false, true, this.y, false);
                tf = this.Q;
                if (tf != null) {
                   n.W(tf, 0, (this.b + 20));
                }
             }
          }
          tf = this.f;
          if (p0 != 3) {
             b = false;
          }
          tf.b(b);
       }else if(p0 == 3){
          this.u(0);
          this.f.b(b);
       }else {
          this.u(b);
          this.f.b(0);
       }
       return;
    }
    public final void y(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiXfControlPanel.class, "102")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       KwaiXfControlPanel tc1 = this.c1;
       if (tc1 != null) {
          p0.r(tc1);
       }
       p0.O(this.D);
       p0.removeOnBufferingUpdateListener(this.C);
       KwaiXfControlPanel tK = this.K;
       if (tK != null) {
          tK.a();
       }
       tK = this.j;
       if (tK != null) {
          tK.b();
       }
       this.k = null;
       this.setOverrideDisplayDurationMs(0);
       return;
    }
    public final void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiXfControlPanel.class, "119")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, KwaiXfControlPanel.class, "15");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): this.isEnabled();
       if (!b) {
          this.setVisibility(8);
       }else if(this.d != null){
          this.setVisibility(0);
       }else {
          this.setVisibility(8);
       }
       return;
    }
}
