package com.kuaishou.live.core.basic.widget.LiveDividerFrameLayout;
import android.widget.FrameLayout;
import android.graphics.Color;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Integer;
import android.graphics.Paint$Style;
import java.lang.Boolean;

public class LiveDividerFrameLayout extends FrameLayout	// class@0008fe
{
    public final Paint b;
    public int c;
    public int d;
    public boolean e;
    public static final int f;
    public static final int g;

    static {
       LiveDividerFrameLayout.f = Color.argb(10, 255, 255, 255);
       LiveDividerFrameLayout.g = a1.e(0x3f800000);
    }
    public void LiveDividerFrameLayout(Context p0){
       super(p0, null);
    }
    public void LiveDividerFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveDividerFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint(1);
       this.c = 0;
       this.d = 0;
       this.e = true;
       this.setWillNotDraw(0);
       this.setDividerColor(LiveDividerFrameLayout.f);
       this.setDividerHeight(LiveDividerFrameLayout.g);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDividerFrameLayout.class, "6")) {
          return;
       }
       super.onDraw(p0);
       if (this.e == null) {
          return;
       }
       float f = (float)(this.getHeight() - (int)this.b.getStrokeWidth());
       p0.drawLine((float)this.c, f, (float)(this.getWidth() - this.d), f, this.b);
       return;
    }
    public void setDividerColor(int p0){
       if (PatchProxy.isSupport(LiveDividerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveDividerFrameLayout.class, "2")) {
          return;
       }
       this.b.setColor(p0);
       this.invalidate();
       return;
    }
    public void setDividerHeight(int p0){
       if (PatchProxy.isSupport(LiveDividerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveDividerFrameLayout.class, "3")) {
          return;
       }
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setStrokeWidth((float)p0);
       this.invalidate();
       return;
    }
    public void setDividerLeftMargin(int p0){
       if (PatchProxy.isSupport(LiveDividerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveDividerFrameLayout.class, "4")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
    public void setDividerRightMargin(int p0){
       if (PatchProxy.isSupport(LiveDividerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveDividerFrameLayout.class, "5")) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
    public void setEnableDivider(boolean p0){
       if (PatchProxy.isSupport(LiveDividerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveDividerFrameLayout.class, "1")) {
          return;
       }
       this.e = p0;
       this.invalidate();
       return;
    }
}
