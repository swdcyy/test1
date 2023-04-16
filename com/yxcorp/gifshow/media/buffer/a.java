package com.yxcorp.gifshow.media.buffer.a;
import com.yxcorp.gifshow.media.buffer.b;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.media.buffer.JpegBufferNativeWrapper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import rg.d;
import java.lang.System;
import java.util.concurrent.LinkedBlockingDeque;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qkd.b;
import ykd.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.concurrent.BlockingQueue;
import java.lang.InterruptedException;
import java.io.IOException;
import android.graphics.Bitmap;
import java.lang.Integer;
import com.yxcorp.gifshow.media.util.h;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.media.buffer.a$a;
import com.yxcorp.gifshow.media.buffer.b$a;
import java.lang.Math;
import java.lang.Number;
import java.lang.UnsupportedOperationException;
import s6b.a;
import java.lang.Runnable;
import t45.c;

public class a implements b	// class@001cf3
{
    public long b;
    public int c;
    public int d;
    public File e;
    public File f;
    public int g;
    public int h;
    public final BlockingQueue i;
    public final BlockingQueue j;
    public boolean k;

    static {
       Application uApplication = a.b();
       if (PatchProxy.applyVoidOneRefs(uApplication, null, JpegBufferNativeWrapper.class, "1")) {
       }else if(uApplication != null){
          d.a(uApplication, "ksvideoprocessor");
       }else {
          System.loadLibrary("ksvideoprocessor");
       }
    }
    public void a(String p0){
       super();
       this.i = new LinkedBlockingDeque(10);
       this.j = new LinkedBlockingDeque(10);
       long l = JpegBufferNativeWrapper.open(p0);
       this.b = l;
       if (l) {
          this.e = new File(p0);
          this.c = JpegBufferNativeWrapper.getWidth(this.b);
          this.d = JpegBufferNativeWrapper.getHeight(this.b);
          this.f = new File(JpegBufferNativeWrapper.getJpegDirectory(this.b));
          this.g = JpegBufferNativeWrapper.getCount(this.b);
       }
       return;
    }
    public static boolean b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || p1 == null) {
          return b;
       }
       a uoa = new a(p0);
       if (!uoa.b - null) {
          return b;
       }
       File uFile = new File(p1);
       int i = (uFile.getName()).lastIndexOf(".bfr");
       if (i < 0) {
          return b;
       }
       File uFile1 = new File(uFile.getParent(), (uFile.getName()).substring(b, i));
       uFile.delete();
       uFile.getParentFile().mkdirs();
       uFile.createNewFile();
       b.q(uFile1);
       uFile1.mkdirs();
       long l = JpegBufferNativeWrapper.create(uoa.getWidth(), uoa.getHeight(), uFile.getAbsolutePath(), uFile1.getAbsolutePath());
       JpegBufferNativeWrapper.setCount(l, uoa.getCount());
       b.c(uoa.f, uFile1);
       JpegBufferNativeWrapper.flush(l);
       JpegBufferNativeWrapper.release(l);
       uoa.close();
       return true;
    }
    public static boolean c(File p0){
       a obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new a(p0.getAbsolutePath());
       int i = 0;
       if (!obj.b - null) {
          Object[] objArray = new Object[i];
          a.C().t("Recorder", "Failed to open bfr file: "+p0, objArray);
          return i;
       }else {
          File uFile = b.X(p0.getParentFile(), ".bfr");
          uFile.createNewFile();
          long l = JpegBufferNativeWrapper.create(obj.getWidth(), obj.getHeight(), uFile.getAbsolutePath(), new File(p0.getParent(), (p0.getName()).substring(i, (p0.getName()).lastIndexOf(".bfr"))).getAbsolutePath());
          JpegBufferNativeWrapper.setCount(l, obj.getCount());
          JpegBufferNativeWrapper.flush(l);
          JpegBufferNativeWrapper.release(l);
          obj.close();
          b.q(p0);
          b.W(uFile, p0);
          return true;
       }
    }
    public File B2(){
       a tj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, a.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       _monitor_enter(this);
       if (PatchProxy.applyOneRefs(objArray, this, a.class, "3") != patchProxyRe) {
          _monitor_exit(this);
       }else {
          while (this.j.size() > 0) {
             tj = this.j;
             _monitor_enter(tj);
             try{
                this.j.wait();
             }catch(java.lang.InterruptedException e1){
                e1.printStackTrace();
             }
             _monitor_exit(tj);
          }
          tj = this.b;
          if (tj - null) {
             try{
                JpegBufferNativeWrapper.setCount(tj, this.g);
                JpegBufferNativeWrapper.flush(this.b);
             }catch(java.io.IOException e0){
                e0.printStackTrace();
             }
             this.a();
             obj = new Object[0];
             a.C().y("Recorder", "competeFiles cost "+(System.currentTimeMillis() - System.currentTimeMillis()), obj);
          }
          _monitor_exit(this);
       }
       return this.e;
    }
    public int M2(){
       return 28;
    }
    public synchronized boolean T0(int p0,Bitmap p1){
       File obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, a.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 >= this.g) {
          return false;
       }else {
          obj = new File(this.d(p0));
          if (obj.exists()) {
             Bitmap uBitmap = h.a(obj);
             if (uBitmap != null) {
                new Canvas(p1).drawBitmap(uBitmap, null, new Rect(false, false, p1.getWidth(), p1.getHeight()), null);
                uBitmap.recycle();
                return true;
             }
          }
          return false;
       }
    }
    public synchronized boolean U0(Bitmap p0,int p1,boolean p2){
       a obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, a.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.g;
       Bitmap uBitmap = this.i.poll();
       if (uBitmap != null && (uBitmap.getWidth() != p0.getWidth() || uBitmap.getHeight() != p0.getHeight())) {
          uBitmap = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), Bitmap$Config.ARGB_8888);
       }
       Canvas uCanvas = new Canvas(uBitmap);
       try{
          uCanvas.drawBitmap(p0, 0, 0, null);
          this.j.put(new a$a(this, obj, uBitmap));
          this.g = this.g + 1;
          return 1;
       }catch(java.lang.InterruptedException e8){
          e8.printStackTrace();
          return false;
       }
    }
    public synchronized b U2(b$a p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       while (this.j.size() > 0) {
          obj = this.j;
          _monitor_enter(obj);
          try{
             this.j.wait();
          }catch(java.lang.InterruptedException e1){
             e1.printStackTrace();
          }
          _monitor_exit(obj);
       }
       obj = this.b;
       if (obj - null) {
          try{
             JpegBufferNativeWrapper.setCount(obj, this.g);
             JpegBufferNativeWrapper.flush(this.b);
             if (p0 != null) {
                obj = this.g;
                p0.a(this, (long)obj, (long)obj);
             }
          }catch(java.io.IOException e8){
             e8.printStackTrace();
          }
          this.a();
          Object[] objArray = new Object[0];
          a.C().y("Recorder", "competeFiles cost "+(System.currentTimeMillis() - System.currentTimeMillis()), objArray);
       }
       return this;
    }
    public final void a(){
       File uFile;
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "14")) {
          return;
       }
       a tg = this.g;
       int i = 0;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tg), this, a.class, "15")) {
          uFile = new File(this.d(i));
          if (!uFile.exists()) {
             i1 = 1;
             while (i1 < tg) {
                File uFile1 = new File(this.d(i1));
                if (uFile1.exists()) {
                   int i3 = 1;
                label_004b :
                   int i4 = i3 + 1;
                   if (i3 < 3) {
                      try{
                         b.g(uFile1, uFile);
                         break ;
                      }catch(java.io.IOException e8){
                         e8.printStackTrace();
                         i3 = i4;
                         goto label_004b ;
                      }
                   }
                }
                i1 = i1 + 1;
             }
          }
       }
       while (i < tg) {
          uFile = new File(this.d(i));
          if (uFile.exists()) {
             objArray = uFile;
          }else if(objArray != null){
             i1 = 1;
          label_0072 :
             int i2 = i1 + 1;
             if (i1 < 3) {
                try{
                   b.g(objArray, uFile);
                }catch(java.io.IOException e6){
                   e6.printStackTrace();
                   i1 = i2;
                   goto label_0072 ;
                }
             }
          }
          i = i + 1;
       }
       for (; tg < this.h; tg = tg + 1) {
          new File(this.d(tg)).delete();
       }
       return;
    }
    public synchronized void close(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.k = true;
       a tb = this.b;
       if (tb) {
          JpegBufferNativeWrapper.release(tb);
          this.b = 0;
       }
       return;
    }
    public String d(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.f.getAbsolutePath()+"/frame-"+p0+".jpg";
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       this.close();
       super.finalize();
       return;
    }
    public synchronized boolean g1(int p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.h = Math.max(this.g, this.h);
       int i = 0;
       p0 = Math.max(i, Math.min(this.g, p0));
       this.g = p0;
       a tb = this.b;
       if (tb && JpegBufferNativeWrapper.setCount(tb, p0)) {
          i = true;
       }
       return i;
    }
    public synchronized int getCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.g < null) {
          Object[] objArray = new Object[0];
          a.C().t("Recorder", "BufferCountError", objArray);
          this.g = 0;
       }
       return this.g;
    }
    public int getHeight(){
       return this.d;
    }
    public long getId(){
       return this.b;
    }
    public int getWidth(){
       return this.c;
    }
    public synchronized boolean j2(byte[] p0,int p1,int p2,int p3,int p4,int p5,boolean p6,int p7,Object p8){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          p0 = PatchProxy.apply(objArray, this, a.class, "7");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       throw new UnsupportedOperationException("this method is not available");
    }
    public synchronized void release(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       this.close();
       c.a(new a(this));
       return;
    }
}
