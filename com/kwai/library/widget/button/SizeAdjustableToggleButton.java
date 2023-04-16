package com.kwai.library.widget.button.SizeAdjustableToggleButton;
import androidx.appcompat.widget.AppCompatToggleButton;
import android.content.Context;
import tyc.g5;
import android.widget.TextView;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import android.view.View;
import ekd.n1;
import java.lang.CharSequence;
import android.widget.TextView$BufferType;

public class SizeAdjustableToggleButton extends AppCompatToggleButton	// class@000908
{
    public final g5 c;

    public void SizeAdjustableToggleButton(Context p0){
       super(p0);
       this.c = new g5(this, p0, null);
    }
    public void SizeAdjustableToggleButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new g5(this, p0, p1);
    }
    public void SizeAdjustableToggleButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new g5(this, p0, p1);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       SizeAdjustableToggleButton tc = this.c;
       if (tc != null) {
          tc.a(p0, p1, p2, p3, p4);
       }
       super.onLayout(p0, p1, p2, p3, p4);
       n1.a(this, this.getMeasuredHeight());
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       SizeAdjustableToggleButton tc = this.c;
       if (tc != null) {
          tc.c(p0, p1, p2, p3);
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       SizeAdjustableToggleButton tc = this.c;
       if (tc != null) {
          tc.d(p0, p1, p2, p3);
       }
       return;
    }
    public void setInitTextSize(float p0){
       this.c.f(p0);
    }
    public void setLineSpacing(float p0,float p1){
       super.setLineSpacing(p0, p1);
       SizeAdjustableToggleButton tc = this.c;
       if (tc != null) {
          tc.g(p0, p1);
       }
       return;
    }
    public void setMaxHeight(int p0){
       super.setMaxHeight(p0);
       SizeAdjustableToggleButton tc = this.c;
       if (tc != null) {
          tc.h(p0);
       }
       return;
    }
    public void setMaxWidth(int p0){
       super.setMaxWidth(p0);
       SizeAdjustableToggleButton tc = this.c;
       if (tc != null) {
          tc.i(p0);
       }
       return;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       super.setText(p0, p1);
       SizeAdjustableToggleButton tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void setTextSizeAdjustable(boolean p0){
       this.c.j(p0);
    }
}
