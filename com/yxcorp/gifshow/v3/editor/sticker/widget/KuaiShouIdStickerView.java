package com.yxcorp.gifshow.v3.editor.sticker.widget.KuaiShouIdStickerView;
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
import itc.k3;
import android.graphics.Paint$Align;
import android.graphics.Paint$FontMetrics;

public class KuaiShouIdStickerView extends EditStickerBaseView	// class@0012e6
{
    public static WeakReference e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;

    static {
       KuaiShouIdStickerView.f = a1.e(107.00f);
       KuaiShouIdStickerView.g = a1.e(13.00f);
       KuaiShouIdStickerView.h = a1.e(0x42f30000);
       KuaiShouIdStickerView.i = a1.e(44.50f);
       KuaiShouIdStickerView.j = a1.e(0x3f800000);
    }
    public void KuaiShouIdStickerView(Context p0){
       super(p0);
    }
    public void KuaiShouIdStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void KuaiShouIdStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaiShouIdStickerView.class, "2")) {
          return;
       }
       WeakReference e = KuaiShouIdStickerView.e;
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaiShouIdStickerView.class, "3")) {
          return;
       }
       WeakReference e = KuaiShouIdStickerView.e;
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
       if (PatchProxy.isSupport(KuaiShouIdStickerView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, KuaiShouIdStickerView.class, "1")) {
          return;
       }
       KuaiShouIdStickerView.e = p0;
       if (p1) {
          this.postInvalidate();
       }
       return;
    }
    public final void h(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaiShouIdStickerView.class, "4")) {
          return;
       }
       p0.save();
       Bitmap uBitmap = KuaiShouIdStickerView.e.get();
       if (BitmapUtil.I(uBitmap)) {
          p0.drawBitmap(uBitmap, 0, 0, p1);
       }
       int i = -1;
       p1.setColor(i);
       String str = k3.j(true);
       int g = KuaiShouIdStickerView.g;
       int j = KuaiShouIdStickerView.j;
       int i1 = KuaiShouIdStickerView.i;
       p1.setTextAlign(Paint$Align.LEFT);
       int f = KuaiShouIdStickerView.f;
       if (k3.x(str, g, f, j, p1)) {
          g = k3.u(str, f, g, j, p1);
       }else {
          j = k3.o(str, f, g, j, p1);
       }
       p1.setTextSize((float)g);
       p1.setColor(i);
       for (i = 0; i < str.length(); i = g) {
          g = i + 1;
          float f1 = (float)KuaiShouIdStickerView.h - p1.getFontMetrics().ascent;
          float f2 = p1.getFontMetrics().descent - p1.getFontMetrics().ascent;
          f2 = f2 + p1.getFontMetrics().leading;
          f2 = f2 / 2.00f;
          f1 = f1 - f2;
          p0.drawText(str.substring(i, g), (float)i1, f1, p1);
          f = (int)p1.measureText(str.substring(i, g)) + j;
          i1 = i1 + f;
       }
       p0.restore();
       return;
    }
}
