package com.yxcorp.gifshow.profile.widget.ArcView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint$Style;

public class ArcView extends View	// class@0015ec
{
    public final RectF b;
    public final Paint c;
    public int d;

    public void ArcView(Context p0){
       super(p0, null);
    }
    public void ArcView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ArcView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new RectF();
       this.c = new Paint();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.v);
       this.d = typedArray.getColor(0, 0xff000000);
       typedArray.recycle();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArcView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       float f = (float)this.getWidth();
       float f1 = (float)this.getHeight();
       this.b.set(0, (f1 - f), f, f1);
       this.c.setAntiAlias(true);
       this.c.setColor(this.d);
       this.c.setStyle(Paint$Style.FILL);
       p0.drawArc(this.b, 0, 180.00f, false, this.c);
       return;
    }
}
