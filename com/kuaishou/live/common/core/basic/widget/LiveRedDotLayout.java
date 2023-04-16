package com.kuaishou.live.common.core.basic.widget.LiveRedDotLayout;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import cw9.c;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.lang.Integer;
import java.lang.Boolean;

public final class LiveRedDotLayout extends FrameLayout	// class@000f23
{
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Paint g;
    public float h;
    public float i;
    public RectF j;
    public HashMap k;

    public void LiveRedDotLayout(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveRedDotLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LiveRedDotLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.j = new RectF(0, 0, 0, 0);
       TypedArray typedArray = p0.getTheme().obtainStyledAttributes(p1, c$b.K2, p2, 0);
       a.o(typedArray, "context.theme.obtainStyl¡­fStyleAttr,\n      0\n    \)");
       p2 = typedArray.getColor(0, 0);
       this.c = p2;
       this.d = typedArray.getDimensionPixelSize(2, c.b(p0.getResources(), 0x7f070334));
       this.e = typedArray.getDimensionPixelSize(1, c.b(p0.getResources(), 0x7f0702ac));
       int dimensionPix = typedArray.getDimensionPixelSize(3, c.b(p0.getResources(), R.dimen.arg_RES_7f0702ac));
       this.f = dimensionPix;
       Paint paint = new Paint();
       this.g = paint;
       paint.setStyle(Paint$Style.FILL);
       paint.setColor(p2);
       this.i = (float)dimensionPix;
       typedArray.recycle();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedDotLayout.class, "3")) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.b != null && p0 != null) {
          p0.drawOval(this.j, this.g);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveRedDotLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveRedDotLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.h = (float)((this.getMeasuredWidth() - this.e) - this.d);
       LiveRedDotLayout th = this.h;
       LiveRedDotLayout ti = this.i;
       LiveRedDotLayout td = this.d;
       this.j = new RectF(th, ti, ((float)td + th), ((float)td + ti));
       return;
    }
    public final void setRedDotEnabled(boolean p0){
       if (PatchProxy.isSupport(LiveRedDotLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveRedDotLayout.class, "1")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
}
