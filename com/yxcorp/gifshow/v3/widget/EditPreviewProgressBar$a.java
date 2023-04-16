package com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar$a;
import android.view.GestureDetector$OnGestureListener;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.v3.f;
import java.lang.Float;
import faa.a;
import q87.c;
import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;
import java.lang.Math;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar$b;

public class EditPreviewProgressBar$a implements GestureDetector$OnGestureListener	// class@001637
{
    public final EditPreviewProgressBar b;

    public void EditPreviewProgressBar$a(EditPreviewProgressBar p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       EditPreviewProgressBar$a obj = PatchProxy.applyOneRefs(p0, this, EditPreviewProgressBar$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       obj.g = 0;
       obj.f = false;
       obj.i = f.H(p0, obj.h);
       return true;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(EditPreviewProgressBar$a.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, EditPreviewProgressBar$a.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       EditPreviewProgressBar$a tb = this.b;
       if (tb.f != null && tb.d != null) {
          Object[] objArray = new Object[0];
          a.D().w("EditPreviewProgressBar", "tracking: onfling tracking stop", objArray);
          tb = this.b;
          tb.d.onStopTrackingTouch(tb);
       }
       tb.f = false;
       return 0;
    }
    public void onLongPress(MotionEvent p0){
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(EditPreviewProgressBar$a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, EditPreviewProgressBar$a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != null && (p1 != null && p0.getPointerId(0) != p1.getPointerId(0))) {
          return 0;
       }else if(this.b.h.getVisibility()){
          return 0;
       }else {
          EditPreviewProgressBar$a tb = this.b;
          if (tb.i == null) {
             return 0;
          }else if(tb.f == null && tb.d != null){
             Object[] objArray = new Object[0];
             a.D().w("EditPreviewProgressBar", "tracking: onscroll tracking start", objArray);
             tb = this.b;
             tb.d.onStartTrackingTouch(tb);
          }
          tb = this.b;
          tb.f = true;
          tb.g = tb.g + p2;
          EditPreviewProgressBar$a tb1 = this.b;
          int i = Math.round(((float)tb.getProgress() - ((tb1.g / (float)tb1.getWidth()) * (float)this.b.getMax())));
          if (i != this.b.getProgress()) {
             this.b.setProgress(i);
             tb = this.b;
             tb.g = 0;
             EditPreviewProgressBar d = tb.d;
             if (d != null) {
                d.onProgressChanged(tb, tb.getProgress(), true);
             }
          }
          return 0;
       }
    }
    public void onShowPress(MotionEvent p0){
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, EditPreviewProgressBar$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       EditPreviewProgressBar$a tb = this.b;
       tb.f = false;
       EditPreviewProgressBar d = tb.d;
       if (d != null) {
          return d.b();
       }
       return false;
    }
}
