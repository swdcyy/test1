package androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AbsActionBarView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import w0.x;
import android.graphics.drawable.Drawable;
import android.view.View;
import a2.i0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import java.lang.CharSequence;
import u0.b;
import android.view.LayoutInflater;
import ag6.a;
import android.view.ViewParent;
import androidx.appcompat.widget.ActionBarContextView$a;
import android.view.View$OnClickListener;
import android.view.Menu;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import w0.b0;
import android.view.View$MeasureSpec;
import java.lang.Math;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class ActionBarContextView extends AbsActionBarView	// class@0005bf
{
    public CharSequence j;
    public CharSequence k;
    public View l;
    public View m;
    public LinearLayout n;
    public TextView o;
    public TextView p;
    public int q;
    public int r;
    public boolean s;
    public int t;

    public void ActionBarContextView(Context p0){
       super(p0, null);
    }
    public void ActionBarContextView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0400ee);
    }
    public void ActionBarContextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       x ox = x.v(p0, p1, c$b.f, p2, 0);
       i0.v0(this, ox.g(0));
       this.q = ox.n(5, 0);
       this.r = ox.n(4, 0);
       this.f = ox.m(3, 0);
       this.t = ox.n(2, 0x7f0d0005);
       ox.w();
    }
    public void g(){
       if (this.l == null) {
          this.k();
       }
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new ViewGroup$MarginLayoutParams(-1, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new ViewGroup$MarginLayoutParams(this.getContext(), p0);
    }
    public int getAnimatedVisibility(){
       return super.getAnimatedVisibility();
    }
    public int getContentHeight(){
       return super.getContentHeight();
    }
    public CharSequence getSubtitle(){
       return this.k;
    }
    public CharSequence getTitle(){
       return this.j;
    }
    public void h(b p0){
       ActionBarContextView tl = this.l;
       if (tl == null) {
          View view = a.c(LayoutInflater.from(this.getContext()), this.t, this, false);
          this.l = view;
          this.addView(view);
       }else if(tl.getParent() == null){
          this.addView(this.l);
       }
       this.l.findViewById(R.id.action_mode_close_button).setOnClickListener(new ActionBarContextView$a(this, p0));
       e uoe = p0.e();
       AbsActionBarView te = this.e;
       if (te != null) {
          te.u();
       }
       ActionMenuPresenter uActionMenuP = new ActionMenuPresenter(this.getContext());
       this.e = uActionMenuP;
       uActionMenuP.F(true);
       uoe.c(this.e, this.c);
       ActionMenuView uActionMenuV = this.e.m(this);
       this.d = uActionMenuV;
       i0.v0(uActionMenuV, null);
       this.addView(this.d, new ViewGroup$LayoutParams(-2, -1));
       return;
    }
    public final void i(){
       if (this.n == null) {
          LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d0000, this);
          LinearLayout childAt = this.getChildAt((this.getChildCount() - 1));
          this.n = childAt;
          this.o = childAt.findViewById(0x7f0a0091);
          this.p = this.n.findViewById(0x7f0a0090);
          if (this.q != null) {
             this.o.setTextAppearance(this.getContext(), this.q);
          }
          if (this.r != null) {
             this.p.setTextAppearance(this.getContext(), this.r);
          }
       }
       this.o.setText(this.j);
       this.p.setText(this.k);
       int i = TextUtils.isEmpty(this.j) ^ 0x01;
       int i1 = TextUtils.isEmpty(this.k) ^ 0x01;
       ActionBarContextView tp = this.p;
       int i2 = 0;
       int i3 = (i1)? 0: 8;
       tp.setVisibility(i3);
       tp = this.n;
       if (!i && !i1) {
          i2 = 8;
       }
       tp.setVisibility(i2);
       if (this.n.getParent() == null) {
          this.addView(this.n);
       }
       return;
    }
    public boolean j(){
       return this.s;
    }
    public void k(){
       this.removeAllViews();
       this.m = null;
       this.d = null;
    }
    public boolean l(){
       AbsActionBarView te = this.e;
       if (te != null) {
          return te.G();
       }
       return false;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       AbsActionBarView te = this.e;
       if (te != null) {
          te.x();
          this.e.y();
       }
       return;
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       if (p0.getEventType() == 32) {
          p0.setSource(this);
          p0.setClassName(this.getClass().getName());
          p0.setPackageName(this.getContext().getPackageName());
          p0.setContentDescription(this.j);
       }else {
          super.onInitializeAccessibilityEvent(p0);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       ViewGroup$MarginLayoutParams layoutParams;
       p0 = b0.b(this);
       int i = (p0)? (p3 - p1) - this.getPaddingRight(): this.getPaddingLeft();
       int paddingTop = this.getPaddingTop();
       p2 = ((p4 - p2) - this.getPaddingTop()) - this.getPaddingBottom();
       ActionBarContextView tl = this.l;
       if (tl != null && tl.getVisibility() != 8) {
          layoutParams = this.l.getLayoutParams();
          ViewGroup$MarginLayoutParams rightMargin = (p0)? layoutParams.rightMargin: layoutParams.leftMargin;
          layoutParams = (p0)? layoutParams.leftMargin: layoutParams.rightMargin;
          int i1 = AbsActionBarView.d(i, rightMargin, p0);
          i = AbsActionBarView.d((i1 + this.e(this.l, i1, paddingTop, p2, p0)), layoutParams, p0);
       }
       layoutParams = i;
       ActionBarContextView i2 = this.n;
       if (i2 != null && (this.m == null && i2.getVisibility() != 8)) {
          layoutParams = layoutParams + this.e(this.n, layoutParams, paddingTop, p2, p0);
       }
    label_0073 :
       int i3 = layoutParams;
       ActionBarContextView tm = this.m;
       if (tm != null) {
          this.e(tm, i3, paddingTop, p2, p0);
       }
       int i4 = (p0)? this.getPaddingLeft(): (p3 - p1) - this.getPaddingRight();
       AbsActionBarView td = this.d;
       if (td != null) {
          this.e(td, i4, paddingTop, p2, (p0 ^ 0x01));
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       ActionBarContextView tn;
       int childCount;
       int i = 0x40000000;
       if (View$MeasureSpec.getMode(p0) != i) {
          throw new IllegalStateException(this.getClass().getSimpleName()+" can only be used with android:layout_width=\"match_parent\" \(or fill_parent\)");
       }
       if (!View$MeasureSpec.getMode(p1)) {
          throw new IllegalStateException(this.getClass().getSimpleName()+" can only be used with android:layout_height=\"wrap_content\"");
       }
       p0 = View$MeasureSpec.getSize(p0);
       AbsActionBarView tf = this.f;
       if (tf <= null) {
          childCount = View$MeasureSpec.getSize(p1);
       }
       p1 = this.getPaddingTop() + this.getPaddingBottom();
       int i1 = (p0 - this.getPaddingLeft()) - this.getPaddingRight();
       int i2 = tf - p1;
       int i3 = View$MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
       ActionBarContextView tl = this.l;
       int i4 = 0;
       if (tl != null) {
          ViewGroup$MarginLayoutParams layoutParams = this.l.getLayoutParams();
          i1 = this.c(tl, i1, i3, i4) - (layoutParams.leftMargin + layoutParams.rightMargin);
       }
       AbsActionBarView td = this.d;
       if (td != null && td.getParent() == this) {
          i1 = this.c(this.d, i1, i3, i4);
       }
       tl = this.n;
       if (tl != null && this.m == null) {
          if (this.s != null) {
             this.n.measure(View$MeasureSpec.makeMeasureSpec(i4, i4), i3);
             i3 = this.n.getMeasuredWidth();
             td = (i3 <= i1)? 1: 0;
             if (td) {
                i1 = i1 - i3;
             }
             tn = this.n;
             int i5 = (td)? 0: 8;
             tn.setVisibility(i5);
          }else {
             i1 = this.c(tl, i1, i3, i4);
          }
       }
       tn = this.m;
       if (tn != null) {
          ViewGroup$LayoutParams layoutParams1 = tn.getLayoutParams();
          ViewGroup$LayoutParams width = layoutParams1.width;
          int i6 = (width != -2)? 0x40000000: Integer.MIN_VALUE;
          if (width >= null) {
             i1 = Math.min(width, i1);
          }
          layoutParams1 = layoutParams1.height;
          if (layoutParams1 == -2) {
             i = Integer.MIN_VALUE;
          }
          if (layoutParams1 >= null) {
             i2 = Math.min(layoutParams1, i2);
          }
          this.m.measure(View$MeasureSpec.makeMeasureSpec(i1, i6), View$MeasureSpec.makeMeasureSpec(i2, i));
       }
       if (this.f <= null) {
          childCount = this.getChildCount();
          i = 0;
          while (i4 < childCount) {
             i1 = this.getChildAt(i4).getMeasuredHeight() + p1;
             if (i1 > i) {
                i = i1;
             }
             i4 = i4 + 1;
          }
          this.setMeasuredDimension(p0, i);
       }else {
          this.setMeasuredDimension(p0, tf);
       }
       return;
    }
    public void setContentHeight(int p0){
       this.f = p0;
    }
    public void setCustomView(View p0){
       ActionBarContextView tm = this.m;
       if (tm != null) {
          this.removeView(tm);
       }
       this.m = p0;
       if (p0 != null) {
          tm = this.n;
          if (tm != null) {
             this.removeView(tm);
             this.n = null;
          }
       }
       if (p0 != null) {
          this.addView(p0);
       }
       this.requestLayout();
       return;
    }
    public void setSubtitle(CharSequence p0){
       this.k = p0;
       this.i();
    }
    public void setTitle(CharSequence p0){
       this.j = p0;
       this.i();
    }
    public void setTitleOptional(boolean p0){
       if (p0 != this.s) {
          this.requestLayout();
       }
       this.s = p0;
       return;
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
    }
    public boolean shouldDelayChildPressedState(){
       return false;
    }
}
