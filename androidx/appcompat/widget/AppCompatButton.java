package androidx.appcompat.widget.AppCompatButton;
import a2.g0;
import androidx.core.widget.a;
import e2.j;
import android.widget.Button;
import android.content.Context;
import android.util.AttributeSet;
import w0.v;
import android.view.View;
import w0.s;
import w0.b;
import androidx.appcompat.widget.b;
import android.widget.TextView;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.view.accessibility.AccessibilityEvent;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.drawable.Drawable;
import android.view.ActionMode$Callback;
import androidx.core.widget.b;

public class AppCompatButton extends Button implements g0, a, j	// class@0005e1
{
    public final b b;
    public final b c;

    public void AppCompatButton(Context p0){
       super(p0, null);
    }
    public void AppCompatButton(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04019f);
    }
    public void AppCompatButton(Context p0,AttributeSet p1,int p2){
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
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       AppCompatButton tb = this.b;
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
       AppCompatButton tc = this.c;
       if (tc != null) {
          return tc.e();
       }
       return -1;
    }
    public int getAutoSizeMinTextSize(){
       if (a.a0) {
          return super.getAutoSizeMinTextSize();
       }
       AppCompatButton tc = this.c;
       if (tc != null) {
          return tc.f();
       }
       return -1;
    }
    public int getAutoSizeStepGranularity(){
       if (a.a0) {
          return super.getAutoSizeStepGranularity();
       }
       AppCompatButton tc = this.c;
       if (tc != null) {
          return tc.g();
       }
       return -1;
    }
    public int[] getAutoSizeTextAvailableSizes(){
       if (a.a0) {
          return super.getAutoSizeTextAvailableSizes();
       }
       AppCompatButton tc = this.c;
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
          AppCompatButton tc = this.c;
          if (tc != null) {
             return tc.i();
          }
          return i;
       }
    }
    public ColorStateList getSupportBackgroundTintList(){
       AppCompatButton tb = this.b;
       ColorStateList uColorStateL = (tb != null)? tb.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       AppCompatButton tb = this.b;
       PorterDuff$Mode mode = (tb != null)? tb.d(): null;
       return mode;
    }
    public ColorStateList getSupportCompoundDrawablesTintList(){
       return this.c.j();
    }
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode(){
       return this.c.k();
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       p0.setClassName(Button.class.getName());
    }
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       super.onInitializeAccessibilityNodeInfo(p0);
       p0.setClassName(Button.class.getName());
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       AppCompatButton tc = this.c;
       if (tc != null) {
          tc.o(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       super.onTextChanged(p0, p1, p2, p3);
       AppCompatButton tc = this.c;
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
          AppCompatButton tc = this.c;
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
          AppCompatButton tc = this.c;
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
          AppCompatButton tc = this.c;
          if (tc != null) {
             tc.u(p0);
          }
       }
       return;
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       AppCompatButton tb = this.b;
       if (tb != null) {
          tb.f(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       AppCompatButton tb = this.b;
       if (tb != null) {
          tb.g(p0);
       }
       return;
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(b.t(this, p0));
    }
    public void setSupportAllCaps(boolean p0){
       AppCompatButton tc = this.c;
       if (tc != null) {
          tc.r(p0);
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       AppCompatButton tb = this.b;
       if (tb != null) {
          tb.i(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       AppCompatButton tb = this.b;
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
       AppCompatButton tc = this.c;
       if (tc != null) {
          tc.q(p0, p1);
       }
       return;
    }
    public void setTextSize(int p0,float p1){
       if (a.a0) {
          super.setTextSize(p0, p1);
       }else {
          AppCompatButton tc = this.c;
          if (tc != null) {
             tc.z(p0, p1);
          }
       }
       return;
    }
}
