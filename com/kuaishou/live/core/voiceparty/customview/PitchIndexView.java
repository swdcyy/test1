package com.kuaishou.live.core.voiceparty.customview.PitchIndexView;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class PitchIndexView extends View	// class@0014bd
{
    public final RectF b;
    public final Paint c;
    public int d;
    public static final int e;

    static {
       PitchIndexView.e = a1.e(0x3fc00000);
    }
    public void PitchIndexView(Context p0){
       super(p0, null);
    }
    public void PitchIndexView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PitchIndexView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new RectF();
       this.c = new Paint(1);
       this.d = 0;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PitchIndexView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       int i = (this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop();
       int i1 = (((this.getWidth() - this.getPaddingRight()) - this.getPaddingLeft()) - (PitchIndexView.e * 11)) / 10;
       int i2 = i / 11;
       PitchIndexView tb = this.b;
       for (int i3 = 0; i3 < 11; i3 = i5) {
          PitchIndexView tc = this.c;
          int i4 = (i3 <= this.d)? -117146: -1;
          tc.setColor(i4);
          int i5 = i3 + 1;
          i4 = i5 * i2;
          int e = PitchIndexView.e;
          int i6 = i1 + e;
          i3 = i3 * i6;
          i3 = i3 + this.getPaddingLeft();
          e = e + i3;
          i6 = i - i4;
          i6 = i6 + this.getPaddingTop();
          i4 = i4 + i6;
          tb.set((float)i3, (float)i6, (float)e, (float)i4);
          p0.drawRoundRect(tb, 6.00f, 6.00f, this.c);
       }
       return;
    }
    public void setPitchLevel(int p0){
       if (PatchProxy.isSupport(PitchIndexView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PitchIndexView.class, "1")) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
}
