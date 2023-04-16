package com.frog.engine.view.FrogEGLConfigChooser;
import android.opengl.GLSurfaceView$EGLConfigChooser;
import java.lang.Object;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.frog.engine.view.FrogEGLConfigChooser$a;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Number;

public class FrogEGLConfigChooser implements GLSurfaceView$EGLConfigChooser	// class@001582
{
    public int[] configAttribs;

    public void FrogEGLConfigChooser(int p0,int p1,int p2,int p3,int p4,int p5){
       super();
       int[] ointArray = new int[]{p0,p1,p2,p3,p4,p5};
       this.configAttribs = ointArray;
    }
    public void FrogEGLConfigChooser(int[] p0){
       super();
       this.configAttribs = p0;
    }
    public EGLConfig chooseConfig(EGL10 p0,EGLDisplay p1){
       int i;
       object oobject;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       FrogEGLConfigChooser obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, FrogEGLConfigChooser.class, "2");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       int[] ointArray = new int[]{0x3024,obj3[0],0x3023,obj3[1],0x3022,obj3[2],0x3021,obj3[i],0x3025,obj3[4],0x3026,obj3[5],0x3040,4,0x3038};
       obj3 = obj.configAttribs;
       i = 3;
       EGLConfig[] uEGLConfigAr = new EGLConfig[1];
       int[] ointArray1 = new int[1];
       if (p0.eglChooseConfig(p1, ointArray, uEGLConfigAr, 1, ointArray1) && ointArray1[0] > 0) {
          return uEGLConfigAr[0];
       }
       int[] ointArray2 = new int[i]{0x3040,4,0x3038};
       if (!p0.eglChooseConfig(p1, ointArray2, null, 0, ointArray1) || ointArray1[0] <= 0) {
          return null;
       }
       int i1 = ointArray1[0];
       FrogEGLConfigChooser$a[] uoaArray = new FrogEGLConfigChooser$a[i1];
       EGLConfig[] uEGLConfigAr1 = new EGLConfig[i1];
       EGLConfig[] uEGLConfigAr2 = uEGLConfigAr1;
       EGLConfig[] uEGLConfigAr3 = uEGLConfigAr1;
       p0.eglChooseConfig(p1, ointArray2, uEGLConfigAr2, i1, ointArray1);
       for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
          uoaArray[i2] = new FrogEGLConfigChooser$a(obj, obj1, obj2, uEGLConfigAr3[i2]);
       }
       FrogEGLConfigChooser$a uoa = new FrogEGLConfigChooser$a(obj, obj.configAttribs);
       int i3 = i1;
       int i4 = 0;
       int i5 = i3 - 1;
       while (i4 < i5) {
          i5 = i4 + i3;
          i5 = i5 / 2;
          FrogEGLConfigChooser$a c = uoa.c;
          FrogEGLConfigChooser$a c1 = uoaArray[i5].c;
          if (c < c1) {
             oobject = -1;
          }else if(c > c1){
             oobject = 1;
          }else {
             oobject = null;
          }
          if (oobject < 0) {
             i3 = i5;
          }else {
             i4 = i5;
          }
       }
       if (i4 != (i1 - 1)) {
          i4 = i4 + 1;
       }
       "Can\'t find EGLConfig match: "+uoa+", instead of closest one:"+uoaArray[i4];
       return uoaArray[i4].a;
    }
    public int findConfigAttrib(EGL10 p0,EGLDisplay p1,EGLConfig p2,int p3,int p4){
       int[] obj;
       if (PatchProxy.isSupport(FrogEGLConfigChooser.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, FrogEGLConfigChooser.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = new int[1];
       if (p0.eglGetConfigAttrib(p1, p2, p3, obj)) {
          return obj[0];
       }else {
          return p4;
       }
    }
}
