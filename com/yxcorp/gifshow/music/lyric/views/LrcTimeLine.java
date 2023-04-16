package com.yxcorp.gifshow.music.lyric.views.LrcTimeLine;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Boolean;
import java.lang.Integer;

public class LrcTimeLine extends View	// class@00205b
{
    public Paint b;
    public int c;
    public int d;
    public boolean e;
    public float f;
    public static final int g;

    static {
       LrcTimeLine.g = a1.e(2.00f);
    }
    public void LrcTimeLine(Context p0){
       super(p0, null, 0);
    }
    public void LrcTimeLine(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LrcTimeLine(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.b3);
       int i = 1;
       this.e = typedArray.getBoolean(i, i);
       this.f = (float)typedArray.getDimensionPixelSize(0, LrcTimeLine.g);
       typedArray.recycle();
       if (PatchProxy.applyVoid(null, this, LrcTimeLine.class, "1")) {
       }else {
          Paint paint = new Paint(i);
          this.b = paint;
          paint.setColor(-1);
       }
       return;
    }
    public void onDraw(Canvas p0){
       float f;
       float f2;
       if (PatchProxy.applyVoidOneRefs(p0, this, LrcTimeLine.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (this.e != null) {
          int i = 0;
          LrcTimeLine tc = this.c;
          while (i < tc) {
             f = (float)i;
             float f1 = f * 0x3f800000;
             f1 = f1 / (float)tc;
             f2 = 0x3f800000 - f1;
             f2 = f2 * 153.00f;
             this.b.setAlpha((int)f2);
             float f3 = f + this.f;
             p0.drawRect(f, 0, f3, (float)this.d, this.b);
             f2 = this.f * 2.00f;
             f = f + f2;
             i = (int)f;
          }
       }else {
          LrcTimeLine tc1 = this.c;
          f = (float)tc1;
          f2 = f - this.f;
          while (f2 >= 0) {
             float f4 = f * 0x3f800000;
             f4 = f4 / (float)this.c;
             f4 = f4 * 153.00f;
             this.b.setAlpha((int)f4);
             f4 = f - this.f;
             p0.drawRect(f4, 0, f, (float)this.d, this.b);
             f2 = this.f * 2.00f;
             f = f - f2;
             tc1 = (int)f;
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LrcTimeLine.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LrcTimeLine.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.c = this.getWidth();
       this.d = this.getHeight();
       return;
    }
}
