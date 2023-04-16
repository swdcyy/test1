package com.yxcorp.gifshow.v3.editor.sticker.widget.OrangeIdStickerView;
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
import java.lang.ref.WeakReference;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.io.File;
import qkd.b;
import java.lang.Boolean;
import android.view.View;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import o56.c;
import o56.a;
import android.app.Application;
import android.graphics.Typeface;
import ekd.d0;
import itc.k3;
import android.graphics.Paint$FontMetrics;

public class OrangeIdStickerView extends EditStickerBaseView	// class@0012ea
{
    public static WeakReference e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;

    static {
       OrangeIdStickerView.f = a1.e(13.50f);
       OrangeIdStickerView.g = a1.e(85.00f);
       OrangeIdStickerView.h = a1.e(97.00f);
       OrangeIdStickerView.i = a1.e(24.00f);
       OrangeIdStickerView.j = a1.e(4.00f);
       OrangeIdStickerView.k = a1.e(13.00f);
       OrangeIdStickerView.l = a1.e(0x431f0000);
       OrangeIdStickerView.m = a1.e(81.00f);
       OrangeIdStickerView.n = a1.e(18.00f);
    }
    public void OrangeIdStickerView(Context p0){
       super(p0);
    }
    public void OrangeIdStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void OrangeIdStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OrangeIdStickerView.class, "2")) {
          return;
       }
       WeakReference e = OrangeIdStickerView.e;
       if (e == null || !BitmapUtil.I(e.get())) {
          File resourcePict = this.getResourcePictureFile();
          if (!b.S(resourcePict)) {
             return;
          }
          this.f(resourcePict, true);
          return;
       }else {
          this.h(p0, p1);
          return;
       }
    }
    public void c(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OrangeIdStickerView.class, "3")) {
          return;
       }
       WeakReference e = OrangeIdStickerView.e;
       if (e == null || !BitmapUtil.I(e.get())) {
          File resourcePict = this.getResourcePictureFile();
          if (!b.S(resourcePict)) {
             return;
          }else {
             this.f(resourcePict, false);
          }
       }
       this.h(p0, p1);
       return;
    }
    public void g(WeakReference p0,boolean p1){
       if (PatchProxy.isSupport(OrangeIdStickerView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, OrangeIdStickerView.class, "1")) {
          return;
       }
       OrangeIdStickerView.e = p0;
       if (p1) {
          this.postInvalidate();
       }
       return;
    }
    public final void h(Canvas p0,TextPaint p1){
       int i1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OrangeIdStickerView.class, "4")) {
          return;
       }
       p0.save();
       Bitmap uBitmap = OrangeIdStickerView.e.get();
       if (BitmapUtil.I(uBitmap)) {
          p0.drawBitmap(uBitmap, 0, 0, p1);
       }
       p1.setTextAlign(Paint$Align.LEFT);
       p1.setTypeface(d0.d(a.a().a()));
       String str = k3.w();
       p1.setTextSize((float)OrangeIdStickerView.f);
       int h = OrangeIdStickerView.h;
       boolean b = false;
       for (int i = 0; i < str.length(); i = i1) {
          i1 = i + 1;
          float f = (float)OrangeIdStickerView.g - p1.getFontMetrics().ascent;
          p0.drawText(str.substring(i, i1), (float)h, f, p1);
          h = h + OrangeIdStickerView.i;
       }
       str = k3.j(b);
       p1.setTypeface(k3.k());
       h = OrangeIdStickerView.j;
       i = OrangeIdStickerView.k;
       i1 = OrangeIdStickerView.n;
       int l = OrangeIdStickerView.l;
       if (k3.x(str, i, l, h, p1)) {
          i = k3.u(str, l, i, h, p1);
       }else {
          h = k3.o(str, l, i, h, p1);
       }
       p1.setTextSize((float)i);
       p1.setColor(-1);
       for (; b < str.length(); b = i) {
          i = b + 1;
          float f1 = (float)OrangeIdStickerView.m - p1.getFontMetrics().descent;
          p0.drawText(str.substring(b, i), (float)i1, f1, p1);
          l = (int)p1.measureText(str.substring(b, i)) + h;
          i1 = i1 + l;
       }
       p0.restore();
       return;
    }
}
