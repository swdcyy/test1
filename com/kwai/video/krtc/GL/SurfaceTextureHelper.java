package com.kwai.video.krtc.GL.SurfaceTextureHelper;
import com.kwai.video.krtc.GL.EglBase$Context;
import android.os.Handler;
import java.lang.Object;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$2;
import android.os.Looper;
import java.lang.Thread;
import com.kwai.video.krtc.GL.EglBase14;
import com.kwai.video.krtc.GL.EglBase;
import com.kwai.video.krtc.GL.e;
import com.kwai.video.krtc.GL.d;
import com.kwai.video.krtc.GL.b;
import com.kwai.video.krtc.GL.c;
import android.graphics.SurfaceTexture;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$3;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import java.lang.IllegalStateException;
import java.lang.String;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.robust.PatchProxyResult;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import com.kwai.video.krtc.utils.e;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import com.kwai.video.krtc.GL.TextureBuffer;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.video.krtc.GL.TextureBuffer$Type;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$9;
import java.lang.Runnable;
import com.kwai.video.krtc.utils.RenderUtils;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$10;
import com.kwai.video.krtc.utils.d$a;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$8;
import android.opengl.GLES20;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$6;
import java.lang.Number;
import android.opengl.GLES30;
import android.os.Build$VERSION;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$5;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$OnTextureFrameAvailableListener;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$4;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.GL.SurfaceTextureHelper$7;

public class SurfaceTextureHelper	// class@000753
{
    public int dropFrames;
    public long dropStatStartTime;
    public EglBase eglBase;
    public Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public boolean isTextureInUse;
    public SurfaceTextureHelper$OnTextureFrameAvailableListener listener;
    public int oesTextureId;
    public SurfaceTextureHelper$OnTextureFrameAvailableListener pendingListener;
    public final Runnable setListenerRunnable;
    public SurfaceTexture surfaceTexture;
    public d t2dConverter;
    public b[] texFbs;
    public int texFbsInUseFlag;
    public TextureBuffer texture;
    public int usingTexIndex;
    public e yuvConverter;
    public static boolean useGlEs30;

    public void SurfaceTextureHelper(EglBase$Context p0,Handler p1){
       super();
       this.handler = null;
       this.eglBase = null;
       this.surfaceTexture = null;
       int i = 0;
       this.oesTextureId = i;
       this.texFbs = null;
       this.yuvConverter = null;
       this.t2dConverter = null;
       this.listener = null;
       this.usingTexIndex = -1;
       this.texFbsInUseFlag = i;
       this.isTextureInUse = i;
       this.hasPendingTexture = i;
       this.texture = null;
       this.isQuitting = i;
       this.dropStatStartTime = 0;
       this.dropFrames = i;
       this.pendingListener = null;
       this.setListenerRunnable = new SurfaceTextureHelper$2(this);
       if (p1.getLooper().getThread() != Thread.currentThread()) {
          throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
       }
       this.handler = p1;
       if (p0 == null) {
          this.eglBase = (EglBase14.a())? EglBase.createEgl14(EglBase.CONFIG_PIXEL_BUFFER): EglBase.createEgl10(EglBase.CONFIG_PIXEL_BUFFER);
       }else {
          this.eglBase = EglBase.create(p0, EglBase.CONFIG_PIXEL_BUFFER);
       }
       try{
          this.eglBase.createDummyPbufferSurface();
          this.eglBase.makeCurrent();
          this.yuvConverter = new e();
          this.t2dConverter = new d();
          int i1 = 3;
          b[] uobArray = new b[i1];
          this.texFbs = uobArray;
          for (; i < i1; i = i + 1) {
             this.texFbs[i] = new b(6408);
          }
          this.oesTextureId = c.a(0x8d65);
          SurfaceTexture surfaceTextu = new SurfaceTexture(this.oesTextureId);
          this.surfaceTexture = surfaceTextu;
          SurfaceTextureHelper.setOnFrameAvailableListener(surfaceTextu, new SurfaceTextureHelper$3(this), p1);
          return;
       }catch(java.lang.RuntimeException e5){
          this.eglBase.release();
          p1.getLooper().quit();
          throw e5;
       }
    }
    public void SurfaceTextureHelper(EglBase$Context p0,Handler p1,SurfaceTextureHelper$1 p2){
       super(p0, p1);
    }
    public static void SetUseGlEs30(boolean p0){
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, surfaceTextu, "2")) {
          return;
       }
       Log.i("SurfaceTextureHelper", " SetUseGlEs30\("+p0+"\)");
       SurfaceTextureHelper.useGlEs30 = p0;
       return;
    }
    public static SurfaceTextureHelper create(String p0,EglBase$Context p1){
       HandlerThread obj = PatchProxy.applyTwoRefs(p0, p1, null, SurfaceTextureHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HandlerThread(p0);
       obj.start();
       Handler handler = new Handler(obj.getLooper());
       return e.a(handler, new SurfaceTextureHelper$1(p1, handler, p0));
    }
    public static void setOnFrameAvailableListener(SurfaceTexture p0,SurfaceTexture$OnFrameAvailableListener p1,Handler p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, SurfaceTextureHelper.class, "4")) {
          return;
       }
       p0.setOnFrameAvailableListener(p1, p2);
       return;
    }
    public final int GetUnusingTextureBufferIndex(){
       int i = (this.usingTexIndex + 1) % 3;
       for (int i1 = 1; i1 < 3; i1 = i1 + 1) {
          int i2 = 1 << i;
          int i3 = this.texFbsInUseFlag & i2;
          if (!i3) {
             break ;
          }else {
             i = i + 1;
             i = i % 3;
          }
       }
       return i;
    }
    public final void StatisticDropFps(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper.class, "32")) {
          return;
       }
       long l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
       if (!this.dropStatStartTime - null) {
          this.dropStatStartTime = l;
       }
       int i = this.dropFrames + 1;
       this.dropFrames = i;
       SurfaceTextureHelper tdropStatSta = this.dropStatStartTime;
       if (l - (5000 + tdropStatSta) >= 0) {
          Log.i("SurfaceTextureHelper", "StatisticDropFps: "+(((float)i * 1000.00f) / (float)(l - tdropStatSta)));
          this.dropStatStartTime = l;
          this.dropFrames = 0;
       }
       return;
    }
    public TextureBuffer cloneTextureBuffer(int p0,int p1,int p2,int p3,long p4,float[] p5){
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, this, surfaceTextu, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return this.cloneTextureBuffer(TextureBuffer$Type.RGB, p0, p1, p2, p3, p1, p2, p4, p5);
    }
    public TextureBuffer cloneTextureBuffer(TextureBuffer$Type p0,int p1,int p2,int p3,int p4,int p5,int p6,long p7,float[] p8){
       SurfaceTextureHelper$9 obj1;
       SurfaceTextureHelper this;
       Object obj = this;
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       int i = 0;
       if (PatchProxy.isSupport(surfaceTextu)) {
          Object[] objArray = new Object[9];
          objArray[i] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Long.valueOf(p7);
          objArray[8] = p8;
          obj1 = PatchProxy.apply(objArray, obj, surfaceTextu, "26");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (obj.handler.getLooper().getThread() != Thread.currentThread()) {
          obj1 = v11;
          SurfaceTextureHelper$9 u9 = v11;
          obj1 = new SurfaceTextureHelper$9(this, this.getAndCheckFenceId(), p0, p1, p2, p3, p4, p5, p6, p7, p8);
          e.a(obj.handler, u9);
          surfaceTextu = this;
          this = surfaceTextu.texture;
          if (this != null) {
             surfaceTextu.waitSyncInGpu(this.getFenceId(), false);
          }
       }else {
          surfaceTextu = obj;
          surfaceTextu.texture = this.cloneTextureBufferPrivate(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       }
       return surfaceTextu.texture;
    }
    public TextureBuffer cloneTextureBuffer(TextureBuffer$Type p0,int p1,int p2,int p3,int p4,int p5,long p6,float[] p7){
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Long.valueOf(p6),p7};
          Object obj = PatchProxy.apply(objArray, this, surfaceTextu, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return this.cloneTextureBuffer(p0, p1, p2, p3, 0, p4, p5, p6, p7);
    }
    public TextureBuffer cloneTextureBuffer(TextureBuffer$Type p0,int p1,int p2,int p3,int p4,long p5,float[] p6){
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),p6};
          Object obj = PatchProxy.apply(objArray, this, surfaceTextu, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return this.cloneTextureBuffer(p0, p1, p2, p3, p4, p2, p3, p5, p6);
    }
    public TextureBuffer cloneTextureBuffer(TextureBuffer$Type p0,int p1,int p2,int p3,long p4,float[] p5){
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, this, surfaceTextu, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return this.cloneTextureBuffer(p0, p1, p2, p3, 0, p2, p3, p4, p5);
    }
    public TextureBuffer cloneTextureBuffer(TextureBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SurfaceTextureHelper.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int rotation = p0.getRotation();
       obj = (rotation == 90 || rotation == 270)? 1: 0;
       int width = p0.getWidth();
       int height = p0.getHeight();
       TextureBuffer$Type type = p0.getType();
       int textureId = p0.getTextureId();
       int i = (obj)? height: width;
       int i1 = (obj)? width: height;
       return this.cloneTextureBuffer(type, textureId, i, i1, rotation, p0.getOrgWidth(), p0.getOrgHeight(), p0.getTimestamp(), p0.getTransformMatrix());
    }
    public TextureBuffer cloneTextureBufferPrivate(TextureBuffer$Type p0,int p1,int p2,int p3,int p4,int p5,int p6,long p7,float[] p8){
       TextureBuffer obj;
       int i = this;
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       int i1 = 1;
       if (PatchProxy.isSupport(surfaceTextu)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[i1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Long.valueOf(p7);
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, i, surfaceTextu, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       surfaceTextu = null;
       int i2 = this.GetUnusingTextureBufferIndex();
       i1 = i1 << i2;
       if (!(i.texFbsInUseFlag & i1)) {
          i.texFbsInUseFlag = i.texFbsInUseFlag | i1;
          i.t2dConverter.a(i.texFbs[i2], p0, p2, p3, p5, p6, p1, p8, SurfaceTextureHelper.useGlEs30);
          obj = this.createTextureBuffer(TextureBuffer$Type.RGB, i.texFbs[i2].b(), p2, p3, p4, this.getAndCheckFenceId(), p7, RenderUtils.identityMatrix());
          i.usingTexIndex = i2;
       }else {
          this.StatisticDropFps();
       }
       return obj;
    }
    public TextureBuffer createTextureBuffer(int p0,int p1,int p2,long p3,float[] p4){
       SurfaceTextureHelper surfaceTextu = this;
       SurfaceTextureHelper surfaceTextu1 = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Long.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, surfaceTextu1, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.createTextureBuffer(TextureBuffer$Type.OES, surfaceTextu.oesTextureId, p0, p1, p2, p3, p4);
    }
    public TextureBuffer createTextureBuffer(int p0,int p1,long p2,float[] p3){
       if (PatchProxy.isSupport(SurfaceTextureHelper.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), p3, this, SurfaceTextureHelper.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.createTextureBuffer(p0, p1, 0, p2, p3);
    }
    public final TextureBuffer createTextureBuffer(TextureBuffer$Type p0,int p1,int p2,int p3,int p4,long p5,long p6,float[] p7){
       Object obj1;
       Object obj = this;
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),Long.valueOf(p6),p7};
          obj1 = PatchProxy.apply(objArray, obj, surfaceTextu, "27");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       TextureBuffer textureBuffe = new TextureBuffer(p2, p3, p4, p6, p0, p1, p5, p7, obj.handler, obj.yuvConverter, new SurfaceTextureHelper$10(obj));
       return obj1;
    }
    public TextureBuffer createTextureBuffer(TextureBuffer$Type p0,int p1,int p2,int p3,int p4,long p5,float[] p6){
       Object obj1;
       Object obj = this;
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),p6};
          obj1 = PatchProxy.apply(objArray, obj, surfaceTextu, "20");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       TextureBuffer textureBuffe = new TextureBuffer(p2, p3, p4, p5, p0, p1, p6, obj.handler, obj.yuvConverter, new SurfaceTextureHelper$8(obj));
       return obj1;
    }
    public TextureBuffer createTextureBuffer(TextureBuffer$Type p0,int p1,int p2,int p3,long p4,float[] p5){
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, this, surfaceTextu, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       return this.createTextureBuffer(p0, p1, p2, p3, 0, p4, p5);
    }
    public TextureBuffer createTextureBuffer(boolean p0,int p1,int p2,int p3,int p4,long p5,float[] p6){
       TextureBuffer$Type obj;
       TextureBuffer this;
       SurfaceTextureHelper surfaceTextu = this;
       SurfaceTextureHelper surfaceTextu1 = SurfaceTextureHelper.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(surfaceTextu1)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5),p6};
          obj = PatchProxy.apply(objArray, this, surfaceTextu1, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p1 > 0) {
          obj = (p0)? TextureBuffer$Type.OES: TextureBuffer$Type.RGB;
          this = this.createTextureBuffer(obj, p1, p2, p3, p4, p5, p6);
       }else if(p0){
          this = this.createTextureBuffer(p2, p3, p4, p5, p6);
       }else {
          int i2 = this.GetUnusingTextureBufferIndex();
          i = i << i2;
          if (!(surfaceTextu.texFbsInUseFlag & i)) {
             surfaceTextu.texFbs[i2].a(p2, p3, i1);
             surfaceTextu.texFbsInUseFlag = surfaceTextu.texFbsInUseFlag | i;
             TextureBuffer$Type rGB = TextureBuffer$Type.RGB;
             i1 = surfaceTextu.texFbs[i2].b();
             float[] uofloatArray = (p6 == null)? p6: RenderUtils.identityMatrix();
             this = this.createTextureBuffer(rGB, i1, p2, p3, p4, p5, uofloatArray);
          }
       }
       return this;
    }
    public final void deleteOesTextureId(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper.class, "15")) {
          return;
       }
       if (this.oesTextureId != null) {
          Log.i("SurfaceTextureHelper", "deleteOesTextureId\(\)");
          int[] ointArray = new int[]{this.oesTextureId};
          GLES20.glDeleteTextures(1, ointArray, 0);
          this.oesTextureId = 0;
          Log.i("SurfaceTextureHelper", "deleteOesTextureId\(\) done");
       }
       return;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper.class, "9")) {
          return;
       }
       Log.i("SurfaceTextureHelper", "dispose\(\)");
       e.a(this.handler, new SurfaceTextureHelper$6(this));
       return;
    }
    public final long getAndCheckFenceId(){
       Object obj = PatchProxy.apply(null, this, SurfaceTextureHelper.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long fenceId = this.getFenceId();
       if (!fenceId - 1281 || !fenceId - 1280) {
          GLES20.glFinish();
       }
       return fenceId;
    }
    public final long getFenceId(){
       Object obj = PatchProxy.apply(null, this, SurfaceTextureHelper.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 1281;
       if (SurfaceTextureHelper.useGlEs30) {
          l = GLES30.glFenceSync(0x9117, 0);
          GLES30.glFlush();
       }
       return l;
    }
    public Handler getHandler(){
       return this.handler;
    }
    public SurfaceTexture getSurfaceTexture(){
       return this.surfaceTexture;
    }
    public void postRunnable(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SurfaceTextureHelper.class, "3")) {
          return;
       }
       if (this.handler.getLooper().getThread() != Thread.currentThread()) {
          this.handler.post(p0);
       }else {
          p0.run();
       }
       return;
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SurfaceTextureHelper.class, "13")) {
          return;
       }
       if (this.handler.getLooper().getThread() != Thread.currentThread()) {
          throw new IllegalStateException("release in wrong thread");
       }
       if (this.isQuitting != null && (this.isTextureInUse != null || this.texFbsInUseFlag != null)) {
          Log.i("SurfaceTextureHelper", "isQuitting="+this.isQuitting+",isTextureInUse="+this.isTextureInUse+",texFbsInUseFlag="+this.texFbsInUseFlag);
          if (this.isTextureInUse == null) {
             this.releaseSurfaceTexture();
             this.deleteOesTextureId();
          }
          return;
       }else {
          Log.i("SurfaceTextureHelper", "release\(\)");
          SurfaceTextureHelper tyuvConverte = this.yuvConverter;
          if (tyuvConverte != null) {
             tyuvConverte.a();
             this.yuvConverter = objArray;
          }
          tyuvConverte = this.t2dConverter;
          if (tyuvConverte != null) {
             tyuvConverte.a();
             this.t2dConverter = objArray;
          }
          int i = 0;
          while (i < 3) {
             SurfaceTextureHelper ttexFbs = this.texFbs;
             if (ttexFbs[i] != null) {
                ttexFbs[i].c();
                this.texFbs[i] = objArray;
             }
             i = i + 1;
          }
          this.releaseSurfaceTexture();
          this.deleteOesTextureId();
          tyuvConverte = this.eglBase;
          if (tyuvConverte != null) {
             tyuvConverte.release();
             this.eglBase = objArray;
          }
          tyuvConverte = this.handler;
          if (tyuvConverte != null) {
             tyuvConverte.getLooper().quit();
          }
          Log.i("SurfaceTextureHelper", "release\(\) done");
          return;
       }
    }
    public final void releaseSurfaceTexture(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SurfaceTextureHelper.class, "14")) {
          return;
       }
       if (this.surfaceTexture != null) {
          Log.i("SurfaceTextureHelper", "releaseSurfaceTexture\(\)");
          if (Build$VERSION.SDK_INT >= 26) {
             if (!this.surfaceTexture.isReleased()) {
                this.surfaceTexture.release();
             }
          }else {
             this.surfaceTexture.release();
          }
          this.surfaceTexture = objArray;
          Log.i("SurfaceTextureHelper", "releaseSurfaceTexture\(\) done");
       }
       return;
    }
    public void returnTextureFrame(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper.class, "8")) {
          return;
       }
       this.returnTextureFrame(this.oesTextureId);
       return;
    }
    public void returnTextureFrame(int p0){
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, surfaceTextu, "7")) {
          return;
       }
       this.postRunnable(new SurfaceTextureHelper$5(this, p0));
       return;
    }
    public void startListening(SurfaceTextureHelper$OnTextureFrameAvailableListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SurfaceTextureHelper.class, "5")) {
          return;
       }
       if (this.listener != null || this.pendingListener != null) {
          throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
       }
       this.pendingListener = p0;
       this.handler.post(this.setListenerRunnable);
       return;
    }
    public void stopListening(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper.class, "6")) {
          return;
       }
       Log.i("SurfaceTextureHelper", "stopListening\(\)");
       this.handler.removeCallbacks(this.setListenerRunnable);
       e.a(this.handler, new SurfaceTextureHelper$4(this));
       return;
    }
    public void textureToYuv(TextureBuffer p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SurfaceTextureHelper.class, "10")) {
          return;
       }
       e.a(this.handler, new SurfaceTextureHelper$7(this, p0, p1));
       return;
    }
    public void tryDeliverTextureFrame(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper.class, "12")) {
          return;
       }
       if (this.isQuitting != null || (this.hasPendingTexture == null || (this.isTextureInUse == null && this.listener != null))) {
          this.isTextureInUse = true;
          this.hasPendingTexture = false;
          this.updateTexImage();
          float[] uofloatArray = new float[16];
          this.surfaceTexture.getTransformMatrix(uofloatArray);
          this.listener.onTextureFrameAvailable(this.oesTextureId, uofloatArray, this.surfaceTexture.getTimestamp());
       }
    label_003c :
       return;
    }
    public void updateTexImage(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper.class, "11")) {
          return;
       }
       Object lock = EglBase.lock;
       _monitor_enter(lock);
       try{
          this.surfaceTexture.updateTexImage();
          GLES20.glClear(0x4000);
       }catch(java.lang.RuntimeException e1){
          Log.e("SurfaceTextureHelper", "RuntimeException during update tex image "+e1);
       }
       _monitor_exit(lock);
       return;
    }
    public void waitSyncInGpu(long p0,boolean p1){
       SurfaceTextureHelper surfaceTextu = SurfaceTextureHelper.class;
       if (PatchProxy.isSupport(surfaceTextu) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, surfaceTextu, "31")) {
          return;
       }
       if (p0 - 1281 && p0 - 1280) {
          GLES30.glWaitSync(p0, 0, -1);
          if (p1) {
             GLES30.glDeleteSync(p0);
          }
       }
       return;
    }
}
