package com.kwai.library.widget.edittext.VerificationCodeView;
import android.text.TextWatcher;
import android.view.View$OnKeyListener;
import android.view.View$OnFocusChangeListener;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.edittext.VerificationCodeView$a;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.edittext.VerificationCodeView$VCInputType;
import java.lang.Enum;
import com.kwai.library.widget.edittext.DelKeyEventEditText;
import com.kwai.library.widget.edittext.PasteTextEditText$a;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.EditText;
import android.text.InputFilter;
import android.text.InputFilter$LengthFilter;
import com.kwai.library.widget.edittext.VerificationCodeView$b;
import android.widget.TextView;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Exception;
import android.view.View;
import com.kwai.library.widget.edittext.PasteTextEditText;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.StringBuffer;
import java.lang.CharSequence;
import com.kwai.library.widget.edittext.VerificationCodeView$c;
import android.view.KeyEvent;
import java.lang.System;

public class VerificationCodeView extends LinearLayout implements TextWatcher, View$OnKeyListener, View$OnFocusChangeListener	// class@000931
{
    public Context b;
    public long c;
    public VerificationCodeView$c d;
    public PasteTextEditText$a e;
    public int f;
    public VerificationCodeView$VCInputType g;
    public int h;
    public int i;
    public float j;
    public int k;

    public void VerificationCodeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 0;
       this.e = new VerificationCodeView$a(this);
       this.b = p0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.U5);
       this.f = typedArray.getInteger(3, 4);
       this.g = VerificationCodeView$VCInputType.values()[typedArray.getInt(2, VerificationCodeView$VCInputType.NUMBER.ordinal())];
       this.h = typedArray.getDimensionPixelSize(6, 120);
       this.i = typedArray.getColor(4, 0xff000000);
       this.j = (float)typedArray.getDimensionPixelSize(5, 16);
       this.k = typedArray.getResourceId(1, 0x7f082554);
       this.setGravity(3);
       this.j = (float)typedArray.getDimensionPixelSize(5, 16);
       typedArray.recycle();
       int i = 0;
       while (i < this.f) {
          DelKeyEventEditText uDelKeyEvent = new DelKeyEventEditText(this.b, this.e);
          VerificationCodeView th = this.h;
          int i1 = th * 2;
          LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(th, i1);
          layoutParams.gravity = 17;
          uDelKeyEvent.setLayoutParams(layoutParams);
          uDelKeyEvent.setGravity(17);
          uDelKeyEvent.setId(i);
          uDelKeyEvent.setCursorVisible(1);
          uDelKeyEvent.setMaxEms(1);
          uDelKeyEvent.setTextColor(this.i);
          uDelKeyEvent.setTextSize(this.j);
          uDelKeyEvent.setMaxLines(1);
          InputFilter[] inputFilterA = new InputFilter[]{new InputFilter$LengthFilter(1)};
          uDelKeyEvent.setFilters(inputFilterA);
          int i2 = VerificationCodeView$b.a[this.g.ordinal()];
          if (i2 != 1) {
             if (i2 != 2) {
                if (i2 != 3) {
                   if (i2 != 4) {
                      uDelKeyEvent.setInputType(2);
                   }else {
                      uDelKeyEvent.setInputType(128);
                   }
                }else {
                   uDelKeyEvent.setInputType(1);
                }
             }else {
                uDelKeyEvent.setInputType(16);
             }
          }else {
             uDelKeyEvent.setInputType(2);
          }
          uDelKeyEvent.setPadding(0, 0, 0, 0);
          try{
             uDelKeyEvent.setOnKeyListener(this);
             Field declaredFiel = TextView.class.getDeclaredField("mCursorDrawableRes");
             declaredFiel.setAccessible(1);
             declaredFiel.set(uDelKeyEvent, Integer.valueOf(this.k));
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
          }
          uDelKeyEvent.addTextChangedListener(this);
          uDelKeyEvent.setOnFocusChangeListener(this);
          uDelKeyEvent.setSoftKeyListener(this);
          this.addView(uDelKeyEvent);
          if (!i) {
             uDelKeyEvent.setFocusable(1);
          }
          i = i + 1;
       }
       return;
    }
    public final void a(){
       PasteTextEditText childAt;
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return;
          }
          try{
             childAt = this.getChildAt(i);
             if (childAt.getText().length() < 1) {
                break ;
             }else {
                childAt.setCursorVisible(false);
             }
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
       childAt.setCursorVisible(true);
       childAt.requestFocus();
       return;
    }
    public void afterTextChanged(Editable p0){
       if (p0.length()) {
          this.a();
          if (this.getChildAt((this.f - 1)).getText().length() > 0) {
             StringBuffer str = "";
             for (int i = 0; i < this.f; i = i + 1) {
                str = str+this.getChildAt(i).getText();
             }
             VerificationCodeView td = this.d;
             if (td != null) {
                td.b(str);
             }
          }
       }
       return;
    }
    public void b(){
       int i = this.f - 1;
       while (i >= 0) {
          PasteTextEditText childAt = this.getChildAt(i);
          childAt.setText("");
          childAt.setCursorVisible(1);
          if (!i) {
             childAt.requestFocus();
          }
          i = i - 1;
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public VerificationCodeView$c getOnCodeFinishListener(){
       return this.d;
    }
    public void onFocusChange(View p0,boolean p1){
       if (p1) {
          this.a();
       }
       return;
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (p1 == 67 && !p2.getAction()) {
          long l = System.currentTimeMillis();
          int i = this.f - 1;
          while (i >= 0) {
             PasteTextEditText childAt = this.getChildAt(i);
             if (childAt.getText().length() >= 1) {
                long l1 = l - this.c;
                if (l1 - 100 > 0) {
                   childAt.setText("");
                   childAt.setCursorVisible(1);
                   childAt.requestFocus();
                   this.c = l;
                   break ;
                }
             }
             i--;
          }
       }
       return false;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void setEnabled(boolean p0){
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          this.getChildAt(i).setEnabled(p0);
       }
       return;
    }
    public void setOnCodeFinishListener(VerificationCodeView$c p0){
       this.d = p0;
    }
}
