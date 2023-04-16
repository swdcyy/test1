package com.yxcorp.gifshow.v3.editor.sticker.widget.GreyTimeStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import java.lang.String;
import android.graphics.Color;
import lnc.a1;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import itc.k3;
import android.graphics.Paint$Style;
import android.graphics.Typeface;
import android.graphics.Paint$Align;
import android.graphics.Paint;
import android.graphics.Paint$FontMetrics;

public class GreyTimeStickerView extends EditStickerBaseView	// class@0012e5
{
    public final RectF e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int[] j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int[] q;
    public static final int r;
    public static final int s;
    public static final int t;

    static {
       GreyTimeStickerView.f = Color.parseColor("#809C9C9C");
       GreyTimeStickerView.g = a1.e(32.00f);
       GreyTimeStickerView.h = a1.e(43.00f);
       GreyTimeStickerView.i = a1.e(4.00f);
       int[] ointArray = new int[]{a1.e(17.50f),a1.e(53.50f),a1.e(98.50f),a1.e(134.50f)};
       GreyTimeStickerView.j = ointArray;
       GreyTimeStickerView.k = a1.e(76.00f);
       GreyTimeStickerView.l = a1.e(3.00f);
       GreyTimeStickerView.m = a1.e(-4.00f);
       GreyTimeStickerView.n = a1.e(45.00f);
       GreyTimeStickerView.o = a1.e(2.50f);
       GreyTimeStickerView.p = a1.e(89.50f);
       ointArray = new int[]{a1.e(89.00f),a1.e(103.00f)};
       GreyTimeStickerView.q = ointArray;
       GreyTimeStickerView.r = a1.e(12.00f);
       GreyTimeStickerView.s = a1.e(168.50f);
       GreyTimeStickerView.t = a1.e(74.00f);
    }
    public void GreyTimeStickerView(Context p0){
       super(p0);
       this.e = new RectF();
    }
    public void GreyTimeStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = new RectF();
    }
    public void GreyTimeStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new RectF();
    }
    public void b(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GreyTimeStickerView.class, "1")) {
          return;
       }
       p0.save();
       String str = (k3.v()).replaceAll(":", "");
       p1.setStyle(Paint$Style.FILL);
       p1.setTextSize((float)GreyTimeStickerView.n);
       p1.setTypeface(Typeface.DEFAULT_BOLD);
       p1.setTextAlign(Paint$Align.LEFT);
       int i = 0;
       int i1 = 0;
       int[] j = GreyTimeStickerView.j;
       int i2 = -1;
       while (i1 < j.length) {
          int i3 = j[i1];
          int k = GreyTimeStickerView.k;
          int i4 = j[i1] + GreyTimeStickerView.g;
          int i5 = GreyTimeStickerView.h + k;
          this.e.set((float)i3, (float)k, (float)i4, (float)i5);
          p1.setColor(GreyTimeStickerView.f);
          i5 = GreyTimeStickerView.i;
          float f = (float)i5;
          p0.drawRoundRect(this.e, f, (float)i5, p1);
          p1.setColor(i2);
          i4 = i1 + 1;
          i3 = i3 + GreyTimeStickerView.l;
          k = k + GreyTimeStickerView.m;
          float f1 = (float)k;
          f1 = f1 - p1.getFontMetrics().ascent;
          p0.drawText(str.substring(i1, i4), (float)i3, f1, p1);
          i1 = i4;
       }
       p1.setColor(GreyTimeStickerView.f);
       int p = GreyTimeStickerView.p;
       i1 = GreyTimeStickerView.o;
       int[] q = GreyTimeStickerView.q;
       p0.drawCircle((float)(p + i1), (float)(q[i] + i1), (float)i1, p1);
       p0.drawCircle((float)(p + i1), (float)(q[1] + i1), (float)i1, p1);
       p1.setColor(i2);
       p1.setTextSize((float)GreyTimeStickerView.r);
       p1.setTypeface(Typeface.DEFAULT);
       p0.drawText(k3.i(), (float)GreyTimeStickerView.s, ((float)(this.getStickerSize() - GreyTimeStickerView.t) - p1.getFontMetrics().descent), p1);
       p0.restore();
       return;
    }
}
