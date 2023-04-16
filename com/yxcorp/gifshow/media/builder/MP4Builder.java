package com.yxcorp.gifshow.media.builder.MP4Builder;
import com.yxcorp.gifshow.media.builder.a;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.media.util.c;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.media.builder.MP4BuilderNativeWrapper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import rg.d;
import java.lang.System;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Float;
import r6b.b;

public class MP4Builder implements a	// class@001cf7
{
    public File a;
    public long b;
    public int c;
    public int d;
    public int e;
    public MP4Builder$ActionCallbackWrap f;
    public final Object g;

    public void MP4Builder(File p0,String p1,int p2,int p3,int p4){
       super();
       Object obj = new Object();
       this.g = obj;
       p2 = p2 - (p2 % 2);
       p3 = p3 - (p3 % 2);
       _monitor_enter(obj);
       Object a = c.a;
       try{
          _monitor_enter(a);
          Application uApplication = a.b();
          if (!PatchProxy.applyVoidOneRefs(uApplication, null, MP4BuilderNativeWrapper.class, "1")) {
             String str = "ksvideoprocessor";
             if (uApplication != null) {
                d.a(uApplication, str);
             }else {
                System.loadLibrary(str);
             }
          }
          this.b = MP4BuilderNativeWrapper.create(p0.getAbsolutePath(), p1, p2, p3, p4, this.e(), true);
       label_0069 :
          _monitor_exit(a);
          _monitor_exit(obj);
          this.a = p0;
          this.c = p2;
          this.d = p3;
          this.e = p4;
          return;
       }catch(java.io.IOException e2){
          if ((p2 % 8) || (p3 % 8)) {
             p2 = p2 - (p2 % 8);
             p3 = p3 - (p3 % 8);
             this.b = MP4BuilderNativeWrapper.create(p0.getAbsolutePath(), p1, p2, p3, p4, this.e(), true);
             goto label_0069 ;
          }else {
             throw e2;
          }
       }
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MP4Builder.class, "7")) {
          return;
       }
       MP4Builder tg = this.g;
       _monitor_enter(tg);
       if (this.b) {
          Object a = c.a;
          _monitor_enter(a);
          MP4BuilderNativeWrapper.finish(this.b, false);
          _monitor_exit(a);
          this.b = 0;
       }
       _monitor_exit(tg);
       return;
    }
    public boolean b(byte[] p0,int p1,int p2,int p3,int p4){
       MP4Builder mP4Builder = MP4Builder.class;
       int i = 0;
       if (PatchProxy.isSupport(mP4Builder)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, mP4Builder, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       mP4Builder = this.g;
       _monitor_enter(mP4Builder);
       if (this.b) {
          Object a = c.a;
          _monitor_enter(a);
          _monitor_exit(a);
          _monitor_exit(mP4Builder);
          return MP4BuilderNativeWrapper.addAudio(this.b, p0, p1, p2, p3, p4);
       }else {
          _monitor_exit(mP4Builder);
          return i;
       }
    }
    public boolean c(byte[] p0,int p1,int p2,int p3,int p4,int p5,boolean p6,int p7,Object p8){
       MP4Builder mP4Builder = this;
       MP4Builder mP4Builder1 = MP4Builder.class;
       int i = 0;
       if (PatchProxy.isSupport(mP4Builder1)) {
          Object[] objArray = new Object[9];
          objArray[i] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          Object obj = PatchProxy.apply(objArray, this, mP4Builder1, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       MP4Builder g = mP4Builder.g;
       _monitor_enter(g);
       if (mP4Builder.b) {
          Object a = c.a;
          _monitor_enter(a);
          _monitor_exit(a);
          _monitor_exit(g);
          return MP4BuilderNativeWrapper.addVideo(mP4Builder.b, p0, p1, p2, p3, p4, p5, p6, p7);
       }else {
          _monitor_exit(g);
          return i;
       }
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, MP4Builder.class, "8")) {
          return;
       }
       MP4Builder tg = this.g;
       _monitor_enter(tg);
       MP4Builder tb = this.b;
       if (tb) {
          MP4BuilderNativeWrapper.finish(tb, true);
          this.a.delete();
          this.b = 0;
       }
       _monitor_exit(tg);
       return;
    }
    public boolean d(File p0,boolean p1,boolean p2,boolean p3,long p4,long p5){
       Object obj1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MP4Builder mP4Builder = MP4Builder.class;
       int i = 6;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int i5 = 1;
       int i6 = 0;
       if (PatchProxy.isSupport(mP4Builder)) {
          Object[] objArray = new Object[i];
          objArray[i6] = p0;
          objArray[i5] = Boolean.valueOf(p1);
          objArray[i4] = Boolean.valueOf(p2);
          objArray[i3] = Boolean.valueOf(p3);
          objArray[i2] = Long.valueOf(p4);
          objArray[i1] = Long.valueOf(p5);
          obj1 = PatchProxy.apply(objArray, obj, mP4Builder, "4");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       float f = 0x3f800000;
       if (PatchProxy.isSupport(mP4Builder)) {
          Object[] objArray1 = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),Long.valueOf(p4),Long.valueOf(p5),Float.valueOf(f)};
          Object obj2 = PatchProxy.apply(objArray1, obj, mP4Builder, "5");
          if (obj2 != patchProxyRe) {
             i6 = obj2.booleanValue();
          }else {
          label_0084 :
             mP4Builder = obj.g;
             _monitor_enter(mP4Builder);
             if (obj.b) {
                obj1 = c.a;
                _monitor_enter(obj1);
                i6 = MP4BuilderNativeWrapper.addFile(obj.b, obj.f, p0.getAbsolutePath(), p1, p2, p3, p4, p5, 0x3f800000);
                _monitor_exit(obj1);
                _monitor_exit(mP4Builder);
             }else {
                _monitor_exit(mP4Builder);
             }
          }
       }else {
          goto label_0084 ;
       }
       return i6;
    }
    public boolean e(){
       return (this instanceof b ^ 0x01);
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, MP4Builder.class, "9")) {
          return;
       }
       this.cancel();
       super.finalize();
       return;
    }
    public int getDelay(){
       return this.e;
    }
    public int getHeight(){
       return this.d;
    }
    public int getWidth(){
       return this.c;
    }
}
