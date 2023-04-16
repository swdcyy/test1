package androidx.appcompat.view.menu.l;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;
import v0.c;
import android.content.Context;
import androidx.appcompat.view.menu.e;
import android.view.View;
import androidx.appcompat.view.menu.l$a;
import androidx.appcompat.view.menu.l$b;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.d;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import androidx.appcompat.widget.MenuPopupWindow;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ListPopupWindow;
import android.widget.AdapterView$OnItemClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import android.graphics.Rect;
import android.widget.ListView;
import java.lang.CharSequence;
import ag6.a;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.Object;
import android.os.Parcelable;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.i;
import a2.i0;
import android.view.Gravity;
import android.view.KeyEvent;
import java.lang.IllegalStateException;
import java.lang.String;

public final class l extends c implements PopupWindow$OnDismissListener, View$OnKeyListener	// class@0005b9
{
    public final Context c;
    public final e d;
    public final d e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final MenuPopupWindow j;
    public final ViewTreeObserver$OnGlobalLayoutListener k;
    public final View$OnAttachStateChangeListener l;
    public PopupWindow$OnDismissListener m;
    public View n;
    public View o;
    public j$a p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public static final int w = 2131558419;

    public void l(Context p0,e p1,View p2,int p3,int p4,boolean p5){
       super();
       this.k = new l$a(this);
       this.l = new l$b(this);
       this.u = 0;
       this.c = p0;
       this.d = p1;
       this.f = p5;
       this.e = new d(p1, LayoutInflater.from(p0), p5, l.w);
       this.h = p3;
       this.i = p4;
       Resources resources = p0.getResources();
       this.g = Math.max((c.c(resources).widthPixels / 2), c.b(resources, 0x7f07001d));
       this.n = p2;
       this.j = new MenuPopupWindow(p0, null, p3, p4);
       p1.c(this, p0);
    }
    public final boolean B(){
       if (this.d()) {
          return true;
       }
       boolean b = false;
       if (this.r == null) {
          l tn = this.n;
          if (tn != null) {
             this.o = tn;
             this.j.G(this);
             this.j.H(this);
             this.j.F(true);
             tn = this.o;
             l ol = (this.q == null)? 1: null;
             ViewTreeObserver viewTreeObse = tn.getViewTreeObserver();
             this.q = viewTreeObse;
             if (ol) {
                viewTreeObse.addOnGlobalLayoutListener(this.k);
             }
             tn.addOnAttachStateChangeListener(this.l);
             this.j.z(tn);
             this.j.C(this.u);
             if (this.s == null) {
                this.t = c.q(this.e, null, this.c, this.g);
                this.s = true;
             }
             this.j.B(this.t);
             this.j.E(2);
             this.j.D(this.p());
             this.j.show();
             ListView listView = this.j.i();
             listView.setOnKeyListener(this);
             if (this.v != null && this.d.z() != null) {
                FrameLayout uFrameLayout = a.c(LayoutInflater.from(this.c), R.layout.arg_RES_7f0d0012, listView, b);
                TextView textView = uFrameLayout.findViewById(0x1020016);
                if (textView != null) {
                   textView.setText(this.d.z());
                }
                uFrameLayout.setEnabled(b);
                listView.addHeaderView(uFrameLayout, null, b);
             }
             this.j.q(this.e);
             this.j.show();
             return true;
          }
       }
       return b;
    }
    public Parcelable a(){
       return null;
    }
    public void b(e p0,boolean p1){
       if (p0 != this.d) {
          return;
       }
       this.dismiss();
       l tp = this.p;
       if (tp != null) {
          tp.b(p0, p1);
       }
       return;
    }
    public void c(Parcelable p0){
    }
    public boolean d(){
       boolean b = (this.r == null && this.j.d())? true: false;
       return b;
    }
    public void dismiss(){
       if (this.d()) {
          this.j.dismiss();
       }
       return;
    }
    public void e(boolean p0){
       this.s = false;
       l te = this.e;
       if (te != null) {
          te.notifyDataSetChanged();
       }
       return;
    }
    public boolean f(m p0){
       if (p0.hasVisibleItems()) {
          i oi = new i(this.c, p0, this.o, this.f, this.h, this.i);
          v0.a(this.p);
          v0.g(c.z(p0));
          v0.i(this.m);
          this.m = null;
          this.d.e(false);
          int i = this.j.m();
          int i1 = this.j.l();
          if ((Gravity.getAbsoluteGravity(this.u, i0.B(this.n)) & 0x07) == 5) {
             i = i + this.n.getWidth();
          }
          if (v0.m(i, i1)) {
             l tp = this.p;
             if (tp != null) {
                tp.c(p0);
             }
             return true;
          }
       }
       return false;
    }
    public boolean h(){
       return false;
    }
    public ListView i(){
       return this.j.i();
    }
    public void l(j$a p0){
       this.p = p0;
    }
    public void n(e p0){
    }
    public void onDismiss(){
       this.r = true;
       this.d.close();
       l tq = this.q;
       if (tq != null) {
          if (!tq.isAlive()) {
             this.q = this.o.getViewTreeObserver();
          }
          this.q.removeGlobalOnLayoutListener(this.k);
          this.q = null;
       }
       this.o.removeOnAttachStateChangeListener(this.l);
       tq = this.m;
       if (tq != null) {
          tq.onDismiss();
       }
       return;
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (p2.getAction() != 1 || p1 != 82) {
          return false;
       }
       this.dismiss();
       return true;
    }
    public void r(View p0){
       this.n = p0;
    }
    public void show(){
       if (this.B()) {
          return;
       }
       throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }
    public void t(boolean p0){
       this.e.d(p0);
    }
    public void u(int p0){
       this.u = p0;
    }
    public void v(int p0){
       this.j.n(p0);
    }
    public void w(PopupWindow$OnDismissListener p0){
       this.m = p0;
    }
    public void x(boolean p0){
       this.v = p0;
    }
    public void y(int p0){
       this.j.j(p0);
    }
}
