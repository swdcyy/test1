package com.yxcorp.plugin.search.result.widget.RounderCornerRelativeLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.graphics.RectF;
import lnc.a1;
import android.graphics.Paint;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;

public class RounderCornerRelativeLayout extends RelativeLayout	// class@000761
{
    public RectF b;
    public float c;
    public Paint d;
    public static final int e = 2131238520;

    public void RounderCornerRelativeLayout(Context p0){
       super(p0);
       this.b = new RectF();
       this.c = (float)a1.e(8.00f);
       this.d = new Paint();
       this.a();
    }
    public void RounderCornerRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new RectF();
       this.c = (float)a1.e(8.00f);
       this.d = new Paint();
       this.a();
    }
    public void RounderCornerRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new RectF();
       this.c = (float)a1.e(8.00f);
       this.d = new Paint();
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RounderCornerRelativeLayout.class, "1")) {
          return;
       }
       this.d.setAntiAlias(true);
       this.d.setColor(this.getResources().getColor(R.color.arg_RES_7f06008d));
       this.setBackgroundResource(RounderCornerRelativeLayout.e);
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RounderCornerRelativeLayout.class, "2")) {
          return;
       }
       super.dispatchDraw(p0);
       if (p0 == null) {
          return;
       }
       this.b.top = (float)this.getPaddingTop();
       this.b.left = (float)this.getPaddingLeft();
       this.b.right = (float)(this.getWidth() - this.getPaddingRight());
       this.b.bottom = (float)(this.getHeight() - this.getPaddingBottom());
       p0.saveLayer(this.b, null, 31);
       this.d.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
       p0.drawRect(this.b, this.d);
       this.d.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
       p0.drawRoundRect(this.b, this.c, this.c, this.d);
       p0.save();
       return;
    }
}
