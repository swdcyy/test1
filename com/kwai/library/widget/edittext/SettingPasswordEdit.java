package com.kwai.library.widget.edittext.SettingPasswordEdit;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.CharSequence;
import android.widget.EditText;
import android.widget.TextView;
import oz6.a;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.InputFilter$LengthFilter;
import com.kwai.library.widget.edittext.a;
import android.text.TextWatcher;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.lang.String;
import android.text.Editable;
import java.lang.Object;
import com.kwai.library.widget.edittext.SettingPasswordEdit$a;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;

public class SettingPasswordEdit extends RelativeLayout	// class@000929
{
    public EditText b;
    public Context c;
    public LinearLayout d;
    public TextView[] e;
    public int f;
    public int g;
    public SettingPasswordEdit$a h;

    public void SettingPasswordEdit(Context p0){
       super(p0, null);
    }
    public void SettingPasswordEdit(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SettingPasswordEdit(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = 0;
       this.g = 4;
       this.c = p0;
    }
    public void a(){
       this.b.setText("");
       for (int i = 0; i < this.g; i = i + 1) {
          this.e[i].setEnabled(true);
       }
       return;
    }
    public void b(a p0){
       this.g = p0.f;
       EditText uEditText = new EditText(this.c);
       this.b = uEditText;
       uEditText.setBackgroundDrawable(null);
       this.b.setCursorVisible(false);
       this.b.setTextSize(0);
       this.b.setLongClickable(false);
       this.b.setInputType(2);
       InputFilter[] inputFilterA = new InputFilter[]{new InputFilter$LengthFilter(this.g)};
       this.b.setFilters(inputFilterA);
       this.b.addTextChangedListener(new a(this));
       int i = -1;
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i, i);
       layoutParams.addRule(12, i);
       this.addView(this.b, layoutParams);
       LinearLayout linearLayout = new LinearLayout(this.c);
       this.d = linearLayout;
       linearLayout.setBackgroundDrawable(null);
       int i1 = -2;
       this.d.setLayoutParams(new RelativeLayout$LayoutParams(i1, i));
       this.d.setOrientation(false);
       this.addView(this.d);
       TextView[] textViewArra = new TextView[this.g];
       this.e = textViewArra;
       int i2 = (p0.b() > 0)? p0.b(): -2;
       if (p0.a() > 0) {
          i1 = p0.a();
       }
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(i2, i1);
       layoutParams1.gravity = 17;
       LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams(false, i);
       layoutParams2.weight = 0x3f800000;
       i = 0;
       while (i < this.e.length) {
          TextView textView = new TextView(this.c);
          textView.setGravity(17);
          SettingPasswordEdit te = this.e;
          te[i] = textView;
          te[i].setTextSize((float)p0.e);
          this.e[i].setIncludeFontPadding(false);
          this.e[i].setTextColor(this.c.getResources().getColor(p0.d));
          this.e[i].setBackgroundResource(p0.a);
          this.e[i].setEnabled(1);
          this.e[i].setInputType(18);
          if (p0.c() != null) {
             this.e[i].setTypeface(p0.c());
          }
          this.d.addView(textView, layoutParams1);
          int i3 = this.e.length - 1;
          if (i < i3) {
             this.d.addView(new View(this.c), layoutParams2);
          }
          i = i + 1;
       }
       this.setPasswordType(p0.g);
       return;
    }
    public void c(int p0,int p1,int p2,int p3,int p4){
       a uoa = new a();
       uoa.d(p0);
       uoa.g(p1);
       uoa.e(p2);
       uoa.h(p3);
       uoa.i(p4);
       uoa.j(0);
       this.b(uoa);
    }
    public void d(){
       this.b.requestFocus();
       this.b.setFocusable(true);
    }
    public EditText getEditText(){
       return this.b;
    }
    public String getPassword(){
       SettingPasswordEdit tb = this.b;
       if (tb != null) {
          return (tb.getText().toString()).trim();
       }
       return "";
    }
    public void setInputType(int p0){
       this.b.setInputType(p0);
       int len = this.e.length;
       for (int i = 0; i < len; i = i + 1) {
          this.e[i].setInputType(p0);
       }
       return;
    }
    public void setOnTextFinishListener(SettingPasswordEdit$a p0){
       this.h = p0;
    }
    public void setPasswordType(int p0){
       this.f = p0;
       SettingPasswordEdit te = this.e;
       int len = te.length;
       int i = 0;
       while (i < len) {
          object oobject = te[i];
          SettingPasswordEdit tf = this.f;
          if (tf != 1) {
             if (tf == 2) {
                oobject.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
             }
          }else {
             oobject.setTransformationMethod(PasswordTransformationMethod.getInstance());
          }
          i = i + 1;
       }
       return;
    }
}
