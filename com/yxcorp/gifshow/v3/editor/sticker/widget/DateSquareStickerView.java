package com.yxcorp.gifshow.v3.editor.sticker.widget.DateSquareStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.Paint;
import itc.k3;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Typeface;

public class DateSquareStickerView extends EditStickerBaseView	// class@0012e0
{
    public static final int e;
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

    static {
       DateSquareStickerView.e = a1.e(2.50f);
       DateSquareStickerView.f = a1.e(0x3fc00000);
       DateSquareStickerView.g = a1.e(70.50f);
       DateSquareStickerView.h = a1.e(43.00f);
       DateSquareStickerView.i = a1.e(72.50f);
       DateSquareStickerView.j = a1.e(0x42bf0000);
       DateSquareStickerView.k = a1.e(0x42df0000);
       DateSquareStickerView.l = a1.e(133.50f);
       DateSquareStickerView.m = a1.e(9.00f);
       DateSquareStickerView.n = a1.e(92.50f);
       DateSquareStickerView.o = a1.e(0x42bf0000);
       DateSquareStickerView.p = a1.e(132.50f);
       DateSquareStickerView.q = a1.e(132.50f);
       DateSquareStickerView.r = a1.e(47.50f);
    }
    public void DateSquareStickerView(Context p0){
       super(p0);
    }
    public void DateSquareStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DateSquareStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DateSquareStickerView.class, "1")) {
          return;
       }
       p0.save();
       p1.setStrokeWidth((float)DateSquareStickerView.e);
       p1.setStyle(Paint$Style.STROKE);
       int r = DateSquareStickerView.r;
       p0.drawRect(new Rect(r, r, (this.getStickerSize() - r), (this.getStickerSize() - r)), p1);
       p1.setStrokeWidth((float)DateSquareStickerView.f);
       r = DateSquareStickerView.g;
       p0.drawLine((float)(this.getStickerSize() - r), (float)r, (float)r, (float)(this.getStickerSize() - r), p1);
       p1.setStyle(Paint$Style.FILL);
       p1.setTextSize((float)DateSquareStickerView.h);
       p0.drawText(k3.p(), (float)DateSquareStickerView.i, (float)DateSquareStickerView.j, p1);
       p0.drawText(k3.l(), (float)DateSquareStickerView.k, (float)DateSquareStickerView.l, p1);
       p1.setTextSize((float)DateSquareStickerView.m);
       Typeface typeface = PatchProxy.apply(null, null, k3.class, "24");
       if (typeface != PatchProxyResult.class) {
       }else {
          typeface = Typeface.create("System", 1);
       }
       p1.setTypeface(typeface);
       p0.drawText("ÔÂ", (float)DateSquareStickerView.n, (float)DateSquareStickerView.o, p1);
       p0.drawText("ÈÕ", (float)DateSquareStickerView.p, (float)DateSquareStickerView.q, p1);
       p0.restore();
       return;
    }
}
