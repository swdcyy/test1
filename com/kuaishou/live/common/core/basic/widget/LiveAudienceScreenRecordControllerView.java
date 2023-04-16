package com.kuaishou.live.common.core.basic.widget.LiveAudienceScreenRecordControllerView;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Paint$Align;
import android.graphics.RectF;
import crd.b;
import android.graphics.Canvas;
import android.graphics.Paint$FontMetrics;
import va1.l0;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import com.kuaishou.live.common.core.basic.widget.LiveAudienceScreenRecordControllerView$a;

public class LiveAudienceScreenRecordControllerView extends View	// class@000f11
{
    public int b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public long j;
    public Paint k;
    public Paint l;
    public Paint m;
    public Paint n;
    public float o;
    public RectF p;
    public RectF q;
    public int r;
    public b s;
    public LiveAudienceScreenRecordControllerView$a t;
    public static final int u;
    public static final int v;

    static {
       LiveAudienceScreenRecordControllerView.u = a1.e(80.00f);
       LiveAudienceScreenRecordControllerView.v = a1.e(36.00f);
    }
    public void LiveAudienceScreenRecordControllerView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceScreenRecordControllerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceScreenRecordControllerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.o = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.s2);
       int i = 1;
       this.b = typedArray.getColor(i, this.getResources().getColor(0x7f061be4));
       this.c = typedArray.getColor(0, this.getResources().getColor(0x7f061bf1));
       this.d = typedArray.getColor(5, this.getResources().getColor(0x7f061be4));
       float f = 2.00f;
       this.e = typedArray.getDimension(3, (float)a1.e(f));
       this.f = typedArray.getDimension(6, (float)n.c(this.getContext(), 14.00f));
       this.g = typedArray.getDimension(2, (float)a1.e(12.00f));
       this.h = typedArray.getDimension(7, (float)a1.e(8.00f));
       this.i = typedArray.getInt(4, -90) % 360;
       typedArray.recycle();
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceScreenRecordControllerView.class, "1")) {
       }else {
          Paint paint = new Paint(i);
          this.k = paint;
          paint.setColor(this.b);
          this.k.setStrokeWidth(this.e);
          this.k.setStyle(Paint$Style.FILL);
          paint = new Paint(i);
          this.l = paint;
          paint.setColor(this.b);
          this.l.setStrokeWidth(this.e);
          this.l.setStyle(Paint$Style.STROKE);
          paint = new Paint(i);
          this.m = paint;
          paint.setColor(this.c);
          this.m.setStrokeWidth(this.e);
          this.m.setStyle(Paint$Style.STROKE);
          paint = new Paint(i);
          this.n = paint;
          paint.setColor(this.d);
          this.n.setTextSize(this.f);
          this.n.setTextAlign(Paint$Align.CENTER);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceScreenRecordControllerView.class, "2")) {
          LiveAudienceScreenRecordControllerView th = this.h;
          this.p = new RectF(((- th) / f), ((- th) / f), (th / f), (th / f));
          LiveAudienceScreenRecordControllerView tg = this.g;
          this.q = new RectF((- tg), (- tg), tg, tg);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceScreenRecordControllerView.class, "9")) {
          return;
       }
       LiveAudienceScreenRecordControllerView ts = this.s;
       if (ts != null) {
          ts.dispose();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceScreenRecordControllerView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       p0.translate((float)a1.e(18.00f), ((float)this.getMeasuredHeight() / 2.00f));
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceScreenRecordControllerView.class, "5")) {
          p0.drawRoundRect(this.p, (float)a1.e(2.00f), (float)a1.e(2.00f), this.k);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceScreenRecordControllerView.class, "6")) {
          p0.save();
          float f = (float)360 * this.o;
          float f1 = (float)this.i;
          p0.drawArc(this.q, f1, f, false, this.l);
          p0.drawArc(this.q, (f1 + f), ((360.00f - f1) - f), false, this.m);
          p0.restore();
       }
       p0.translate((float)a1.e(37.00f), 0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceScreenRecordControllerView.class, "7")) {
          p0.save();
          Paint$FontMetrics fontMetrics = this.n.getFontMetrics();
          p0.drawText(l0.d((long)(this.r * 1000)), 0, (0 - ((fontMetrics.ascent + fontMetrics.descent) / 2.00f)), this.n);
          p0.restore();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveAudienceScreenRecordControllerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveAudienceScreenRecordControllerView.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       int size = View$MeasureSpec.getSize(p0);
       int size1 = View$MeasureSpec.getSize(p1);
       p1 = View$MeasureSpec.getMode(p1);
       if (View$MeasureSpec.getMode(p0) != 0x40000000) {
          size = LiveAudienceScreenRecordControllerView.u;
       }
       if (p1 != 0x40000000) {
          size1 = LiveAudienceScreenRecordControllerView.v;
       }
       this.setMeasuredDimension(size, size1);
       return;
    }
    public void setLiveScreenRecordControllerCallback(LiveAudienceScreenRecordControllerView$a p0){
       this.t = p0;
    }
}
