package androidx.appcompat.widget.ScrollingTabContainerView$TabView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import android.content.Context;
import androidx.appcompat.app.ActionBar$c;
import android.util.AttributeSet;
import w0.x;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.TextUtils$TruncateAt;
import w0.y;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View$MeasureSpec;

public class ScrollingTabContainerView$TabView extends LinearLayout	// class@00060f
{
    public final int[] b;
    public ActionBar$c c;
    public TextView d;
    public ImageView e;
    public View f;
    public final ScrollingTabContainerView g;

    public void ScrollingTabContainerView$TabView(ScrollingTabContainerView p0,Context p1,ActionBar$c p2,boolean p3){
       this.g = p0;
       super(p1, null, 0x7f0400da);
       int[] ointArray = new int[]{0x10100d4};
       this.b = ointArray;
       this.c = p2;
       x ox = x.v(p1, null, ointArray, R.attr.arg_RES_7f0400da, 0);
       if (ox.s(0)) {
          this.setBackgroundDrawable(ox.g(0));
       }
       ox.w();
       if (p3) {
          this.setGravity(0x800013);
       }
       this.b();
       return;
    }
    public void a(ActionBar$c p0){
       this.c = p0;
       this.b();
    }
    public void b(){
       ScrollingTabContainerView$TabView tc = this.c;
       View view = tc.b();
       int i = 8;
       Drawable uDrawable = null;
       if (view != null) {
          ViewParent parent = view.getParent();
          if (parent != this) {
             if (parent != null) {
                parent.removeView(view);
             }
             this.addView(view);
          }
          this.f = view;
          tc = this.d;
          if (tc != null) {
             tc.setVisibility(i);
          }
          tc = this.e;
          if (tc != null) {
             tc.setVisibility(i);
             this.e.setImageDrawable(uDrawable);
          }
       }else {
          ScrollingTabContainerView$TabView tf = this.f;
          if (tf != null) {
             this.removeView(tf);
             this.f = uDrawable;
          }
          Drawable uDrawable1 = tc.c();
          CharSequence uCharSequenc = tc.f();
          if (uDrawable1 != null) {
             if (this.e == null) {
                AppCompatImageView uAppCompatIm = new AppCompatImageView(this.getContext());
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                uAppCompatIm.setLayoutParams(layoutParams);
                this.addView(uAppCompatIm, 0);
                this.e = uAppCompatIm;
             }
             this.e.setImageDrawable(uDrawable1);
             this.e.setVisibility(0);
          }else {
             tf = this.e;
             if (tf != null) {
                tf.setVisibility(i);
                this.e.setImageDrawable(uDrawable);
             }
          }
          int i1 = TextUtils.isEmpty(uCharSequenc) ^ 0x01;
          if (i1) {
             if (this.d == null) {
                AppCompatTextView uAppCompatTe = new AppCompatTextView(this.getContext(), uDrawable, 0x7f0400db);
                uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
                LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(-2, -2);
                layoutParams1.gravity = 16;
                uAppCompatTe.setLayoutParams(layoutParams1);
                this.addView(uAppCompatTe);
                this.d = uAppCompatTe;
             }
             this.d.setText(uCharSequenc);
             this.d.setVisibility(0);
          }else {
             ScrollingTabContainerView$TabView td = this.d;
             if (td != null) {
                td.setVisibility(i);
                this.d.setText(uDrawable);
             }
          }
          ScrollingTabContainerView$TabView te = this.e;
          if (te != null) {
             te.setContentDescription(tc.a());
          }
          if (!i1) {
             uDrawable = tc.a();
          }
          y.a(this, uDrawable);
       }
       return;
    }
    public ActionBar$c getTab(){
       return this.c;
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       p0.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       super.onInitializeAccessibilityNodeInfo(p0);
       p0.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (this.g.g > null) {
          ScrollingTabContainerView g = this.g.g;
          if (this.getMeasuredWidth() > g) {
             super.onMeasure(View$MeasureSpec.makeMeasureSpec(g, 0x40000000), p1);
          }
       }
       return;
    }
    public void setSelected(boolean p0){
       int i = (this.isSelected() != p0)? 1: 0;
       super.setSelected(p0);
       if (i && p0) {
          this.sendAccessibilityEvent(4);
       }
       return;
    }
}
