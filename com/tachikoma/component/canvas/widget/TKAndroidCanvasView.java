package com.tachikoma.component.canvas.widget.TKAndroidCanvasView;
import android.view.View;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iq8.r;
import android.graphics.Canvas;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.tachikoma.component.canvas.widget.TKAndroidCanvasView$a;
import java.lang.Integer;

public class TKAndroidCanvasView extends View	// class@000cdf
{
    public boolean b;
    public TKAndroidCanvasView$a c;
    public final RectF d;
    public final Rect e;
    public Paint f;
    public Paint g;
    public int h;
    public float i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;

    public void TKAndroidCanvasView(Context p0){
       super(p0);
       this.d = new RectF();
       this.e = new Rect();
       this.m = true;
       this.a();
    }
    public void TKAndroidCanvasView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new RectF();
       this.e = new Rect();
       this.m = true;
       this.a();
    }
    public void TKAndroidCanvasView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new RectF();
       this.e = new Rect();
       this.m = true;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, TKAndroidCanvasView.class, "1")) {
          return;
       }
       r.a();
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, TKAndroidCanvasView.class, "6")) {
          return;
       }
       super.onAttachedToWindow();
       this.l = true;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, TKAndroidCanvasView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       this.l = false;
       return;
    }
    public void onDraw(Canvas p0){
       TKAndroidCanvasView obj;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAndroidCanvasView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (this.b == null) {
          return;
       }
       if (this.m != null) {
          obj = PatchProxy.apply(null, this, TKAndroidCanvasView.class, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(this.k == null || this.l == null){
             b = false;
          }else {
             b = this.getGlobalVisibleRect(this.e);
          }
          if (!b) {
             return;
          }
       }
       obj = this.c;
       if (obj != null) {
          obj.onViewDraw(p0);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKAndroidCanvasView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKAndroidCanvasView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       TKAndroidCanvasView td = this.d;
       td.right = (float)p0;
       td.bottom = (float)p1;
       td = this.c;
       if (td != null) {
          td.onViewSizeChanged(p0, p1);
       }
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       if (PatchProxy.isSupport(TKAndroidCanvasView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKAndroidCanvasView.class, "2")) {
          return;
       }
       super.onWindowVisibilityChanged(p0);
       boolean b = (!p0)? true: false;
       this.k = b;
       return;
    }
    public void setCallback(TKAndroidCanvasView$a p0){
       this.c = p0;
    }
    public void setCheckVisiblePreDraw(boolean p0){
       this.m = p0;
    }
}
