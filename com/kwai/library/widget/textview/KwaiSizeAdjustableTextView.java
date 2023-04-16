package com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import com.kwai.library.widget.textview.KwaiBaseTextView;
import android.content.Context;
import android.util.AttributeSet;
import tyc.g5;
import android.widget.TextView;
import ekd.n1;
import com.yxcorp.gifshow.widget.c;
import android.view.View;
import java.lang.CharSequence;
import com.yxcorp.utility.RadiusStyle;
import android.content.res.Resources;
import android.widget.TextView$BufferType;

public class KwaiSizeAdjustableTextView extends KwaiBaseTextView	// class@000a53
{
    public int n;
    public g5 o;
    public int p;

    public void KwaiSizeAdjustableTextView(Context p0){
       super(p0);
       this.t(p0, null);
    }
    public void KwaiSizeAdjustableTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.t(p0, p1);
    }
    public void KwaiSizeAdjustableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.t(p0, p1);
    }
    private void t(Context p0,AttributeSet p1){
       g5 og5 = new g5(this, p0, p1);
       this.o = og5;
       KwaiSizeAdjustableTextView tp = this.p;
       if (tp > null) {
          og5.i(tp);
       }
       this.n = n1.e(p0, p1, 0);
       return;
    }
    public c getAdjustingTextSizeFinder(){
       return this.o.e;
    }
    public int getBackgroundRadius(){
       return this.n;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       KwaiSizeAdjustableTextView tp = this.p;
       if (tp > null && (p3 - p1) > tp) {
          p3 = p1 + tp;
       }
       tp = this.o;
       if (tp != null) {
          tp.a(p0, p1, p2, p3, p4);
       }
       super.onLayout(p0, p1, p2, p3, p4);
       KwaiSizeAdjustableTextView tn = this.n;
       if (tn > null) {
          n1.c(this, tn);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       KwaiSizeAdjustableTextView to = this.o;
       if (to != null) {
          to.c(p0, p1, p2, p3);
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       KwaiSizeAdjustableTextView to = this.o;
       if (to != null) {
          to.d(p0, p1, p2, p3);
       }
       return;
    }
    public void setBackgroundRadius(RadiusStyle p0){
       this.n = (int)this.getContext().getResources().getDimension(p0.radiusId);
    }
    public void setInitTextSize(float p0){
       this.o.f(p0);
    }
    public void setLineSpacing(float p0,float p1){
       super.setLineSpacing(p0, p1);
       KwaiSizeAdjustableTextView to = this.o;
       if (to != null) {
          to.g(p0, p1);
       }
       return;
    }
    public void setMaxHeight(int p0){
       super.setMaxHeight(p0);
       KwaiSizeAdjustableTextView to = this.o;
       if (to != null) {
          to.h(p0);
       }
       return;
    }
    public void setMaxWidth(int p0){
       this.p = p0;
       super.setMaxWidth(p0);
       KwaiSizeAdjustableTextView to = this.o;
       if (to != null) {
          to.i(p0);
       }
       return;
    }
    public void setMinTextSize(float p0){
       this.o.e.e(p0);
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       super.setText(p0, p1);
       KwaiSizeAdjustableTextView to = this.o;
       if (to != null) {
          to.b();
       }
       return;
    }
    public void setTextSizeAdjustWithHeight(boolean p0){
       this.o.i = p0;
    }
    public void setTextSizeAdjustable(boolean p0){
       this.o.j(p0);
    }
    public void setTextSizeStepGranularity(float p0){
       this.o.e.f(p0);
    }
}
