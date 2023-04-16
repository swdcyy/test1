package androidx.appcompat.app.e;
import androidx.appcompat.widget.ActionBarOverlayLayout$d;
import androidx.appcompat.app.ActionBar;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.app.Activity;
import java.util.ArrayList;
import androidx.appcompat.app.e$a;
import androidx.appcompat.app.e$b;
import androidx.appcompat.app.e$c;
import android.view.Window;
import android.view.View;
import android.app.Dialog;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import w0.k;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarContainer;
import android.content.Context;
import u0.a;
import ll8.c$b;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import androidx.appcompat.app.ActionBar$c;
import androidx.appcompat.app.e$e;
import a2.i0;
import android.content.res.Configuration;
import androidx.appcompat.widget.ScrollingTabContainerView;
import android.widget.HorizontalScrollView;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.app.e$d;
import android.view.KeyCharacterMap;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.app.ActionBar$a;
import java.lang.Object;
import java.lang.Math;
import androidx.fragment.app.FragmentActivity;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.appcompat.app.ActionBar$d;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import ag6.a;
import androidx.appcompat.app.ActionBar$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import u0.h;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.ActionBar$b;
import androidx.appcompat.app.c;
import android.widget.AdapterView$OnItemSelectedListener;
import java.lang.CharSequence;
import android.widget.FrameLayout;
import u0.b$a;
import u0.b;
import a2.m0;
import androidx.appcompat.widget.AbsActionBarView;
import a2.p0;
import android.view.animation.Interpolator;
import a2.n0;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.view.ContextThemeWrapper;
import androidx.appcompat.widget.Toolbar;

public class e extends ActionBar implements ActionBarOverlayLayout$d	// class@000594
{
    public boolean A;
    public boolean B;
    public h C;
    public boolean D;
    public boolean E;
    public final n0 F;
    public final n0 G;
    public final p0 H;
    public Context d;
    public Context e;
    public Activity f;
    public ActionBarOverlayLayout g;
    public ActionBarContainer h;
    public k i;
    public ActionBarContextView j;
    public View k;
    public ScrollingTabContainerView l;
    public ArrayList m;
    public e$e n;
    public int o;
    public boolean p;
    public e$d q;
    public b r;
    public b$a s;
    public boolean t;
    public ArrayList u;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final Interpolator I;
    public static final Interpolator J;

    static {
       e.I = new AccelerateInterpolator();
       e.J = new DecelerateInterpolator();
    }
    public void e(Activity p0,boolean p1){
       super();
       this.m = new ArrayList();
       this.o = -1;
       this.u = new ArrayList();
       this.w = 0;
       this.x = true;
       this.B = true;
       this.F = new e$a(this);
       this.G = new e$b(this);
       this.H = new e$c(this);
       this.f = p0;
       View decorView = p0.getWindow().getDecorView();
       this.B0(decorView);
       if (!p1) {
          this.k = decorView.findViewById(0x1020002);
       }
       return;
    }
    public void e(Dialog p0){
       super();
       this.m = new ArrayList();
       this.o = -1;
       this.u = new ArrayList();
       this.w = 0;
       this.x = true;
       this.B = true;
       this.F = new e$a(this);
       this.G = new e$b(this);
       this.H = new e$c(this);
       this.B0(p0.getWindow().getDecorView());
    }
    public void e(View p0){
       super();
       this.m = new ArrayList();
       this.o = -1;
       this.u = new ArrayList();
       this.w = 0;
       this.x = true;
       this.B = true;
       this.F = new e$a(this);
       this.G = new e$b(this);
       this.H = new e$c(this);
       this.B0(p0);
    }
    public static boolean r0(boolean p0,boolean p1,boolean p2){
       if (p2) {
          return true;
       }
       if (p0 || p1) {
          return false;
       }
       return true;
    }
    public final void A0(){
       if (this.A != null) {
          this.A = false;
          e tg = this.g;
          if (tg != null) {
             tg.setShowingForActionMode(false);
          }
          this.I0(false);
       }
       return;
    }
    public boolean B(){
       boolean i = this.p();
       i = (this.B != null && (!i || this.z0() < i))? true: false;
       return i;
    }
    public final void B0(View p0){
       ActionBarOverlayLayout uActionBarOv = p0.findViewById(R.id.decor_content_parent);
       this.g = uActionBarOv;
       if (uActionBarOv != null) {
          uActionBarOv.setActionBarVisibilityCallback(this);
       }
       this.i = this.y0(p0.findViewById(0x7f0a007f));
       this.j = p0.findViewById(0x7f0a009a);
       ActionBarContainer uActionBarCo = p0.findViewById(R.id.action_bar_container);
       this.h = uActionBarCo;
       e ti = this.i;
       if (ti != null && (this.j != null && uActionBarCo != null)) {
          this.d = ti.getContext();
          int b = true;
          uActionBarCo = (this.i.w() & 0x04)? 1: 0;
          if (uActionBarCo) {
             this.p = b;
          }
          a uoa = a.b(this.d);
          boolean b1 = (uoa.a() || uActionBarCo)? true: false;
          this.F0(b1);
          this.D0(uoa.g());
          TypedArray typedArray = this.d.obtainStyledAttributes(null, c$b.c, R.attr.arg_RES_7f0400d8, 0);
          if (typedArray.getBoolean(14, 0)) {
             this.E0(b);
          }
          b = typedArray.getDimensionPixelSize(12, 0);
          if (b) {
             this.C0((float)b);
          }
          typedArray.recycle();
          return;
       }else {
          throw new IllegalStateException(e.class.getSimpleName()+" can only be used with a compatible window decor layout");
       }
    }
    public ActionBar$c C(){
       return new e$e(this);
    }
    public void C0(float p0){
       i0.A0(this.h, p0);
    }
    public void D(Configuration p0){
       this.D0(a.b(this.d).g());
    }
    public final void D0(boolean p0){
       this.v = p0;
       ScrollingTabContainerView scrollingTab = null;
       if (!p0) {
          this.i.Q(scrollingTab);
          this.h.setTabContainer(this.l);
       }else {
          this.h.setTabContainer(scrollingTab);
          this.i.Q(this.l);
       }
       boolean b = true;
       int i = (this.r() == 2)? 1: 0;
       e tl = this.l;
       if (tl != null) {
          if (i) {
             tl.setVisibility(0);
             tl = this.g;
             if (tl != null) {
                i0.p0(tl);
             }
          }else {
             tl.setVisibility(8);
          }
       }
       tl = this.i;
       boolean b1 = (this.v == null && i)? true: false;
       tl.s(b1);
       tl = this.g;
       if (this.v != null || !i) {
          b = false;
       }
       tl.setHasNonEmbeddedTabs(b);
       return;
    }
    public void E0(boolean p0){
       if (p0 && !this.g.u()) {
          throw new IllegalStateException("Action bar must be in overlay mode \(Window.FEATURE_OVERLAY_ACTION_BAR\) to enable hide on content scroll");
       }
       this.E = p0;
       this.g.setHideOnContentScrollEnabled(p0);
       return;
    }
    public boolean F(int p0,KeyEvent p1){
       e tq = this.q;
       if (tq == null) {
          return false;
       }
       Menu menu = tq.e();
       if (menu == null) {
          return false;
       }
       int deviceId = (p1 != null)? p1.getDeviceId(): -1;
       boolean b = true;
       if (KeyCharacterMap.load(deviceId).getKeyboardType() == b) {
          b = false;
       }
       menu.setQwertyMode(b);
       return menu.performShortcut(p0, p1, false);
    }
    public void F0(boolean p0){
       this.i.B(p0);
    }
    public final boolean G0(){
       return i0.Y(this.h);
    }
    public final void H0(){
       if (this.A == null) {
          boolean b = true;
          this.A = b;
          e tg = this.g;
          if (tg != null) {
             tg.setShowingForActionMode(b);
          }
          this.I0(false);
       }
       return;
    }
    public void I(){
       this.s0();
    }
    public final void I0(boolean p0){
       if (e.r0(this.y, this.z, this.A)) {
          if (this.B == null) {
             this.B = true;
             this.w0(p0);
          }
       }else if(this.B != null){
          this.B = false;
          this.v0(p0);
       }
       return;
    }
    public void J(ActionBar$a p0){
       this.u.remove(p0);
    }
    public void K(ActionBar$c p0){
       this.L(p0.d());
    }
    public void L(int p0){
       ActionBar$c uoc;
       if (this.l == null) {
          return;
       }
       e tn = this.n;
       int i = (tn != null)? tn.d(): this.o;
       this.l.k(p0);
       e$e uoe = this.m.remove(p0);
       if (uoe != null) {
          uoe.s(-1);
       }
       int i1 = this.m.size();
       for (int i2 = p0; i2 < i1; i2 = i2 + 1) {
          this.m.get(i2).s(i2);
       }
       if (i == p0) {
          if (this.m.isEmpty()) {
             uoc = null;
          }else {
             p0--;
             uoc = this.m.get(Math.max(0, p0));
          }
          this.M(uoc);
       }
       return;
    }
    public void M(ActionBar$c p0){
       e uoe;
       int i = -1;
       if (this.r() != 2) {
          if (p0 != null) {
             i = p0.d();
          }
          this.o = i;
          return;
       }else if(this.f instanceof FragmentActivity && !this.i.A().isInEditMode()){
          uoe = this.f.getSupportFragmentManager().beginTransaction();
          uoe.q();
       }else {
          uoe = null;
       }
       e tn = this.n;
       if (tn == p0) {
          if (tn != null) {
             tn.r().a(this.n, uoe);
             this.l.c(p0.d());
          }
       }else {
          tn = this.l;
          if (p0 != null) {
             i = p0.d();
          }
          tn.setTabSelected(i);
          e tn1 = this.n;
          if (tn1 != null) {
             tn1.r().b(this.n, uoe);
          }
          this.n = p0;
          if (p0 != null) {
             p0.r().c(this.n, uoe);
          }
       }
       if (uoe != null && !uoe.t()) {
          uoe.l();
       }
       return;
    }
    public void N(Drawable p0){
       this.h.setPrimaryBackground(p0);
    }
    public void O(int p0){
       this.P(a.c(LayoutInflater.from(this.x()), p0, this.i.A(), false));
    }
    public void P(View p0){
       this.i.M(p0);
    }
    public void Q(View p0,ActionBar$LayoutParams p1){
       p0.setLayoutParams(p1);
       this.i.M(p0);
    }
    public void R(boolean p0){
       if (this.p == null) {
          this.S(p0);
       }
       return;
    }
    public void S(boolean p0){
       int i = (p0)? 4: 0;
       this.U(i, 4);
       return;
    }
    public void T(int p0){
       if (p0 & 0x04) {
          this.p = true;
       }
       this.i.l(p0);
       return;
    }
    public void U(int p0,int p1){
       int i = this.i.w();
       if (p1 & 0x04) {
          this.p = true;
       }
       this.i.l(((p0 & p1) | ((~ p1) & i)));
       return;
    }
    public void V(boolean p0){
       int i = (p0)? 16: 0;
       this.U(i, 16);
       return;
    }
    public void W(boolean p0){
       int i = (p0)? 2: 0;
       this.U(i, 2);
       return;
    }
    public void X(boolean p0){
       int i = (p0)? 8: 0;
       this.U(i, 8);
       return;
    }
    public void Y(boolean p0){
       this.U(p0, 1);
    }
    public void Z(int p0){
       this.i.p(p0);
    }
    public void a(){
       e tC = this.C;
       if (tC != null) {
          tC.a();
          this.C = null;
       }
       return;
    }
    public void a0(Drawable p0){
       this.i.x(p0);
    }
    public void b(boolean p0){
       this.x = p0;
    }
    public void b0(int p0){
       this.i.setIcon(p0);
    }
    public void c(){
       if (this.z != null) {
          this.z = false;
          this.I0(true);
       }
       return;
    }
    public void c0(Drawable p0){
       this.i.setIcon(p0);
    }
    public void d(){
    }
    public void d0(SpinnerAdapter p0,ActionBar$b p1){
       this.i.G(p0, new c(p1));
    }
    public void e(){
       if (this.z == null) {
          this.z = true;
          this.I0(true);
       }
       return;
    }
    public void e0(int p0){
       this.i.setLogo(p0);
    }
    public void f(ActionBar$a p0){
       this.u.add(p0);
    }
    public void f0(Drawable p0){
       this.i.K(p0);
    }
    public void g(ActionBar$c p0){
       this.j(p0, this.m.isEmpty());
    }
    public void g0(int p0){
       e ti;
       boolean i = this.i.n();
       if (i != 2) {
       }else {
          this.o = this.s();
          this.M(null);
          this.l.setVisibility(8);
       }
       if (i != p0 && this.v == null) {
          e tg = this.g;
          if (tg != null) {
             i0.p0(tg);
          }
       }
       this.i.o(p0);
       i = false;
       if (p0 == 2) {
          this.x0();
          this.l.setVisibility(i);
          ti = this.o;
          int i1 = -1;
          if (ti != i1) {
             this.h0(ti);
             this.o = i1;
          }
       }
       ti = this.i;
       boolean b = (p0 == 2 && this.v == null)? true: false;
       ti.s(b);
       ti = this.g;
       if (p0 == 2 && this.v == null) {
          i = true;
       }
       ti.setHasNonEmbeddedTabs(i);
       return;
    }
    public void h(ActionBar$c p0,int p1){
       this.i(p0, p1, this.m.isEmpty());
    }
    public void h0(int p0){
       int i = this.i.n();
       if (i != 1) {
          if (i == 2) {
             this.M(this.m.get(p0));
          }else {
             throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
          }
       }else {
          this.i.O(p0);
       }
       return;
    }
    public void i(ActionBar$c p0,int p1,boolean p2){
       this.x0();
       this.l.a(p0, p1, p2);
       this.u0(p0, p1);
       if (p2) {
          this.M(p0);
       }
       return;
    }
    public void i0(boolean p0){
       this.D = p0;
       if (!p0) {
          e tC = this.C;
          if (tC != null) {
             tC.a();
          }
       }
       return;
    }
    public void j(ActionBar$c p0,boolean p1){
       this.x0();
       this.l.b(p0, p1);
       this.u0(p0, this.m.size());
       if (p1) {
          this.M(p0);
       }
       return;
    }
    public void j0(int p0){
       this.k0(this.d.getString(p0));
    }
    public void k0(CharSequence p0){
       this.i.y(p0);
    }
    public boolean l(){
       e ti = this.i;
       if (ti == null || !ti.H()) {
          return false;
       }
       this.i.collapseActionView();
       return true;
    }
    public void l0(int p0){
       this.m0(this.d.getString(p0));
    }
    public void m(boolean p0){
       if (p0 == this.t) {
          return;
       }
       this.t = p0;
       int i = this.u.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.u.get(i1).a(p0);
       }
       return;
    }
    public void m0(CharSequence p0){
       this.i.setTitle(p0);
    }
    public View n(){
       return this.i.J();
    }
    public void n0(CharSequence p0){
       this.i.setWindowTitle(p0);
    }
    public int o(){
       return this.i.w();
    }
    public void o0(){
       if (this.y != null) {
          this.y = false;
          this.I0(false);
       }
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       this.w = p0;
    }
    public int p(){
       return this.h.getHeight();
    }
    public b p0(b$a p0){
       e tq = this.q;
       if (tq != null) {
          tq.c();
       }
       this.g.setHideOnContentScrollEnabled(false);
       this.j.k();
       e$d uod = new e$d(this, this.j.getContext(), p0);
       if (uod.t()) {
          this.q = uod;
          uod.k();
          this.j.h(uod);
          this.q0(true);
          this.j.sendAccessibilityEvent(32);
          return uod;
       }else {
          return null;
       }
    }
    public int q(){
       int i = this.i.n();
       if (i == 1) {
          return this.i.r();
       }
       if (i != 2) {
          return 0;
       }
       return this.m.size();
    }
    public void q0(boolean p0){
       m0 om0;
       m0 om01;
       if (p0) {
          this.H0();
       }else {
          this.A0();
       }
       int i = 4;
       if (this.G0()) {
          if (p0) {
             om0 = this.i.z(i, 100);
             om01 = this.j.f(0, 200);
          }else {
             om01 = this.i.z(0, 200);
             om0 = this.j.f(8, 100);
          }
          h oh = new h();
          oh.d(om0, om01);
          oh.h();
       }else if(p0){
          this.i.setVisibility(i);
          this.j.setVisibility(0);
       }else {
          this.i.setVisibility(0);
          this.j.setVisibility(8);
       }
       return;
    }
    public int r(){
       return this.i.n();
    }
    public int s(){
       int i = this.i.n();
       if (i == 1) {
          return this.i.I();
       }
       int i1 = -1;
       if (i != 2) {
          return i1;
       }
       e tn = this.n;
       if (tn != null) {
          i1 = tn.d();
       }
       return i1;
    }
    public final void s0(){
       if (this.n != null) {
          this.M(null);
       }
       this.m.clear();
       e tl = this.l;
       if (tl != null) {
          tl.j();
       }
       this.o = -1;
       return;
    }
    public ActionBar$c t(){
       return this.n;
    }
    public void t0(){
       e ts = this.s;
       if (ts != null) {
          ts.a(this.r);
          this.r = null;
          this.s = null;
       }
       return;
    }
    public CharSequence u(){
       return this.i.getSubtitle();
    }
    public final void u0(ActionBar$c p0,int p1){
       if (p0.r() == null) {
          throw new IllegalStateException("Action Bar Tab must have a Callback");
       }
       p0.s(p1);
       this.m.add(p1, p0);
       int i = this.m.size();
       p1++;
       while (p1 < i) {
          this.m.get(p1).s(p1);
       }
       return;
    }
    public ActionBar$c v(int p0){
       return this.m.get(p0);
    }
    public void v0(boolean p0){
       e tC = this.C;
       if (tC != null) {
          tC.a();
       }
       if (this.w == null && (this.D != null || p0)) {
          this.h.setAlpha(0x3f800000);
          boolean b = true;
          this.h.setTransitioning(b);
          h oh = new h();
          float f = (float)(- this.h.getHeight());
          if (p0) {
             int[] ointArray = new int[2]{0,0};
             this.h.getLocationInWindow(ointArray);
             f = f - (float)ointArray[b];
          }
          m0 om0 = i0.c(this.h);
          om0.k(f);
          om0.i(this.H);
          oh.c(om0);
          if (this.x != null) {
             e tk = this.k;
             if (tk != null) {
                om0 = i0.c(tk);
                om0.k(f);
                oh.c(om0);
             }
          }
          oh.f(e.I);
          oh.e(250);
          oh.g(this.F);
          this.C = oh;
          oh.h();
       }else {
          this.F.a(null);
       }
       return;
    }
    public int w(){
       return this.m.size();
    }
    public void w0(boolean p0){
       e tg;
       e tC = this.C;
       if (tC != null) {
          tC.a();
       }
       this.h.setVisibility(0);
       if (this.w == null && (this.D != null || p0)) {
          this.h.setTranslationY(0);
          float f = (float)(- this.h.getHeight());
          if (p0) {
             int[] ointArray = new int[2]{0,0};
             this.h.getLocationInWindow(ointArray);
             f = f - (float)ointArray[1];
          }
          this.h.setTranslationY(f);
          h oh = new h();
          m0 om0 = i0.c(this.h);
          om0.k(0);
          om0.i(this.H);
          oh.c(om0);
          if (this.x != null) {
             e tk = this.k;
             if (tk != null) {
                tk.setTranslationY(f);
                m0 om01 = i0.c(this.k);
                om01.k(0);
                oh.c(om01);
             }
          }
          oh.f(e.J);
          oh.e(250);
          oh.g(this.G);
          this.C = oh;
          oh.h();
       }else {
          this.h.setAlpha(0x3f800000);
          this.h.setTranslationY(0);
          if (this.x != null) {
             tg = this.k;
             if (tg != null) {
                tg.setTranslationY(0);
             }
          }
          this.G.a(null);
       }
       tg = this.g;
       if (tg != null) {
          i0.p0(tg);
       }
       return;
    }
    public Context x(){
       if (this.e == null) {
          TypedValue typedValue = new TypedValue();
          this.d.getTheme().resolveAttribute(R.attr.arg_RES_7f0400dd, typedValue, true);
          typedValue = typedValue.resourceId;
          this.e = (typedValue != null)? new ContextThemeWrapper(this.d, typedValue): this.d;
       }
    label_0028 :
       return this.e;
    }
    public final void x0(){
       if (this.l != null) {
          return;
       }
       ScrollingTabContainerView scrollingTab = new ScrollingTabContainerView(this.d);
       if (this.v != null) {
          scrollingTab.setVisibility(0);
          this.i.Q(scrollingTab);
       }else if(this.r() == 2){
          scrollingTab.setVisibility(0);
          e tg = this.g;
          if (tg != null) {
             i0.p0(tg);
          }
       }else {
          scrollingTab.setVisibility(8);
       }
       this.h.setTabContainer(scrollingTab);
       this.l = scrollingTab;
       return;
    }
    public CharSequence y(){
       return this.i.getTitle();
    }
    public final k y0(View p0){
       if (p0 instanceof k) {
          return p0;
       }
       if (p0 instanceof Toolbar) {
          return p0.getWrapper();
       }
       StringBuilder str = "Can\'t make a decor toolbar out of ";
       String simpleName = (p0 != null)? p0.getClass().getSimpleName(): "null";
       throw new IllegalStateException(str+simpleName);
    }
    public void z(){
       if (this.y == null) {
          this.y = true;
          this.I0(false);
       }
       return;
    }
    public int z0(){
       return this.g.getActionBarHideOffset();
    }
}
