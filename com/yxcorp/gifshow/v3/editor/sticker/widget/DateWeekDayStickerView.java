package com.yxcorp.gifshow.v3.editor.sticker.widget.DateWeekDayStickerView;
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
import android.graphics.Typeface;
import com.kwai.robust.PatchProxyResult;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import com.yxcorp.gifshow.v3.editor.sticker.h1;

public class DateWeekDayStickerView extends EditStickerBaseView	// class@0012e1
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
       DateWeekDayStickerView.e = a1.e(2.00f);
       DateWeekDayStickerView.f = a1.e(0x3fc00000);
       DateWeekDayStickerView.g = a1.e(6.00f);
       DateWeekDayStickerView.h = a1.e(129.00f);
       DateWeekDayStickerView.i = a1.e(45.00f);
       DateWeekDayStickerView.j = a1.e(79.00f);
       DateWeekDayStickerView.k = a1.e(0x42f00000);
       DateWeekDayStickerView.l = a1.e(15.00f);
       DateWeekDayStickerView.m = a1.e(150.00f);
       DateWeekDayStickerView.n = a1.e(35.00f);
       DateWeekDayStickerView.o = a1.e(52.50f);
    }
    public void DateWeekDayStickerView(Context p0){
       super(p0);
    }
    public void DateWeekDayStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DateWeekDayStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DateWeekDayStickerView.class, "1")) {
          return;
       }
       p0.save();
       p1.setStrokeWidth((float)DateWeekDayStickerView.e);
       p1.setStyle(Paint$Style.STROKE);
       int o = DateWeekDayStickerView.o;
       int n = DateWeekDayStickerView.n;
       p0.drawRect(new Rect(o, n, (this.getStickerSize() - o), (this.getStickerSize() - n)), p1);
       p1.setStrokeWidth((float)DateWeekDayStickerView.f);
       o = DateWeekDayStickerView.g;
       int h = DateWeekDayStickerView.h;
       p0.drawLine((float)((this.getStickerSize() / 2) - (o / 2)), (float)h, (float)((this.getStickerSize() / 2) + (o / 2)), (float)h, p1);
       p1.setStyle(Paint$Style.FILL);
       p1.setTextSize((float)DateWeekDayStickerView.i);
       p0.drawText(k3.p(), (float)(this.getStickerSize() / 2), (float)DateWeekDayStickerView.j, p1);
       p0.drawText(k3.l(), (float)(this.getStickerSize() / 2), (float)DateWeekDayStickerView.k, p1);
       p1.setTextSize((float)DateWeekDayStickerView.l);
       p1.setTypeface(k3.m());
       String str = PatchProxy.apply(null, null, k3.class, "4");
       if (str != PatchProxyResult.class) {
       }else {
          Locale uS = Locale.US;
          SimpleDateFormat simpleDateFo = new SimpleDateFormat("EEEE", uS);
          Date uDate = (h1.e() == null)? new Date(): h1.e();
          str = (simpleDateFo.format(uDate)).toUpperCase(uS);
       }
       p0.drawText(str, (float)(this.getStickerSize() / 2), (float)DateWeekDayStickerView.m, p1);
       p0.restore();
       return;
    }
}
