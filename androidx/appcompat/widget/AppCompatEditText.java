package androidx.appcompat.widget.AppCompatEditText;
import a2.g0;
import android.widget.EditText;
import android.content.Context;
import android.util.AttributeSet;
import w0.v;
import android.view.View;
import w0.s;
import w0.b;
import androidx.appcompat.widget.b;
import android.widget.TextView;
import w0.i;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.text.Editable;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import android.view.textclassifier.TextClassifier;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import w0.e;
import android.graphics.drawable.Drawable;
import android.view.ActionMode$Callback;
import androidx.core.widget.b;

public class AppCompatEditText extends EditText implements g0	// class@0005e4
{
    public final b b;
    public final b c;
    public final i d;

    public void AppCompatEditText(Context p0){
       super(p0, null);
    }
    public void AppCompatEditText(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f04031d);
    }
    public void AppCompatEditText(Context p0,AttributeSet p1,int p2){
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
       AppCompatEditText tb = this.b;
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
       AppCompatEditText tb = this.b;
       ColorStateList uColorStateL = (tb != null)? tb.c(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       AppCompatEditText tb = this.b;
       PorterDuff$Mode mode = (tb != null)? tb.d(): null;
       return mode;
    }
    public Editable getText(){
       if (Build$VERSION.SDK_INT >= 28) {
          return super.getText();
       }
       return super.getEditableText();
    }
    public CharSequence getText(){
       return this.getText();
    }
    public TextClassifier getTextClassifier(){
       if (Build$VERSION.SDK_INT < 28) {
          AppCompatEditText td = this.d;
          if (td != null) {
             return td.a();
          }
       }
       return super.getTextClassifier();
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       e.a(inputConnect, p0, this);
       return inputConnect;
    }
    public void setBackgroundDrawable(Drawable p0){
       super.setBackgroundDrawable(p0);
       AppCompatEditText tb = this.b;
       if (tb != null) {
          tb.f(p0);
       }
       return;
    }
    public void setBackgroundResource(int p0){
       super.setBackgroundResource(p0);
       AppCompatEditText tb = this.b;
       if (tb != null) {
          tb.g(p0);
       }
       return;
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(b.t(this, p0));
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       AppCompatEditText tb = this.b;
       if (tb != null) {
          tb.i(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       AppCompatEditText tb = this.b;
       if (tb != null) {
          tb.j(p0);
       }
       return;
    }
    public void setTextAppearance(Context p0,int p1){
       super.setTextAppearance(p0, p1);
       AppCompatEditText tc = this.c;
       if (tc != null) {
          tc.q(p0, p1);
       }
       return;
    }
    public void setTextClassifier(TextClassifier p0){
       if (Build$VERSION.SDK_INT < 28) {
          AppCompatEditText td = this.d;
          if (td != null) {
             td.b(p0);
             return;
          }
       }
       super.setTextClassifier(p0);
       return;
    }
}
