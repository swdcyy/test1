package com.yxcorp.gifshow.album.widget.preview.KSAPassThroughEventView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;

public class KSAPassThroughEventView extends View	// class@001b1f
{
    public View b;
    public float c;
    public float d;
    public int e;

    public void KSAPassThroughEventView(Context p0){
       super(p0);
       this.a(p0);
    }
    public void KSAPassThroughEventView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public void KSAPassThroughEventView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSAPassThroughEventView.class, "1")) {
          return;
       }
       this.e = ViewConfiguration.get(p0).getScaledPagingTouchSlop();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       KSAPassThroughEventView obj = PatchProxy.applyOneRefs(p0, this, KSAPassThroughEventView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null) {
          obj.dispatchTouchEvent(p0);
       }
       if (!p0.getAction()) {
          this.c = p0.getX();
          this.d = p0.getY();
       }else if(p0.getAction() == 1){
          float f = Math.abs((p0.getY() - this.d));
          KSAPassThroughEventView te = this.e;
          if (Math.abs((p0.getX() - this.c)) - (float)te <= 0 && f - (float)te <= 0) {
             this.performClick();
          }
       }
       return true;
    }
    public void setUndersideView(View p0){
       this.b = p0;
    }
}
