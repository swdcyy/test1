package androidx.appcompat.widget.Toolbar;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import androidx.appcompat.widget.Toolbar$a;
import androidx.appcompat.widget.Toolbar$b;
import ll8.c$b;
import w0.x;
import android.content.res.TypedArray;
import android.view.View;
import a2.i0;
import w0.r;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionMenuView;
import android.text.Layout;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.Toolbar$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import android.view.View$MeasureSpec;
import java.lang.Runnable;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar$d;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.e$a;
import android.view.ViewParent;
import java.util.List;
import a2.g;
import androidx.appcompat.app.ActionBar$LayoutParams;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.AppCompatImageButton;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar$c;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.Menu;
import android.view.MenuInflater;
import u0.g;
import w0.k;
import androidx.appcompat.widget.i;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ActionMenuView$d;
import android.view.MotionEvent;
import w0.b0;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar$SavedState;
import androidx.customview.view.AbsSavedState;
import android.view.MenuItem;
import r0.a;
import androidx.appcompat.widget.Toolbar$e;
import android.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.TextUtils$TruncateAt;
import a2.o;

public class Toolbar extends ViewGroup	// class@000633
{
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList E;
    public final ArrayList F;
    public final int[] G;
    public Toolbar$e H;
    public final ActionMenuView$d I;
    public i J;
    public ActionMenuPresenter K;
    public Toolbar$d L;
    public j$a M;
    public e$a N;
    public boolean O;
    public final Runnable P;
    public ActionMenuView b;
    public TextView c;
    public TextView d;
    public ImageButton e;
    public ImageView f;
    public Drawable g;
    public CharSequence h;
    public ImageButton i;
    public View j;
    public Context k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public r u;
    public int v;
    public int w;
    public int x;
    public CharSequence y;
    public CharSequence z;

    public void Toolbar(Context p0){
       super(p0, null);
    }
    public void Toolbar(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04095a);
    }
    public void Toolbar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = 0x800013;
       this.E = new ArrayList();
       this.F = new ArrayList();
       int i = 2;
       int[] ointArray = new int[i];
       this.G = ointArray;
       this.I = new Toolbar$a(this);
       this.P = new Toolbar$b(this);
       int[] k5 = c$b.K5;
       x ox = x.v(this.getContext(), p1, k5, p2, 0);
       i0.q0(this, p0, k5, p1, ox.r(), p2, 0);
       this.m = ox.n(28, 0);
       this.n = ox.n(19, 0);
       this.x = ox.l(0, this.x);
       this.o = ox.l(i, 48);
       int i1 = ox.e(22, 0);
       int i2 = 27;
       if (ox.s(i2)) {
          i1 = ox.e(i2, i1);
       }
       this.t = i1;
       this.s = i1;
       this.r = i1;
       this.q = i1;
       i2 = -1;
       i1 = ox.e(25, i2);
       if (i1 >= 0) {
          this.q = i1;
       }
       i1 = ox.e(24, i2);
       if (i1 >= 0) {
          this.r = i1;
       }
       i1 = ox.e(26, i2);
       if (i1 >= 0) {
          this.s = i1;
       }
       i1 = ox.e(23, i2);
       if (i1 >= 0) {
          this.t = i1;
       }
       this.p = ox.f(13, i2);
       i2 = Integer.MIN_VALUE;
       i1 = ox.e(9, i2);
       p2 = ox.e(5, i2);
       this.h();
       this.u.e(ox.f(7, 0), ox.f(8, 0));
       if (i1 != i2 || p2 != i2) {
          this.u.g(i1, p2);
       }
       this.v = ox.e(10, i2);
       this.w = ox.e(6, i2);
       this.g = ox.g(4);
       this.h = ox.p(3);
       CharSequence uCharSequenc = ox.p(21);
       if (!TextUtils.isEmpty(uCharSequenc)) {
          this.setTitle(uCharSequenc);
       }
       uCharSequenc = ox.p(18);
       if (!TextUtils.isEmpty(uCharSequenc)) {
          this.setSubtitle(uCharSequenc);
       }
       this.k = this.getContext();
       this.setPopupTheme(ox.n(17, 0));
       Drawable uDrawable = ox.g(16);
       if (uDrawable != null) {
          this.setNavigationIcon(uDrawable);
       }
       uCharSequenc = ox.p(15);
       if (!TextUtils.isEmpty(uCharSequenc)) {
          this.setNavigationContentDescription(uCharSequenc);
       }
       uDrawable = ox.g(11);
       if (uDrawable != null) {
          this.setLogo(uDrawable);
       }
       uCharSequenc = ox.p(12);
       if (!TextUtils.isEmpty(uCharSequenc)) {
          this.setLogoDescription(uCharSequenc);
       }
       i1 = 29;
       if (ox.s(i1)) {
          this.setTitleTextColor(ox.c(i1));
       }
       i1 = 20;
       if (ox.s(i1)) {
          this.setSubtitleTextColor(ox.c(i1));
       }
       i1 = 14;
       if (ox.s(i1)) {
          this.y(ox.n(i1, 0));
       }
       ox.w();
       return;
    }
    public boolean A(){
       Toolbar tb = this.b;
       boolean b = (tb != null && tb.I())? true: false;
       return b;
    }
    public boolean B(){
       Toolbar tb = this.b;
       boolean b = (tb != null && tb.J())? true: false;
       return b;
    }
    public boolean C(){
       Toolbar tc = this.c;
       if (tc == null) {
          return false;
       }
       Layout layout = tc.getLayout();
       if (layout == null) {
          return false;
       }
       int lineCount = layout.getLineCount();
       int i = 0;
       while (true) {
          if (i >= lineCount) {
             return false;
          }
          if (layout.getEllipsisCount(i) > 0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public final int D(View p0,int p1,int[] p2,int p3){
       Toolbar$LayoutParams layoutParams = p0.getLayoutParams();
       int i = layoutParams.leftMargin - p2[0];
       p1 = p1 + Math.max(0, i);
       p2[0] = Math.max(0, (- i));
       int i1 = this.r(p0, p3);
       p3 = p0.getMeasuredWidth();
       p0.layout(p1, i1, (p1 + p3), (p0.getMeasuredHeight() + i1));
       return (p1 + (p3 + layoutParams.rightMargin));
    }
    public final int E(View p0,int p1,int[] p2,int p3){
       Toolbar$LayoutParams layoutParams = p0.getLayoutParams();
       int i = layoutParams.rightMargin - p2[1];
       p1 = p1 - Math.max(0, i);
       p2[1] = Math.max(0, (- i));
       int i1 = this.r(p0, p3);
       p3 = p0.getMeasuredWidth();
       p0.layout((p1 - p3), i1, p1, (p0.getMeasuredHeight() + i1));
       return (p1 - (p3 + layoutParams.leftMargin));
    }
    public final int F(View p0,int p1,int p2,int p3,int p4,int[] p5){
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       int i = layoutParams.leftMargin - p5[0];
       int i1 = layoutParams.rightMargin - p5[1];
       int i2 = Math.max(0, i) + Math.max(0, i1);
       p5[0] = Math.max(0, (- i));
       p5[1] = Math.max(0, (- i1));
       p0.measure(ViewGroup.getChildMeasureSpec(p1, (((this.getPaddingLeft() + this.getPaddingRight()) + i2) + p2), layoutParams.width), ViewGroup.getChildMeasureSpec(p3, ((((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin) + p4), layoutParams.height));
       return (p0.getMeasuredWidth() + i2);
    }
    public final void G(View p0,int p1,int p2,int p3,int p4,int p5){
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       p1 = ViewGroup.getChildMeasureSpec(p1, ((((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin) + p2), layoutParams.width);
       p2 = ViewGroup.getChildMeasureSpec(p3, ((((this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin) + p4), layoutParams.height);
       p3 = View$MeasureSpec.getMode(p2);
       if (p3 != 0x40000000 && p5 >= 0) {
          if (p3) {
             p5 = Math.min(View$MeasureSpec.getSize(p2), p5);
          }
          p2 = View$MeasureSpec.makeMeasureSpec(p5, 0x40000000);
       }
       p0.measure(p1, p2);
       return;
    }
    public final void H(){
       this.removeCallbacks(this.P);
       this.post(this.P);
    }
    public void I(){
       int i = this.getChildCount() - 1;
       while (i >= 0) {
          View childAt = this.getChildAt(i);
          if (childAt.getLayoutParams().b != 2 && childAt != this.b) {
             this.removeViewAt(i);
             this.F.add(childAt);
          }
          i = i - 1;
       }
       return;
    }
    public void J(int p0,int p1){
       this.h();
       this.u.g(p0, p1);
    }
    public void K(e p0,ActionMenuPresenter p1){
       if (p0 == null && this.b == null) {
          return;
       }
       this.k();
       e uoe = this.b.N();
       if (uoe == p0) {
          return;
       }
       if (uoe != null) {
          uoe.Q(this.K);
          uoe.Q(this.L);
       }
       if (this.L == null) {
          this.L = new Toolbar$d(this);
       }
       boolean b = true;
       p1.C(b);
       if (p0 != null) {
          p0.c(p1, this.k);
          p0.c(this.L, this.k);
       }else {
          p1.k(this.k, null);
          this.L.k(this.k, null);
          p1.e(b);
          this.L.e(b);
       }
       this.b.setPopupTheme(this.l);
       this.b.setPresenter(p1);
       this.K = p1;
       return;
    }
    public void L(j$a p0,e$a p1){
       this.M = p0;
       this.N = p1;
       Toolbar tb = this.b;
       if (tb != null) {
          tb.O(p0, p1);
       }
       return;
    }
    public void M(Context p0,int p1){
       this.n = p1;
       Toolbar td = this.d;
       if (td != null) {
          td.setTextAppearance(p0, p1);
       }
       return;
    }
    public void N(Context p0,int p1){
       this.m = p1;
       Toolbar tc = this.c;
       if (tc != null) {
          tc.setTextAppearance(p0, p1);
       }
       return;
    }
    public final boolean O(){
       if (this.O == null) {
          return false;
       }
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return true;
          }
          View childAt = this.getChildAt(i);
          if (this.P(childAt) && (childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final boolean P(View p0){
       boolean b = (p0 != null && (p0.getParent() == this && p0.getVisibility() != 8))? true: false;
       return b;
    }
    public boolean Q(){
       Toolbar tb = this.b;
       boolean b = (tb != null && tb.P())? true: false;
       return b;
    }
    public void a(){
       for (int i = this.F.size() - 1; i >= 0; i = i - 1) {
          this.addView(this.F.get(i));
       }
       this.F.clear();
       return;
    }
    public final void b(List p0,int p1){
       Toolbar$LayoutParams layoutParams = null;
       int i = 1;
       View view = (i0.B(this) == i)? 1: null;
       int childCount = this.getChildCount();
       p1 = g.b(p1, i0.B(this));
       p0.clear();
       if (view) {
          childCount = childCount - i;
          while (childCount >= 0) {
             view = this.getChildAt(childCount);
             layoutParams = view.getLayoutParams();
             if (layoutParams.b == null && (this.P(view) && this.q(layoutParams.a) == p1)) {
                p0.add(view);
             }
          label_003e :
             childCount = childCount - 1;
          }
       }else {
          while (layoutParams < childCount) {
             view = this.getChildAt(layoutParams);
             Toolbar$LayoutParams layoutParams1 = view.getLayoutParams();
             if (layoutParams1.b == null && (this.P(view) && this.q(layoutParams1.a) == p1)) {
                p0.add(view);
             }
          label_0062 :
             layoutParams = layoutParams + 1;
          }
       }
       return;
    }
    public final void c(View p0,boolean p1){
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams == null) {
          layoutParams = this.n();
       }else if(!this.checkLayoutParams(layoutParams)){
          layoutParams = this.p(layoutParams);
       }else {
       }
       layoutParams.b = 1;
       if (p1 && this.j != null) {
          p0.setLayoutParams(layoutParams);
          this.F.add(p0);
       }else {
          this.addView(p0, layoutParams);
       }
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       boolean b = (super.checkLayoutParams(p0) && p0 instanceof Toolbar$LayoutParams)? true: false;
       return b;
    }
    public boolean d(){
       boolean b;
       if (!this.getVisibility()) {
          Toolbar tb = this.b;
          if (tb != null && tb.K()) {
             b = true;
          label_0013 :
             return b;
          }
       }
       b = false;
       goto label_0013 ;
    }
    public void e(){
       Toolbar tL = this.L;
       h oh = (tL == null)? null: tL.c;
       if (oh != null) {
          oh.collapseActionView();
       }
       return;
    }
    public void f(){
       Toolbar tb = this.b;
       if (tb != null) {
          tb.B();
       }
       return;
    }
    public void g(){
       if (this.i == null) {
          AppCompatImageButton uAppCompatIm = new AppCompatImageButton(this.getContext(), null, 0x7f040959);
          this.i = uAppCompatIm;
          uAppCompatIm.setImageDrawable(this.g);
          this.i.setContentDescription(this.h);
          Toolbar$LayoutParams layoutParams = this.n();
          layoutParams.a = 0x800003 | (this.o & 0x70);
          layoutParams.b = 2;
          this.i.setLayoutParams(layoutParams);
          this.i.setOnClickListener(new Toolbar$c(this));
       }
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.n();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.o(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.p(p0);
    }
    public CharSequence getCollapseContentDescription(){
       Toolbar ti = this.i;
       CharSequence contentDescr = (ti != null)? ti.getContentDescription(): null;
       return contentDescr;
    }
    public Drawable getCollapseIcon(){
       Toolbar ti = this.i;
       Drawable drawable = (ti != null)? ti.getDrawable(): null;
       return drawable;
    }
    public int getContentInsetEnd(){
       Toolbar tu = this.u;
       int i = (tu != null)? tu.a(): 0;
       return i;
    }
    public int getContentInsetEndWithActions(){
       Toolbar tw = this.w;
       if (tw != Integer.MIN_VALUE) {
       }else {
          tw = this.getContentInsetEnd();
       }
       return tw;
    }
    public int getContentInsetLeft(){
       Toolbar tu = this.u;
       int i = (tu != null)? tu.b(): 0;
       return i;
    }
    public int getContentInsetRight(){
       Toolbar tu = this.u;
       int i = (tu != null)? tu.c(): 0;
       return i;
    }
    public int getContentInsetStart(){
       Toolbar tu = this.u;
       int i = (tu != null)? tu.d(): 0;
       return i;
    }
    public int getContentInsetStartWithNavigation(){
       Toolbar tv = this.v;
       if (tv != Integer.MIN_VALUE) {
       }else {
          tv = this.getContentInsetStart();
       }
       return tv;
    }
    public int getCurrentContentInsetEnd(){
       int i1;
       Toolbar tb = this.b;
       int i = 0;
       if (tb != null) {
          e uoe = tb.N();
          if (uoe != null && uoe.hasVisibleItems()) {
             i1 = 1;
          label_0014 :
             i1 = (i1)? Math.max(this.getContentInsetEnd(), Math.max(this.w, i)): this.getContentInsetEnd();
             return i1;
          }
       }
       i1 = 0;
       goto label_0014 ;
    }
    public int getCurrentContentInsetLeft(){
       int currentConte = (i0.B(this) == 1)? this.getCurrentContentInsetEnd(): this.getCurrentContentInsetStart();
       return currentConte;
    }
    public int getCurrentContentInsetRight(){
       int currentConte = (i0.B(this) == 1)? this.getCurrentContentInsetStart(): this.getCurrentContentInsetEnd();
       return currentConte;
    }
    public int getCurrentContentInsetStart(){
       int i = (this.getNavigationIcon() != null)? Math.max(this.getContentInsetStart(), Math.max(this.v, 0)): this.getContentInsetStart();
       return i;
    }
    public Drawable getLogo(){
       Toolbar tf = this.f;
       Drawable drawable = (tf != null)? tf.getDrawable(): null;
       return drawable;
    }
    public CharSequence getLogoDescription(){
       Toolbar tf = this.f;
       CharSequence contentDescr = (tf != null)? tf.getContentDescription(): null;
       return contentDescr;
    }
    public Menu getMenu(){
       this.j();
       return this.b.getMenu();
    }
    public final MenuInflater getMenuInflater(){
       return new g(this.getContext());
    }
    public CharSequence getNavigationContentDescription(){
       Toolbar te = this.e;
       CharSequence contentDescr = (te != null)? te.getContentDescription(): null;
       return contentDescr;
    }
    public Drawable getNavigationIcon(){
       Toolbar te = this.e;
       Drawable drawable = (te != null)? te.getDrawable(): null;
       return drawable;
    }
    public ActionMenuPresenter getOuterActionMenuPresenter(){
       return this.K;
    }
    public Drawable getOverflowIcon(){
       this.j();
       return this.b.getOverflowIcon();
    }
    public Context getPopupContext(){
       return this.k;
    }
    public int getPopupTheme(){
       return this.l;
    }
    public CharSequence getSubtitle(){
       return this.z;
    }
    public final TextView getSubtitleTextView(){
       return this.d;
    }
    public CharSequence getTitle(){
       return this.y;
    }
    public int getTitleMarginBottom(){
       return this.t;
    }
    public int getTitleMarginEnd(){
       return this.r;
    }
    public int getTitleMarginStart(){
       return this.q;
    }
    public int getTitleMarginTop(){
       return this.s;
    }
    public final TextView getTitleTextView(){
       return this.c;
    }
    public k getWrapper(){
       if (this.J == null) {
          this.J = new i(this, true);
       }
       return this.J;
    }
    public final void h(){
       if (this.u == null) {
          this.u = new r();
       }
       return;
    }
    public final void i(){
       if (this.f == null) {
          this.f = new AppCompatImageView(this.getContext());
       }
       return;
    }
    public final void j(){
       this.k();
       if (this.b.N() == null) {
          e menu = this.b.getMenu();
          if (this.L == null) {
             this.L = new Toolbar$d(this);
          }
          this.b.setExpandedActionViewsExclusive(true);
          menu.c(this.L, this.k);
       }
       return;
    }
    public final void k(){
       if (this.b == null) {
          ActionMenuView uActionMenuV = new ActionMenuView(this.getContext());
          this.b = uActionMenuV;
          uActionMenuV.setPopupTheme(this.l);
          this.b.setOnMenuItemClickListener(this.I);
          this.b.O(this.M, this.N);
          Toolbar$LayoutParams layoutParams = this.n();
          layoutParams.a = 0x800005 | (this.o & 0x70);
          this.b.setLayoutParams(layoutParams);
          this.c(this.b, false);
       }
       return;
    }
    public final void l(){
       if (this.e == null) {
          this.e = new AppCompatImageButton(this.getContext(), null, 0x7f040959);
          Toolbar$LayoutParams layoutParams = this.n();
          layoutParams.a = 0x800003 | (this.o & 0x70);
          this.e.setLayoutParams(layoutParams);
       }
       return;
    }
    public Toolbar$LayoutParams n(){
       return new Toolbar$LayoutParams(-2, -2);
    }
    public Toolbar$LayoutParams o(AttributeSet p0){
       return new Toolbar$LayoutParams(this.getContext(), p0);
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.removeCallbacks(this.P);
    }
    public boolean onHoverEvent(MotionEvent p0){
       int actionMasked = p0.getActionMasked();
       if (actionMasked == 9) {
          this.D = false;
       }
       if (this.D == null) {
          boolean b = super.onHoverEvent(p0);
          if (actionMasked == 9 && !b) {
             this.D = true;
          }
       }
       if (actionMasked == 10 || actionMasked == 3) {
          this.D = false;
       }
       return true;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       boolean i4;
       boolean i5;
       Toolbar$LayoutParams layoutParams1;
       int i7;
       int i8;
       Toolbar toolbar = this;
       int i = 1;
       int i1 = 0;
       Toolbar toolbar1 = (i0.B(this) == i)? 1: null;
       int width = this.getWidth();
       int height = this.getHeight();
       int paddingLeft = this.getPaddingLeft();
       int paddingRight = this.getPaddingRight();
       int paddingTop = this.getPaddingTop();
       int paddingBotto = this.getPaddingBottom();
       int i2 = width - paddingRight;
       Toolbar g = toolbar.G;
       g[i] = i1;
       g[i1] = i1;
       int i3 = i0.C(this);
       i3 = (i3 >= 0)? Math.min(i3, (p4 - p2)): 0;
       if (toolbar.P(toolbar.e)) {
          if (toolbar1) {
             i4 = toolbar.E(toolbar.e, i2, g, i3);
             i5 = paddingLeft;
          label_0057 :
             if (toolbar.P(toolbar.i)) {
                if (toolbar1) {
                   i4 = toolbar.E(toolbar.i, i4, g, i3);
                }else {
                   i5 = toolbar.D(toolbar.i, i5, g, i3);
                }
             }
             if (toolbar.P(toolbar.b)) {
                if (toolbar1) {
                   i5 = toolbar.D(toolbar.b, i5, g, i3);
                }else {
                   i4 = toolbar.E(toolbar.b, i4, g, i3);
                }
             }
             int currentConte = this.getCurrentContentInsetLeft();
             int currentConte1 = this.getCurrentContentInsetRight();
             g[i1] = Math.max(i1, (currentConte - i5));
             g[1] = Math.max(i1, (currentConte1 - (i2 - i4)));
             i = Math.max(i5, currentConte);
             i2 = Math.min(i4, (i2 - currentConte1));
             if (toolbar.P(toolbar.j)) {
                if (toolbar1) {
                   i2 = toolbar.E(toolbar.j, i2, g, i3);
                }else {
                   i = toolbar.D(toolbar.j, i, g, i3);
                }
             }
             if (toolbar.P(toolbar.f)) {
                if (toolbar1) {
                   i2 = toolbar.E(toolbar.f, i2, g, i3);
                }else {
                   i = toolbar.D(toolbar.f, i, g, i3);
                }
             }
             i5 = toolbar.P(toolbar.c);
             i4 = toolbar.P(toolbar.d);
             if (i5) {
                Toolbar$LayoutParams layoutParams = toolbar.c.getLayoutParams();
                p3 = paddingRight;
                i1 = ((layoutParams.topMargin + toolbar.c.getMeasuredHeight()) + layoutParams.bottomMargin) + 0;
             }else {
                p3 = paddingRight;
                i1 = 0;
             }
             if (i4) {
                layoutParams1 = toolbar.d.getLayoutParams();
                currentConte1 = width;
                i1 = i1 + ((layoutParams1.topMargin + toolbar.d.getMeasuredHeight()) + layoutParams1.bottomMargin);
             }else {
                currentConte1 = width;
             }
             if (i5 || i4) {
                Toolbar c = (i5)? toolbar.c: toolbar.d;
                Toolbar d = (i4)? toolbar.d: toolbar.c;
                Toolbar$LayoutParams layoutParams2 = c.getLayoutParams();
                layoutParams1 = d.getLayoutParams();
                int i6 = (!i5 || (toolbar.c.getMeasuredWidth() > 0 || (i4 && toolbar.d.getMeasuredWidth() > 0)))? 1: 0;
                currentConte = toolbar.x & 0x70;
                i7 = paddingLeft;
                if (currentConte != 48) {
                   if (currentConte != 80) {
                      paddingLeft = (((height - paddingTop) - paddingBotto) - i1) / 2;
                      ViewGroup$MarginLayoutParams topMargin = layoutParams2.topMargin;
                      p2 = i3;
                      Toolbar s = toolbar.s;
                      p4 = i;
                      if (paddingLeft < (topMargin + s)) {
                         paddingLeft = topMargin + s;
                      }else {
                         height = (((height - paddingBotto) - i1) - paddingLeft) - paddingTop;
                         Toolbar t = toolbar.t;
                         if (height < (layoutParams2.bottomMargin + t)) {
                            paddingLeft = Math.max(0, (paddingLeft - ((layoutParams1.bottomMargin + t) - height)));
                         }
                      }
                      paddingTop = paddingTop + paddingLeft;
                   }else {
                      p4 = i;
                      p2 = i3;
                      paddingTop = (((height - paddingBotto) - layoutParams1.bottomMargin) - toolbar.t) - i1;
                   }
                }else {
                   p4 = i;
                   p2 = i3;
                   paddingTop = (this.getPaddingTop() + layoutParams2.topMargin) + toolbar.s;
                }
                if (toolbar1) {
                   toolbar1 = (i6)? toolbar.q: 0;
                   i = 1;
                   i8 = toolbar1 - g[i];
                   i1 = 0;
                   i2 = i2 - Math.max(i1, i8);
                   g[i] = Math.max(i1, (- i8));
                   if (i5) {
                      i = i2 - toolbar.c.getMeasuredWidth();
                      i1 = toolbar.c.getMeasuredHeight() + paddingTop;
                      toolbar.c.layout(i, paddingTop, i2, i1);
                      i = i - toolbar.r;
                      paddingTop = i1 + toolbar.c.getLayoutParams().bottomMargin;
                   }else {
                      i = i2;
                   }
                   if (i4) {
                      paddingTop = paddingTop + toolbar.d.getLayoutParams().topMargin;
                      toolbar.d.layout((i2 - toolbar.d.getMeasuredWidth()), paddingTop, i2, (toolbar.d.getMeasuredHeight() + paddingTop));
                      i8 = i2 - toolbar.r;
                   }else {
                      i8 = i2;
                   }
                   if (i6) {
                      i2 = Math.min(i, i8);
                   }
                   i = p4;
                label_0128 :
                   i8 = 0;
                }else if(i6){
                   d = toolbar.q;
                   i8 = 0;
                }else {
                   i8 = 0;
                   paddingRight = 0;
                }
                paddingRight = d - g[i8];
                i = p4 + Math.max(i8, paddingRight);
                g[i8] = Math.max(i8, (- paddingRight));
                if (i5) {
                   width = toolbar.c.getMeasuredWidth() + i;
                   height = toolbar.c.getMeasuredHeight() + paddingTop;
                   toolbar.c.layout(i, paddingTop, width, height);
                   width = width + toolbar.r;
                   paddingTop = height + toolbar.c.getLayoutParams().bottomMargin;
                }else {
                   width = i;
                }
                if (i4) {
                   paddingTop = paddingTop + toolbar.d.getLayoutParams().topMargin;
                   i1 = toolbar.d.getMeasuredWidth() + i;
                   toolbar.d.layout(i, paddingTop, i1, (toolbar.d.getMeasuredHeight() + paddingTop));
                   i1 = i1 + toolbar.r;
                }else {
                   i1 = i;
                }
                if (i6) {
                   i = Math.max(width, i1);
                }
             }else {
                i7 = paddingLeft;
                p2 = i3;
                goto label_0128 ;
             }
             toolbar.b(toolbar.E, 3);
             i1 = toolbar.E.size();
             for (paddingRight = 0; paddingRight < i1; paddingRight = paddingRight + 1) {
                i = toolbar.D(toolbar.E.get(paddingRight), i, g, p2);
             }
             i3 = p2;
             toolbar.b(toolbar.E, 5);
             i1 = toolbar.E.size();
             for (paddingRight = 0; paddingRight < i1; paddingRight = paddingRight + 1) {
                i2 = toolbar.E(toolbar.E.get(paddingRight), i2, g, i3);
             }
             toolbar.b(toolbar.E, 1);
             i1 = toolbar.v(toolbar.E, g);
             paddingLeft = (i7 + (((currentConte1 - i7) - p3) / 2)) - (i1 / 2);
             i1 = i1 + paddingLeft;
             if (paddingLeft >= i) {
                i = (i1 > i2)? paddingLeft - (i1 - i2): paddingLeft;
             }
          label_02f2 :
             i1 = toolbar.E.size();
             for (; i8 < i1; i8 = i8 + 1) {
                toolbar.D(toolbar.E.get(i8), i, g, i3);
             }
             toolbar.E.clear();
             return;
          }else {
             i5 = toolbar.D(toolbar.e, paddingLeft, g, i3);
          }
       }else {
          i5 = paddingLeft;
       }
       i4 = i2;
       goto label_0057 ;
    }
    public void onMeasure(int p0,int p1){
       int i2;
       int i3;
       int i4;
       int i6;
       int i7;
       Toolbar toolbar = this;
       Toolbar g = toolbar.G;
       int b = b0.b(this);
       int i = 0;
       int i1 = b ^ 0x01;
       if (toolbar.P(toolbar.e)) {
          this.G(toolbar.e, p0, 0, p1, 0, toolbar.p);
          i2 = toolbar.e.getMeasuredWidth() + toolbar.t(toolbar.e);
          i3 = Math.max(i, (toolbar.e.getMeasuredHeight() + toolbar.u(toolbar.e)));
          i4 = View.combineMeasuredStates(i, toolbar.e.getMeasuredState());
       }else {
          i2 = 0;
          i3 = 0;
          i4 = 0;
       }
       if (toolbar.P(toolbar.i)) {
          this.G(toolbar.i, p0, 0, p1, 0, toolbar.p);
          i2 = toolbar.i.getMeasuredWidth() + toolbar.t(toolbar.i);
          i3 = Math.max(i3, (toolbar.i.getMeasuredHeight() + toolbar.u(toolbar.i)));
          i4 = View.combineMeasuredStates(i4, toolbar.i.getMeasuredState());
       }
       int currentConte = this.getCurrentContentInsetStart();
       int i5 = i + Math.max(currentConte, i2);
       g[b] = Math.max(i, (currentConte - i2));
       if (toolbar.P(toolbar.b)) {
          this.G(toolbar.b, p0, i5, p1, 0, toolbar.p);
          i2 = toolbar.b.getMeasuredWidth() + toolbar.t(toolbar.b);
          i3 = Math.max(i3, (toolbar.b.getMeasuredHeight() + toolbar.u(toolbar.b)));
          i4 = View.combineMeasuredStates(i4, toolbar.b.getMeasuredState());
       }else {
          i2 = 0;
       }
       currentConte = this.getCurrentContentInsetEnd();
       i5 = i5 + Math.max(currentConte, i2);
       g[i1] = Math.max(i, (currentConte - i2));
       if (toolbar.P(toolbar.j)) {
          i5 = i5 + this.F(toolbar.j, p0, i5, p1, 0, g);
          i3 = Math.max(i3, (toolbar.j.getMeasuredHeight() + toolbar.u(toolbar.j)));
          i4 = View.combineMeasuredStates(i4, toolbar.j.getMeasuredState());
       }
       if (toolbar.P(toolbar.f)) {
          i5 = i5 + this.F(toolbar.f, p0, i5, p1, 0, g);
          i3 = Math.max(i3, (toolbar.f.getMeasuredHeight() + toolbar.u(toolbar.f)));
          i4 = View.combineMeasuredStates(i4, toolbar.f.getMeasuredState());
       }
       b = this.getChildCount();
       i1 = 0;
       while (i1 < b) {
          View childAt = toolbar.getChildAt(i1);
          if (childAt.getLayoutParams().b == null && toolbar.P(childAt)) {
             i5 = i5 + this.F(childAt, p0, i5, p1, 0, g);
             i2 = childAt.getMeasuredHeight() + toolbar.u(childAt);
             i3 = Math.max(i3, i2);
             i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
          }
          i1 = i1 + 1;
       }
       b = toolbar.s + toolbar.t;
       i1 = toolbar.q + toolbar.r;
       if (toolbar.P(toolbar.c)) {
          this.F(toolbar.c, p0, (i5 + i1), p1, b, g);
          i6 = toolbar.c.getMeasuredHeight() + toolbar.u(toolbar.c);
          i7 = View.combineMeasuredStates(i4, toolbar.c.getMeasuredState());
          i4 = toolbar.c.getMeasuredWidth() + toolbar.t(toolbar.c);
       }else {
          i7 = i4;
          i4 = 0;
          i6 = 0;
       }
       if (toolbar.P(toolbar.d)) {
          i4 = Math.max(i4, this.F(toolbar.d, p0, (i5 + i1), p1, (i6 + b), g));
          i6 = i6 + (toolbar.d.getMeasuredHeight() + toolbar.u(toolbar.d));
          i7 = View.combineMeasuredStates(i7, toolbar.d.getMeasuredState());
       }else {
          b = i7;
       }
       currentConte = View.resolveSizeAndState(Math.max(((i5 + i4) + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth()), p0, (0xff000000 & i7));
       i2 = View.resolveSizeAndState(Math.max((Math.max(i3, i6) + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight()), p1, (i7 << 16));
       if (!this.O()) {
          i = i2;
       }
       toolbar.setMeasuredDimension(currentConte, i);
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof Toolbar$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          Toolbar tb = this.b;
          e uoe = (tb != null)? tb.N(): null;
          Toolbar$SavedState d = p0.d;
          if (d != null && (this.L != null && uoe != null)) {
             MenuItem menuItem = uoe.findItem(d);
             if (menuItem != null) {
                menuItem.expandActionView();
             }
          }
          if (p0.e != null) {
             this.H();
          }
          return;
       }
    }
    public void onRtlPropertiesChanged(int p0){
       super.onRtlPropertiesChanged(p0);
       this.h();
       Toolbar tu = this.u;
       int i = 1;
       if (p0 == i) {
       }else {
          i = false;
       }
       tu.f(i);
       return;
    }
    public Parcelable onSaveInstanceState(){
       Toolbar$SavedState savedState = new Toolbar$SavedState(super.onSaveInstanceState());
       Toolbar tL = this.L;
       if (tL != null) {
          Toolbar$d c = tL.c;
          if (c != null) {
             savedState.d = c.getItemId();
          }
       }
       savedState.e = this.B();
       return savedState;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int actionMasked = p0.getActionMasked();
       if (!actionMasked) {
          this.C = false;
       }
       if (this.C == null) {
          boolean b = super.onTouchEvent(p0);
          if (!actionMasked && !b) {
             this.C = true;
          }
       }
       if (actionMasked == 1 || actionMasked == 3) {
          this.C = false;
       }
       return true;
    }
    public Toolbar$LayoutParams p(ViewGroup$LayoutParams p0){
       if (p0 instanceof Toolbar$LayoutParams) {
          return new Toolbar$LayoutParams(p0);
       }
       if (p0 instanceof ActionBar$LayoutParams) {
          return new Toolbar$LayoutParams(p0);
       }
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new Toolbar$LayoutParams(p0);
       }
       return new Toolbar$LayoutParams(p0);
    }
    public final int q(int p0){
       int i = i0.B(this);
       p0 = g.b(p0, i) & 0x07;
       if (p0 != 1) {
          int i1 = 3;
          if (p0 != i1 && p0 != 5) {
             if (i == 1) {
                i1 = 5;
             }
             return i1;
          }
       }
       return p0;
    }
    public final int r(View p0,int p1){
       Toolbar$LayoutParams layoutParams = p0.getLayoutParams();
       int measuredHeig = p0.getMeasuredHeight();
       int i = 0;
       p1 = (p1 > 0)? (measuredHeig - p1) / 2: 0;
       int i1 = this.s(layoutParams.a);
       if (i1 != 48) {
          if (i1 != 80) {
             p1 = this.getPaddingTop();
             i1 = this.getPaddingBottom();
             int height = this.getHeight();
             int i2 = (((height - p1) - i1) - measuredHeig) / 2;
             ViewGroup$MarginLayoutParams topMargin = layoutParams.topMargin;
             if (i2 < topMargin) {
                i2 = topMargin;
             }else {
                height = (((height - i1) - measuredHeig) - i2) - p1;
                ViewGroup$MarginLayoutParams bottomMargin = layoutParams.bottomMargin;
                if (height < bottomMargin) {
                   i2 = Math.max(i, (i2 - (bottomMargin - height)));
                }
             }
             return (p1 + i2);
          }else {
             return ((((this.getHeight() - this.getPaddingBottom()) - measuredHeig) - layoutParams.bottomMargin) - p1);
          }
       }else {
          return (this.getPaddingTop() - p1);
       }
    }
    public final int s(int p0){
       p0 = p0 & 0x70;
       if (p0 != 16 && (p0 != 48 && p0 != 80)) {
          p0 = this.x & 0x70;
       }
    label_0012 :
       return p0;
    }
    public void setCollapseContentDescription(int p0){
       CharSequence text = (p0)? this.getContext().getText(p0): null;
       this.setCollapseContentDescription(text);
       return;
    }
    public void setCollapseContentDescription(CharSequence p0){
       if (!TextUtils.isEmpty(p0)) {
          this.g();
       }
       Toolbar ti = this.i;
       if (ti != null) {
          ti.setContentDescription(p0);
       }
       return;
    }
    public void setCollapseIcon(int p0){
       this.setCollapseIcon(a.d(this.getContext(), p0));
    }
    public void setCollapseIcon(Drawable p0){
       if (p0 != null) {
          this.g();
          this.i.setImageDrawable(p0);
       }else {
          Toolbar ti = this.i;
          if (ti != null) {
             ti.setImageDrawable(this.g);
          }
       }
       return;
    }
    public void setCollapsible(boolean p0){
       this.O = p0;
       this.requestLayout();
    }
    public void setContentInsetEndWithActions(int p0){
       if (p0 < 0) {
          p0 = Integer.MIN_VALUE;
       }
       if (p0 != this.w) {
          this.w = p0;
          if (this.getNavigationIcon() != null) {
             this.requestLayout();
          }
       }
       return;
    }
    public void setContentInsetStartWithNavigation(int p0){
       if (p0 < 0) {
          p0 = Integer.MIN_VALUE;
       }
       if (p0 != this.v) {
          this.v = p0;
          if (this.getNavigationIcon() != null) {
             this.requestLayout();
          }
       }
       return;
    }
    public void setLogo(int p0){
       this.setLogo(a.d(this.getContext(), p0));
    }
    public void setLogo(Drawable p0){
       Toolbar tf;
       if (p0 != null) {
          this.i();
          if (!this.z(this.f)) {
             this.c(this.f, true);
          }
       }else {
          tf = this.f;
          if (tf != null && this.z(tf)) {
             this.removeView(this.f);
             this.F.remove(this.f);
          }
       }
       tf = this.f;
       if (tf != null) {
          tf.setImageDrawable(p0);
       }
       return;
    }
    public void setLogoDescription(int p0){
       this.setLogoDescription(this.getContext().getText(p0));
    }
    public void setLogoDescription(CharSequence p0){
       if (!TextUtils.isEmpty(p0)) {
          this.i();
       }
       Toolbar tf = this.f;
       if (tf != null) {
          tf.setContentDescription(p0);
       }
       return;
    }
    public void setNavigationContentDescription(int p0){
       CharSequence text = (p0)? this.getContext().getText(p0): null;
       this.setNavigationContentDescription(text);
       return;
    }
    public void setNavigationContentDescription(CharSequence p0){
       if (!TextUtils.isEmpty(p0)) {
          this.l();
       }
       Toolbar te = this.e;
       if (te != null) {
          te.setContentDescription(p0);
       }
       return;
    }
    public void setNavigationIcon(int p0){
       this.setNavigationIcon(a.d(this.getContext(), p0));
    }
    public void setNavigationIcon(Drawable p0){
       Toolbar te;
       if (p0 != null) {
          this.l();
          if (!this.z(this.e)) {
             this.c(this.e, true);
          }
       }else {
          te = this.e;
          if (te != null && this.z(te)) {
             this.removeView(this.e);
             this.F.remove(this.e);
          }
       }
       te = this.e;
       if (te != null) {
          te.setImageDrawable(p0);
       }
       return;
    }
    public void setNavigationOnClickListener(View$OnClickListener p0){
       this.l();
       this.e.setOnClickListener(p0);
    }
    public void setOnMenuItemClickListener(Toolbar$e p0){
       this.H = p0;
    }
    public void setOverflowIcon(Drawable p0){
       this.j();
       this.b.setOverflowIcon(p0);
    }
    public void setPopupTheme(int p0){
       if (this.l != p0) {
          this.l = p0;
          this.k = (!p0)? this.getContext(): new ContextThemeWrapper(this.getContext(), p0);
       }
    label_001a :
       return;
    }
    public void setSubtitle(int p0){
       this.setSubtitle(this.getContext().getText(p0));
    }
    public void setSubtitle(CharSequence p0){
       Toolbar tB;
       if (!TextUtils.isEmpty(p0)) {
          if (this.d == null) {
             Context context = this.getContext();
             AppCompatTextView uAppCompatTe = new AppCompatTextView(context);
             this.d = uAppCompatTe;
             uAppCompatTe.setSingleLine();
             this.d.setEllipsize(TextUtils$TruncateAt.END);
             Toolbar tn = this.n;
             if (tn != null) {
                this.d.setTextAppearance(context, tn);
             }
             tB = this.B;
             if (tB != null) {
                this.d.setTextColor(tB);
             }
          }
          if (!this.z(this.d)) {
             this.c(this.d, true);
          }
       }else {
          tB = this.d;
          if (tB != null && this.z(tB)) {
             this.removeView(this.d);
             this.F.remove(this.d);
          }
       }
       tB = this.d;
       if (tB != null) {
          tB.setText(p0);
       }
       this.z = p0;
       return;
    }
    public void setSubtitleTextColor(int p0){
       this.setSubtitleTextColor(ColorStateList.valueOf(p0));
    }
    public void setSubtitleTextColor(ColorStateList p0){
       this.B = p0;
       Toolbar td = this.d;
       if (td != null) {
          td.setTextColor(p0);
       }
       return;
    }
    public void setTitle(int p0){
       this.setTitle(this.getContext().getText(p0));
    }
    public void setTitle(CharSequence p0){
       Toolbar tA;
       if (!TextUtils.isEmpty(p0)) {
          if (this.c == null) {
             Context context = this.getContext();
             AppCompatTextView uAppCompatTe = new AppCompatTextView(context);
             this.c = uAppCompatTe;
             uAppCompatTe.setSingleLine();
             this.c.setEllipsize(TextUtils$TruncateAt.END);
             Toolbar tm = this.m;
             if (tm != null) {
                this.c.setTextAppearance(context, tm);
             }
             tA = this.A;
             if (tA != null) {
                this.c.setTextColor(tA);
             }
          }
          if (!this.z(this.c)) {
             this.c(this.c, true);
          }
       }else {
          tA = this.c;
          if (tA != null && this.z(tA)) {
             this.removeView(this.c);
             this.F.remove(this.c);
          }
       }
       tA = this.c;
       if (tA != null) {
          tA.setText(p0);
       }
       this.y = p0;
       return;
    }
    public void setTitleMarginBottom(int p0){
       this.t = p0;
       this.requestLayout();
    }
    public void setTitleMarginEnd(int p0){
       this.r = p0;
       this.requestLayout();
    }
    public void setTitleMarginStart(int p0){
       this.q = p0;
       this.requestLayout();
    }
    public void setTitleMarginTop(int p0){
       this.s = p0;
       this.requestLayout();
    }
    public void setTitleTextColor(int p0){
       this.setTitleTextColor(ColorStateList.valueOf(p0));
    }
    public void setTitleTextColor(ColorStateList p0){
       this.A = p0;
       Toolbar tc = this.c;
       if (tc != null) {
          tc.setTextColor(p0);
       }
       return;
    }
    public final int t(View p0){
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       int i = o.b(layoutParams);
       return (i + o.a(layoutParams));
    }
    public final int u(View p0){
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       return (layoutParams.topMargin + layoutParams.bottomMargin);
    }
    public final int v(List p0,int[] p1){
       int i = p1[0];
       int i1 = p1[1];
       int i2 = p0.size();
       int i3 = 0;
       int i4 = 0;
       while (i3 < i2) {
          View view = p0.get(i3);
          Toolbar$LayoutParams layoutParams = view.getLayoutParams();
          int i5 = layoutParams.leftMargin - i;
          i = layoutParams.rightMargin - i1;
          i1 = Math.max(0, i5);
          int i6 = Math.max(0, i);
          i5 = - i5;
          i = - i;
          i1 = i1 + view.getMeasuredWidth();
          i1 = i1 + i6;
          i4 = i4 + i1;
          i3 = i3 + 1;
          i = Math.max(0, i5);
       }
       return i4;
    }
    public boolean w(){
       Toolbar tL = this.L;
       boolean b = (tL != null && tL.c != null)? true: false;
       return b;
    }
    public boolean x(){
       Toolbar tb = this.b;
       boolean b = (tb != null && tb.H())? true: false;
       return b;
    }
    public void y(int p0){
       this.getMenuInflater().inflate(p0, this.getMenu());
    }
    public final boolean z(View p0){
       boolean b = (p0.getParent() == this || this.F.contains(p0))? true: false;
       return b;
    }
}
