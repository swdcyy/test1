package com.yxcorp.gifshow.detail.slideplay.SlidePlayNumberTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Typeface;
import ekd.d0;

public class SlidePlayNumberTextView extends TextView	// class@001719
{

    public void SlidePlayNumberTextView(Context p0){
       super(p0);
       this.a();
    }
    public void SlidePlayNumberTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void SlidePlayNumberTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SlidePlayNumberTextView.class, "1")) {
          return;
       }
       this.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       return;
    }
}
