package com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestSeekBar;
import android.widget.SeekBar;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestSeekBar$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uw9.o;
import java.lang.StringBuilder;
import java.lang.Math;
import q87.c;
import android.view.ViewParent;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestSeekBar$b;
import android.view.View;

public class InterestSeekBar extends SeekBar	// class@001743
{
    public InterestSeekBar$b b;
    public float c;
    public float d;
    public boolean e;

    public void InterestSeekBar(Context p0){
       super(p0, null);
    }
    public void InterestSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void InterestSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = false;
       this.setOnSeekBarChangeListener(new InterestSeekBar$a(this));
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, InterestSeekBar.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          float f = 0;
          if (action != 1) {
             if (action != 0.00f) {
                if (action == 3) {
                label_00be :
                   this.e = false;
                   this.c = f;
                   this.d = f;
                }
             }else if(this.c - f && this.d - f){
                float x = p0.getX();
                float y = p0.getY();
                Object[] objArray = new Object[false];
                o.C().w("JaySong", "dx:"+Math.abs((x - this.c))+"  dy:"+Math.abs((y - this.d)), objArray);
                if (Math.abs((x - this.c)) - f >= 0 && Math.abs((x - this.c)) - Math.abs((y - this.d)) >= 0) {
                   this.getParent().requestDisallowInterceptTouchEvent(true);
                   this.e = false;
                }else {
                   this.getParent().requestDisallowInterceptTouchEvent(false);
                   this.e = true;
                }
                if (x - this.c) {
                   this.c = f;
                   this.d = f;
                }
                if (this.e != null) {
                   PatchProxy.onMethodExit(InterestSeekBar.class, "1");
                   return false;
                }
             }
          }else if(this.e != null){
             PatchProxy.onMethodExit(InterestSeekBar.class, "1");
             return false;
          }else {
             goto label_00be ;
          }
          if (p0.getX() - (((float)this.getWidth() / 100.00f) * 20.00f) <= 0) {
             this.setProgress(20);
             if (p0.getAction() == 1) {
                InterestSeekBar tb = this.b;
                if (tb != null) {
                   tb.onStopTrackingTouch(this);
                }
             }
             PatchProxy.onMethodExit(InterestSeekBar.class, "1");
             return false;
          }else {
             PatchProxy.onMethodExit(InterestSeekBar.class, "1");
             return super.dispatchTouchEvent(p0);
          }
       }else {
          this.getParent().requestDisallowInterceptTouchEvent(true);
          this.c = p0.getX();
          this.d = p0.getY();
          this.e = false;
          PatchProxy.onMethodExit(InterestSeekBar.class, "1");
          return super.dispatchTouchEvent(p0);
       }
    }
    public void setSeekBarChangeListener(InterestSeekBar$b p0){
       this.b = p0;
    }
}
