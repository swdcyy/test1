package com.frog.engine.view.FrogKeyBoardView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.frog.engine.keyboard.KeyBoardShowParam;
import java.lang.CharSequence;
import android.text.InputFilter;
import android.text.InputFilter$LengthFilter;
import java.util.Objects;

public class FrogKeyBoardView extends FrameLayout	// class@001593
{
    public EditText mEditText;
    public TextView mTextView;

    public void FrogKeyBoardView(Context p0){
       super(p0);
       this.init(p0);
    }
    public void FrogKeyBoardView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.init(p0);
    }
    public void FrogKeyBoardView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.init(p0);
    }
    public EditText getEditText(){
       return this.mEditText;
    }
    public TextView getTextView(){
       return this.mTextView;
    }
    public final void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogKeyBoardView.class, "1")) {
          return;
       }
       View view = a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d053a, this, false);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
       layoutParams.gravity = 80;
       this.addView(view, layoutParams);
       this.mEditText = view.findViewById(0x7f0a0ca2);
       this.mTextView = view.findViewById(0x7f0a3c21);
       return;
    }
    public void setParam(KeyBoardShowParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogKeyBoardView.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.mEditText.setText(p0.defaultValue);
          int i = 1;
          InputFilter[] inputFilterA = new InputFilter[i];
          inputFilterA[0] = new InputFilter$LengthFilter(p0.maxLength);
          this.mEditText.setFilters(inputFilterA);
          this.mEditText.setSingleLine((p0.multiple ^ i));
          p0 = p0.confirmType;
          Objects.requireNonNull(p0);
          switch (p0.hashCode()){
              case 0xc9fa65a8:
                if (p0.equals("search")) {
                   i = 0;
                }
                break;
              case 3304:
                if (p0.equals("go")) {
                }
                break;
              case 0x2f2382:
                if (p0.equals("done")) {
                   i = 2;
                }
                break;
              case 0x338af3:
                if (p0.equals("next")) {
                   i = 3;
                }
                break;
              case 0x35cf88:
                if (p0.equals("send")) {
                   i = 4;
                }
                break;
              default:
             label_003b :
                i = -1;
          }
          switch (i){
              case 0:
                this.mTextView.setText(R.string.arg_RES_7f1010fa);
                break;
              case 1:
                this.mTextView.setText(R.string.arg_RES_7f1010f8);
                break;
              case 2:
                this.mTextView.setText(R.string.arg_RES_7f1010f7);
                break;
              case 3:
                this.mTextView.setText(R.string.arg_RES_7f1010f9);
                break;
              case 4:
                this.mTextView.setText(R.string.arg_RES_7f1010fb);
                break;
              default:
          }
       }
       return;
    }
}
