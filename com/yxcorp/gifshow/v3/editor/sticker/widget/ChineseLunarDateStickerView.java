package com.yxcorp.gifshow.v3.editor.sticker.widget.ChineseLunarDateStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import java.lang.String;
import android.graphics.Color;
import lnc.a1;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Typeface;
import itc.k3;
import itc.k3$a;
import android.graphics.Paint$FontMetrics;

public class ChineseLunarDateStickerView extends EditStickerBaseView	// class@0012de
{
    public final Rect e;
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int[] u;
    public static final int[] v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;

    static {
       ChineseLunarDateStickerView.f = Color.parseColor("#80FE5000");
       ChineseLunarDateStickerView.g = a1.e(0x3f800000);
       ChineseLunarDateStickerView.h = a1.e(3.00f);
       ChineseLunarDateStickerView.i = a1.e(5.00f);
       ChineseLunarDateStickerView.j = a1.e(75.00f);
       ChineseLunarDateStickerView.k = a1.e(43.00f);
       ChineseLunarDateStickerView.l = a1.e(11.00f);
       ChineseLunarDateStickerView.m = a1.e(38.00f);
       ChineseLunarDateStickerView.n = a1.e(78.50f);
       ChineseLunarDateStickerView.o = a1.e(42.00f);
       ChineseLunarDateStickerView.p = a1.e(51.00f);
       ChineseLunarDateStickerView.q = a1.e(0x3f000000);
       ChineseLunarDateStickerView.r = a1.e(0x41f80000);
       ChineseLunarDateStickerView.s = a1.e(67.50f);
       ChineseLunarDateStickerView.t = a1.e(0x3f400000);
       int[] ointArray = new int[]{a1.e(64.00f),a1.e(100.50f)};
       ChineseLunarDateStickerView.u = ointArray;
       int[] ointArray1 = new int[]{a1.e(0x41f80000),a1.e(50.00f)};
       ChineseLunarDateStickerView.v = ointArray1;
       ChineseLunarDateStickerView.w = a1.e(96.70f);
       ChineseLunarDateStickerView.x = a1.e(10.00f);
       ChineseLunarDateStickerView.y = a1.e(67.50f);
       ChineseLunarDateStickerView.z = a1.e(64.50f);
       ChineseLunarDateStickerView.A = a1.e(35.00f);
       ChineseLunarDateStickerView.B = a1.e(16.00f);
       ChineseLunarDateStickerView.C = a1.e(53.50f);
    }
    public void ChineseLunarDateStickerView(Context p0){
       super(p0);
       this.e = new Rect();
    }
    public void ChineseLunarDateStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = new Rect();
    }
    public void ChineseLunarDateStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new Rect();
    }
    public void b(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChineseLunarDateStickerView.class, "1")) {
          return;
       }
       p0.save();
       p1.setColor(-1);
       p1.setStrokeWidth((float)ChineseLunarDateStickerView.g);
       p1.setStyle(Paint$Style.STROKE);
       int c = ChineseLunarDateStickerView.C;
       int b = ChineseLunarDateStickerView.B;
       this.e.set(c, b, (this.getStickerSize() - c), (this.getStickerSize() - b));
       p0.drawRect(this.e, p1);
       p1.setStrokeWidth((float)ChineseLunarDateStickerView.h);
       int i = ChineseLunarDateStickerView.i;
       int i1 = i + c;
       int i2 = (this.getStickerSize() - i) - c;
       this.e.set(i1, (i + b), i2, ((this.getStickerSize() - i) - b));
       p0.drawRect(this.e, p1);
       p1.setColor(ChineseLunarDateStickerView.f);
       p1.setStyle(Paint$Style.FILL);
       c = ChineseLunarDateStickerView.l;
       p0.drawCircle((float)(ChineseLunarDateStickerView.j + c), (float)(ChineseLunarDateStickerView.k + c), (float)c, p1);
       p1.setColor(-1);
       p1.setTextSize((float)ChineseLunarDateStickerView.m);
       p1.setTextAlign(Paint$Align.LEFT);
       p1.setTypeface(k3.m());
       k3$a c1 = k3.n().c;
       i = ChineseLunarDateStickerView.n;
       int o = ChineseLunarDateStickerView.o;
       p0.drawText(c1.substring(0, 1), (float)i, ((float)o - p1.getFontMetrics().ascent), p1);
       float f = (float)i;
       p0.drawText(c1.substring(1, 2), f, (((float)o - p1.getFontMetrics().ascent) + (float)ChineseLunarDateStickerView.p), p1);
       p1.setStrokeWidth((float)ChineseLunarDateStickerView.q);
       int[] u = ChineseLunarDateStickerView.u;
       int[] v = ChineseLunarDateStickerView.v;
       Paint paint = p1;
       p0.drawLine((float)u[0], (float)(this.getStickerSize() - v[0]), (float)(u[0] + ChineseLunarDateStickerView.s), (float)(this.getStickerSize() - v[0]), paint);
       int r = ChineseLunarDateStickerView.r;
       p0.drawLine((float)u[0], (float)(this.getStickerSize() - v[1]), (float)(u[0] + r), (float)(this.getStickerSize() - v[1]), paint);
       p0.drawLine((float)u[1], (float)(this.getStickerSize() - v[1]), (float)(u[1] + r), (float)(this.getStickerSize() - v[1]), paint);
       b = ChineseLunarDateStickerView.t;
       p0.drawCircle((float)(ChineseLunarDateStickerView.w + b), (float)(this.getStickerSize() - v[1]), (float)b, p1);
       String str = k3.n().toString();
       p1.setTextSize((float)k3.u(str, ChineseLunarDateStickerView.y, ChineseLunarDateStickerView.x, 0, p1));
       p0.drawText(str, (float)ChineseLunarDateStickerView.z, ((float)this.getStickerSize() - ((float)ChineseLunarDateStickerView.A + p1.getFontMetrics().descent)), p1);
       p0.restore();
       return;
    }
}
