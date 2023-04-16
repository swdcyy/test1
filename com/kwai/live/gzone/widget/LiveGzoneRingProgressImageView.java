package com.kwai.live.gzone.widget.LiveGzoneRingProgressImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import lnc.a1;
import android.graphics.Paint$Cap;
import android.graphics.Canvas;
import java.lang.Math;
import android.graphics.RectF;
import android.view.View;
import java.lang.Long;

public class LiveGzoneRingProgressImageView extends AppCompatImageView	// class@000e7f
{
    public Paint d;
    public float e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public boolean j;

    public void LiveGzoneRingProgressImageView(Context p0){
       super(p0, null);
    }
    public void LiveGzoneRingProgressImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneRingProgressImageView(Context p0,AttributeSet p1,int p2){
       int i;
       super(p0, p1, p2);
       boolean b = true;
       this.h = b;
       this.j = b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneRingProgressImageView.class, "2")) {
       }else {
          Context context = this.getContext();
          float f = 0x3f800000;
          if (PatchProxy.isSupport(LiveGzoneRingProgressImageView.class)) {
             Object obj = PatchProxy.applyTwoRefs(context, Float.valueOf(f), objArray, LiveGzoneRingProgressImageView.class, "1");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             label_0049 :
                this.e = (float)i;
                Paint paint = new Paint();
                this.d = paint;
                paint.setAntiAlias(b);
                this.d.setStyle(Paint$Style.STROKE);
                this.d.setColor(a1.a(R.color.arg_RES_7f061e07));
                this.d.setStrokeCap(Paint$Cap.ROUND);
                this.d.setStrokeWidth(this.e);
             }
          }
          i = (int)((f * c.c(context.getResources()).density) + 0x3f000000);
          goto label_0049 ;
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneRingProgressImageView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (this.j != null && !PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneRingProgressImageView.class, "3")) {
          float f = (float)(this.getWidth() / 2);
          float f1 = (float)(this.getHeight() / 2);
          LiveGzoneRingProgressImageView te = this.e;
          float f2 = (float)Math.min((this.getWidth() / 2), (this.getHeight() / 2)) - (te / 2.00f);
          this.d.setStrokeWidth(te);
          float f3 = f - f2;
          float f4 = f1 - f2;
          f = f + f2;
          f1 = f1 + f2;
          if (this.h == null) {
             p0.drawArc(new RectF(f3, f4, f, f1), (float)this.f, (float)this.g, false, this.d);
          }
          super.dispatchDraw(p0);
       }
       return;
    }
    public void setMaxTimeMs(long p0){
       this.i = p0;
    }
    public final void setProgress(float p0){
       if (PatchProxy.isSupport(LiveGzoneRingProgressImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveGzoneRingProgressImageView.class, "5")) {
          return;
       }
       boolean b = ((double)p0 - 0x3f50624dd2f1a9fc <= 0)? true: false;
       this.h = b;
       if (p0 <= 0) {
          this.h = true;
       }
       this.h = false;
       p0 = p0 * 360.00f;
       this.f = (int)(270.00f - p0);
       this.g = (int)p0;
       if (this.j != null) {
          this.invalidate();
       }
       return;
    }
    public void setShowProgress(boolean p0){
       this.j = p0;
    }
    public void setTime(long p0){
       if (PatchProxy.isSupport(LiveGzoneRingProgressImageView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveGzoneRingProgressImageView.class, "6")) {
          return;
       }
       LiveGzoneRingProgressImageView ti = this.i;
       if (ti > 0) {
          this.setProgress(((float)p0 / (float)ti));
       }else {
          this.setProgress(0);
       }
       return;
    }
}
