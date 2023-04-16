package com.kuaishou.live.common.core.basic.widget.LiveProfileContainerView;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.GestureDetector;
import android.view.ViewGroup;

public class LiveProfileContainerView extends RelativeLayout	// class@000f22
{
    public Bitmap b;
    public boolean c;
    public int d;
    public Rect e;
    public GestureDetector f;

    public void LiveProfileContainerView(Context p0){
       super(p0, null);
    }
    public void LiveProfileContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveProfileContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = false;
       this.setWillNotDraw(false);
       this.setDrawingCacheEnabled(true);
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileContainerView.class, "3")) {
          return;
       }
       if (this.c != null && this.b != null) {
          LiveProfileContainerView te = this.e;
          te.left = 0;
          te.top = this.getHeight() - this.d;
          te.right = this.getWidth();
          te.bottom = this.getHeight();
          p0.drawBitmap(this.b, (float)te.left, (float)te.top, null);
          return;
       }else {
          try{
             super.draw(p0);
             return;
          }catch(java.lang.IndexOutOfBoundsException e0){
          }
       }
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       LiveProfileContainerView obj = PatchProxy.applyOneRefs(p0, this, LiveProfileContainerView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       if (obj != null) {
          obj.onTouchEvent(p0);
       }
       return super.onInterceptHoverEvent(p0);
    }
    public void setGestureDetector(GestureDetector p0){
       this.f = p0;
    }
}
