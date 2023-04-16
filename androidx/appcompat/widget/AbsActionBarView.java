package androidx.appcompat.widget.AbsActionBarView;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AbsActionBarView$a;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View$MeasureSpec;
import java.lang.Math;
import a2.m0;
import a2.i0;
import a2.n0;
import android.content.res.Configuration;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.appcompat.widget.ActionMenuPresenter;
import android.view.MotionEvent;

public abstract class AbsActionBarView extends ViewGroup	// class@0005bc
{
    public final AbsActionBarView$a b;
    public final Context c;
    public ActionMenuView d;
    public ActionMenuPresenter e;
    public int f;
    public m0 g;
    public boolean h;
    public boolean i;

    public void AbsActionBarView(Context p0){
       super(p0, null);
    }
    public void AbsActionBarView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AbsActionBarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new AbsActionBarView$a(this);
       TypedValue typedValue = new TypedValue();
       this.c = (p0.getTheme().resolveAttribute(0x7f0400d5, typedValue, true) && typedValue.resourceId != null)? new ContextThemeWrapper(p0, typedValue.resourceId): p0;
       return;
    }
    public static void a(AbsActionBarView p0,int p1){
       super.setVisibility(p1);
    }
    public static void b(AbsActionBarView p0,int p1){
       super.setVisibility(p1);
    }
    public static int d(int p0,int p1,boolean p2){
       p0 = (p2)? p0 - p1: p0 + p1;
       return p0;
    }
    public int c(View p0,int p1,int p2,int p3){
       p0.measure(View$MeasureSpec.makeMeasureSpec(p1, Integer.MIN_VALUE), p2);
       return Math.max(0, ((p1 - p0.getMeasuredWidth()) - p3));
    }
    public int e(View p0,int p1,int p2,int p3,boolean p4){
       int measuredWidt = p0.getMeasuredWidth();
       int measuredHeig = p0.getMeasuredHeight();
       p2 = p2 + ((p3 - measuredHeig) / 2);
       if (p4) {
          p0.layout((p1 - measuredWidt), p2, p1, (measuredHeig + p2));
       }else {
          p0.layout(p1, p2, (p1 + measuredWidt), (measuredHeig + p2));
       }
       if (p4) {
          measuredWidt = - measuredWidt;
       }
       return measuredWidt;
    }
    public m0 f(int p0,long p1){
       AbsActionBarView tb;
       AbsActionBarView tg = this.g;
       if (tg != null) {
          tg.b();
       }
       float f = 0;
       if (!p0) {
          if (this.getVisibility()) {
             this.setAlpha(f);
          }
          m0 om0 = i0.c(this);
          om0.a(0x3f800000);
          om0.d(p1);
          tb = this.b;
          tb.d(om0, p0);
          om0.f(tb);
          return om0;
       }else {
          m0 om01 = i0.c(this);
          om01.a(f);
          om01.d(p1);
          tb = this.b;
          tb.d(om01, p0);
          om01.f(tb);
          return om01;
       }
    }
    public int getAnimatedVisibility(){
       if (this.g != null) {
          return this.b.b;
       }
       return this.getVisibility();
    }
    public int getContentHeight(){
       return this.f;
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       TypedArray typedArray = this.getContext().obtainStyledAttributes(null, c$b.c, R.attr.arg_RES_7f0400d8, 0);
       this.setContentHeight(typedArray.getLayoutDimension(13, 0));
       typedArray.recycle();
       AbsActionBarView te = this.e;
       if (te != null) {
          te.B(p0);
       }
       return;
    }
    public boolean onHoverEvent(MotionEvent p0){
       int actionMasked = p0.getActionMasked();
       if (actionMasked == 9) {
          this.i = false;
       }
       if (this.i == null) {
          boolean b = super.onHoverEvent(p0);
          if (actionMasked == 9 && !b) {
             this.i = true;
          }
       }
       if (actionMasked == 10 || actionMasked == 3) {
          this.i = false;
       }
       return true;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int actionMasked = p0.getActionMasked();
       if (!actionMasked) {
          this.h = false;
       }
       if (this.h == null) {
          boolean b = super.onTouchEvent(p0);
          if (!actionMasked && !b) {
             this.h = true;
          }
       }
       if (actionMasked == 1 || actionMasked == 3) {
          this.h = false;
       }
       return true;
    }
    public void setContentHeight(int p0){
       this.f = p0;
       this.requestLayout();
    }
    public void setVisibility(int p0){
       if (p0 != this.getVisibility()) {
          AbsActionBarView tg = this.g;
          if (tg != null) {
             tg.b();
          }
          super.setVisibility(p0);
       }
       return;
    }
}
