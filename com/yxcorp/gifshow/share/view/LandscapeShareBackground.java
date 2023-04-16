package com.yxcorp.gifshow.share.view.LandscapeShareBackground;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import qrd.l1;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Integer;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;

public final class LandscapeShareBackground extends FrameLayout	// class@001c91
{
    public LinearGradient b;
    public Paint c;

    public void LandscapeShareBackground(Context p0){
       a.p(p0, "context");
       super(p0);
       Paint paint = new Paint();
       paint.setStyle(Paint$Style.FILL);
       this.c = paint;
       this.setWillNotDraw(false);
    }
    public void LandscapeShareBackground(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       Paint paint = new Paint();
       paint.setStyle(Paint$Style.FILL);
       this.c = paint;
       this.setWillNotDraw(false);
    }
    public void LandscapeShareBackground(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       Paint paint = new Paint();
       paint.setStyle(Paint$Style.FILL);
       this.c = paint;
       this.setWillNotDraw(false);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeShareBackground.class, "2")) {
          return;
       }
       super.onDraw(p0);
       if (p0 != null) {
          p0.drawRect(0, 0, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), this.c);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       int[] this;
       if (PatchProxy.isSupport(LandscapeShareBackground.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LandscapeShareBackground.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this = new int[]{0,0x40000000,0x73000000,(int)0xa6000000,(int)0xe6000000};
       LinearGradient linearGradie = new LinearGradient(0, 0, (float)p0, 0, this, new float[5]{0,0x3d75c28f,0x3e0f5c29,0x3e800000,0x3f800000}, Shader$TileMode.CLAMP);
       this.b = 5;
       this.c.setShader(5);
       return;
    }
}
