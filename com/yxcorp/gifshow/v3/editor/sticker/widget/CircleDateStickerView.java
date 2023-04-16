package com.yxcorp.gifshow.v3.editor.sticker.widget.CircleDateStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import java.lang.String;
import android.graphics.Color;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.graphics.Typeface;
import ekd.d0;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Paint$FontMetrics;
import java.lang.StringBuilder;
import itc.k3;

public class CircleDateStickerView extends EditStickerBaseView	// class@0012df
{
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;

    static {
       CircleDateStickerView.e = Color.parseColor("#809C9C9C");
       CircleDateStickerView.f = a1.e(80.00f);
       CircleDateStickerView.g = a1.e(71.00f);
       CircleDateStickerView.h = a1.e(2.50f);
       CircleDateStickerView.i = a1.e(32.00f);
       CircleDateStickerView.j = a1.e(39.50f);
       CircleDateStickerView.k = a1.e(60.50f);
       int[] ointArray = new int[]{a1.e(45.00f),a1.e(61.00f),a1.e(134.50f)};
       CircleDateStickerView.l = ointArray;
       int[] ointArray1 = new int[]{a1.e(77.00f),a1.e(0x42ef0000),a1.e(140.50f)};
       CircleDateStickerView.m = ointArray1;
       ointArray1 = new int[]{a1.e(105.00f),a1.e(0x3f333333)};
       CircleDateStickerView.n = ointArray1;
       CircleDateStickerView.o = a1.e(41.00f);
       CircleDateStickerView.p = a1.e(74.50f);
       CircleDateStickerView.q = a1.e(43.00f);
       CircleDateStickerView.r = a1.e(26.00f);
       CircleDateStickerView.s = a1.e(0x42f90000);
       CircleDateStickerView.t = a1.e(68.50f);
       CircleDateStickerView.u = a1.e(17.50f);
    }
    public void CircleDateStickerView(Context p0){
       super(p0);
    }
    public void CircleDateStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void CircleDateStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Canvas p0,TextPaint p1){
       Object obj = p1;
       if (PatchProxy.applyVoidTwoRefs(p0, obj, this, CircleDateStickerView.class, "1")) {
          return;
       }
       p0.save();
       obj.setTypeface(d0.d(a.a().a()));
       obj.setColor(CircleDateStickerView.e);
       obj.setStyle(Paint$Style.FILL);
       int u = CircleDateStickerView.u;
       int f = CircleDateStickerView.f;
       p0.drawCircle((float)(u + f), (float)(u + f), (float)f, obj);
       obj.setColor(-1);
       obj.setStyle(Paint$Style.STROKE);
       obj.setStrokeWidth((float)CircleDateStickerView.h);
       p0.drawCircle((float)(u + f), (float)(u + f), (float)CircleDateStickerView.g, obj);
       obj.setStyle(Paint$Style.FILL);
       obj.setTextSize((float)CircleDateStickerView.i);
       obj.setTextAlign(Paint$Align.LEFT);
       obj.setTypeface(Typeface.DEFAULT_BOLD);
       p0.drawText("TIME", (float)CircleDateStickerView.k, ((float)CircleDateStickerView.j - p1.getFontMetrics().ascent), obj);
       int[] l = CircleDateStickerView.l;
       int[] m = CircleDateStickerView.m;
       int[] n = CircleDateStickerView.n;
       Paint paint = p1;
       p0.drawLine((float)l[0], (float)m[0], (float)(l[0] + n[0]), (float)m[0], paint);
       p0.drawLine((float)l[0], (float)m[1], (float)(l[0] + n[0]), (float)m[1], paint);
       p0.drawLine((float)l[1], (float)m[2], (float)(l[1] + n[1]), (float)m[2], paint);
       p0.drawLine((float)l[2], (float)m[2], (float)(l[2] + n[1]), (float)m[2], paint);
       obj.setTextSize((float)CircleDateStickerView.o);
       p0.drawText(k3.p()+"/"+k3.l(), (float)CircleDateStickerView.q, ((float)CircleDateStickerView.p - p1.getFontMetrics().ascent), obj);
       obj.setTextSize((float)CircleDateStickerView.r);
       p0.drawText(k3.w(), (float)CircleDateStickerView.t, ((float)CircleDateStickerView.s - p1.getFontMetrics().ascent), obj);
       p0.restore();
       return;
    }
}
