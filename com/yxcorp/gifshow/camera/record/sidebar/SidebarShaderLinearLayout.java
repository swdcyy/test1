package com.yxcorp.gifshow.camera.record.sidebar.SidebarShaderLinearLayout;
import android.widget.LinearLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
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
import android.view.ViewGroup;

public class SidebarShaderLinearLayout extends LinearLayout	// class@000f0e
{
    public Paint b;
    public Paint c;
    public Paint d;
    public Matrix e;
    public Matrix f;
    public Matrix g;
    public Shader h;
    public Shader i;
    public Shader j;
    public boolean k;
    public boolean l;
    public static final int m;
    public static final int n;
    public static final int o;

    static {
       SidebarShaderLinearLayout.m = a1.e(16.00f);
       SidebarShaderLinearLayout.n = a1.e(10.00f);
       SidebarShaderLinearLayout.o = a1.e(20.00f);
    }
    public void SidebarShaderLinearLayout(Context p0){
       super(p0);
       this.c();
    }
    public void SidebarShaderLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c();
    }
    public void SidebarShaderLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c();
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(SidebarShaderLinearLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SidebarShaderLinearLayout.class, "4")) {
          return;
       }
       if (p0 != this.l || p0 != this.k) {
          this.l = p0;
          this.k = p0;
          this.invalidate();
       }
       return;
    }
    public void b(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SidebarShaderLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SidebarShaderLinearLayout.class, "5")) {
          return;
       }
       if (p1 != this.l || p0 != this.k) {
          this.l = p1;
          this.k = p0;
          this.invalidate();
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, SidebarShaderLinearLayout.class, "1")) {
          return;
       }
       this.d = new Paint();
       LinearGradient linearGradie = new LinearGradient(0, 0, 0, (float)SidebarShaderLinearLayout.m, 0xff000000, 0xff000000, Shader$TileMode.CLAMP);
       this.j = v0;
       this.d.setShader(v0);
       this.d.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.g = new Matrix();
       this.b = new Paint();
       linearGradie = new LinearGradient(0, 0, 0, (float)SidebarShaderLinearLayout.n, 0xff000000, 0, Shader$TileMode.CLAMP);
       this.h = v0;
       this.b.setShader(v0);
       this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.e = new Matrix();
       this.c = new Paint();
       linearGradie = new LinearGradient(0, 0, 0, (float)SidebarShaderLinearLayout.o, 0, 0xff000000, Shader$TileMode.CLAMP);
       this.i = v0;
       this.c.setShader(v0);
       this.c.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.f = new Matrix();
       int i = (this.d())? 2: 1;
       this.setLayerType(i, null);
       return;
    }
    public final boolean d(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       if (PatchProxy.isSupport(SidebarShaderLinearLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, SidebarShaderLinearLayout.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = super.drawChild(p0, p1, p2);
       if (!PatchProxy.applyVoidOneRefs(p0, this, SidebarShaderLinearLayout.class, "2")) {
          int m = SidebarShaderLinearLayout.m;
          float f = (float)m;
          this.g.setScale(f, 0x3f800000);
          this.g.postTranslate(0, 0);
          this.j.setLocalMatrix(this.g);
          p0.drawRect(0, 0, (float)this.getWidth(), f, this.d);
          if (this.k != null) {
             int n = SidebarShaderLinearLayout.n;
             this.e.setScale((float)n, 0x3f800000);
             this.e.postTranslate(0, f);
             this.h.setLocalMatrix(this.e);
             p0.drawRect(0, f, (float)this.getWidth(), (float)(m + n), this.b);
          }
          if (this.l != null) {
             m = SidebarShaderLinearLayout.o;
             this.f.setScale((float)m, 0x3f800000);
             this.f.postTranslate(0, (float)(this.getHeight() - m));
             this.i.setLocalMatrix(this.f);
             p0.drawRect(0, (float)(this.getHeight() - m), (float)this.getWidth(), (float)this.getHeight(), this.c);
          }
       }
       return b;
    }
}
