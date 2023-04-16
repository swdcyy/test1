package androidx.appcompat.widget.AppCompatRadioButton;
import e2.i;
import a2.g0;
import android.widget.RadioButton;
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

public class AppCompatRadioButton extends RadioButton implements i, g0	// class@0005e9
{
    public final c b;
    public final b c;
    public final b d;

    public void AppCompatRadioButton(Context p0){
       super(p0, null);
    }
    public void AppCompatRadioButton(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040731);
    }
    public void AppCompatRadioButton(Context p0,AttributeSet p1,int p2){
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
       AppCompatRadioButton tc = this.c;
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
       AppCompatRadioButton tb = this.b;
       if (tb != null) {
          tb.b(compoundPadd);
       }
       return compoundPadd;
    }
    public ColorStateList getSupportBackgroundTintList(){
       AppCompatRadioButton tc = this.c;
       ColorStateList uColorStateL = (tc != null)? tc.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       AppCompatRadioButton tc = this.c;
       PorterDuff$Mode mode = (tc != null)? tc.d(): null;
       return mode;
    }
    public ColorStateList getSupportButtonTintList(){
       AppCompatRadioButton tb = this.b;
       ColorStateList uColorStateL = (tb != null)? tb.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportButtonTintMode(){
       AppCompatRadioButton tb = this.b;
       PorterDuff$Mode mode = (tb != null)? tb.d(): null;
       return mode;
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       AppCompatRadioButton tc = this.c;
       if (tc != null) {
          tc.f(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       AppCompatRadioButton tc = this.c;
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
       AppCompatRadioButton tb = this.b;
       if (tb != null) {
          tb.f();
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       AppCompatRadioButton tc = this.c;
       if (tc != null) {
          tc.i(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       AppCompatRadioButton tc = this.c;
       if (tc != null) {
          tc.j(p0);
       }
       return;
    }
    public void setSupportButtonTintList(ColorStateList p0){
       AppCompatRadioButton tb = this.b;
       if (tb != null) {
          tb.g(p0);
       }
       return;
    }
    public void setSupportButtonTintMode(PorterDuff$Mode p0){
       AppCompatRadioButton tb = this.b;
       if (tb != null) {
          tb.h(p0);
       }
       return;
    }
}
