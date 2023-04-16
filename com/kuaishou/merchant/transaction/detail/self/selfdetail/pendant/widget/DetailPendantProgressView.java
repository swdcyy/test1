package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.widget.DetailPendantProgressView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import android.graphics.Paint;
import android.graphics.RectF;
import lnc.a1;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class DetailPendantProgressView extends View	// class@000751
{
    public final Paint b;
    public int c;
    public int d;
    public float e;
    public final RectF f;
    public final RectF g;
    public HashMap h;

    public void DetailPendantProgressView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void DetailPendantProgressView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void DetailPendantProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Paint paint = new Paint();
       this.b = paint;
       paint.setAntiAlias(true);
       this.f = new RectF();
       this.g = new RectF();
       this.d = a1.a(0x7f0606a7);
       this.c = a1.a(0x7f0601e4);
    }
    public void DetailPendantProgressView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailPendantProgressView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       float f = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, DetailPendantProgressView.class, "2")) {
          this.b.setColor(this.c);
          this.f.set(f, f, (float)this.getWidth(), (float)this.getHeight());
          p0.drawRoundRect(this.g, (float)(this.getHeight() >> 1), (float)(this.getHeight() >> 1), this.b);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, DetailPendantProgressView.class, "3")) {
          this.b.setColor(this.d);
          this.g.set(f, f, (this.e * (float)this.getWidth()), (float)this.getHeight());
          p0.drawRoundRect(this.g, (float)(this.getHeight() >> 1), (float)(this.getHeight() >> 1), this.b);
       }
       return;
    }
    public void setBackgroundColor(int p0){
       this.c = p0;
    }
    public final void setProgress(float p0){
       this.e = p0;
    }
}
