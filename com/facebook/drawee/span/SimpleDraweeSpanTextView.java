package com.facebook.drawee.span.SimpleDraweeSpanTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import bc.b;
import java.lang.CharSequence;
import android.widget.TextView$BufferType;

public class SimpleDraweeSpanTextView extends TextView	// class@001091
{
    public b b;
    public boolean c;

    public void SimpleDraweeSpanTextView(Context p0){
       super(p0);
       this.c = false;
    }
    public void SimpleDraweeSpanTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = false;
    }
    public void SimpleDraweeSpanTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = false;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.c = true;
       SimpleDraweeSpanTextView tb = this.b;
       if (tb != null) {
          tb.b(this);
       }
       return;
    }
    public void onDetachedFromWindow(){
       this.c = false;
       SimpleDraweeSpanTextView tb = this.b;
       if (tb != null) {
          tb.a(this);
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onFinishTemporaryDetach(){
       super.onFinishTemporaryDetach();
       this.c = true;
       SimpleDraweeSpanTextView tb = this.b;
       if (tb != null) {
          tb.b(this);
       }
       return;
    }
    public void onStartTemporaryDetach(){
       this.c = false;
       SimpleDraweeSpanTextView tb = this.b;
       if (tb != null) {
          tb.a(this);
       }
       super.onStartTemporaryDetach();
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       super.onTextChanged(p0, p1, p2, p3);
       SimpleDraweeSpanTextView tb = this.b;
       if (tb != null) {
          tb.a(this);
       }
       this.b = null;
       return;
    }
    public void setDraweeSpanStringBuilder(b p0){
       this.setText(p0, TextView$BufferType.SPANNABLE);
       this.b = p0;
       if (p0 != null && this.c != null) {
          p0.b(this);
       }
       return;
    }
}
