package com.yxcorp.gifshow.v3.editor.sticker.widget.TimeDashStickerView;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import itc.k3;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Typeface;
import java.io.File;
import ekd.d0;
import lnc.a1;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;

public class TimeDashStickerView extends EditStickerBaseView	// class@0012eb
{

    public void TimeDashStickerView(Context p0){
       super(p0);
    }
    public void TimeDashStickerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void TimeDashStickerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(Canvas p0,TextPaint p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TimeDashStickerView.class, "1")) {
          return;
       }
       p0.save();
       Typeface typeface = PatchProxy.apply(null, null, k3.class, "23");
       if (typeface != PatchProxyResult.class) {
       }else {
          typeface = d0.b(new File(k3.r(), "sticker_dash.ttf"));
       }
       p1.setTypeface(typeface);
       p1.setColor(-1);
       p1.setTextSize((float)a1.e(60.00f));
       Paint$FontMetrics fontMetrics = p1.getFontMetrics();
       p0.drawText(k3.v(), (float)((this.getStickerSize() / 2) - a1.e(12.00f)), (float)(((int)(((float)this.getStickerSize() - fontMetrics.top) - fontMetrics.bottom) / 2) - a1.e(5.00f)), p1);
       p1.setTextSize((float)a1.e(18.00f));
       fontMetrics = p1.getFontMetrics();
       p0.drawText(k3.i(), (float)a1.e(156.00f), (float)((int)(((float)a1.e(228.00f) - fontMetrics.top) - fontMetrics.bottom) / 2), p1);
       p0.restore();
       return;
    }
}
