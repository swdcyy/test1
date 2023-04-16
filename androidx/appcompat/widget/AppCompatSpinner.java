package androidx.appcompat.widget.AppCompatSpinner;
import a2.g0;
import android.widget.Spinner;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import android.graphics.Rect;
import android.view.View;
import w0.s;
import ll8.c$b;
import w0.x;
import w0.b;
import u0.d;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatSpinner$e;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ListPopupWindow;
import java.lang.String;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatSpinner$a;
import androidx.appcompat.widget.AppCompatSpinner$c;
import android.widget.ArrayAdapter;
import java.lang.Object;
import android.widget.SpinnerAdapter;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatSpinner$f;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import android.view.View$BaseSavedState;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.MotionEvent;
import w0.m;
import android.widget.Adapter;
import androidx.appcompat.widget.AppCompatSpinner$d;
import android.widget.ListAdapter;
import r0.a;

public class AppCompatSpinner extends Spinner implements g0	// class@0005f7
{
    public final b b;
    public final Context c;
    public m d;
    public SpinnerAdapter e;
    public final boolean f;
    public AppCompatSpinner$f g;
    public int h;
    public final Rect i;
    public static final int[] j;

    static {
       int[] ointArray = new int[]{0x10102f1};
       AppCompatSpinner.j = ointArray;
    }
    public void AppCompatSpinner(Context p0){
       super(p0, null);
    }
    public void AppCompatSpinner(Context p0,int p1){
       super(p0, null, 0x7f04085a, p1);
    }
    public void AppCompatSpinner(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04085a);
    }
    public void AppCompatSpinner(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, -1);
    }
    public void AppCompatSpinner(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3, null);
    }
    public void AppCompatSpinner(Context p0,AttributeSet p1,int p2,int p3,Resources$Theme p4){
       TypedArray typedArray;
       super(p0, p1, p2);
       this.i = new Rect();
       s.a(this, this.getContext());
       int i = 0;
       x ox = x.v(p0, p1, c$b.p5, p2, i);
       this.b = new b(this);
       int i1 = ox.n(4, i);
       this.c = (i1)? new d(p0, i1): p0;
       if (p3 == -1) {
          try{
             typedArray = p0.obtainStyledAttributes(p1, AppCompatSpinner.j, p2, i);
             try{
                if (typedArray.hasValue(i)) {
                   p3 = typedArray.getInt(i, i);
                }
                typedArray.recycle();
             }catch(java.lang.Exception e0){
             }
             if (typedArray) {
                goto label_0054 ;
             }
          }catch(java.lang.Exception e0){
             typedArray = null;
             goto label_0052 ;
          }
       }
       i1 = 2;
       if (p3) {
          if (p3 == 1) {
             AppCompatSpinner$e uoe = new AppCompatSpinner$e(this, this.c, p1, p2);
             x ox1 = x.v(this.c, p1, c$b.p5, p2, e0);
             this.h = ox1.m(3, -2);
             uoe.e(ox1.g(1));
             uoe.o(ox.o(i1));
             ox1.w();
             this.g = uoe;
             this.d = new AppCompatSpinner$a(this, this, uoe);
          }
       }else {
          AppCompatSpinner$c uoc = new AppCompatSpinner$c(this);
          this.g = uoc;
          uoc.o(ox.o(i1));
       }
       CharSequence[] uCharSequenc = ox.q(e0);
       if (uCharSequenc != null) {
          ArrayAdapter uArrayAdapte = new ArrayAdapter(p0, 0x1090008, uCharSequenc);
          uArrayAdapte.setDropDownViewResource(R.layout.arg_RES_7f0d1580);
          this.setAdapter(uArrayAdapte);
       }
       ox.w();
       this.f = true;
       AppCompatSpinner te = this.e;
       if (te != null) {
          this.setAdapter(te);
          this.e = null;
       }
       this.b.e(p1, p2);
       return;
    }
    public int a(SpinnerAdapter p0,Drawable p1){
       int i = 0;
       if (p0 == null) {
          return i;
       }
       int i1 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), i);
       int i2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), i);
       int i3 = Math.max(i, this.getSelectedItemPosition());
       int i4 = Math.min(p0.getCount(), (i3 + 15));
       View view = null;
       i3 = 0;
       for (int i5 = Math.max(i, (i3 - ((i4 - i3) - 15))); i5 < i4; i5 = i5 + 1) {
          int itemViewType = p0.getItemViewType(i5);
          if (itemViewType != i) {
             view = null;
             i = itemViewType;
          }
          view = p0.getView(i5, view, this);
          if (view.getLayoutParams() == null) {
             view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
          }
          view.measure(i1, i2);
          i3 = Math.max(i3, view.getMeasuredWidth());
       }
       if (p1 != null) {
          p1.getPadding(this.i);
          AppCompatSpinner ti = this.i;
          i3 = i3 + (ti.left + ti.right);
       }
       return i3;
    }
    public void b(){
       this.g.h(this.getTextDirection(), this.getTextAlignment());
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       AppCompatSpinner tb = this.b;
       if (tb != null) {
          tb.b();
       }
       return;
    }
    public int getDropDownHorizontalOffset(){
       AppCompatSpinner tg = this.g;
       if (tg != null) {
          return tg.m();
       }
       return super.getDropDownHorizontalOffset();
    }
    public int getDropDownVerticalOffset(){
       AppCompatSpinner tg = this.g;
       if (tg != null) {
          return tg.l();
       }
       return super.getDropDownVerticalOffset();
    }
    public int getDropDownWidth(){
       if (this.g != null) {
          return this.h;
       }
       return super.getDropDownWidth();
    }
    public final AppCompatSpinner$f getInternalPopup(){
       return this.g;
    }
    public Drawable getPopupBackground(){
       AppCompatSpinner tg = this.g;
       if (tg != null) {
          return tg.f();
       }
       return super.getPopupBackground();
    }
    public Context getPopupContext(){
       return this.c;
    }
    public CharSequence getPrompt(){
       AppCompatSpinner tg = this.g;
       CharSequence uCharSequenc = (tg != null)? tg.g(): super.getPrompt();
       return uCharSequenc;
    }
    public ColorStateList getSupportBackgroundTintList(){
       AppCompatSpinner tb = this.b;
       ColorStateList uColorStateL = (tb != null)? tb.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       AppCompatSpinner tb = this.b;
       PorterDuff$Mode mode = (tb != null)? tb.d(): null;
       return mode;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       AppCompatSpinner tg = this.g;
       if (tg != null && tg.d()) {
          this.g.dismiss();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (this.g != null && View$MeasureSpec.getMode(p0) == Integer.MIN_VALUE) {
          this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View$MeasureSpec.getSize(p0)), this.getMeasuredHeight());
       }
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       super.onRestoreInstanceState(p0.getSuperState());
       if (p0.b != null) {
          ViewTreeObserver viewTreeObse = this.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.addOnGlobalLayoutListener(new AppCompatSpinner$b(this));
          }
       }
       return;
    }
    public Parcelable onSaveInstanceState(){
       AppCompatSpinner$SavedState savedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
       AppCompatSpinner tg = this.g;
       boolean b = (tg != null && tg.d())? true: false;
       savedState.b = b;
       return savedState;
    }
    public boolean onTouchEvent(MotionEvent p0){
       AppCompatSpinner td = this.d;
       if (td != null && td.onTouch(this, p0)) {
          return true;
       }
       return super.onTouchEvent(p0);
    }
    public boolean performClick(){
       AppCompatSpinner tg = this.g;
       if (tg == null) {
          return super.performClick();
       }
       if (!tg.d()) {
          this.b();
       }
       return true;
    }
    public void setAdapter(Adapter p0){
       this.setAdapter(p0);
    }
    public void setAdapter(SpinnerAdapter p0){
       if (this.f == null) {
          this.e = p0;
          return;
       }else {
          super.setAdapter(p0);
          if (this.g != null) {
             AppCompatSpinner tc = this.c;
             if (tc == null) {
                tc = this.getContext();
             }
             this.g.q(new AppCompatSpinner$d(p0, tc.getTheme()));
          }
          return;
       }
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       AppCompatSpinner tb = this.b;
       if (tb != null) {
          tb.f(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       AppCompatSpinner tb = this.b;
       if (tb != null) {
          tb.g(p0);
       }
       return;
    }
    public void setDropDownHorizontalOffset(int p0){
       AppCompatSpinner tg = this.g;
       if (tg != null) {
          tg.k(p0);
          this.g.n(p0);
       }else {
          super.setDropDownHorizontalOffset(p0);
       }
       return;
    }
    public void setDropDownVerticalOffset(int p0){
       AppCompatSpinner tg = this.g;
       if (tg != null) {
          tg.j(p0);
       }else {
          super.setDropDownVerticalOffset(p0);
       }
       return;
    }
    public void setDropDownWidth(int p0){
       if (this.g != null) {
          this.h = p0;
       }else {
          super.setDropDownWidth(p0);
       }
       return;
    }
    public void setPopupBackgroundDrawable(Drawable p0){
       AppCompatSpinner tg = this.g;
       if (tg != null) {
          tg.e(p0);
       }else {
          super.setPopupBackgroundDrawable(p0);
       }
       return;
    }
    public void setPopupBackgroundResource(int p0){
       this.setPopupBackgroundDrawable(a.d(this.getPopupContext(), p0));
    }
    public void setPrompt(CharSequence p0){
       AppCompatSpinner tg = this.g;
       if (tg != null) {
          tg.o(p0);
       }else {
          super.setPrompt(p0);
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       AppCompatSpinner tb = this.b;
       if (tb != null) {
          tb.i(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       AppCompatSpinner tb = this.b;
       if (tb != null) {
          tb.j(p0);
       }
       return;
    }
}
