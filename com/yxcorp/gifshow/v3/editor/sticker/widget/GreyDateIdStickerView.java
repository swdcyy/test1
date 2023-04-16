package com.yxcorp.gifshow.v3.editor.sticker.widget.GreyDateIdStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import lnc.a1;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.PorterDuff$Mode;
import android.graphics.Typeface;
import itc.k3;
import android.graphics.Paint$Align;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import java.lang.StringBuilder;
import o56.c;
import o56.a;
import android.app.Application;
import ekd.d0;
import android.graphics.Paint$Style;
import android.graphics.Xfermode;
import android.graphics.Bitmap;
import android.graphics.PorterDuffXfermode;
import android.graphics.Bitmap$Config;

public class GreyDateIdStickerView extends EditStickerBaseView	// class@0012e4
{
    public Rect e;
    public Paint f;
    public Bitmap g;
    public Canvas h;
    public Bitmap i;
    public Canvas j;
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
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
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int[] z;

    static {
       GreyDateIdStickerView.k = a1.e(27.00f);
       GreyDateIdStickerView.l = a1.e(18.00f);
       GreyDateIdStickerView.m = a1.e(43.00f);
       GreyDateIdStickerView.n = a1.e(16.00f);
       GreyDateIdStickerView.o = a1.e(60.00f);
       GreyDateIdStickerView.p = a1.e(72.00f);
       GreyDateIdStickerView.q = a1.e(98.00f);
       GreyDateIdStickerView.r = a1.e(150.00f);
       GreyDateIdStickerView.s = a1.e(13.00f);
       GreyDateIdStickerView.t = a1.e(104.50f);
       GreyDateIdStickerView.u = a1.e(153.50f);
       GreyDateIdStickerView.v = a1.e(19.00f);
       GreyDateIdStickerView.w = a1.e(18.00f);
       GreyDateIdStickerView.x = a1.e(131.00f);
       GreyDateIdStickerView.y = a1.e(18.00f);
       int[] ointArray = new int[]{a1.e(41.50f),a1.e(158.50f)};
       GreyDateIdStickerView.z = ointArray;
       GreyDateIdStickerView.A = a1.e(0x3f800000);
       GreyDateIdStickerView.B = a1.e(17.00f);
       GreyDateIdStickerView.C = a1.e(2.50f);
       GreyDateIdStickerView.D = a1.e(134.00f);
       GreyDateIdStickerView.E = a1.e(22.00f);
       GreyDateIdStickerView.F = a1.e(11.50f);
       GreyDateIdStickerView.G = a1.e(0x3f800000);
       GreyDateIdStickerView.H = a1.e(64.00f);
       GreyDateIdStickerView.I = a1.e(142.00f);
       GreyDateIdStickerView.J = a1.e(109.00f);
    }
    public void GreyDateIdStickerView(Context p0){
       super(p0);
       this.e = new Rect();
       this.h();
    }
    public void GreyDateIdStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = new Rect();
       this.h();
    }
    public void GreyDateIdStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new Rect();
       this.h();
    }
    public void b(Canvas p0,TextPaint p1){
       float f;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GreyDateIdStickerView.class, "2")) {
          return;
       }
       p0.save();
       int i = 0;
       this.h.drawColor(i, PorterDuff$Mode.CLEAR);
       this.j.drawColor(i, PorterDuff$Mode.CLEAR);
       int i1 = -1;
       p1.setColor(i1);
       p1.setTypeface(k3.k());
       p1.setTextAlign(Paint$Align.LEFT);
       p1.setTextSize((float)GreyDateIdStickerView.k);
       this.j.drawText(k3.w(), (float)GreyDateIdStickerView.l, ((float)GreyDateIdStickerView.m - p1.getFontMetrics().ascent), p1);
       p1.setTypeface(d0.d(a.a().a()));
       p1.setTextSize((float)GreyDateIdStickerView.p);
       this.j.drawText(k3.p()+"/"+k3.l(), (float)GreyDateIdStickerView.n, ((float)GreyDateIdStickerView.o - p1.getFontMetrics().ascent), p1);
       int s = GreyDateIdStickerView.s;
       this.j.drawCircle((float)(GreyDateIdStickerView.r + s), (float)(GreyDateIdStickerView.q + s), (float)s, p1);
       p1.setStyle(Paint$Style.FILL);
       int w = GreyDateIdStickerView.w;
       s = GreyDateIdStickerView.x;
       int[] z = GreyDateIdStickerView.z;
       int y = GreyDateIdStickerView.y;
       this.e.set(w, s, (z[i] + w), (s + y));
       this.j.drawRect(this.e, p1);
       p1.setStyle(Paint$Style.STROKE);
       p1.setStrokeWidth((float)GreyDateIdStickerView.A);
       int i2 = 1;
       this.e.set(w, s, (z[i2] + w), (y + s));
       this.j.drawRect(this.e, p1);
       p1.setTextSize((float)GreyDateIdStickerView.v);
       p1.setTypeface(k3.k());
       p1.setStyle(Paint$Style.FILL);
       this.h.drawText("»’", (float)GreyDateIdStickerView.u, ((float)GreyDateIdStickerView.t - p1.getFontMetrics().ascent), p1);
       p1.setTextSize((float)GreyDateIdStickerView.B);
       int e = GreyDateIdStickerView.E;
       for (w = 0; w < 4; w = s) {
          s = w + 1;
          f = (float)GreyDateIdStickerView.D - p1.getFontMetrics().ascent;
          this.h.drawText(("KUAI").substring(w, s), (float)e, f, p1);
          y = (int)p1.measureText(("KUAI").substring(w, s)) + GreyDateIdStickerView.C;
          e = e + y;
       }
       String str = k3.j(i2);
       w = GreyDateIdStickerView.F;
       s = GreyDateIdStickerView.G;
       int h = GreyDateIdStickerView.H;
       p1.setXfermode(null);
       y = GreyDateIdStickerView.J;
       if (k3.x(str, w, y, s, p1)) {
          w = k3.u(str, y, w, s, p1);
       }else {
          s = k3.o(str, y, w, s, p1);
       }
       p1.setTextSize((float)w);
       p1.setTextAlign(Paint$Align.LEFT);
       p1.setColor(i1);
       for (; i < str.length(); i = i1) {
          i1 = i + 1;
          f = (float)GreyDateIdStickerView.I - p1.getFontMetrics().ascent;
          float f1 = p1.getFontMetrics().descent - p1.getFontMetrics().ascent;
          f1 = f1 + p1.getFontMetrics().leading;
          f1 = f1 / 2.00f;
          f = f - f1;
          this.j.drawText(str.substring(i, i1), (float)h, f, p1);
          w = (int)p1.measureText(str.substring(i, i1)) + s;
          h = h + w;
       }
       p0.drawBitmap(this.i, 0, 0, null);
       p0.drawBitmap(this.g, 0, 0, this.f);
       p0.restoreToCount(p0.saveLayer(0, 0, (float)this.getStickerSize(), (float)this.getStickerSize(), null));
       p0.restore();
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, GreyDateIdStickerView.class, "1")) {
          return;
       }
       Paint paint = new Paint();
       this.f = paint;
       paint.setColor(0xff000000);
       this.f.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.f.setAntiAlias(true);
       this.g = Bitmap.createBitmap(this.getStickerSize(), this.getStickerSize(), Bitmap$Config.ARGB_4444);
       this.h = new Canvas(this.g);
       this.i = Bitmap.createBitmap(this.getStickerSize(), this.getStickerSize(), Bitmap$Config.ARGB_4444);
       this.j = new Canvas(this.i);
       return;
    }
}
