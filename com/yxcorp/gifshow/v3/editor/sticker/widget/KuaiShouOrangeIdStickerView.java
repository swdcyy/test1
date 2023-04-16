package com.yxcorp.gifshow.v3.editor.sticker.widget.KuaiShouOrangeIdStickerView;
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
import itc.k3;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Paint$FontMetrics;

public class KuaiShouOrangeIdStickerView extends EditStickerBaseView	// class@0012e7
{
    public static WeakReference e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;

    static {
       KuaiShouOrangeIdStickerView.f = a1.e(11.50f);
       KuaiShouOrangeIdStickerView.g = a1.e(115.00f);
       KuaiShouOrangeIdStickerView.h = a1.e(180.00f);
       KuaiShouOrangeIdStickerView.i = a1.e(0x42fe0000);
    }
    public void KuaiShouOrangeIdStickerView(Context p0){
       super(p0);
    }
    public void KuaiShouOrangeIdStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void KuaiShouOrangeIdStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaiShouOrangeIdStickerView.class, "2")) {
          return;
       }
       WeakReference e = KuaiShouOrangeIdStickerView.e;
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaiShouOrangeIdStickerView.class, "3")) {
          return;
       }
       WeakReference e = KuaiShouOrangeIdStickerView.e;
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
       if (PatchProxy.isSupport(KuaiShouOrangeIdStickerView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, KuaiShouOrangeIdStickerView.class, "1")) {
          return;
       }
       KuaiShouOrangeIdStickerView.e = p0;
       if (p1) {
          this.postInvalidate();
       }
       return;
    }
    public final void h(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaiShouOrangeIdStickerView.class, "4")) {
          return;
       }
       p0.save();
       Bitmap uBitmap = KuaiShouOrangeIdStickerView.e.get();
       if (BitmapUtil.I(uBitmap)) {
          p0.drawBitmap(uBitmap, 0, 0, p1);
       }
       p1.setColor(-1);
       p1.setTextAlign(Paint$Align.RIGHT);
       String str = k3.j(true);
       if (TextUtils.isEmpty(str)) {
          return;
       }else {
          int h = KuaiShouOrangeIdStickerView.h;
          float f = (float)(int)((((float)KuaiShouOrangeIdStickerView.i + p1.getFontMetrics().descent) - p1.getFontMetrics().ascent) + p1.getFontMetrics().leading);
          p0.rotate((float)-9.17f, (float)h, f);
          p1.setTextSize((float)k3.u(str, KuaiShouOrangeIdStickerView.g, KuaiShouOrangeIdStickerView.f, 0, p1));
          p0.drawText(str, (float)h, f, p1);
          p0.restore();
          return;
       }
    }
}
