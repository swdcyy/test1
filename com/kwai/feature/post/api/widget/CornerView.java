package com.kwai.feature.post.api.widget.CornerView;
import android.view.View;
import android.content.Context;
import android.graphics.RectF;
import lnc.a1;
import android.graphics.Paint;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;

public class CornerView extends View	// class@001467
{
    public final RectF b;
    public float c;
    public Paint d;
    public int e;

    public void CornerView(Context p0){
       super(p0);
       this.b = new RectF();
       this.c = (float)a1.e(3.00f);
       this.d = new Paint(7);
       this.e = a1.a(0x7f0606da);
       this.b();
    }
    public void CornerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new RectF();
       this.c = (float)a1.e(3.00f);
       this.d = new Paint(7);
       this.e = a1.a(0x7f0606da);
       this.a(p0, p1);
       this.b();
    }
    public void CornerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new RectF();
       this.c = (float)a1.e(3.00f);
       this.d = new Paint(7);
       this.e = a1.a(0x7f0606da);
       this.a(p0, p1);
       this.b();
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CornerView.class, "1")) {
          return;
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.f0);
          this.c = (float)typedArray.getDimensionPixelOffset(1, (int)this.c);
          this.e = typedArray.getColor(0, this.e);
          typedArray.recycle();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, CornerView.class, "2")) {
          return;
       }
       this.setCornerColor(this.e);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CornerView.class, "6")) {
          return;
       }
       p0.drawRoundRect(this.b, this.c, this.c, this.d);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(CornerView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CornerView.class, "5")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.b.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       return;
    }
    public void setCorner(float p0){
       if (PatchProxy.isSupport(CornerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CornerView.class, "4")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
    public void setCornerColor(int p0){
       if (PatchProxy.isSupport(CornerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CornerView.class, "3")) {
          return;
       }
       this.e = p0;
       this.d.setColor(p0);
       return;
    }
}
