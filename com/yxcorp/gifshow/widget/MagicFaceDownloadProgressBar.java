package com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
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

public class MagicFaceDownloadProgressBar extends ProgressBar	// class@00187f
{
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final Paint e;
    public float f;
    public float g;
    public float h;
    public float i;

    public void MagicFaceDownloadProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MagicFaceDownloadProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new RectF();
       this.c = new RectF();
       Paint paint = new Paint(1);
       this.d = paint;
       Paint paint1 = new Paint(1);
       this.e = paint1;
       if (PatchProxy.applyVoid(null, this, MagicFaceDownloadProgressBar.class, "1")) {
       }else {
          this.i = (float)n.c(this.getContext(), 0x3fc00000);
          paint.setStyle(Paint$Style.STROKE);
          paint.setStrokeWidth(this.i);
          paint1.setStyle(Paint$Style.FILL);
          paint1.setColor(0x66ffffff);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceDownloadProgressBar.class, "2")) {
          return;
       }
       p0.drawArc(this.b, 0, 360.00f, false, this.e);
       this.d.setColor(Integer.MIN_VALUE);
       p0.drawArc(this.c, 0, 360.00f, false, this.d);
       this.d.setColor(-1);
       p0.drawArc(this.c, -90.00f, (((float)this.getProgress() / (float)this.getMax()) * 360.00f), false, this.d);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(MagicFaceDownloadProgressBar.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, MagicFaceDownloadProgressBar.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)(p0 / 2);
       this.g = f;
       float f1 = (float)(p1 / 2);
       this.h = f1;
       f = Math.min(f, f1);
       this.f = f;
       MagicFaceDownloadProgressBar tb = this.b;
       MagicFaceDownloadProgressBar th = this.h;
       tb.top = th - f;
       tb.bottom = th + f;
       th = this.g;
       tb.left = th - f;
       tb.right = th + f;
       tb = this.c;
       th = this.h;
       MagicFaceDownloadProgressBar tf = this.f;
       tb.top = th - tf;
       tb.bottom = th + tf;
       th = this.g;
       tb.left = th - tf;
       tb.right = th + tf;
       tb.inset(((this.i / 2.00f) + (float)a1.e(0x3fc00000)), ((this.i / 2.00f) + (float)a1.e(0x3fc00000)));
       return;
    }
}
