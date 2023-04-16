package com.kwai.live.gzone.widget.VerticalFadeView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Matrix;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.View;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;

public class VerticalFadeView extends FrameLayout	// class@000e83
{
    public Paint b;
    public Matrix c;
    public Shader d;
    public int e;

    public void VerticalFadeView(Context p0){
       super(p0, null);
    }
    public void VerticalFadeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VerticalFadeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, VerticalFadeView.class, "1")) {
       }else {
          this.b = new Paint();
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, 0x3f800000, 0xff000000, 0, Shader$TileMode.CLAMP);
          this.d = new Paint();
          this.b.setShader(new Paint());
          this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.c = new Matrix();
          this.e = this.getVerticalFadingEdgeLength();
          if (!PatchProxy.applyVoid(null, this, VerticalFadeView.class, "2") && this.a()) {
             this.setLayerType(2, null);
          }
       }
       return;
    }
    public final boolean a(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalFadeView.class, "5")) {
          return;
       }
       super.draw(p0);
       return;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       VerticalFadeView verticalFade = this;
       if (PatchProxy.isSupport(VerticalFadeView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, VerticalFadeView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.drawChild(p0, p1, p2);
       if (verticalFade.e <= null || (this.a() && !PatchProxy.applyVoidOneRefs(p0, this, VerticalFadeView.class, "3"))) {
          int paddingTop = this.getPaddingTop();
          VerticalFadeView e = verticalFade.e;
          int i = this.getHeight() - this.getPaddingBottom();
          float f = (float)e;
          verticalFade.c.setScale(0x3f800000, f);
          verticalFade.c.postRotate(180.00f);
          float f1 = (float)0;
          float f2 = (float)i;
          verticalFade.c.postTranslate(f1, f2);
          verticalFade.d.setLocalMatrix(verticalFade.c);
          verticalFade.b.setShader(verticalFade.d);
          float f3 = (float)this.getWidth();
          p0.drawRect(f1, (float)(i - e), f3, f2, verticalFade.b);
          verticalFade.c.setScale(0x3f800000, f);
          float f4 = (float)paddingTop;
          verticalFade.c.postTranslate(f1, f4);
          verticalFade.c.postRotate(0);
          verticalFade.d.setLocalMatrix(verticalFade.c);
          verticalFade.b.setShader(verticalFade.d);
          p0.drawRect(f1, f4, f3, (float)(paddingTop + e), verticalFade.b);
       }
    label_00ad :
       return b;
    }
}
