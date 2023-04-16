package androidx.appcompat.widget.AppCompatCheckBox;
import e2.i;
import a2.g0;
import android.widget.CheckBox;
import android.content.Context;
import android.util.AttributeSet;
import w0.v;
import android.view.View;
import w0.s;
import w0.c;
import android.widget.CompoundButton;
import w0.b;
import androidx.appcompat.widget.b;
import android.widget.TextView;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import r0.a;

public class AppCompatCheckBox extends CheckBox implements i, g0	// class@0005e2
{
    public final c b;
    public final b c;
    public final b d;

    public void AppCompatCheckBox(Context p0){
       super(p0, null);
    }
    public void AppCompatCheckBox(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0401bc);
    }
    public void AppCompatCheckBox(Context p0,AttributeSet p1,int p2){
       v.a(p0);
       super(p0, p1, p2);
       s.a(this, this.getContext());
       c uoc = new c(this);
       this.b = uoc;
       uoc.e(p1, p2);
       b uob = new b(this);
       this.c = uob;
       uob.e(p1, p2);
       uob = new b(this);
       this.d = uob;
       uob.m(p1, p2);
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       AppCompatCheckBox tc = this.c;
       if (tc != null) {
          tc.b();
       }
       tc = this.d;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public int getCompoundPaddingLeft(){
       int compoundPadd = super.getCompoundPaddingLeft();
       AppCompatCheckBox tb = this.b;
       if (tb != null) {
          tb.b(compoundPadd);
       }
       return compoundPadd;
    }
    public ColorStateList getSupportBackgroundTintList(){
       AppCompatCheckBox tc = this.c;
       ColorStateList uColorStateL = (tc != null)? tc.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       AppCompatCheckBox tc = this.c;
       PorterDuff$Mode mode = (tc != null)? tc.d(): null;
       return mode;
    }
    public ColorStateList getSupportButtonTintList(){
       AppCompatCheckBox tb = this.b;
       ColorStateList uColorStateL = (tb != null)? tb.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportButtonTintMode(){
       AppCompatCheckBox tb = this.b;
       PorterDuff$Mode mode = (tb != null)? tb.d(): null;
       return mode;
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       AppCompatCheckBox tc = this.c;
       if (tc != null) {
          tc.f(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       AppCompatCheckBox tc = this.c;
       if (tc != null) {
          tc.g(p0);
       }
       return;
    }
    public void setButtonDrawable(int p0){
       this.setButtonDrawable(a.d(this.getContext(), p0));
    }
    public void setButtonDrawable(Drawable p0){
       super.setButtonDrawable(p0);
       AppCompatCheckBox tb = this.b;
       if (tb != null) {
          tb.f();
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       AppCompatCheckBox tc = this.c;
       if (tc != null) {
          tc.i(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       AppCompatCheckBox tc = this.c;
       if (tc != null) {
          tc.j(p0);
       }
       return;
    }
    public void setSupportButtonTintList(ColorStateList p0){
       AppCompatCheckBox tb = this.b;
       if (tb != null) {
          tb.g(p0);
       }
       return;
    }
    public void setSupportButtonTintMode(PorterDuff$Mode p0){
       AppCompatCheckBox tb = this.b;
       if (tb != null) {
          tb.h(p0);
       }
       return;
    }
}
