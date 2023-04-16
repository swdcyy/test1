package androidx.appcompat.widget.AppCompatTextView;
import a2.g0;
import e2.j;
import androidx.core.widget.a;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import w0.v;
import android.view.View;
import w0.s;
import w0.b;
import androidx.appcompat.widget.b;
import w0.i;
import androidx.core.widget.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import java.lang.CharSequence;
import android.view.textclassifier.TextClassifier;
import android.os.Build$VERSION;
import y1.c$a;
import java.lang.Object;
import java.util.concurrent.Future;
import y1.c;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import w0.e;
import android.graphics.drawable.Drawable;
import r0.a;
import android.view.ActionMode$Callback;
import android.graphics.Typeface;
import p1.e;

public class AppCompatTextView extends TextView implements g0, j, a	// class@0005f8
{
    public final b b;
    public final b c;
    public final i d;
    public Future e;

    public void AppCompatTextView(Context p0){
       super(p0, null);
    }
    public void AppCompatTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0x1010084);
    }
    public void AppCompatTextView(Context p0,AttributeSet p1,int p2){
       v.a(p0);
       super(p0, p1, p2);
       s.a(this, this.getContext());
       b uob = new b(this);
       this.b = uob;
       uob.e(p1, p2);
       uob = new b(this);
       this.c = uob;
       uob.m(p1, p2);
       uob.b();
       this.d = new i(this);
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       AppCompatTextView tb = this.b;
       if (tb != null) {
          tb.b();
       }
       tb = this.c;
       if (tb != null) {
          tb.b();
       }
       return;
    }
    public int getAutoSizeMaxTextSize(){
       if (a.a0) {
          return super.getAutoSizeMaxTextSize();
       }
       AppCompatTextView tc = this.c;
       if (tc != null) {
          return tc.e();
       }
       return -1;
    }
    public int getAutoSizeMinTextSize(){
       if (a.a0) {
          return super.getAutoSizeMinTextSize();
       }
       AppCompatTextView tc = this.c;
       if (tc != null) {
          return tc.f();
       }
       return -1;
    }
    public int getAutoSizeStepGranularity(){
       if (a.a0) {
          return super.getAutoSizeStepGranularity();
       }
       AppCompatTextView tc = this.c;
       if (tc != null) {
          return tc.g();
       }
       return -1;
    }
    public int[] getAutoSizeTextAvailableSizes(){
       if (a.a0) {
          return super.getAutoSizeTextAvailableSizes();
       }
       AppCompatTextView tc = this.c;
       if (tc != null) {
          return tc.h();
       }
       int[] ointArray = new int[0];
       return ointArray;
    }
    public int getAutoSizeTextType(){
       int i = 0;
       if (a.a0) {
          if (super.getAutoSizeTextType() == 1) {
             i = 1;
          }
          return i;
       }else {
          AppCompatTextView tc = this.c;
          if (tc != null) {
             return tc.i();
          }
          return i;
       }
    }
    public int getFirstBaselineToTopHeight(){
       return b.b(this);
    }
    public int getLastBaselineToBottomHeight(){
       return b.c(this);
    }
    public ColorStateList getSupportBackgroundTintList(){
       AppCompatTextView tb = this.b;
       ColorStateList uColorStateL = (tb != null)? tb.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       AppCompatTextView tb = this.b;
       PorterDuff$Mode mode = (tb != null)? tb.d(): null;
       return mode;
    }
    public ColorStateList getSupportCompoundDrawablesTintList(){
       return this.c.j();
    }
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode(){
       return this.c.k();
    }
    public CharSequence getText(){
       this.o();
       return super.getText();
    }
    public TextClassifier getTextClassifier(){
       if (Build$VERSION.SDK_INT < 28) {
          AppCompatTextView td = this.d;
          if (td != null) {
             return td.a();
          }
       }
       return super.getTextClassifier();
    }
    public c$a getTextMetricsParamsCompat(){
       return b.g(this);
    }
    public final void o(){
       try{
          AppCompatTextView te = this.e;
          if (te != null) {
             Future uFuture = null;
             this.e = uFuture;
             b.q(this, te.get());
          }
       label_0010 :
          return;
       }catch(java.lang.InterruptedException e0){
       }catch(java.util.concurrent.ExecutionException e0){
       }
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       e.a(inputConnect, p0, this);
       return inputConnect;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       AppCompatTextView tc = this.c;
       if (tc != null) {
          tc.o(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       this.o();
       super.onMeasure(p0, p1);
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       super.onTextChanged(p0, p1, p2, p3);
       AppCompatTextView tc = this.c;
       if (tc != null && (!a.a0 && tc.l())) {
          this.c.c();
       }
    label_0016 :
       return;
    }
    public void setAutoSizeTextTypeUniformWithConfiguration(int p0,int p1,int p2,int p3){
       if (a.a0) {
          super.setAutoSizeTextTypeUniformWithConfiguration(p0, p1, p2, p3);
       }else {
          AppCompatTextView tc = this.c;
          if (tc != null) {
             tc.s(p0, p1, p2, p3);
          }
       }
       return;
    }
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] p0,int p1){
       if (a.a0) {
          super.setAutoSizeTextTypeUniformWithPresetSizes(p0, p1);
       }else {
          AppCompatTextView tc = this.c;
          if (tc != null) {
             tc.t(p0, p1);
          }
       }
       return;
    }
    public void setAutoSizeTextTypeWithDefaults(int p0){
       if (a.a0) {
          super.setAutoSizeTextTypeWithDefaults(p0);
       }else {
          AppCompatTextView tc = this.c;
          if (tc != null) {
             tc.u(p0);
          }
       }
       return;
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       AppCompatTextView tb = this.b;
       if (tb != null) {
          tb.f(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       AppCompatTextView tb = this.b;
       if (tb != null) {
          tb.g(p0);
       }
       return;
    }
    public void setCompoundDrawables(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       super.setCompoundDrawables(p0, p1, p2, p3);
       AppCompatTextView tc = this.c;
       if (tc != null) {
          tc.p();
       }
       return;
    }
    public void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       super.setCompoundDrawablesRelative(p0, p1, p2, p3);
       AppCompatTextView tc = this.c;
       if (tc != null) {
          tc.p();
       }
       return;
    }
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int p0,int p1,int p2,int p3){
       Context context = this.getContext();
       Drawable uDrawable = null;
       Drawable uDrawable1 = (p0)? a.d(context, p0): uDrawable;
       Drawable uDrawable2 = (p1)? a.d(context, p1): uDrawable;
       Drawable uDrawable3 = (p2)? a.d(context, p2): uDrawable;
       if (p3) {
          uDrawable = a.d(context, p3);
       }
       this.setCompoundDrawablesRelativeWithIntrinsicBounds(uDrawable1, uDrawable2, uDrawable3, uDrawable);
       AppCompatTextView tc = this.c;
       if (tc != null) {
          tc.p();
       }
       return;
    }
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       super.setCompoundDrawablesRelativeWithIntrinsicBounds(p0, p1, p2, p3);
       AppCompatTextView tc = this.c;
       if (tc != null) {
          tc.p();
       }
       return;
    }
    public void setCompoundDrawablesWithIntrinsicBounds(int p0,int p1,int p2,int p3){
       Context context = this.getContext();
       Drawable uDrawable = null;
       Drawable uDrawable1 = (p0)? a.d(context, p0): uDrawable;
       Drawable uDrawable2 = (p1)? a.d(context, p1): uDrawable;
       Drawable uDrawable3 = (p2)? a.d(context, p2): uDrawable;
       if (p3) {
          uDrawable = a.d(context, p3);
       }
       this.setCompoundDrawablesWithIntrinsicBounds(uDrawable1, uDrawable2, uDrawable3, uDrawable);
       AppCompatTextView tc = this.c;
       if (tc != null) {
          tc.p();
       }
       return;
    }
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       super.setCompoundDrawablesWithIntrinsicBounds(p0, p1, p2, p3);
       AppCompatTextView tc = this.c;
       if (tc != null) {
          tc.p();
       }
       return;
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(b.t(this, p0));
    }
    public void setFirstBaselineToTopHeight(int p0){
       if (Build$VERSION.SDK_INT >= 28) {
          super.setFirstBaselineToTopHeight(p0);
       }else {
          b.n(this, p0);
       }
       return;
    }
    public void setLastBaselineToBottomHeight(int p0){
       if (Build$VERSION.SDK_INT >= 28) {
          super.setLastBaselineToBottomHeight(p0);
       }else {
          b.o(this, p0);
       }
       return;
    }
    public void setLineHeight(int p0){
       b.p(this, p0);
    }
    public void setPrecomputedText(c p0){
       b.q(this, p0);
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       AppCompatTextView tb = this.b;
       if (tb != null) {
          tb.i(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       AppCompatTextView tb = this.b;
       if (tb != null) {
          tb.j(p0);
       }
       return;
    }
    public void setSupportCompoundDrawablesTintList(ColorStateList p0){
       this.c.v(p0);
       this.c.b();
    }
    public void setSupportCompoundDrawablesTintMode(PorterDuff$Mode p0){
       this.c.w(p0);
       this.c.b();
    }
    public void setTextAppearance(Context p0,int p1){
       super.setTextAppearance(p0, p1);
       AppCompatTextView tc = this.c;
       if (tc != null) {
          tc.q(p0, p1);
       }
       return;
    }
    public void setTextClassifier(TextClassifier p0){
       if (Build$VERSION.SDK_INT < 28) {
          AppCompatTextView td = this.d;
          if (td != null) {
             td.b(p0);
             return;
          }
       }
       super.setTextClassifier(p0);
       return;
    }
    public void setTextFuture(Future p0){
       this.e = p0;
       if (p0 != null) {
          this.requestLayout();
       }
       return;
    }
    public void setTextMetricsParamsCompat(c$a p0){
       b.s(this, p0);
    }
    public void setTextSize(int p0,float p1){
       if (a.a0) {
          super.setTextSize(p0, p1);
       }else {
          AppCompatTextView tc = this.c;
          if (tc != null) {
             tc.z(p0, p1);
          }
       }
       return;
    }
    public void setTypeface(Typeface p0,int p1){
       Typeface typeface = (p0 != null && p1 > 0)? e.a(this.getContext(), p0, p1): null;
       if (typeface != null) {
          p0 = typeface;
       }
       super.setTypeface(p0, p1);
       return;
    }
}
