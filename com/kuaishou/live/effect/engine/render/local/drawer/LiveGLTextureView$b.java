package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$b;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$f;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.IllegalArgumentException;
import java.lang.Exception;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$j;

public abstract class LiveGLTextureView$b implements LiveGLTextureView$f	// class@001b05
{
    public int[] a;
    public final LiveGLTextureView b;

    public void LiveGLTextureView$b(LiveGLTextureView p0,int[] p1){
       this.b = p0;
       super();
       int[] obj = PatchProxy.applyOneRefs(p1, this, LiveGLTextureView$b.class, "2");
       if (obj != PatchProxyResult.class) {
          p1 = obj;
       }else if(p0.k != 2){
          int len = p1.length;
          obj = new int[(len + 2)];
          int i = len - 1;
          System.arraycopy(p1, 0, obj, 0, i);
          obj[i] = 0x3040;
          obj[len] = 4;
          len++;
          obj[len] = 0x3038;
          p1 = obj;
       }
       this.a = p1;
       return;
    }
    public abstract EGLConfig a(EGL10 p0,EGLDisplay p1,EGLConfig[] p2);
    public EGLConfig chooseConfig(EGL10 p0,EGLDisplay p1){
       int i;
       EGLConfig[] uEGLConfigAr;
       EGLConfig uEGLConfig;
       LiveGLTextureView m2;
       int[] obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveGLTextureView$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new int[1];
          if (!p0.eglChooseConfig(p1, this.a, null, 0, obj)) {
             throw new IllegalArgumentException("eglChooseConfig failed");
          }
       }catch(java.lang.Exception e1){
          m2 = this.b.m;
          if (m2 != null) {
             m2.a(e1);
          }
       }
       try{
          i = obj[0];
          if (i <= 0) {
             throw new IllegalArgumentException("No configs match configSpec");
          }
       }catch(java.lang.Exception e1){
          m2 = this.b.m;
          if (m2 != null) {
             m2.a(e1);
          }
       }
       try{
          uEGLConfigAr = new EGLConfig[i];
          if (!p0.eglChooseConfig(p1, this.a, uEGLConfigAr, i, obj)) {
             throw new IllegalArgumentException("eglChooseConfig#2 failed");
          }
       }catch(java.lang.Exception e0){
          LiveGLTextureView m1 = this.b.m;
          if (m1 != null) {
             m1.a(e0);
          }
       }
       try{
          uEGLConfig = this.a(p0, p1, uEGLConfigAr);
          if (uEGLConfig == null) {
             throw new IllegalArgumentException("No config chosen");
          }
       }catch(java.lang.Exception e10){
          LiveGLTextureView m = this.b.m;
          if (m != null) {
             m.a(e10);
          }
       }
       return uEGLConfig;
    }
}
