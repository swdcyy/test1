package com.yxcorp.gifshow.camera.record.sidebar.SidebarShaderRightLayout;
import android.widget.LinearLayout;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
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
import android.graphics.Shader;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;

public class SidebarShaderRightLayout extends LinearLayout	// class@000f0f
{
    public Paint b;
    public Matrix c;
    public Shader d;
    public int e;
    public int f;
    public int g;
    public int h;

    public void SidebarShaderRightLayout(Context p0){
       super(p0);
       this.e = a1.e(150.00f);
       this.f = a1.e(585.00f);
       this.a();
    }
    public void SidebarShaderRightLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = a1.e(150.00f);
       this.f = a1.e(585.00f);
       this.a();
    }
    public void SidebarShaderRightLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = a1.e(150.00f);
       this.f = a1.e(585.00f);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SidebarShaderRightLayout.class, "1")) {
          return;
       }
       Paint paint = new Paint();
       this.b = paint;
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.c = new Matrix();
       int i = (this.b())? 2: 1;
       this.setLayerType(i, null);
       return;
    }
    public final boolean b(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       if (PatchProxy.isSupport(SidebarShaderRightLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, SidebarShaderRightLayout.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.drawChild(p0, p1, p2);
       if (!PatchProxy.applyVoidOneRefs(p0, this, SidebarShaderRightLayout.class, "2")) {
          this.c.setScale((float)this.g, 0x3f800000);
          this.c.postTranslate(0, (float)this.h);
          this.d.setLocalMatrix(this.c);
          SidebarShaderRightLayout tf = this.f;
          p0.drawRect(0, (float)(tf - this.h), (float)this.e, (float)tf, this.b);
       }
       return b;
    }
    public void setEndAlphaShaderStartY(int p0){
       if (PatchProxy.isSupport(SidebarShaderRightLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SidebarShaderRightLayout.class, "3")) {
          return;
       }
       this.h = p0 - this.getLayoutParams().topMargin;
       this.g = (this.f + this.getLayoutParams().topMargin) - p0;
       LinearGradient linearGradie = new LinearGradient(0, 0, 0, (float)this.g, 0, 0xff000000, Shader$TileMode.CLAMP);
       this.d = p0;
       this.b.setShader(p0);
       this.invalidate();
       return;
    }
}
