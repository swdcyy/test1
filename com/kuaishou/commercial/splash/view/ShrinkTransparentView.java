package com.kuaishou.commercial.splash.view.ShrinkTransparentView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import android.graphics.Path;
import lnc.a1;
import android.graphics.Paint;
import android.content.res.Resources;
import android.widget.ImageView;
import android.graphics.Paint$Style;
import qrd.l1;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Path$Direction;
import android.graphics.Region$Op;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;

public final class ShrinkTransparentView extends KwaiImageView	// class@001636
{
    public int A;
    public float B;
    public final Path C;
    public Drawable D;
    public float E;
    public Paint F;
    public HashMap G;
    public final RectF x;
    public final RectF y;
    public int z;

    public void ShrinkTransparentView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void ShrinkTransparentView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void ShrinkTransparentView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.x = new RectF();
       this.y = new RectF();
       this.C = new Path();
       this.E = (float)a1.e(3.00f);
       Paint paint = new Paint(1);
       paint.setColor(this.getResources().getColor(R.color.arg_RES_7f0620c7));
       paint.setStrokeWidth(this.E);
       paint.setStyle(Paint$Style.STROKE);
       this.F = paint;
    }
    public void ShrinkTransparentView(Context p0,AttributeSet p1,int p2,int p3,u p4){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, ShrinkTransparentView.class, "5")) {
          return;
       }
       if (p0 != null) {
          p0.save();
          this.C.reset();
          this.C.addRoundRect(this.x, this.B, this.B, Path$Direction.CCW);
          p0.clipPath(this.C, Region$Op.DIFFERENCE);
          super.onDraw(p0);
          p0.restore();
          ShrinkTransparentView tD = this.D;
          if (tD != null && tD.getBounds().width() != this.getWidth()) {
             tD.setBounds(0, 0, this.getWidth(), this.getHeight());
          }
          p0.drawRoundRect(this.x, this.B, this.B, this.F);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ShrinkTransparentView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ShrinkTransparentView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.z = (this.getWidth() - this.getPaddingRight()) - this.getPaddingLeft();
          this.A = (this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop();
          if (!PatchProxy.applyVoid(null, this, ShrinkTransparentView.class, "3")) {
             ShrinkTransparentView tA = this.A;
             this.x.set((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(this.getPaddingLeft() + this.z), (float)(this.getPaddingTop() + tA));
             this.y.set((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(this.getPaddingLeft() + this.z), (float)(this.getPaddingTop() + tA));
          }
       }
       return;
    }
    public final void setClipRoundRadius(float p0){
       this.B = p0;
    }
}
