package com.yxcorp.gifshow.follow.slide.detail.widget.SlideNumberTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Typeface;
import ekd.d0;

public class SlideNumberTextView extends TextView	// class@001145
{

    public void SlideNumberTextView(Context p0){
       super(p0);
       this.a();
    }
    public void SlideNumberTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void SlideNumberTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SlideNumberTextView.class, "1")) {
          return;
       }
       try{
          Typeface typeface = d0.a("alte-din.ttf", this.getContext());
          if (typeface != null) {
             if (this.getTypeface() != null) {
                this.setTypeface(typeface, this.getTypeface().getStyle());
             }else {
                this.setTypeface(typeface);
             }
          }
          return;
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
    }
}
