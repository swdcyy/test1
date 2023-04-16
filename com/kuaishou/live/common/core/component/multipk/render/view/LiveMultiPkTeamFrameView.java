package com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkTeamFrameView;
import android.widget.FrameLayout;
import java.lang.Float;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import lnc.a1;
import d61.k;
import android.graphics.Paint$Style;
import qrd.l1;
import android.graphics.Canvas;
import android.view.ViewGroup;

public final class LiveMultiPkTeamFrameView extends FrameLayout	// class@00167e
{
    public RectF b;
    public boolean c;
    public final float d;
    public Paint e;
    public String f;
    public final Float g;
    public HashMap h;

    public void LiveMultiPkTeamFrameView(Float p0,Context p1,AttributeSet p2,int p3,u p4){
       a.p(p1, "context");
       super(p1, null);
       this.g = p0;
       this.setLayerType(1, null);
       this.b = new RectF();
       this.d = 50.00f;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkTeamFrameView.class, "1")) {
          return;
       }
       a.p(p0, "shadowColorString");
       boolean b = false;
       LiveMultiPkTeamFrameView liveMultiPkT = (!p0.length())? 1: null;
       if (liveMultiPkT) {
          return;
       }else if(!p0.equals(this.f)){
          this.c = b;
          this.f = p0;
       }
       liveMultiPkT = this.g;
       float f = (liveMultiPkT != null)? liveMultiPkT.floatValue(): (float)a1.d(0x7f07034b);
       if (this.c == null) {
          Paint paint = new Paint();
          paint.setAntiAlias(true);
          paint.setStyle(Paint$Style.STROKE);
          paint.setStrokeWidth(this.d);
          paint.setShadowLayer(f, 0, -4.00f, k.b(p0));
          this.e = paint;
          this.c = true;
          this.postInvalidate();
       }
       if (this.c != null) {
          liveMultiPkT = this.e;
          if (liveMultiPkT == null) {
             a.S("shadowPaint");
          }
          liveMultiPkT.setColor(k.b(p0));
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkTeamFrameView.class, "2")) {
          return;
       }
       a.p(p0, "canvas");
       if (this.c != null && (this.getWidth() > 0 && this.getHeight() > 0)) {
          float f = (float)this.getWidth();
          float f1 = (float)this.getHeight();
          LiveMultiPkTeamFrameView tb = this.b;
          tb.left = 0;
          tb.top = 0;
          tb.right = f;
          tb.bottom = f1;
          tb = this.d;
          float f2 = (float)2;
          float f3 = 0 - (tb / f2);
          float f4 = 0 - (tb / f2);
          float f5 = f + (tb / f2);
          float f6 = f1 + (tb / f2);
          LiveMultiPkTeamFrameView te = this.e;
          if (te == null) {
             a.S("shadowPaint");
          }
          p0.drawRect(f3, f4, f5, f6, te);
       }
    label_0055 :
       super.dispatchDraw(p0);
       return;
    }
}
