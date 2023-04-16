package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$c;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$b;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;

public class LiveGLTextureView$c extends LiveGLTextureView$b	// class@001b06
{
    public int[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final LiveGLTextureView j;

    public void LiveGLTextureView$c(LiveGLTextureView p0,int p1,int p2,int p3,int p4,int p5,int p6){
       this.j = p0;
       int[] ointArray = new int[]{0x3024,p1,0x3023,p2,0x3022,p3,0x3021,p4,0x3025,p5,0x3026,p6,0x3038};
       super(p0, ointArray);
       int[] ointArray1 = new int[1];
       this.c = ointArray1;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
    }
    public EGLConfig a(EGL10 p0,EGLDisplay p1,EGLConfig[] p2){
       object oobject;
       EGL10 this;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGLTextureView$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int len = p2.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = p2[i];
          int i1 = 0;
          LiveGLTextureView$c uoc = this;
          this = p0;
          EGLDisplay uEGLDisplay = p1;
          object oobject1 = oobject;
          int i2 = uoc.b(this, uEGLDisplay, oobject1, 0x3025, i1);
          int i3 = uoc.b(this, uEGLDisplay, oobject1, 0x3026, i1);
          if (i2 >= this.h && i3 >= this.i) {
             i1 = 0;
             uoc = this;
             this = p0;
             uEGLDisplay = p1;
             oobject1 = oobject;
             i2 = uoc.b(this, uEGLDisplay, oobject1, 0x3024, i1);
             int i4 = uoc.b(this, uEGLDisplay, oobject1, 0x3023, i1);
             int i5 = uoc.b(this, uEGLDisplay, oobject1, 0x3022, i1);
             i3 = uoc.b(this, uEGLDisplay, oobject1, 0x3021, i1);
             if (i2 == this.d && (i4 == this.e && (i5 == this.f && i3 == this.g))) {
                break ;
             }
          }
       label_0060 :
          i = i + 1;
       }
       return oobject;
    }
    public final int b(EGL10 p0,EGLDisplay p1,EGLConfig p2,int p3,int p4){
       LiveGLTextureView$c uoc = LiveGLTextureView$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0.eglGetConfigAttrib(p1, p2, p3, this.c)) {
          return this.c[0];
       }else {
          return p4;
       }
    }
}
