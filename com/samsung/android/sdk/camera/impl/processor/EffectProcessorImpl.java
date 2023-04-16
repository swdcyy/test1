package com.samsung.android.sdk.camera.impl.processor.EffectProcessorImpl;
import yk8.a;
import yk8.b;
import android.media.ImageReader$OnImageAvailableListener;
import android.os.Handler;
import android.media.ImageReader;
import java.lang.IllegalStateException;
import java.lang.String;
import tk8.a;
import java.lang.Object;
import vk8.h;
import tk8.b;
import com.samsung.android.sdk.camera.impl.filter.a;
import uk8.a;
import java.lang.Integer;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.InterruptedException;
import com.samsung.android.sdk.camera.impl.internal.NativeProcessor;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import yk8.c;
import wk8.b;
import vk8.g;
import java.lang.Class;
import yk8.c$a;
import android.util.Size;
import vk8.b;
import java.lang.ref.WeakReference;
import com.samsung.android.sdk.camera.impl.internal.NativeUtil;
import android.util.AndroidException;
import vk8.f;
import java.nio.ByteBuffer;
import vk8.a;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Throwable;
import android.media.Image;
import vk8.f$a;
import yk8.a$a;

public final class EffectProcessorImpl extends a	// class@000b83
{
    public int A;
    public Size B;
    public Size C;
    public ByteBuffer D;
    public b E;
    public ImageReader F;
    public SurfaceTexture G;
    public Surface H;
    public Surface I;
    public HandlerThread J;
    public Handler K;
    public HandlerThread L;
    public Handler M;
    public a$a N;
    public Handler O;
    public a P;
    public String Q;
    public b R;
    public int S;
    public boolean T;
    public String U;
    public final Object V;
    public boolean W;
    public NativeProcessor$a X;
    public ImageReader$OnImageAvailableListener Y;
    public final f x;
    public long y;
    public int z;
    public static final int[] U0;
    public static final int[] V0;
    public static final String Z;

    static {
       EffectProcessorImpl.Z = "SEC_SDK/EffectProcessorImpl";
       int[] ointArray = new int[]{256};
       EffectProcessorImpl.U0 = ointArray;
       int[] ointArray1 = new int[]{256};
       EffectProcessorImpl.V0 = ointArray1;
       EffectProcessorImpl.native_init();
    }
    public static native final void native_init();
    public void A(){
       this.r();
       this.c();
       if (this.T == null) {
          throw new IllegalStateException("don\'t invoke stopStreamProcessing\(\) in the Stop state.");
       }
       this.T = false;
       this.F.setOnImageAvailableListener(null, null);
       this.native_stop();
       return;
    }
    public final void C(a p0){
       String str2;
       h.c(p0, "filter must not null");
       h.c(p0.a(), "filter.getInfo\(\) must not null");
       String str = "malformed filter!";
       if (!p0 instanceof a) {
          throw new IllegalArgumentException(str);
       }
       if (!p0.a() instanceof a) {
          throw new IllegalArgumentException(str);
       }
       a uoa = p0.a();
       EffectProcessorImpl tP = this.P;
       if (tP == null) {
          this.P = uoa;
       }else if(!(tP.b()).equals(uoa.b()) || !(this.P.a()).equals(uoa.a())){
          this.P = uoa;
       }else {
          boolean b = 0;
       label_0050 :
          int i = ((uoa.b()).equals("com.samsung.android.provider.filterprovider") && (uoa.a()).equals("Beauty"))? 1: 0;
          if (tP) {
             String str1 = uoa.c();
             b = (str1.substring(0, 8)).equals("internal");
             str1 = str1.substring(11);
             this.S = (i == 1)? 1: 0;
             if (b == true) {
                this.native_setEffect_internal(Integer.valueOf(str1).intValue());
             }else {
                this.native_setEffect_external(str1);
             }
          }
          if (i == 1) {
             if (p0.b("intensity") != null) {
                str2 = p0.c();
                this.U = str2;
                if (str2 == null) {
                   this.U = "intensity=0";
                }
             }
          }else {
             p0.c();
             str2 = p0.c();
             this.Q = str2;
             if (str2 != null) {
                this.native_setEffect_parameter(str2);
             }
          }
          return;
       }
       tP = 1;
       goto label_0050 ;
    }
    public final void E(){
       HandlerThread handlerThrea = new HandlerThread("EFFECT_Stream_BG_Thread");
       this.L = handlerThrea;
       handlerThrea.start();
       this.M = new Handler(this.L.getLooper());
    }
    public final void I(){
       HandlerThread handlerThrea = new HandlerThread("EFFECT_BG_Thread");
       this.J = handlerThrea;
       handlerThrea.start();
       this.K = new Handler(this.J.getLooper());
    }
    public final void J(){
       EffectProcessorImpl tL = this.L;
       if (tL != null) {
          try{
             tL.quitSafely();
             this.L.join();
             HandlerThread handlerThrea = null;
             this.L = handlerThrea;
             this.M = handlerThrea;
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
       }
    }
    public final void K(){
       EffectProcessorImpl tJ = this.J;
       if (tJ != null) {
          try{
             tJ.quitSafely();
             this.J.join();
             HandlerThread handlerThrea = null;
             this.J = handlerThrea;
             this.K = handlerThrea;
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
       }
    }
    public void f(){
       this.r();
       this.c();
       if (this.T == 1) {
          this.A();
       }
       EffectProcessorImpl tx = this.x;
       if (tx != null) {
          tx.c();
       }
       this.F.close();
       this.F = null;
       this.J();
       this.K();
       this.native_release();
       this.G.release();
       this.G = null;
       this.H.release();
       this.H = null;
       this.P = null;
       this.I = null;
       this.E = null;
       this.o(false);
       return;
    }
    public c g(){
       this.r();
       b uob = new b(this.R.h(), EffectProcessorImpl.class.getSuperclass());
       c$a w = a.w;
       uob.f(w, this.R.b(w));
       return uob;
    }
    public void j(){
       this.r();
       this.e();
       this.B = this.R.b(b.m);
       this.C = this.R.b(b.k);
       this.z = this.R.b(b.g).intValue();
       this.A = this.R.b(b.i).intValue();
       this.F = ImageReader.newInstance(this.B.getWidth(), this.B.getHeight(), 35, 3);
       SurfaceTexture surfaceTextu = new SurfaceTexture(-1);
       this.G = surfaceTextu;
       surfaceTextu.setDefaultBufferSize(this.B.getWidth(), this.B.getHeight());
       this.H = new Surface(this.G);
       this.E = new b();
       this.native_setup(new WeakReference(this));
       this.native_initialize();
       this.I();
       this.E();
       try{
          surfaceTextu = 1;
          NativeUtil.e(this.H, 17, surfaceTextu);
       }catch(com.samsung.android.sdk.camera.impl.internal.NativeUtil$BufferQueueAbandonedException e1){
          e1.printStackTrace();
       }
       EffectProcessorImpl tG = this.G;
       try{
          this.native_setInputSurface(tG);
          if (NativeUtil.c() >= 3 && !NativeProcessor.a()) {
             NativeUtil.b(this.H, 0);
          }
       }catch(java.lang.Exception e0){
       }
       tG = this.x;
       if (tG != null) {
          tG.f();
       }
       this.o(e0);
       return;
    }
    public void l(){
       EffectProcessorImpl tx = this.x;
       if (tx != null) {
          tx.close();
       }
       return;
    }
    public native final void native_capture_buffer(byte[] p0);
    public native final void native_capture_image(Object p0,int p1);
    public native final void native_getGLBuffer(Object p0,Object p1,ByteBuffer p2);
    public native final int native_getVersion();
    public native final boolean native_initialize();
    public native final boolean native_release();
    public native final boolean native_setEffect_external(String p0);
    public native final boolean native_setEffect_internal(int p0);
    public native boolean native_setEffect_parameter(String p0);
    public native final void native_setInputSurface(Object p0);
    public native final void native_setOutputSurface(Object p0);
    public native final void native_setRecordingSurface(Object p0);
    public native final void native_setup(Object p0);
    public native final boolean native_start();
    public native final boolean native_stop();
    public void p(c p0){
       this.r();
       h.c(p0, "SCameraProcessorParameter must not null");
       if (!p0 instanceof b) {
          throw new IllegalArgumentException("Malformed SCameraProcessorParameter.");
       }
       try{
          c uoc = p0;
          Size[] sizeArray = this.R.b(b.n);
          Size[] sizeArray1 = this.R.b(b.l);
          c$a m = b.m;
          Size size = uoc.b(m);
          c$a k = b.k;
          Size size1 = uoc.b(k);
          c$a g = b.g;
          Integer integer = uoc.b(g);
          c$a i = b.i;
          Integer integer1 = uoc.b(i);
          h.c(size, "STREAM_SIZE must not null");
          h.c(size1, "STILL_SIZE must not null");
          h.c(integer, "STILL_INPUT_FORMAT must not null");
          h.c(integer1, "STILL_OUTPUT_FORMAT must not null");
          if (!this.R.b(m).equals(size) || (!this.R.b(k).equals(size1) || (this.R.b(g).equals(integer) && (!this.R.b(i).equals(integer1) && this.k())))) {
             throw new RuntimeException("To change initialization parameter, call deinitialize first.");
          }
          h.a(size, sizeArray, "STREAM_SIZE");
          h.a(size1, sizeArray1, "STILL_SIZE");
          if (!a.a(this.R.b(b.h), integer.intValue())) {
             throw new RuntimeException("Invalid STILL_INPUT_FORMAT");
          }
          if (!a.a(this.R.b(b.j), integer1.intValue())) {
             throw new RuntimeException("Invalid STILL_OUTPUT_FORMAT");
          }
          c$a w = a.w;
          a uoa = p0.b(w);
          this.C(uoa);
          this.R.f(m, size);
          this.R.f(k, size1);
          this.R.f(g, integer);
          this.R.f(i, integer1);
          this.R.f(w, uoa);
          return;
       }catch(java.lang.RuntimeException e12){
          throw e12;
       }catch(java.lang.Exception e12){
          throw new RuntimeException("setParameters failed: "+e12.getMessage(), e12);
       }
    }
    public Surface s(){
       this.r();
       this.c();
       if (!NativeProcessor.a()) {
          return this.H;
       }
       return this.F.getSurface();
    }
    public void u(Image p0){
       this.r();
       this.c();
       h.c(p0, "data must not null.");
       if (this.T == null) {
          throw new RuntimeException("requestProcess fail. startStreamProcessing\(\) was not called.");
       }
       Size size = new Size(p0.getWidth(), p0.getHeight());
       if (p0.getFormat() != this.z || !size.equals(this.C)) {
          String str = (size.equals(this.C))? "format is invalid.": "size is invalid";
          Object[] objArray = new Object[]{Integer.valueOf(size.getWidth()),Integer.valueOf(size.getHeight()),Integer.valueOf(p0.getFormat()),str};
          String.format("Image with size \(w=%d, h=%d\) and format 0x%x is not valid, %s", objArray);
          Object[] objArray1 = new Object[]{Integer.valueOf(size.getWidth()),Integer.valueOf(size.getHeight()),Integer.valueOf(p0.getFormat()),str};
          throw new IllegalArgumentException(String.format("Image with size \(w=%d, h=%d\) and format 0x%x is not valid, %s", objArray1));
       }else {
          ByteBuffer uByteBuffer = this.E.a(p0);
          if (uByteBuffer != null) {
             EffectProcessorImpl tV = this.V;
             _monitor_enter(tV);
             if (this.W == null) {
                this.W = true;
                _monitor_exit(tV);
                if (this.S == 1) {
                   f$a uoa = null;
                   EffectProcessorImpl tx = this.x;
                   if (tx != null) {
                      uoa = tx.g(p0);
                   }
                   if (uoa != null && uoa.c > null) {
                      this.native_setEffect_parameter("face="+uoa.c+",width="+uoa.a+",height="+uoa.b+",left="+uoa.d+",top="+uoa.e+",right="+uoa.f+",bottom="+uoa.g+",tonemin="+uoa.h+",tonemax="+uoa.i+","+this.U);
                   }
                }
             label_00c4 :
                this.native_capture_image(uByteBuffer, uByteBuffer.remaining());
             }else {
                throw new RuntimeException("requestProcess fail. previous processImage not finished.");
             }
          }
          return;
       }
    }
    public void v(a$a p0,Handler p1){
       this.r();
       this.c();
       p1 = b.b(p1, p0);
       if (p0 != null) {
          this.O = p1;
          this.N = p0;
       }else {
          this.O = null;
          this.N = null;
       }
       return;
    }
    public void x(Surface p0){
       this.r();
       this.c();
       h.c(p0, "Output surface must not null");
       if (!p0.isValid()) {
          throw new IllegalArgumentException("Output surface must valid");
       }
       this.native_setOutputSurface(p0);
       this.I = p0;
       return;
    }
    public void y(Surface p0){
       this.r();
       this.c();
       if (this.T == null) {
          throw new IllegalStateException("don\'t invoke setRecordingSurface\(\) in the Stop state.");
       }
       if (p0 == null) {
          this.native_setRecordingSurface(null);
       }else {
          this.native_setRecordingSurface(p0);
       }
       return;
    }
    public void z(){
       this.r();
       this.c();
       h.c(this.I, "Set OutputSurface first.");
       boolean b = true;
       if (this.T == b) {
          throw new IllegalStateException("don\'t invoke startStreamProcessing\(\) in the Streamming state.");
       }
       this.T = b;
       this.F.setOnImageAvailableListener(this.Y, this.M);
       EffectProcessorImpl tP = this.P;
       if (tP != null) {
          String str = tP.c();
          str = str.substring(11);
          if ((str.substring(0, 8)).equals("internal") == b) {
             this.native_setEffect_internal(Integer.valueOf(str).intValue());
          }else {
             this.native_setEffect_external(str);
          }
          tP = this.Q;
          if (tP != null) {
             this.native_setEffect_parameter(tP);
          }
       }
       this.native_start();
       return;
    }
}
