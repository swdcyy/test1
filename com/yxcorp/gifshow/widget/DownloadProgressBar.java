package com.yxcorp.gifshow.widget.DownloadProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.lang.Integer;
import java.lang.Math;
import lnc.a1;

public class DownloadProgressBar extends ProgressBar	// class@00181b
{
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final Paint e;
    public float f;

    public void DownloadProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DownloadProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new RectF();
       this.c = new RectF();
       Paint paint = new Paint(1);
       this.d = paint;
       Paint paint1 = new Paint(1);
       this.e = paint1;
       if (PatchProxy.applyVoid(null, this, DownloadProgressBar.class, "1")) {
       }else {
          this.f = (float)n.c(this.getContext(), 0x3fc00000);
          paint.setStyle(Paint$Style.STROKE);
          paint.setStrokeWidth(this.f);
          paint1.setStyle(Paint$Style.FILL);
          paint1.setColor(0x4d000000);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadProgressBar.class, "2")) {
          return;
       }
       p0.drawArc(this.b, 0, 360.00f, false, this.e);
       this.d.setColor(0x59ffffff);
       p0.drawArc(this.c, 0, 360.00f, false, this.d);
       this.d.setColor(-1);
       p0.drawArc(this.c, -90.00f, (((float)this.getProgress() / (float)this.getMax()) * 360.00f), false, this.d);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DownloadProgressBar.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DownloadProgressBar.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)p0 / 2.00f;
       float f1 = (float)p1 / 2.00f;
       float f2 = Math.min(f, f1);
       DownloadProgressBar tb = this.b;
       float f3 = f1 - f2;
       tb.top = f3;
       f1 = f1 + f2;
       tb.bottom = f1;
       float f4 = f - f2;
       tb.left = f4;
       f = f + f2;
       tb.right = f;
       DownloadProgressBar tc = this.c;
       tc.top = f3;
       tc.bottom = f1;
       tc.left = f4;
       tc.right = f;
       tc.inset(((this.f / 2.00f) + (float)a1.e(0x3fc00000)), ((this.f / 2.00f) + (float)a1.e(0x3fc00000)));
       return;
    }
}
