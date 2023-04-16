package com.yxcorp.gifshow.v3.editor.sticker.widget.OrangeDateTimeStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.text.TextPaint;
import com.kwai.robust.PatchProxyResult;
import itc.k3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import com.yxcorp.gifshow.v3.editor.sticker.h1;

public class OrangeDateTimeStickerView extends EditStickerBaseView	// class@0012e8
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

    static {
       OrangeDateTimeStickerView.e = a1.e(3.00f);
       OrangeDateTimeStickerView.f = a1.e(60.00f);
       OrangeDateTimeStickerView.g = a1.e(39.50f);
       OrangeDateTimeStickerView.h = a1.e(108.50f);
       OrangeDateTimeStickerView.i = a1.e(0x42f70000);
       OrangeDateTimeStickerView.j = a1.e(108.50f);
       OrangeDateTimeStickerView.k = a1.e(20.00f);
       OrangeDateTimeStickerView.l = a1.e(39.50f);
       OrangeDateTimeStickerView.m = a1.e(128.50f);
       OrangeDateTimeStickerView.n = a1.e(66.50f);
       OrangeDateTimeStickerView.o = a1.e(0x41f40000);
    }
    public void OrangeDateTimeStickerView(Context p0){
       super(p0);
    }
    public void OrangeDateTimeStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void OrangeDateTimeStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Canvas p0,TextPaint p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k3 ok3 = k3.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OrangeDateTimeStickerView.class, "1")) {
          return;
       }
       p0.save();
       p1.setStrokeWidth((float)OrangeDateTimeStickerView.e);
       p1.setColor(-45056);
       int o = OrangeDateTimeStickerView.o;
       float f = (float)o;
       int n = OrangeDateTimeStickerView.n;
       float f1 = (float)n;
       float f2 = (float)o;
       p0.drawLine(f, f1, f2, (float)(this.getStickerSize() - n), p1);
       p1.setColor(-1);
       p1.setTextAlign(Paint$Align.LEFT);
       p1.setTextSize((float)OrangeDateTimeStickerView.f);
       Object[] objArray = null;
       String str = PatchProxy.apply(objArray, objArray, ok3, "8");
       if (str != patchProxyRe) {
       }else {
          Locale uS = Locale.US;
          SimpleDateFormat simpleDateFo1 = new SimpleDateFormat("MMM", uS);
          Date uDate1 = (h1.e() == null)? new Date(): h1.e();
          str = (simpleDateFo1.format(uDate1)).toUpperCase(uS);
       }
       p0.drawText(str, (float)OrangeDateTimeStickerView.g, (float)OrangeDateTimeStickerView.h, p1);
       p0.drawText(k3.l(), (float)OrangeDateTimeStickerView.i, (float)OrangeDateTimeStickerView.j, p1);
       p1.setTextSize((float)OrangeDateTimeStickerView.k);
       String str1 = PatchProxy.apply(objArray, objArray, ok3, "5");
       if (str1 != patchProxyRe) {
       }else {
          SimpleDateFormat simpleDateFo = new SimpleDateFormat("HH:mm");
          Date uDate = (h1.e() == null)? new Date(): h1.e();
          str1 = simpleDateFo.format(uDate);
       }
       p0.drawText(str1, (float)OrangeDateTimeStickerView.l, (float)OrangeDateTimeStickerView.m, p1);
       p0.restore();
       return;
    }
}
