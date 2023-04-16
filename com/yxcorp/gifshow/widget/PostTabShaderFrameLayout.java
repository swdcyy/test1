package com.yxcorp.gifshow.widget.PostTabShaderFrameLayout;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
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
import java.lang.Integer;

public class PostTabShaderFrameLayout extends FrameLayout	// class@00189a
{
    public Paint b;
    public Paint c;
    public Matrix d;
    public Matrix e;
    public Shader f;
    public Shader g;
    public int h;
    public int i;
    public boolean j;
    public static final int k;
    public static final int l;

    static {
       PostTabShaderFrameLayout.k = a1.e(12.00f);
       PostTabShaderFrameLayout.l = a1.e(20.00f);
    }
    public void PostTabShaderFrameLayout(Context p0){
       super(p0);
       this.a(p0, null);
    }
    public void PostTabShaderFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0, p1);
    }
    public void PostTabShaderFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostTabShaderFrameLayout.class, "2")) {
          return;
       }
       int k = PostTabShaderFrameLayout.k;
       this.h = k;
       int l = PostTabShaderFrameLayout.l;
       this.i = l;
       int i = 1;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.h4);
          this.h = (int)typedArray.getDimension(0, (float)k);
          this.i = (int)typedArray.getDimension(i, (float)l);
          typedArray.recycle();
       }
       this.b = new Paint();
       LinearGradient linearGradie = new LinearGradient(0, 0, 0x3f800000, 0, 0xff000000, 0, Shader$TileMode.CLAMP);
       this.f = new Paint();
       this.b.setShader(new Paint());
       this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.d = new Matrix();
       this.c = new Paint();
       linearGradie = new LinearGradient(0, 0, 0x3f400000, 0, 0, 0xff000000, Shader$TileMode.CLAMP);
       this.g = new Paint();
       this.c.setShader(new Paint());
       this.c.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.e = new Matrix();
       if (this.b()) {
          i = 2;
       }
       this.setLayerType(i, null);
       return;
    }
    public final boolean b(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       if (PatchProxy.isSupport(PostTabShaderFrameLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, PostTabShaderFrameLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.drawChild(p0, p1, p2);
       if (this.j == null && !PatchProxy.applyVoidOneRefs(p0, this, PostTabShaderFrameLayout.class, "3")) {
          this.d.setScale((float)this.h, 0x3f800000);
          this.d.postTranslate(0, 0);
          this.f.setLocalMatrix(this.d);
          p0.drawRect(0, 0, (float)this.h, (float)this.getHeight(), this.b);
          this.e.setScale((float)this.i, 0x3f800000);
          this.e.postTranslate((float)(this.getWidth() - this.i), 0);
          this.g.setLocalMatrix(this.e);
          p0.drawRect((float)(this.getWidth() - this.i), 0, (float)this.getWidth(), (float)this.getHeight(), this.c);
       }
       return b;
    }
    public void setFadingEdgeLeft(int p0){
       if (PatchProxy.isSupport(PostTabShaderFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostTabShaderFrameLayout.class, "4")) {
          return;
       }
       this.h = p0;
       this.invalidate();
       return;
    }
    public void setFadingEdgeRight(int p0){
       if (PatchProxy.isSupport(PostTabShaderFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostTabShaderFrameLayout.class, "5")) {
          return;
       }
       this.i = p0;
       this.invalidate();
       return;
    }
    public void setHideFadingEdge(boolean p0){
       if (PatchProxy.isSupport(PostTabShaderFrameLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PostTabShaderFrameLayout.class, "1")) {
          return;
       }
       if (this.j == p0) {
          return;
       }
       this.j = p0;
       this.invalidate();
       return;
    }
}
