package com.kuaishou.live.core.show.screenrecord.videocapture.gl.f;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a$a;
import android.os.Handler;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.e;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.a;
import java.lang.Object;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f$a;
import android.os.Looper;
import java.lang.Thread;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.c$a;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.b;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.b$a;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.k;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.j;
import kj2.b;
import kj2.c;
import android.graphics.SurfaceTexture;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.g;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import java.lang.IllegalStateException;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.TextureBuffer$Type;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.TextureBuffer;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import lj2.d$f;
import kj2.a;
import android.opengl.GLES20;
import java.nio.FloatBuffer;
import lj2.c;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f$c;
import lj2.a$a;
import java.lang.Runnable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f$b;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f$d;
import java.lang.Throwable;

public class f	// class@000ffc
{
    public Handler a;
    public a b;
    public SurfaceTexture c;
    public int d;
    public b[] e;
    public k f;
    public j g;
    public f$d h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public TextureBuffer m;
    public boolean n;
    public f$d o;
    public final Runnable p;

    public void f(a$a p0,Handler p1,e p2){
       int[] c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       super();
       Handler handler = null;
       this.a = handler;
       this.b = handler;
       this.c = handler;
       int i = 0;
       this.d = i;
       this.e = handler;
       this.f = handler;
       this.g = handler;
       this.h = handler;
       this.i = -1;
       this.j = i;
       this.k = i;
       this.l = i;
       this.m = handler;
       this.n = i;
       this.o = handler;
       this.p = new f$a(this);
       if (p1.getLooper().getThread() != Thread.currentThread()) {
          throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
       }
       this.a = p1;
       if (p0 == null) {
          if (c.j()) {
             c = a.c;
             c uoc = PatchProxy.applyOneRefs(c, handler, uoa, "5");
             if (uoc != patchProxyRe) {
             }else {
                uoc = new c(handler, c);
             }
             this.b = uoc;
          }else {
             c = a.c;
             b uob = PatchProxy.applyOneRefs(c, handler, uoa, "4");
             if (uob != patchProxyRe) {
             }else {
                uob = new b(handler, c);
             }
             this.b = uob;
          }
       }else {
          this.b = a.a(p0, a.c);
       }
       try{
          this.b.b();
          this.b.f();
          this.f = new k();
          this.g = new j();
          int i1 = 3;
          b[] uobArray = new b[i1];
          this.e = uobArray;
          for (; i < i1; i = i + 1) {
             uobArray[i] = new b(6408);
          }
          this.d = c.c(0x8d65);
          SurfaceTexture surfaceTextu = new SurfaceTexture(this.d);
          this.c = surfaceTextu;
          g og = new g(this);
          if (!PatchProxy.applyVoidThreeRefs(surfaceTextu, og, p1, null, f.class, "3")) {
             surfaceTextu.setOnFrameAvailableListener(og, p1);
          }
          return;
       }catch(java.lang.RuntimeException e7){
          this.b.g();
          p1.getLooper().quit();
          throw e7;
       }
    }
    public TextureBuffer a(TextureBuffer$Type p0,int p1,int p2,int p3,long p4,float[] p5){
       int i10;
       TextureBuffer textureBuffe;
       TextureBuffer$Type oES;
       String str;
       int i11;
       int i = this;
       object oobject = p0;
       int i1 = p2;
       int i2 = p3;
       object oobject1 = p5;
       f uof = f.class;
       int i3 = 5;
       int i4 = 4;
       int i5 = 2;
       int i6 = 6;
       int i7 = 3;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[i6];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[i5] = Integer.valueOf(p2);
          objArray[i7] = Integer.valueOf(p3);
          objArray[i4] = Long.valueOf(p4);
          objArray[i3] = oobject1;
          Object obj = PatchProxy.apply(objArray, i, uof, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i8 = (i.i + 1) % i7;
       for (uof = 1; uof < i7; i11 = uof + 1) {
          int i9 = 1 << i8;
          i10 = i.j & i9;
          if (!i10) {
             break ;
          }
          i8 = i8 + 1;
          i8 = i8 % i7;
       }
       i10 = 1 << i8;
       if (!(i.j & i10)) {
          i.j = i.j | i10;
          uof = i.g;
          object oobject2 = i.e[i8];
          Objects.requireNonNull(uof);
          j oj = j.class;
          if (PatchProxy.isSupport(oj)) {
             Object[] objArray1 = new Object[i6];
             objArray1[0] = oobject2;
             objArray1[1] = oobject;
             objArray1[i5] = Integer.valueOf(p2);
             objArray1[i7] = Integer.valueOf(p3);
             objArray1[i4] = Integer.valueOf(p1);
             objArray1[i3] = oobject1;
             if (PatchProxy.applyVoid(objArray1, uof, oj, "2")) {
             label_0166 :
                textureBuffe = this.b(TextureBuffer$Type.RGB, i.e[i8].b(), p2, p3, p4, new float[16]{0x3f800000,0,0,0,0,0x3f800000,0,0,0,0,0x3f800000,0,0,0,0,0x3f800000});
                i.i = i8;
             }
          }
          uof.a.a();
          if (uof.c == null) {
             if (!PatchProxy.applyVoidOneRefs(oobject, uof, oj, "1")) {
                if (uof.b != oobject) {
                   j d = uof.d;
                   if (d != null) {
                      d.c();
                      uof.d = null;
                   }
                   uof.b = oobject;
                }else if(uof.d != null){
                }
             }
          label_011b :
             uof.d.e();
             if (oobject == TextureBuffer$Type.OES) {
                oobject1 = c.a(oobject1, c.b());
             }
             oobject2.d(i1, i2);
             GLES20.glBindFramebuffer(0x8d40, oobject2.a());
             GLES20.glActiveTexture(0x84c0);
             GLES20.glBindTexture(p0.getGlTarget(), p1);
             GLES20.glUniformMatrix4fv(uof.e, 1, 0, oobject1, 0);
             GLES20.glViewport(0, 0, i1, i2);
             GLES20.glDrawArrays(5, 0, i4);
             c.a("T2DConverter.convert");
             GLES20.glBindFramebuffer(0x8d40, 0);
             GLES20.glBindTexture(p0.getGlTarget(), 0);
             GLES20.glFinish();
             goto label_0166 ;
          }else {
             throw new IllegalStateException("T2DConverter.convert called on released object");
          }
       }else {
          textureBuffe = null;
       }
       return textureBuffe;
    }
    public TextureBuffer b(TextureBuffer$Type p0,int p1,int p2,int p3,long p4,float[] p5){
       Object obj1;
       Object obj = this;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4),p5};
          obj1 = PatchProxy.apply(objArray, obj, uof, "13");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       TextureBuffer textureBuffe = new TextureBuffer(p2, p3, 0, p4, p0, p1, p5, obj.a, obj.f, new f$c(obj));
       return obj1;
    }
    public void c(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       if (this.a.getLooper().getThread() != Thread.currentThread()) {
          this.a.post(p0);
       }else {
          p0.run();
       }
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "11")) {
          return;
       }
       if (this.a.getLooper().getThread() != Thread.currentThread()) {
          throw new IllegalStateException("release in wrong thread");
       }
       String str = "SurfaceTextureHelper";
       if (this.n != null && (this.k != null || this.j != null)) {
          b.P(LiveLogTag.LIVE_SCREEN_RECORD.appendTag(str), "isQuitting="+this.n+",isTextureInUse="+this.k+",texFbsInUseFlag="+this.j);
          return;
       }else {
          b.P(LiveLogTag.LIVE_SCREEN_RECORD.appendTag(str), "release\(\)");
          f tf = this.f;
          if (tf != null) {
             Objects.requireNonNull(tf);
             if (!PatchProxy.applyVoid(objArray, tf, k.class, "4")) {
                tf.a.a();
                tf.h = true;
                k d1 = tf.d;
                if (d1 != null) {
                   d1.c();
                }
                tf.b.c();
             }
             this.f = objArray;
          }
          tf = this.g;
          if (tf != null) {
             Objects.requireNonNull(tf);
             if (!PatchProxy.applyVoid(objArray, tf, j.class, "3")) {
                tf.a.a();
                tf.c = true;
                j d = tf.d;
                if (d != null) {
                   d.c();
                   tf.d = objArray;
                }
             }
             this.g = objArray;
          }
          int i = 0;
          int i1 = 0;
          while (i1 < 3) {
             f te = this.e;
             if (te[i1] != null) {
                te[i1].c();
                this.e[i1] = objArray;
             }
             i1 = i1 + 1;
          }
          int[] ointArray = new int[]{this.d};
          GLES20.glDeleteTextures(1, ointArray, i);
          tf = this.c;
          if (tf != null) {
             tf.release();
             this.c = objArray;
          }
          tf = this.b;
          if (tf != null) {
             tf.g();
             this.b = objArray;
          }
          tf = this.a;
          if (tf != null) {
             tf.getLooper().quit();
             this.a = objArray;
          }
          b.P(LiveLogTag.LIVE_SCREEN_RECORD.appendTag(str), "release\(\) done");
          return;
       }
    }
    public void e(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "6")) {
          return;
       }
       this.c(new f$b(this, p0));
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       if (this.n != null || (this.l == null || (this.k == null && this.h != null))) {
          this.k = true;
          this.l = false;
          this.g();
          float[] uofloatArray = new float[16];
          this.c.getTransformMatrix(uofloatArray);
          this.h.onTextureFrameAvailable(this.d, uofloatArray, this.c.getTimestamp());
       }
    label_003c :
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       Object a = a.a;
       _monitor_enter(a);
       try{
          this.c.updateTexImage();
          GLES20.glClear(0x4000);
       }catch(java.lang.RuntimeException e1){
          b.y(LiveLogTag.LIVE_SCREEN_RECORD.appendTag("SurfaceTextureHelper"), "RuntimeException during update tex image ", e1);
       }
       _monitor_exit(a);
       return;
    }
}
