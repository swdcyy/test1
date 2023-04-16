package com.kwai.sharelib.ui.poster.PosterRoundCorner;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;

public class PosterRoundCorner extends FrameLayout	// class@001720
{
    public float b;
    public float c;
    public float d;
    public float e;

    public void PosterRoundCorner(Context p0){
       super(p0, null, 0);
    }
    public void PosterRoundCorner(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PosterRoundCorner(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = p0.getResources().getDimension(0x7f070cba);
       this.c = p0.getResources().getDimension(0x7f070cba);
       this.d = p0.getResources().getDimension(0x7f070cba);
       this.e = p0.getResources().getDimension(0x7f070cba);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PosterRoundCorner.class, "1")) {
          return;
       }
       Path path = new Path();
       path.moveTo(0, this.b);
       PosterRoundCorner tb = this.b;
       float f = tb * 2.00f;
       RectF rectF = new RectF(0, 0, f, (tb * 2.00f));
       path.arcTo(rectF, -180.00f, 90.00f);
       float f1 = (float)this.getWidth();
       path.lineTo((f1 - this.c), 0);
       tb = this.c;
       path.arcTo(new RectF((f1 - (tb * 2.00f)), 0, f1, (tb * 2.00f)), -90.00f, 90.00f);
       float f2 = (float)this.getHeight();
       path.lineTo(f1, (f2 - this.d));
       tb = this.d;
       path.arcTo(new RectF((f1 - (tb * 2.00f)), (f2 - (tb * 2.00f)), f1, f2), 0, 90.00f);
       path.lineTo(this.e, f2);
       PosterRoundCorner te = this.e;
       path.arcTo(new RectF(0, (f2 - (te * 2.00f)), (te * 2.00f), f2), 90.00f, 90.00f);
       path.close();
       p0.clipPath(path);
       super.dispatchDraw(p0);
       return;
    }
}
