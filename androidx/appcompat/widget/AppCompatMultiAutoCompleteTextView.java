package androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import a2.g0;
import android.widget.MultiAutoCompleteTextView;
import android.content.Context;
import android.util.AttributeSet;
import w0.v;
import android.view.View;
import w0.s;
import w0.x;
import android.graphics.drawable.Drawable;
import w0.b;
import androidx.appcompat.widget.b;
import android.widget.TextView;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import w0.e;
import r0.a;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements g0	// class@0005e7
{
    public final b b;
    public final b c;
    public static final int[] d;

    static {
       int[] ointArray = new int[]{0x1010176};
       AppCompatMultiAutoCompleteTextView.d = ointArray;
    }
    public void AppCompatMultiAutoCompleteTextView(Context p0){
       super(p0, null);
    }
    public void AppCompatMultiAutoCompleteTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040126);
    }
    public void AppCompatMultiAutoCompleteTextView(Context p0,AttributeSet p1,int p2){
       v.a(p0);
       super(p0, p1, p2);
       s.a(this, this.getContext());
       x ox = x.v(this.getContext(), p1, AppCompatMultiAutoCompleteTextView.d, p2, 0);
       if (ox.s(0)) {
          this.setDropDownBackgroundDrawable(ox.g(0));
       }
       ox.w();
       b uob = new b(this);
       this.b = uob;
       uob.e(p1, p2);
       uob = new b(this);
       this.c = uob;
       uob.m(p1, p2);
       uob.b();
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       AppCompatMultiAutoCompleteTextView tb = this.b;
       if (tb != null) {
          tb.b();
       }
       tb = this.c;
       if (tb != null) {
          tb.b();
       }
       return;
    }
    public ColorStateList getSupportBackgroundTintList(){
       AppCompatMultiAutoCompleteTextView tb = this.b;
       ColorStateList uColorStateL = (tb != null)? tb.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       AppCompatMultiAutoCompleteTextView tb = this.b;
       PorterDuff$Mode mode = (tb != null)? tb.d(): null;
       return mode;
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       e.a(inputConnect, p0, this);
       return inputConnect;
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       AppCompatMultiAutoCompleteTextView tb = this.b;
       if (tb != null) {
          tb.f(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       AppCompatMultiAutoCompleteTextView tb = this.b;
       if (tb != null) {
          tb.g(p0);
       }
       return;
    }
    public void setDropDownBackgroundResource(int p0){
       this.setDropDownBackgroundDrawable(a.d(this.getContext(), p0));
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       AppCompatMultiAutoCompleteTextView tb = this.b;
       if (tb != null) {
          tb.i(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       AppCompatMultiAutoCompleteTextView tb = this.b;
       if (tb != null) {
          tb.j(p0);
       }
       return;
    }
    public void setTextAppearance(Context p0,int p1){
       super.setTextAppearance(p0, p1);
       AppCompatMultiAutoCompleteTextView tc = this.c;
       if (tc != null) {
          tc.q(p0, p1);
       }
       return;
    }
}