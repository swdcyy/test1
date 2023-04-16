package androidx.appcompat.widget.i;
import w0.k;
import androidx.appcompat.widget.Toolbar;
import java.lang.Object;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.view.ViewGroup;
import ll8.c$b;
import android.util.AttributeSet;
import w0.x;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import androidx.appcompat.widget.i$a;
import android.view.View$OnClickListener;
import r0.a;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.e$a;
import android.widget.SpinnerAdapter;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.Spinner;
import android.util.SparseArray;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.Menu;
import androidx.appcompat.widget.ScrollingTabContainerView;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.appcompat.app.ActionBar$LayoutParams;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.e;
import a2.i0;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.view.Window$Callback;
import a2.m0;
import androidx.appcompat.widget.i$b;
import a2.n0;

public class i implements k	// class@00064f
{
    public Toolbar a;
    public int b;
    public View c;
    public Spinner d;
    public View e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public boolean i;
    public CharSequence j;
    public CharSequence k;
    public CharSequence l;
    public Window$Callback m;
    public boolean n;
    public ActionMenuPresenter o;
    public int p;
    public int q;
    public Drawable r;

    public void i(Toolbar p0,boolean p1){
       super(p0, p1, 0x7f10000f, 0x7f08001c);
    }
    public void i(Toolbar p0,boolean p1,int p2,int p3){
       i ta;
       super();
       p3 = 0;
       this.p = p3;
       this.q = p3;
       this.a = p0;
       this.j = p0.getTitle();
       this.k = p0.getSubtitle();
       int b = (this.j != null)? true: false;
       this.i = b;
       this.h = p0.getNavigationIcon();
       x ox = x.v(p0.getContext(), null, c$b.c, R.attr.arg_RES_7f0400d8, p3);
       this.r = ox.g(15);
       if (p1) {
          CharSequence uCharSequenc = ox.p(27);
          if (!TextUtils.isEmpty(uCharSequenc)) {
             this.setTitle(uCharSequenc);
          }
          uCharSequenc = ox.p(25);
          if (!TextUtils.isEmpty(uCharSequenc)) {
             this.y(uCharSequenc);
          }
          Drawable uDrawable = ox.g(20);
          if (uDrawable != null) {
             this.K(uDrawable);
          }
          uDrawable = ox.g(17);
          if (uDrawable != null) {
             this.setIcon(uDrawable);
          }
          if (this.h == null) {
             i tr = this.r;
             if (tr != null) {
                this.x(tr);
             }
          }
          this.l(ox.k(10, p3));
          int i = ox.n(9, p3);
          if (i) {
             this.M(a.c(LayoutInflater.from(this.a.getContext()), i, this.a, p3));
             this.l((this.b | 0x10));
          }
          i = ox.m(13, p3);
          if (i > 0) {
             ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
             layoutParams.height = i;
             this.a.setLayoutParams(layoutParams);
          }
          i = ox.e(7, -1);
          b = ox.e(3, -1);
          if (i >= 0 || b >= 0) {
             this.a.J(Math.max(i, p3), Math.max(b, p3));
          }
          i = ox.n(28, p3);
          if (i) {
             ta = this.a;
             ta.N(ta.getContext(), i);
          }
          i = ox.n(26, p3);
          if (i) {
             ta = this.a;
             ta.M(ta.getContext(), i);
          }
          i = ox.n(22, p3);
          if (i) {
             this.a.setPopupTheme(i);
          }
       }else {
          this.b = this.S();
       }
       ox.w();
       this.C(p2);
       this.l = this.a.getNavigationContentDescription();
       this.a.setNavigationOnClickListener(new i$a(this));
       return;
    }
    public ViewGroup A(){
       return this.a;
    }
    public void B(boolean p0){
    }
    public void C(int p0){
       if (p0 == this.q) {
          return;
       }
       this.q = p0;
       if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
          this.p(this.q);
       }
       return;
    }
    public boolean D(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public void E(int p0){
       Drawable uDrawable = (p0)? a.d(this.getContext(), p0): null;
       this.x(uDrawable);
       return;
    }
    public void F(j$a p0,e$a p1){
       this.a.L(p0, p1);
    }
    public void G(SpinnerAdapter p0,AdapterView$OnItemSelectedListener p1){
       this.T();
       this.d.setAdapter(p0);
       this.d.setOnItemSelectedListener(p1);
    }
    public boolean H(){
       return this.a.w();
    }
    public int I(){
       i td = this.d;
       int selectedItem = (td != null)? td.getSelectedItemPosition(): 0;
       return selectedItem;
    }
    public View J(){
       return this.e;
    }
    public void K(Drawable p0){
       this.g = p0;
       this.X();
    }
    public void L(SparseArray p0){
       this.a.saveHierarchyState(p0);
    }
    public void M(View p0){
       i te = this.e;
       if (te != null && (this.b & 0x10)) {
          this.a.removeView(te);
       }
       this.e = p0;
       if (p0 != null && (this.b & 0x10)) {
          this.a.addView(p0);
       }
       return;
    }
    public void N(){
    }
    public void O(int p0){
       i td = this.d;
       if (td == null) {
          throw new IllegalStateException("Can\'t set dropdown selected position without an adapter");
       }
       td.setSelection(p0);
       return;
    }
    public Menu P(){
       return this.a.getMenu();
    }
    public void Q(ScrollingTabContainerView p0){
       i tc = this.c;
       if (tc != null) {
          i ta = this.a;
          if (tc.getParent() == ta) {
             ta.removeView(this.c);
          }
       }
       this.c = p0;
       if (p0 != null && this.p == 2) {
          this.a.addView(p0, 0);
          Toolbar$LayoutParams layoutParams = this.c.getLayoutParams();
          layoutParams.width = -2;
          layoutParams.height = -2;
          layoutParams.a = 0x800053;
          p0.setAllowCollapse(true);
       }
       return;
    }
    public void R(SparseArray p0){
       this.a.restoreHierarchyState(p0);
    }
    public final int S(){
       if (this.a.getNavigationIcon() != null) {
          this.r = this.a.getNavigationIcon();
       }else {
          int i = 11;
       }
       return 15;
    }
    public final void T(){
       if (this.d == null) {
          this.d = new AppCompatSpinner(this.getContext(), null, 0x7f0400df);
          this.d.setLayoutParams(new Toolbar$LayoutParams(-2, -2, 0x800013));
       }
       return;
    }
    public final void U(CharSequence p0){
       this.j = p0;
       if (this.b & 0x08) {
          this.a.setTitle(p0);
       }
       return;
    }
    public final void V(){
       if (this.b & 0x04) {
          if (TextUtils.isEmpty(this.l)) {
             this.a.setNavigationContentDescription(this.q);
          }else {
             this.a.setNavigationContentDescription(this.l);
          }
       }
       return;
    }
    public final void W(){
       if (this.b & 0x04) {
          i ta = this.a;
          i th = this.h;
          if (th == null) {
             th = this.r;
          }
          ta.setNavigationIcon(th);
       }else {
          this.a.setNavigationIcon(null);
       }
       return;
    }
    public final void X(){
       i tb = this.b;
       if (tb & 0x02) {
          if (tb & 0x01) {
             tb = this.g;
             if (tb == null) {
                tb = this.f;
             }
          }else {
             tb = this.f;
          }
       }else {
          Drawable uDrawable = null;
       }
       this.a.setLogo(tb);
       return;
    }
    public boolean a(){
       return this.a.x();
    }
    public void b(Menu p0,j$a p1){
       if (this.o == null) {
          ActionMenuPresenter uActionMenuP = new ActionMenuPresenter(this.a.getContext());
          this.o = uActionMenuP;
          uActionMenuP.s(R.id.action_menu_presenter);
       }
       this.o.l(p1);
       this.a.K(p0, this.o);
       return;
    }
    public boolean c(){
       return this.a.A();
    }
    public void collapseActionView(){
       this.a.e();
    }
    public boolean d(){
       return this.a.d();
    }
    public void e(Drawable p0){
       i0.v0(this.a, p0);
    }
    public boolean f(){
       return this.a.Q();
    }
    public boolean g(){
       return this.a.B();
    }
    public Context getContext(){
       return this.a.getContext();
    }
    public int getHeight(){
       return this.a.getHeight();
    }
    public CharSequence getSubtitle(){
       return this.a.getSubtitle();
    }
    public CharSequence getTitle(){
       return this.a.getTitle();
    }
    public int getVisibility(){
       return this.a.getVisibility();
    }
    public boolean h(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public void i(){
       this.n = true;
    }
    public boolean j(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public boolean k(){
       return this.a.C();
    }
    public void l(int p0){
       int i = this.b ^ p0;
       this.b = p0;
       if (i) {
          if (i & 0x04) {
             if (p0 & 0x04) {
                this.V();
             }
             this.W();
          }
          if (i & 0x03) {
             this.X();
          }
          if (i & 0x08) {
             if (p0 & 0x08) {
                this.a.setTitle(this.j);
                this.a.setSubtitle(this.k);
             }else {
                this.a.setTitle(null);
                this.a.setSubtitle(null);
             }
          }
          if (i & 0x10) {
             i te = this.e;
             if (te != null) {
                if (p0 & 0x10) {
                   this.a.addView(te);
                }else {
                   this.a.removeView(te);
                }
             }
          }
       }
    label_0055 :
       return;
    }
    public void m(CharSequence p0){
       this.l = p0;
       this.V();
    }
    public int n(){
       return this.p;
    }
    public void o(int p0){
       i ta;
       i tp = this.p;
       if (p0 != tp) {
          int i = 2;
          int i1 = 1;
          if (tp != i1) {
             if (tp == i) {
                tp = this.c;
                if (tp != null) {
                   ta = this.a;
                   if (tp.getParent() == ta) {
                      ta.removeView(this.c);
                   }
                }
             }
          }else {
             tp = this.d;
             if (tp != null) {
                ta = this.a;
                if (tp.getParent() == ta) {
                   ta.removeView(this.d);
                }
             }
          }
          this.p = p0;
          if (p0) {
             int i2 = 0;
             if (p0 != i1) {
                if (p0 == i) {
                   i tc = this.c;
                   if (tc != null) {
                      this.a.addView(tc, i2);
                      Toolbar$LayoutParams layoutParams = this.c.getLayoutParams();
                      layoutParams.width = -2;
                      layoutParams.height = -2;
                      layoutParams.a = 0x800053;
                   }
                }else {
                   throw new IllegalArgumentException("Invalid navigation mode "+p0);
                }
             }else {
                this.T();
                this.a.addView(this.d, i2);
             }
          }
       }
    label_0074 :
       return;
    }
    public void p(int p0){
       CharSequence uCharSequenc = (!p0)? null: this.getContext().getString(p0);
       this.m(uCharSequenc);
       return;
    }
    public void q(){
    }
    public int r(){
       i td = this.d;
       int count = (td != null)? td.getCount(): 0;
       return count;
    }
    public void s(boolean p0){
       this.a.setCollapsible(p0);
    }
    public void setIcon(int p0){
       Drawable uDrawable = (p0)? a.d(this.getContext(), p0): null;
       this.setIcon(uDrawable);
       return;
    }
    public void setIcon(Drawable p0){
       this.f = p0;
       this.X();
    }
    public void setLogo(int p0){
       Drawable uDrawable = (p0)? a.d(this.getContext(), p0): null;
       this.K(uDrawable);
       return;
    }
    public void setTitle(CharSequence p0){
       this.i = true;
       this.U(p0);
    }
    public void setVisibility(int p0){
       this.a.setVisibility(p0);
    }
    public void setWindowCallback(Window$Callback p0){
       this.m = p0;
    }
    public void setWindowTitle(CharSequence p0){
       if (this.i == null) {
          this.U(p0);
       }
       return;
    }
    public void t(){
       this.a.f();
    }
    public void u(Drawable p0){
       if (this.r != p0) {
          this.r = p0;
          this.W();
       }
       return;
    }
    public void v(int p0){
       this.z(p0, 200).j();
    }
    public int w(){
       return this.b;
    }
    public void x(Drawable p0){
       this.h = p0;
       this.W();
    }
    public void y(CharSequence p0){
       this.k = p0;
       if (this.b & 0x08) {
          this.a.setSubtitle(p0);
       }
       return;
    }
    public m0 z(int p0,long p1){
       m0 om0 = i0.c(this.a);
       float f = (!p0)? 0x3f800000: 0;
       om0.a(f);
       om0.d(p1);
       om0.f(new i$b(this, p0));
       return om0;
    }
}
