package com.kuaishou.growth.pendant.ui.widget.CircularProgressView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import lnc.a1;
import qf0.b;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Canvas;
import java.lang.Float;

public class CircularProgressView extends View	// class@0006f8
{
    public final Paint b;
    public final RectF c;
    public float d;
    public boolean e;
    public int f;
    public int g;
    public int h;

    public void CircularProgressView(Context p0){
       super(p0);
       this.b = new Paint();
       this.c = new RectF();
       this.d = 0;
       this.e = false;
       this.f = a1.a(0x7f061f76);
       this.g = a1.a(0x7f06202f);
       this.h = b.b(0x7f070c41);
    }
    public void CircularProgressView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Paint();
       this.c = new RectF();
       this.d = 0;
       this.e = false;
       this.f = a1.a(0x7f061f76);
       this.g = a1.a(0x7f06202f);
       this.h = b.b(0x7f070c41);
    }
    public void CircularProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint();
       this.c = new RectF();
       this.d = 0;
       this.e = false;
       this.f = a1.a(0x7f061f76);
       this.g = a1.a(0x7f06202f);
       this.h = b.b(0x7f070c41);
    }
    public final void a(int p0){
       if (PatchProxy.isSupport(CircularProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CircularProgressView.class, "7")) {
          return;
       }
       this.b.setColor(p0);
       this.b.setDither(true);
       this.b.setFlags(true);
       this.b.setAntiAlias(true);
       this.b.setStrokeWidth((float)this.h);
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setStrokeCap(Paint$Cap.ROUND);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CircularProgressView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if (!PatchProxy.applyVoid(null, this, CircularProgressView.class, "6")) {
          CircularProgressView tc = this.c;
          float f = (float)this.h;
          tc.left = f;
          tc.top = f;
          tc.right = (float)(this.getWidth() - this.h);
          this.c.bottom = (float)(this.getHeight() - this.h);
       }
       if (this.e == null) {
          this.a(this.g);
          p0.drawArc(this.c, 0, 360.00f, false, this.b);
       }
       this.a(this.f);
       p0.drawArc(this.c, -90.00f, (this.d * 360.00f), false, this.b);
       return;
    }
    public void setColor(int p0){
       if (PatchProxy.isSupport(CircularProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CircularProgressView.class, "1")) {
          return;
       }
       if (this.f == p0) {
          return;
       }
       this.f = p0;
       this.invalidate();
       return;
    }
    public void setDisableBgField(boolean p0){
       this.e = p0;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(CircularProgressView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CircularProgressView.class, "3")) {
          return;
       }
       if (!this.d - p0) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
    public void setProgressBgColor(int p0){
       if (PatchProxy.isSupport(CircularProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CircularProgressView.class, "2")) {
          return;
       }
       if (this.g == p0) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
    public void setStrokeWidth(int p0){
       if (PatchProxy.isSupport(CircularProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CircularProgressView.class, "4")) {
          return;
       }
       if (this.h == p0) {
          return;
       }
       this.h = p0;
       this.invalidate();
       return;
    }
}
