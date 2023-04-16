package com.yxcorp.gifshow.v3.widget.EditSoundWaveView;
import android.widget.LinearLayout;
import lnc.a1;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.List;

public class EditSoundWaveView extends LinearLayout	// class@00163a
{
    public Paint b;
    public int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final List k;

    static {
       EditSoundWaveView.d = a1.a(0x7f061bf7);
       EditSoundWaveView.e = a1.e(4.00f);
       EditSoundWaveView.f = a1.e(2.50f);
       EditSoundWaveView.g = a1.e(9.00f);
       EditSoundWaveView.h = a1.e(0x3f000000);
       EditSoundWaveView.i = a1.e(3.00f);
       EditSoundWaveView.j = a1.e(6.00f);
       Integer[] integerArray = new Integer[]{Integer.valueOf(a1.e(3.00f)),Integer.valueOf(a1.e(5.00f)),Integer.valueOf(a1.e(4.00f)),Integer.valueOf(a1.e(8.00f)),Integer.valueOf(a1.e(6.00f)),Integer.valueOf(a1.e(3.00f)),Integer.valueOf(a1.e(0x3f000000))};
       EditSoundWaveView.k = Lists.e(integerArray);
    }
    public void EditSoundWaveView(Context p0){
       super(p0);
       Paint paint = new Paint();
       this.b = paint;
       paint.setAntiAlias(true);
       this.b.setColor(EditSoundWaveView.d);
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setStrokeWidth((float)EditSoundWaveView.e);
       this.b.setStrokeCap(Paint$Cap.ROUND);
       this.setWillNotDraw(false);
       this.c = 0;
    }
    public void EditSoundWaveView(Context p0,AttributeSet p1){
       super(p0, p1);
       Paint paint = new Paint();
       this.b = paint;
       paint.setAntiAlias(true);
       this.b.setColor(EditSoundWaveView.d);
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setStrokeWidth((float)EditSoundWaveView.e);
       this.b.setStrokeCap(Paint$Cap.ROUND);
       this.setWillNotDraw(false);
       this.c = 0;
    }
    public void EditSoundWaveView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Paint paint = new Paint();
       this.b = paint;
       paint.setAntiAlias(true);
       this.b.setColor(EditSoundWaveView.d);
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setStrokeWidth((float)EditSoundWaveView.e);
       this.b.setStrokeCap(Paint$Cap.ROUND);
       this.setWillNotDraw(false);
       this.c = 0;
    }
    public final void a(Canvas p0,int p1,int p2){
       float this;
       if (PatchProxy.isSupport(EditSoundWaveView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, EditSoundWaveView.class, "5")) {
          return;
       }
       this = (float)p1;
       float f = (float)p2;
       p0.drawLine(this, (((float)this.getMeasuredHeight() / 2.00f) - f), this, (((float)this.getMeasuredHeight() / 2.00f) + f), this.b);
       return;
    }
    public void onDraw(Canvas p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditSoundWaveView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       EditSoundWaveView tc = this.c;
       int g = EditSoundWaveView.g;
       int e = EditSoundWaveView.e;
       if (tc < ((g * 2) + e)) {
          i = tc / 2;
          if (!PatchProxy.isSupport(EditSoundWaveView.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i), this, EditSoundWaveView.class, "2")) {
             p0.save();
             this.a(p0, i, EditSoundWaveView.j);
             p0.restore();
          }
       }
       tc = this.c;
       int f = EditSoundWaveView.f;
       if (tc < (((g * 2) + (e * 3)) + (f * 2))) {
          i = tc / 2;
          if (!PatchProxy.isSupport(EditSoundWaveView.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i), this, EditSoundWaveView.class, "3")) {
             p0.save();
             this.a(p0, i, EditSoundWaveView.j);
             int i1 = EditSoundWaveView.i;
             this.a(p0, ((i - f) - e), i1);
             this.a(p0, ((i + f) + e), i1);
             p0.restore();
          }
          return;
       }else {
          p0.save();
          g = g + (e / 2);
          this.a(p0, g, EditSoundWaveView.h);
          g = g + (e + f);
          i = 0;
          e = EditSoundWaveView.e;
          float f1 = (float)e / 2.00f;
          float f2 = (float)g + f1;
          f = this.c - EditSoundWaveView.g;
          int i2 = e * 2;
          int f3 = EditSoundWaveView.f;
          int i3 = f3 * 2;
          i2 = i2 + i3;
          f = f - i2;
          while (f2 - (float)f < 0) {
             List k = EditSoundWaveView.k;
             if (i >= k.size()) {
                i = i - k.size();
             }
             this.a(p0, g, k.get(i).intValue());
             e = e + f3;
             g = g + e;
             i = i + 1;
          }
          if (!PatchProxy.isSupport(EditSoundWaveView.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(g), this, EditSoundWaveView.class, "4")) {
             this.a(p0, g, EditSoundWaveView.i);
             this.a(p0, (g + (e + f3)), EditSoundWaveView.h);
          }
          p0.restore();
          return;
       }
    }
    public void setLength(int p0){
       this.c = p0;
    }
}
