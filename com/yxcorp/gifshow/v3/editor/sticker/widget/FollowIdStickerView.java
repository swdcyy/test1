package com.yxcorp.gifshow.v3.editor.sticker.widget.FollowIdStickerView;
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

public class FollowIdStickerView extends EditStickerBaseView	// class@0012e3
{
    public static WeakReference e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;

    static {
       FollowIdStickerView.f = a1.e(12.00f);
       FollowIdStickerView.g = a1.e(145.00f);
       FollowIdStickerView.h = a1.e(25.00f);
       FollowIdStickerView.i = a1.e(170.00f);
    }
    public void FollowIdStickerView(Context p0){
       super(p0);
    }
    public void FollowIdStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void FollowIdStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowIdStickerView.class, "2")) {
          return;
       }
       WeakReference e = FollowIdStickerView.e;
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowIdStickerView.class, "3")) {
          return;
       }
       WeakReference e = FollowIdStickerView.e;
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
       if (PatchProxy.isSupport(FollowIdStickerView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, FollowIdStickerView.class, "1")) {
          return;
       }
       FollowIdStickerView.e = p0;
       if (p1) {
          this.postInvalidate();
       }
       return;
    }
    public final void h(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowIdStickerView.class, "4")) {
          return;
       }
       p0.save();
       Bitmap uBitmap = FollowIdStickerView.e.get();
       if (BitmapUtil.I(uBitmap)) {
          p0.drawBitmap(uBitmap, 0, 0, p1);
       }
       p1.setColor(-1);
       p1.setTextAlign(Paint$Align.LEFT);
       String str = k3.j(true);
       if (TextUtils.isEmpty(str)) {
          return;
       }else {
          this.d(p0, str, FollowIdStickerView.f, FollowIdStickerView.h, (int)((float)FollowIdStickerView.i + (((p1.getFontMetrics().descent - p1.getFontMetrics().ascent) + p1.getFontMetrics().leading) / 2.00f)), FollowIdStickerView.g, p1);
          p0.restore();
          return;
       }
    }
}
