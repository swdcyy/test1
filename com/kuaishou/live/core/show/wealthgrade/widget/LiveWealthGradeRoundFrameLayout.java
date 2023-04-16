package com.kuaishou.live.core.show.wealthgrade.widget.LiveWealthGradeRoundFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Path$Direction;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import android.view.ViewGroup;
import java.lang.Boolean;

public class LiveWealthGradeRoundFrameLayout extends FrameLayout	// class@001283
{
    public Path b;
    public int c;
    public RectF d;

    public void LiveWealthGradeRoundFrameLayout(Context p0){
       super(p0, null);
    }
    public void LiveWealthGradeRoundFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveWealthGradeRoundFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (!PatchProxy.isSupport(LiveWealthGradeRoundFrameLayout.class) || (!PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), this, LiveWealthGradeRoundFrameLayout.class, "1") && p1 != null)) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.Z2, p2, 0);
          this.c = typedArray.getDimensionPixelOffset(0, 0);
          typedArray.recycle();
       }
       this.b = new Path();
       this.d = new RectF();
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeRoundFrameLayout.class, "3")) {
          return;
       }
       Path path = new Path();
       this.b = path;
       LiveWealthGradeRoundFrameLayout tc = this.c;
       float f = (float)tc;
       path.addRoundRect(this.d, f, (float)tc, Path$Direction.CW);
       p0.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
       p0.clipPath(this.b);
       super.dispatchDraw(p0);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveWealthGradeRoundFrameLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveWealthGradeRoundFrameLayout.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       LiveWealthGradeRoundFrameLayout td = this.d;
       td.left = 0;
       td.top = 0;
       td.right = (float)this.getWidth();
       td.bottom = (float)this.getHeight();
       return;
    }
}
