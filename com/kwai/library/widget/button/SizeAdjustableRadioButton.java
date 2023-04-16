package com.kwai.library.widget.button.SizeAdjustableRadioButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import android.content.Context;
import tyc.g5;
import android.widget.TextView;
import android.util.AttributeSet;
import java.lang.CharSequence;
import android.widget.TextView$BufferType;

public class SizeAdjustableRadioButton extends AppCompatRadioButton	// class@000907
{
    public final g5 e;

    public void SizeAdjustableRadioButton(Context p0){
       super(p0);
       this.e = new g5(this, p0, null);
    }
    public void SizeAdjustableRadioButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = new g5(this, p0, p1);
    }
    public void SizeAdjustableRadioButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new g5(this, p0, p1);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       SizeAdjustableRadioButton te = this.e;
       if (te != null) {
          te.a(p0, p1, p2, p3, p4);
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       SizeAdjustableRadioButton te = this.e;
       if (te != null) {
          te.c(p0, p1, p2, p3);
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       SizeAdjustableRadioButton te = this.e;
       if (te != null) {
          te.d(p0, p1, p2, p3);
       }
       return;
    }
    public void setInitTextSize(float p0){
       this.e.f(p0);
    }
    public void setLineSpacing(float p0,float p1){
       super.setLineSpacing(p0, p1);
       SizeAdjustableRadioButton te = this.e;
       if (te != null) {
          te.g(p0, p1);
       }
       return;
    }
    public void setMaxHeight(int p0){
       super.setMaxHeight(p0);
       SizeAdjustableRadioButton te = this.e;
       if (te != null) {
          te.h(p0);
       }
       return;
    }
    public void setMaxWidth(int p0){
       super.setMaxWidth(p0);
       SizeAdjustableRadioButton te = this.e;
       if (te != null) {
          te.i(p0);
       }
       return;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       super.setText(p0, p1);
       SizeAdjustableRadioButton te = this.e;
       if (te != null) {
          te.b();
       }
       return;
    }
    public void setTextSizeAdjustable(boolean p0){
       this.e.j(p0);
    }
}
