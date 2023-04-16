package com.yxcorp.gifshow.widget.DetailFollowLinearLayout;
import android.widget.LinearLayout;
import lnc.a1;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;

public class DetailFollowLinearLayout extends LinearLayout	// class@001818
{
    public final Paint b;
    public float c;
    public static final int d;

    static {
       DetailFollowLinearLayout.d = a1.e(35.00f);
    }
    public void DetailFollowLinearLayout(Context p0){
       super(p0);
       this.b = new Paint();
       this.c();
    }
    public void DetailFollowLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Paint();
       this.c();
    }
    public void DetailFollowLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint();
       this.c();
    }
    public void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailFollowLinearLayout.class, "3")) {
          return;
       }
       p0.drawColor(0, PorterDuff$Mode.MULTIPLY);
       int height = p0.getHeight();
       float f = (float)p0.getWidth();
       p0.saveLayer(0, 0, f, (float)height, null, 31);
       this.getBackground().draw(p0);
       p0.drawCircle(f, (float)(height / 2), this.c, this.b);
       p0.restore();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, DetailFollowLinearLayout.class, "1")) {
          return;
       }
       this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
       this.b.setColor(0);
       this.c = (float)(DetailFollowLinearLayout.d / 2);
       this.setLayerType(1, null);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailFollowLinearLayout.class, "2")) {
          return;
       }
       super.onDraw(p0);
       this.a(p0);
       return;
    }
}
