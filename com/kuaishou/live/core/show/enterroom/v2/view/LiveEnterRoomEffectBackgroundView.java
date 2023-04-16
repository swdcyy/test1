package com.kuaishou.live.core.show.enterroom.v2.view.LiveEnterRoomEffectBackgroundView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import java.lang.Boolean;
import java.lang.Integer;

public class LiveEnterRoomEffectBackgroundView extends View	// class@000b1d
{
    public float b;
    public float c;
    public int[] d;
    public float[] e;
    public int[] f;
    public float[] g;
    public LinearGradient h;
    public LinearGradient i;
    public Paint j;
    public RectF k;
    public RectF l;

    public void LiveEnterRoomEffectBackgroundView(Context p0){
       super(p0, null);
    }
    public void LiveEnterRoomEffectBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveEnterRoomEffectBackgroundView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new int[2]{0,0};
       this.e = null;
       this.f = new int[2]{0,0};
       this.g = null;
       Paint paint = new Paint();
       this.j = paint;
       paint.setAntiAlias(true);
       this.k = new RectF();
       this.l = new RectF();
       this.setWillNotDraw(false);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveEnterRoomEffectBackgroundView.class, "5")) {
          return;
       }
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.f, this.g, Shader$TileMode.CLAMP);
       this.h = v0;
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveEnterRoomEffectBackgroundView.class, "6")) {
          return;
       }
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, this.d, this.e, Shader$TileMode.CLAMP);
       this.i = v0;
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectBackgroundView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       LiveEnterRoomEffectBackgroundView tk = this.k;
       float f = 0;
       tk.left = f;
       float f1 = (float)this.getWidth();
       tk.right = f1;
       tk.top = f;
       float f2 = (float)this.getHeight();
       tk.bottom = f2;
       if (this.h == null) {
          this.a();
       }
       this.j.setStrokeWidth(f);
       this.j.setStyle(Paint$Style.FILL);
       this.j.setShader(this.h);
       p0.drawRoundRect(this.k, this.b, this.b, this.j);
       tk = this.c;
       if (tk - f > 0) {
          LiveEnterRoomEffectBackgroundView tl = this.l;
          tl.left = tk / 2.00f;
          tl.right = f1 - (tk / 2.00f);
          tl.top = tk / 2.00f;
          tl.bottom = f2 - (tk / 2.00f);
          if (this.i == null) {
             this.b();
          }
          this.j.setStrokeWidth(this.c);
          this.j.setStyle(Paint$Style.STROKE);
          this.j.setShader(this.i);
          p0.drawRoundRect(this.l, this.b, this.b, this.j);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveEnterRoomEffectBackgroundView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveEnterRoomEffectBackgroundView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.a();
       this.b();
       return;
    }
    public void setBorderWidth(float p0){
       this.c = p0;
    }
    public void setRadius(float p0){
       this.b = p0;
    }
}
