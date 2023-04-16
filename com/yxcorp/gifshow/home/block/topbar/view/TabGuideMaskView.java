package com.yxcorp.gifshow.home.block.topbar.view.TabGuideMaskView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;

public final class TabGuideMaskView extends View	// class@00168d
{
    public Paint b;
    public int c;
    public int d;
    public int e;

    public void TabGuideMaskView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
       this.b = new Paint();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabGuideMaskView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       if (p0 != null) {
          p0.save();
       }
       a.m(p0);
       p0.saveLayer(0, 0, (float)p0.getWidth(), (float)p0.getHeight(), null, 31);
       float f = (float)a1.d(0x7f070271);
       TabGuideMaskView tc = this.c;
       float f1 = (float)tc;
       RectF rectF = new RectF(f, f1, ((float)this.e - f), (float)(tc + this.d));
       p0.drawColor(a1.a(R.color.arg_RES_7f0600a7));
       this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.b.setColor(0xffff0000);
       p0.drawRoundRect(rectF, (float)a1.d(R.dimen.arg_RES_7f07042b), (float)a1.d(R.dimen.arg_RES_7f07042b), this.b);
       p0.restore();
       this.b.setXfermode(null);
       return;
    }
    public final void setMaskHeight(int p0){
       this.c = p0;
    }
    public final void setTransparentHeight(int p0){
       this.d = p0;
    }
    public final void setTransparentWidth(int p0){
       this.e = p0;
    }
}
