package d22.k;
import android.opengl.GLSurfaceView$Renderer;
import com.kuaishou.live.core.basic.widget.d;
import java.lang.Object;
import java.util.ArrayList;
import d22.m;
import java.util.concurrent.LinkedBlockingQueue;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.opengl.GLSurfaceView;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.opengl.GLES20;
import java.lang.Boolean;
import java.util.List;
import java.lang.Float;
import d22.k$b;
import java.nio.Buffer;
import javax.microedition.khronos.opengles.GL10;
import java.util.Iterator;
import d22.k$a;
import javax.microedition.khronos.egl.EGLConfig;
import java.util.Objects;

public class k implements GLSurfaceView$Renderer	// class@002430
{
    public m b;
    public int c;
    public k$b[] d;
    public LinkedBlockingQueue e;
    public LinkedBlockingQueue f;
    public byte[] g;
    public final List h;
    public GLSurfaceView i;
    public float j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public static final c o;

    static {
       k.o = d.b;
    }
    public void k(){
       super();
       this.c = 0;
       this.h = new ArrayList();
       this.b = new m();
       this.e = new LinkedBlockingQueue();
       this.f = new LinkedBlockingQueue();
    }
    public synchronized byte[] a(ByteBuffer p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, k.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b.Z(k.o, "feedI420Data size:"+p1+"X"+p2+"  rotate:"+p3+", tag: "+this.i.getTag());
       return this.h(p0, p1, p2, p3, 0, false);
    }
    public final void b(){
       int i;
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       b.Z(k.o, "fitCenter viewWidth: "+this.l+" viewHeight: "+this.k+"  mVideoRatio:"+this.j);
       k tk = this.k;
       if (tk > null) {
          k tl = this.l;
          if (tl > null) {
             k tj = this.j;
             if (tj - ((float)tk / (float)tl) > 0) {
                i = (int)((double)((float)tk / tj) + 0x3fe0000000000000);
                GLES20.glViewport(((tl - i) / 2), 0, i, tk);
             }else {
                i = (int)((double)(tj * (float)tl) + 0x3fe0000000000000);
                GLES20.glViewport(0, ((tk - i) / 2), tl, i);
             }
          }
       }
       return;
    }
    public final void c(){
       int i;
       if (PatchProxy.applyVoid(null, this, k.class, "7")) {
          return;
       }
       b.Z(k.o, "fitCenterCrop viewWidth: "+this.l+" viewHeight: "+this.k+"  mVideoRatio:"+this.j);
       k tk = this.k;
       if (tk > null) {
          k tl = this.l;
          if (tl > null) {
             k tj = this.j;
             if (tj - ((float)tk / (float)tl) > 0) {
                i = (int)((float)tl * tj);
                GLES20.glViewport(0, (- ((i - tk) / 2)), tl, i);
             }else {
                i = (int)((float)tk / tj);
                GLES20.glViewport((- ((i - tl) / 2)), 0, i, tk);
             }
          }
       }
       return;
    }
    public synchronized void d(){
       if (PatchProxy.applyVoid(null, this, k.class, "14")) {
          return;
       }
       this.e(true);
       return;
    }
    public synchronized final void e(boolean p0){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, k.class, "15")) {
          return;
       }
       while (this.f.size() > 0) {
          this.f.poll();
       }
       while (this.e.size() > 0) {
          this.e.poll();
       }
       this.c = 0;
       this.d = null;
       this.g = null;
       if (p0) {
          this.h.clear();
       }
       return;
    }
    public void f(boolean p0){
       this.m = p0;
    }
    public void g(float p0){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, k.class, "2")) {
          return;
       }
       b.Z(k.o, "setRatio:"+p0);
       this.j = p0;
       return;
    }
    public final byte[] h(ByteBuffer p0,int p1,int p2,int p3,int p4,boolean p5){
       k$b[] obj;
       int i8;
       k$b[] uobArray = this;
       object oobject = p0;
       int i = p1;
       int i1 = p2;
       int i2 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i3 = 5;
       int i4 = 3;
       int i5 = 2;
       if (PatchProxy.isSupport(k.class)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5)};
          obj = PatchProxy.apply(objArray, uobArray, k.class, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), Integer.valueOf(p2), uobArray, k.class, "13")) {
          int i9 = i * i1;
          if (uobArray.c < i9) {
             uobArray.e(0);
             obj = new k$b[i5];
             uobArray.d = obj;
             i8 = 0;
             k d = uobArray.d;
             while (i8 < d.length) {
                d[i8] = new k$b(uobArray, i, i1);
                uobArray.e.add(uobArray.d[i8]);
                i8 = i8 + 1;
             }
             uobArray.c = i9;
          }
          k g1 = uobArray.g;
          if (g1 == null || g1.length != ((i9 * 3) / i5)) {
             byte[] uobyteArray1 = new byte[((i9 * 3) / i5)];
             uobArray.g = uobyteArray1;
          }
       }
       _monitor_enter(this);
       Object[] objArray1 = null;
       obj = PatchProxy.apply(objArray1, uobArray, k.class, "8");
       if (obj != patchProxyRe) {
          _monitor_exit(this);
       }else if(uobArray.e.isEmpty()){
          k$b uob = uobArray.f.poll();
          if (uob != null) {
             uob.a();
             uobArray.e.add(uob);
          }
       }
       i8 = uobArray.e.poll();
       _monitor_exit(this);
       if (obj != null) {
          byte[] uobyteArray = (p5 && p0.hasArray())? p0.array(): objArray1;
          if (uobyteArray == null) {
             k g = uobArray.g;
             oobject.get(g, 0, g.length);
             p0.clear();
             uobyteArray = uobArray.g;
          }
          if (uobyteArray == null) {
             return objArray1;
          }else {
             i4 = i * i1;
             obj.a.put(uobyteArray, 0, i4).position(0);
             if (!i2) {
                i2 = i4 / 4;
                obj.b.put(uobyteArray, i4, i2).position(0);
                obj.c.put(uobyteArray, ((i4 * 5) / 4), i2).position(0);
             }else if(i2 == 1){
                int i7 = i4 / 4;
                for (i2 = 0; i2 < i7; i2 = i2 + 1) {
                   i5 = i2 * 2;
                   i5 = i5 + i4;
                   obj.c.put(uobyteArray, i5, 1);
                   i5 = i5 + 1;
                   obj.b.put(uobyteArray, i5, 1);
                }
                obj.b.position(0);
                obj.c.position(0);
             }
             obj.f = p3;
             obj.d = i;
             obj.e = i1;
             uobArray.f.add(obj);
             k i6 = uobArray.i;
             if (i6 != null) {
                i6.requestRender();
             }
             return uobyteArray;
          }
       }else {
          b.Z(k.o, "no free buffer, drop frame");
          return objArray1;
       }
    }
    public synchronized void onDrawFrame(GL10 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "5")) {
          return;
       }
       GLES20.glClear(0x4000);
       if (this.m != null) {
          b.Z(k.o, "onDrawFrame FillMode =  "+this.n);
          if (this.n == 2) {
             this.b();
          }else {
             this.c();
          }
          this.m = false;
       }
       if (!this.f.isEmpty()) {
          k$b uob = this.f.poll();
          if (uob != null) {
             this.b.c(uob);
             uob.a();
             this.e.add(uob);
          }
       }
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDrawFrame();
       }
       return;
    }
    public void onSurfaceChanged(GL10 p0,int p1,int p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, k.class, "4")) {
          return;
       }
       c o = k.o;
       b.Z(o, "onSurfaceChanged viewWidth: "+p1+" viewHeight: "+p2+"  mVideoRatio:"+this.j);
       this.l = p1;
       this.k = p2;
       if (this.j && (p2 && p1)) {
          b.Z(o, "onSurfaceChanged FillMode =  "+this.n);
          if (this.n == 2) {
             this.b();
          }else {
             this.c();
          }
       }else {
          GLES20.glViewport(0, 0, p1, p2);
       }
       return;
    }
    public synchronized void onSurfaceCreated(GL10 p0,EGLConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "3")) {
          return;
       }
       GLES20.glClearColor(0, 0, 0, 0x3f800000);
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, m.class, "1")) {
          tb.d();
       }
       return;
    }
}
