package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBackgroundView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Path;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.graphics.Canvas;
import android.graphics.Path$Direction;

public final class LiveGiftBackgroundView extends View	// class@00120f
{
    public final float[] b;
    public final Path c;
    public final RectF d;
    public HashMap e;

    public void LiveGiftBackgroundView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveGiftBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveGiftBackgroundView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       float[] uofloatArray = new float[8];
       this.b = uofloatArray;
       this.c = new Path();
       this.d = new RectF();
       this.a(0, 0, 0, 0);
    }
    public void LiveGiftBackgroundView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveGiftBackgroundView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveGiftBackgroundView.class, "2")) {
          return;
       }
       LiveGiftBackgroundView tb = this.b;
       float f = (float)p0;
       tb[0] = f;
       tb[1] = f;
       float f1 = (float)p1;
       tb[2] = f1;
       tb[3] = f1;
       f1 = (float)p2;
       tb[4] = f1;
       tb[5] = f1;
       f1 = (float)p3;
       tb[6] = f1;
       tb[7] = f1;
       this.invalidate();
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBackgroundView.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       this.d.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       this.c.reset();
       this.c.addRoundRect(this.d, this.b, Path$Direction.CW);
       p0.clipPath(this.c);
       super.draw(p0);
       return;
    }
}
