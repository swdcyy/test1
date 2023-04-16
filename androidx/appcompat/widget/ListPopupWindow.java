package androidx.appcompat.widget.ListPopupWindow;
import v0.e;
import android.os.Build$VERSION;
import android.widget.PopupWindow;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Method;
import android.graphics.Rect;
import android.view.View;
import java.lang.Integer;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import androidx.appcompat.widget.ListPopupWindow$g;
import androidx.appcompat.widget.ListPopupWindow$f;
import androidx.appcompat.widget.ListPopupWindow$e;
import androidx.appcompat.widget.ListPopupWindow$c;
import android.os.Handler;
import android.os.Looper;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatPopupWindow;
import android.graphics.drawable.Drawable;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.widget.DropDownListView;
import android.widget.ListView;
import androidx.appcompat.widget.ListPopupWindow$a;
import android.widget.ListAdapter;
import androidx.appcompat.widget.ListPopupWindow$b;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AbsListView$OnScrollListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Runnable;
import androidx.appcompat.widget.ListPopupWindow$d;
import android.database.DataSetObserver;
import e2.f;
import a2.i0;
import android.view.View$OnTouchListener;
import android.view.ViewParent;

public class ListPopupWindow implements e	// class@00060c
{
    public final ListPopupWindow$c A;
    public Runnable B;
    public final Handler C;
    public final Rect D;
    public Rect E;
    public boolean F;
    public PopupWindow G;
    public Context b;
    public ListAdapter c;
    public DropDownListView d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public int p;
    public View q;
    public int r;
    public DataSetObserver s;
    public View t;
    public Drawable u;
    public AdapterView$OnItemClickListener v;
    public AdapterView$OnItemSelectedListener w;
    public final ListPopupWindow$g x;
    public final ListPopupWindow$f y;
    public final ListPopupWindow$e z;
    public static Method H;
    public static Method I;
    public static Method J;

    static {
       int i = 0;
       int i1 = 1;
       if (Build$VERSION.SDK_INT <= 28) {
          try{
             Class[] uClassArray = new Class[i1];
             uClassArray[i] = Boolean.TYPE;
             ListPopupWindow.H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", uClassArray);
             try{
                uClassArray = new Class[i1];
                uClassArray[i] = Rect.class;
                ListPopupWindow.J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", uClassArray);
             }catch(java.lang.NoSuchMethodException e0){
             }
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public void ListPopupWindow(Context p0){
       super(p0, null, 0x7f0405af);
    }
    public void ListPopupWindow(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0405af);
    }
    public void ListPopupWindow(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, 0);
    }
    public void ListPopupWindow(Context p0,AttributeSet p1,int p2,int p3){
       super();
       this.e = -2;
       this.f = -2;
       this.i = 1002;
       this.m = 0;
       this.n = false;
       this.o = false;
       this.p = Integer.MAX_VALUE;
       this.r = 0;
       this.x = new ListPopupWindow$g(this);
       this.y = new ListPopupWindow$f(this);
       this.z = new ListPopupWindow$e(this);
       this.A = new ListPopupWindow$c(this);
       this.D = new Rect();
       this.b = p0;
       this.C = new Handler(p0.getMainLooper());
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.r2, p2, p3);
       this.g = typedArray.getDimensionPixelOffset(0, 0);
       int dimensionPix = typedArray.getDimensionPixelOffset(1, 0);
       this.h = dimensionPix;
       if (dimensionPix) {
          this.j = true;
       }
       typedArray.recycle();
       AppCompatPopupWindow uAppCompatPo = new AppCompatPopupWindow(p0, p1, p2, p3);
       this.G = uAppCompatPo;
       uAppCompatPo.setInputMethodMode(1);
       return;
    }
    public void A(int p0){
       this.G.setAnimationStyle(p0);
    }
    public void B(int p0){
       Drawable background = this.G.getBackground();
       if (background != null) {
          background.getPadding(this.D);
          ListPopupWindow tD = this.D;
          this.f = (tD.left + tD.right) + p0;
       }else {
          this.M(p0);
       }
       return;
    }
    public void C(int p0){
       this.m = p0;
    }
    public void D(Rect p0){
       Rect rect = (p0 != null)? new Rect(p0): null;
       this.E = rect;
       return;
    }
    public void E(int p0){
       this.G.setInputMethodMode(p0);
    }
    public void F(boolean p0){
       this.F = p0;
       this.G.setFocusable(p0);
    }
    public void G(PopupWindow$OnDismissListener p0){
       this.G.setOnDismissListener(p0);
    }
    public void H(AdapterView$OnItemClickListener p0){
       this.v = p0;
    }
    public void I(boolean p0){
       this.l = true;
       this.k = p0;
    }
    public final void J(boolean p0){
       if (Build$VERSION.SDK_INT <= 28) {
          Method h = ListPopupWindow.H;
          if (h != null) {
             try{
                Object[] objArray = new Object[]{Boolean.valueOf(p0)};
                h.invoke(this.G, objArray);
             }catch(java.lang.Exception e0){
             }
          }
       }else {
          this.G.setIsClippedToScreen(p0);
       }
       return;
    }
    public void K(int p0){
       this.r = p0;
    }
    public void L(int p0){
       ListPopupWindow td = this.d;
       if (this.d() && td != null) {
          td.setListSelectionHidden(false);
          td.setSelection(p0);
          if (td.getChoiceMode()) {
             td.setItemChecked(p0, true);
          }
       }
       return;
    }
    public void M(int p0){
       this.f = p0;
    }
    public final int c(){
       ListPopupWindow tb;
       ListPopupWindow tw;
       int i4;
       int i5;
       LinearLayout linearLayout1;
       int i = Integer.MIN_VALUE;
       int i1 = -1;
       int i2 = 1;
       int i3 = 0;
       if (this.d == null) {
          tb = this.b;
          this.B = new ListPopupWindow$a(this);
          DropDownListView uDropDownLis = this.s(tb, (this.F ^ i2));
          this.d = uDropDownLis;
          ListPopupWindow tu = this.u;
          if (tu != null) {
             uDropDownLis.setSelector(tu);
          }
          this.d.setAdapter(this.c);
          this.d.setOnItemClickListener(this.v);
          this.d.setFocusable(i2);
          this.d.setFocusableInTouchMode(i2);
          this.d.setOnItemSelectedListener(new ListPopupWindow$b(this));
          this.d.setOnScrollListener(this.z);
          tw = this.w;
          if (tw != null) {
             this.d.setOnItemSelectedListener(tw);
          }
          tw = this.d;
          tu = this.q;
          if (tu != null) {
             LinearLayout linearLayout = new LinearLayout(tb);
             linearLayout.setOrientation(i2);
             LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(i1, i3, 0x3f800000);
             ListPopupWindow tr = this.r;
             if (tr != null) {
                if (tr == i2) {
                   linearLayout.addView(tw, layoutParams);
                   linearLayout.addView(tu);
                }
             }else {
                linearLayout.addView(tu);
                linearLayout.addView(tw, layoutParams);
             }
             tb = this.f;
             if (tb >= null) {
                i4 = Integer.MIN_VALUE;
             }else {
                i5 = 0;
                i4 = 0;
             }
             tu.measure(View$MeasureSpec.makeMeasureSpec(tb, i4), i3);
             layoutParams = tu.getLayoutParams();
             i5 = (tu.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
             linearLayout1 = linearLayout;
          }else {
             i5 = 0;
          }
          this.G.setContentView(linearLayout1);
       }else {
          ViewGroup contentView = this.G.getContentView();
          tb = this.q;
          if (tb != null) {
             LinearLayout$LayoutParams layoutParams1 = tb.getLayoutParams();
             i5 = (tb.getMeasuredHeight() + layoutParams1.topMargin) + layoutParams1.bottomMargin;
          }else {
             i5 = 0;
          }
       }
       Drawable background = this.G.getBackground();
       if (background != null) {
          background.getPadding(this.D);
          tw = this.D;
          Rect top = tw.top;
          i4 = tw.bottom + top;
          if (this.j == null) {
             this.h = - top;
          }
       }else {
          this.D.setEmpty();
          i4 = 0;
       }
       if (this.G.getInputMethodMode() != 2) {
          i2 = false;
       }
       i2 = this.u(this.t(), this.h, i2);
       if (this.n != null || this.e == i1) {
          return (i2 + i4);
       }else {
          ListPopupWindow tf = this.f;
          if (tf != -2) {
             i = 0x40000000;
             if (tf != i1) {
                i = View$MeasureSpec.makeMeasureSpec(tf, i);
             }else {
                tf = this.D;
                i = View$MeasureSpec.makeMeasureSpec((c.c(this.b.getResources()).widthPixels - (tf.left + tf.right)), i);
             }
          }else {
             tf = this.D;
             i = View$MeasureSpec.makeMeasureSpec((c.c(this.b.getResources()).widthPixels - (tf.left + tf.right)), i);
          }
          i = this.d.d(i, 0, -1, (i2 - i5), -1);
          if (i > 0) {
             i5 = i5 + (i4 + (this.d.getPaddingTop() + this.d.getPaddingBottom()));
          }
          return (i + i5);
       }
    }
    public boolean d(){
       return this.G.isShowing();
    }
    public void dismiss(){
       this.G.dismiss();
       this.y();
       this.G.setContentView(null);
       this.d = null;
       this.C.removeCallbacks(this.x);
    }
    public void e(Drawable p0){
       this.G.setBackgroundDrawable(p0);
    }
    public Drawable f(){
       return this.G.getBackground();
    }
    public ListView i(){
       return this.d;
    }
    public void j(int p0){
       this.h = p0;
       this.j = true;
    }
    public int l(){
       if (this.j == null) {
          return 0;
       }
       return this.h;
    }
    public int m(){
       return this.g;
    }
    public void n(int p0){
       this.g = p0;
    }
    public void q(ListAdapter p0){
       ListPopupWindow ts = this.s;
       if (ts == null) {
          this.s = new ListPopupWindow$d(this);
       }else {
          ListPopupWindow tc = this.c;
          if (tc != null) {
             tc.unregisterDataSetObserver(ts);
          }
       }
       this.c = p0;
       if (p0 != null) {
          p0.registerDataSetObserver(this.s);
       }
       ListPopupWindow td = this.d;
       if (td != null) {
          td.setAdapter(this.c);
       }
       return;
    }
    public void r(){
       ListPopupWindow td = this.d;
       if (td != null) {
          td.setListSelectionHidden(true);
          td.requestLayout();
       }
       return;
    }
    public DropDownListView s(Context p0,boolean p1){
       return new DropDownListView(p0, p1);
    }
    public void show(){
       ListPopupWindow tf;
       ListPopupWindow tG;
       int i1;
       ListPopupWindow tG1;
       int i = this.c();
       int b = this.w();
       f.b(this.G, this.i);
       boolean b1 = true;
       ListPopupWindow listPopupWin = -2;
       if (this.G.isShowing()) {
          if (!i0.X(this.t())) {
             return;
          }else {
             tf = this.f;
             if (tf == -1) {
                tf = -1;
             }else if(tf == listPopupWin){
                tf = this.t().getWidth();
             }
             ListPopupWindow te = this.e;
             if (te == -1) {
                if (!b) {
                   i = -1;
                }
                if (b) {
                   tG = this.G;
                   i1 = (this.f == -1)? -1: 0;
                   tG.setWidth(i1);
                   this.G.setHeight(0);
                }else {
                   tG = this.G;
                   i1 = (this.f == -1)? -1: 0;
                   tG.setWidth(i1);
                   this.G.setHeight(-1);
                }
             }else if(te == listPopupWin){
                i = te;
             }
             tG = this.G;
             if (this.o != null || this.n != null) {
                b1 = false;
             }
             tG.setOutsideTouchable(b1);
             te = this.G;
             View view = this.t();
             ListPopupWindow tg = this.g;
             ListPopupWindow th = this.h;
             int i2 = (tf < 0)? -1: tf;
             int i3 = (i < null)? -1: i;
             te.update(view, tg, th, i2, i3);
          }
       }else {
          tG = this.f;
          if (tG == -1) {
             b = -1;
          }else if(tG == listPopupWin){
             b = this.t().getWidth();
          }
          tf = this.e;
          if (tf == -1) {
             i = -1;
          }else if(tf == listPopupWin){
             tG1 = tf;
          }
          this.G.setWidth(b);
          this.G.setHeight(i);
          this.J(b1);
          tG1 = this.G;
          b = (this.o == null && this.n == null)? true: false;
          tG1.setOutsideTouchable(b);
          this.G.setTouchInterceptor(this.y);
          if (this.l != null) {
             f.a(this.G, this.k);
          }
          if (Build$VERSION.SDK_INT <= 28) {
             Method j = ListPopupWindow.J;
             if (j != null) {
                try{
                   Object[] objArray = new Object[b1];
                   objArray[0] = this.E;
                   j.invoke(this.G, objArray);
                }catch(java.lang.Exception e0){
                }
             }
          }else {
             this.G.setEpicenterBounds(this.E);
          }
       }
       return;
    }
    public View t(){
       return this.t;
    }
    public final int u(View p0,int p1,boolean p2){
       if (Build$VERSION.SDK_INT > 23) {
          return this.G.getMaxAvailableHeight(p0, p1, p2);
       }
       Method i = ListPopupWindow.I;
       if (i == null) {
          return this.G.getMaxAvailableHeight(p0, p1);
       }
       try{
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2)};
          return i.invoke(this.G, objArray).intValue();
       }catch(java.lang.Exception e0){
       }
    }
    public int v(){
       return this.f;
    }
    public boolean w(){
       boolean b = (this.G.getInputMethodMode() == 2)? true: false;
       return b;
    }
    public boolean x(){
       return this.F;
    }
    public final void y(){
       ListPopupWindow tq = this.q;
       if (tq != null) {
          ViewParent parent = tq.getParent();
          if (parent instanceof ViewGroup) {
             parent.removeView(this.q);
          }
       }
       return;
    }
    public void z(View p0){
       this.t = p0;
    }
}
