package com.yxcorp.gifshow.media.a;
import java.io.Closeable;
import java.io.File;
import java.lang.Object;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.media.MediaDecoderNativeWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import rg.d;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Bitmap;
import java.lang.Boolean;

public class a implements Closeable	// class@001cef
{
    public long b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public File i;
    public final Object j;

    public void a(File p0,int p1,int p2){
       super();
       this.c = -1;
       this.j = new Object();
       Application uApplication = a.b();
       if (PatchProxy.applyVoidOneRefs(uApplication, null, MediaDecoderNativeWrapper.class, "1")) {
       }else if(uApplication != null){
          d.a(uApplication, "ksvideoprocessor");
       }else {
          System.loadLibrary("ksvideoprocessor");
       }
       this.b = MediaDecoderNativeWrapper.open(p0.getAbsolutePath(), p1, p2);
       this.i = p0;
       return;
    }
    public long a(){
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!this.h) {
          obj = this.j;
          _monitor_enter(obj);
          a tb = this.b;
          if (tb) {
             this.h = MediaDecoderNativeWrapper.getDuration(tb);
          }
          _monitor_exit(obj);
       }
       return this.h;
    }
    public int c(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.g == null) {
          obj = this.j;
          _monitor_enter(obj);
          a tb = this.b;
          if (tb) {
             this.g = MediaDecoderNativeWrapper.getRotation(tb);
          }
          _monitor_exit(obj);
       }
       return this.g;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       a tj = this.j;
       _monitor_enter(tj);
       a tb = this.b;
       if (tb) {
          MediaDecoderNativeWrapper.close(tb);
          this.b = 0;
       }
       _monitor_exit(tj);
       return;
    }
    public boolean d(Bitmap p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       _monitor_enter(obj);
       a tb = this.b;
       if (tb) {
          _monitor_exit(obj);
          return MediaDecoderNativeWrapper.nextBitmap(tb, p0);
       }else {
          _monitor_exit(obj);
          return false;
       }
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.close();
       super.finalize();
       return;
    }
    public int getHeight(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.e == null) {
          obj = this.j;
          _monitor_enter(obj);
          if (this.b) {
             if ((this.c() % 180) == 90) {
                this.d = MediaDecoderNativeWrapper.getHeight(this.b);
                this.e = MediaDecoderNativeWrapper.getWidth(this.b);
             }else {
                this.d = MediaDecoderNativeWrapper.getWidth(this.b);
                this.e = MediaDecoderNativeWrapper.getHeight(this.b);
             }
          }
          _monitor_exit(obj);
       }
       return this.e;
    }
    public int getWidth(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.d == null) {
          obj = this.j;
          _monitor_enter(obj);
          if (this.b) {
             if ((this.c() % 180) == 90) {
                this.d = MediaDecoderNativeWrapper.getHeight(this.b);
                this.e = MediaDecoderNativeWrapper.getWidth(this.b);
             }else {
                this.d = MediaDecoderNativeWrapper.getWidth(this.b);
                this.e = MediaDecoderNativeWrapper.getHeight(this.b);
             }
          }
          _monitor_exit(obj);
       }
       return this.d;
    }
}
