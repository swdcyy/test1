package com.frog.engine.view.FrogEGLConfigChooser$a;
import java.lang.Comparable;
import com.frog.engine.view.FrogEGLConfigChooser;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FrogEGLConfigChooser$a implements Comparable	// class@001581
{
    public EGLConfig a;
    public int[] b;
    public int c;

    public void FrogEGLConfigChooser$a(FrogEGLConfigChooser p0,EGL10 p1,EGLDisplay p2,EGLConfig p3){
       super();
       this.a = null;
       this.b = null;
       this.c = 0;
       this.a = p3;
       int[] ointArray = new int[6];
       this.b = ointArray;
       ointArray[0] = p0.findConfigAttrib(p1, p2, p3, 0x3024, 0);
       EGLDisplay uEGLDisplay = p2;
       EGLConfig uEGLConfig = p3;
       this.b[1] = p0.findConfigAttrib(p1, uEGLDisplay, uEGLConfig, 0x3023, 0);
       this.b[2] = p0.findConfigAttrib(p1, uEGLDisplay, uEGLConfig, 0x3022, 0);
       this.b[3] = p0.findConfigAttrib(p1, uEGLDisplay, uEGLConfig, 0x3021, 0);
       this.b[4] = p0.findConfigAttrib(p1, uEGLDisplay, uEGLConfig, 0x3025, 0);
       this.b[5] = p0.findConfigAttrib(p1, uEGLDisplay, uEGLConfig, 0x3026, 0);
       this.a();
    }
    public void FrogEGLConfigChooser$a(FrogEGLConfigChooser p0,int[] p1){
       super();
       this.a = null;
       this.b = null;
       this.c = 0;
       this.b = p1;
       this.a();
    }
    public final void a(){
       FrogEGLConfigChooser$a tb = this.b;
       int i = 4;
       if (tb[i] > 0) {
          this.c = (this.c + 0x20000000) + ((tb[i] % 64) << 6);
       }
       i = 5;
       if (tb[i] > 0) {
          this.c = (this.c + 0x10000000) + (tb[i] % 64);
       }
       i = 3;
       if (tb[i] > 0) {
          this.c = (this.c + 0x40000000) + ((tb[i] % 16) << 24);
       }
       i = 1;
       if (tb[i] > 0) {
          this.c = this.c + ((tb[i] % 16) << 20);
       }
       i = 2;
       if (tb[i] > 0) {
          this.c = this.c + ((tb[i] % 16) << 16);
       }
       if (tb[0] > 0) {
          this.c = this.c + ((tb[0] % 16) << 12);
       }
       return;
    }
    public int compareTo(Object p0){
       int i;
       FrogEGLConfigChooser$a tc = this.c;
       p0 = p0.c;
       if (tc < p0) {
          i = -1;
       }else if(tc > p0){
          i = 1;
       }else {
          i = 0;
       }
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FrogEGLConfigChooser$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{ color: "+this.b[3]+this.b[2]+this.b[1]+this.b[0]+"; depth: "+this.b[4]+"; stencil: "+this.b[5]+";}";
    }
}
