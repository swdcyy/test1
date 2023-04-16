package com.yxcorp.gifshow.v3.widget.FadingEdgeContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Canvas;
import android.view.View;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.graphics.Shader;

public class FadingEdgeContainer extends FrameLayout	// class@00164b
{
    public int b;
    public Paint c;
    public Matrix d;
    public Shader e;
    public Shader f;
    public int g;

    public void FadingEdgeContainer(Context p0){
       super(p0);
       this.b = 0;
       this.c = new Paint();
       this.d = new Matrix();
       this.g = 0;
    }
    public void FadingEdgeContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.c = new Paint();
       this.d = new Matrix();
       this.g = 0;
    }
    public void FadingEdgeContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = new Paint();
       this.d = new Matrix();
       this.g = 0;
    }
    public void a(int p0,int p1){
       int i = this;
       int i1 = p0;
       int i2 = p1;
       if (PatchProxy.isSupport(FadingEdgeContainer.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), i, FadingEdgeContainer.class, "1")) {
          return;
       }
       i.b = i1;
       i.g = i2;
       if (!i1 || i2 <= 0) {
          i.e = null;
          i.f = null;
          i.setLayerType(0, null);
       }else {
          LinearGradient linearGradie = new LinearGradient(0, 0, 0x3f800000, 0, 0xff000000, 0, Shader$TileMode.CLAMP);
          i.e = i1;
          LinearGradient linearGradie1 = new LinearGradient(0, 0, 0x3f800000, 0, 0, 0xff000000, Shader$TileMode.CLAMP);
          i.f = i1;
          i.c.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          i.setLayerType(2, null);
       }
       this.postInvalidate();
       return;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       FadingEdgeContainer obj;
       if (PatchProxy.isSupport(FadingEdgeContainer.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, FadingEdgeContainer.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.drawChild(p0, p1, p2);
       if (this.g <= null) {
          return b;
       }else {
          FadingEdgeContainer tb = this.b;
          obj = 3;
          float f = 0;
          float f1 = 0x3f800000;
          if (tb != 1 && (tb == obj && !PatchProxy.applyVoidOneRefs(p0, this, FadingEdgeContainer.class, "3"))) {
             this.c.setShader(this.e);
             this.d.setScale((float)this.g, f1);
             this.d.postTranslate(f, f);
             this.e.setLocalMatrix(this.d);
             new Paint().setColor(-1);
             p0.drawRect(0, 0, (float)this.g, (float)this.getHeight(), this.c);
          }
          tb = this.b;
          if (tb != 2 && (tb == obj && !PatchProxy.applyVoidOneRefs(p0, this, FadingEdgeContainer.class, "4"))) {
             this.c.setShader(this.f);
             this.d.setScale((float)this.g, f1);
             this.d.postTranslate((float)(this.getWidth() - this.g), f);
             this.f.setLocalMatrix(this.d);
             p0.drawRect((float)(this.getWidth() - this.g), 0, (float)this.getWidth(), (float)this.getHeight(), this.c);
          }
          return b;
       }
    }
}
