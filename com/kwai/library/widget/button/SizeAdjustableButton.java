package com.kwai.library.widget.button.SizeAdjustableButton;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Context;
import tyc.g5;
import android.widget.TextView;
import android.util.AttributeSet;
import android.widget.Button;
import android.view.View;
import ekd.n1;
import java.lang.CharSequence;
import android.widget.TextView$BufferType;

public class SizeAdjustableButton extends AppCompatButton	// class@000906
{
    public final g5 d;

    public void SizeAdjustableButton(Context p0){
       super(p0);
       this.d = new g5(this, p0, null);
    }
    public void SizeAdjustableButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new g5(this, p0, p1);
    }
    public void SizeAdjustableButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new g5(this, p0, p1);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       SizeAdjustableButton td = this.d;
       if (td != null) {
          td.a(p0, p1, p2, p3, p4);
       }
       super.onLayout(p0, p1, p2, p3, p4);
       n1.a(this, this.getMeasuredHeight());
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       SizeAdjustableButton td = this.d;
       if (td != null) {
          td.c(p0, p1, p2, p3);
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       SizeAdjustableButton td = this.d;
       if (td != null) {
          td.d(p0, p1, p2, p3);
       }
       return;
    }
    public void setInitTextSize(float p0){
       this.d.f(p0);
    }
    public void setLineSpacing(float p0,float p1){
       super.setLineSpacing(p0, p1);
       SizeAdjustableButton td = this.d;
       if (td != null) {
          td.g(p0, p1);
       }
       return;
    }
    public void setMaxHeight(int p0){
       super.setMaxHeight(p0);
       SizeAdjustableButton td = this.d;
       if (td != null) {
          td.h(p0);
       }
       return;
    }
    public void setMaxWidth(int p0){
       super.setMaxWidth(p0);
       SizeAdjustableButton td = this.d;
       if (td != null) {
          td.i(p0);
       }
       return;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       super.setText(p0, p1);
       SizeAdjustableButton td = this.d;
       if (td != null) {
          td.b();
       }
       return;
    }
    public void setTextSizeAdjustable(boolean p0){
       this.d.j(p0);
    }
}
