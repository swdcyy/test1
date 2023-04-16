package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView;
import android.view.View;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import lnc.a1;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveStyle;
import android.graphics.Paint;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView$Wave;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import java.lang.Integer;
import java.lang.Math;

public final class WaveView extends View	// class@001412
{
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public WaveStyle g;
    public int h;
    public int i;
    public final Paint j;
    public final WaveView$Wave k;
    public float l;
    public HashMap m;

    public void WaveView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void WaveView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void WaveView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = 900;
       this.c = (float)a1.e(0x41f00000);
       this.d = (float)a1.e(0x3f800000);
       this.e = (float)a1.e(4.00f);
       this.f = (float)a1.e(25.00f);
       this.g = WaveStyle.RING_FIX_WAVE_DIFFUSE;
       this.h = a1.a(0x7f0604d9);
       this.i = a1.a(0x7f0604d9);
       Paint paint = new Paint();
       this.j = paint;
       this.k = new WaveView$Wave(this);
       this.l = (float)a1.e(25.00f);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.j6, p2, 0);
       a.o(typedArray, "context.obtainStyledAttr¡­aveView, defStyleAttr, 0\)");
       this.i = typedArray.getColor(0, a1.a(0x7f0604d9));
       this.h = typedArray.getColor(3, a1.a(0x7f0604d9));
       this.f = typedArray.getDimension(1, 25.00f);
       this.c = typedArray.getDimension(2, 0x41f00000);
       this.d = typedArray.getDimension(6, 0x3f800000);
       this.e = typedArray.getDimension(5, 3.00f);
       this.b = typedArray.getInt(4, 1500);
       paint.setColor(this.i);
       typedArray.recycle();
    }
    public final int getRingAlpha(){
       Object obj = PatchProxy.apply(null, this, WaveView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 255;
       if (this.g == WaveStyle.RING_SCALING_WAVE_SCALING) {
          i = (int)((float)i * ((float)1 - (this.k.d * 0x3f19999a)));
       }
       return i;
    }
    public final float getRingRadius(){
       WaveView tg = this.g;
       tg = (tg == WaveStyle.RING_SCALING_WAVE_DIFFUSE || tg == WaveStyle.RING_SCALING_WAVE_SCALING)? this.l: this.f;
       return tg;
    }
    public final float getRingWidth(){
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       WaveView obj = PatchProxy.apply(objArray, this, WaveView.class, "8");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       if (this.g == WaveStyle.RING_SCALING_WAVE_SCALING) {
          obj = this.k;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, WaveView$Wave.class, "6");
          f = (obj1 != patchProxyRe)? obj1.floatValue(): (float)a1.e(2.00f) + (obj.e.e * obj.d);
       }else {
          f = (float)a1.e(0x3fc00000);
       }
       return f;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaveView.class, "6")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       WaveView tk = this.k;
       WaveView$Wave c = tk.c;
       tk.d = c;
       int i = 1;
       if (c - 0x3f000000 >= 0) {
          tk.d = (float)i - c;
       }
       c = tk.e;
       WaveView f = c.f;
       c.l = f + ((tk.d * (c.c - f)) * 0.30f);
       this.j.setAntiAlias(i);
       if (this.g != WaveStyle.RING_SCALING_WAVE_SCALING) {
          this.j.setColor(this.h);
          float f1 = (float)i;
          this.j.setAlpha((int)((float)255 * (f1 - this.k.c)));
          WaveView tk1 = this.k;
          this.j.setStrokeWidth((tk1.e.d * (f1 - tk1.c)));
          this.j.setStyle(Paint$Style.STROKE);
          f = this.k;
          WaveView$Wave e = f.e;
          WaveView f2 = e.f;
          p0.drawCircle((float)(this.getWidth() / 2), (float)(this.getHeight() / 2), (f2 + (f.c * (e.c - f2))), this.j);
       }
       this.j.setColor(this.i);
       this.j.setAlpha(this.getRingAlpha());
       this.j.setStrokeWidth(this.getRingWidth());
       this.j.setStyle(Paint$Style.STROKE);
       p0.drawCircle((float)(this.getWidth() / 2), (float)(this.getHeight() / 2), this.getRingRadius(), this.j);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(WaveView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, WaveView.class, "5")) {
          return;
       }
       float f = (float)Math.min(p0, p1) / 2.00f;
       if (f - this.c < 0) {
          this.c = f;
       }
       return;
    }
    public final void setCenterRadius(float p0){
       this.f = p0;
    }
    public final void setDuration(int p0){
       this.b = p0;
    }
    public final void setWaveStyle(WaveStyle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaveView.class, "1")) {
          return;
       }
       a.p(p0, "waveStyle");
       this.g = p0;
       return;
    }
}
