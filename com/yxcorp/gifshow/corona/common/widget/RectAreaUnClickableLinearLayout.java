package com.yxcorp.gifshow.corona.common.widget.RectAreaUnClickableLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.graphics.Rect;
import android.view.ViewGroup;

public class RectAreaUnClickableLinearLayout extends LinearLayout	// class@001284
{
    public Rect b;
    public float c;
    public float d;

    public void RectAreaUnClickableLinearLayout(Context p0){
       super(p0);
       this.c = 0x3f800000;
       this.d = 0x3f800000;
    }
    public void RectAreaUnClickableLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 0x3f800000;
       this.d = 0x3f800000;
    }
    public void RectAreaUnClickableLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 0x3f800000;
       this.d = 0x3f800000;
    }
    public void a(float p0,float p1){
       this.c = p0;
       this.d = p1;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, RectAreaUnClickableLinearLayout.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, this, RectAreaUnClickableLinearLayout.class, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.b != null){
          int i = (int)((float)this.getHeight() * this.d);
          if (this.b.width() <= (int)((float)this.getWidth() * this.c) && this.b.height() <= i) {
             b = true;
          }
       }
       b = false;
       if (b) {
          p0.getX();
          p0.getY();
          float x = p0.getX();
          float y = p0.getY();
          RectAreaUnClickableLinearLayout tb = this.b;
          if (x - (float)tb.left > 0 && (x - (float)tb.right < 0 && (y - (float)tb.top > 0 && y - (float)tb.bottom < 0))) {
             return true;
          }
       }
    label_0081 :
       return super.onInterceptTouchEvent(p0);
    }
    public void setBlockArea(Rect p0){
       this.b = p0;
    }
}
