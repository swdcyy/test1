package com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.c;
import android.os.Handler$Callback;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.c$b;
import java.lang.Object;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.c$a;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import com.kuaishou.audio.recorder.IAudioRecordEngine;
import gt.a;
import tr.d;
import tr.a;
import tr.c;
import java.io.IOException;
import java.io.FileOutputStream;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import android.os.Message;
import java.lang.IllegalStateException;
import com.kuaishou.audio.recorder.IAudioRecordEngine$RecordAudioFormat;
import com.kuaishou.audio.recorder.IAudioRecordEngine$AudioScene;
import ot.c;
import tkd.b;
import tkd.d;
import os5.l;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.AryaInitManager;
import java.lang.System;
import jw4.a;
import jw4.e;
import com.kwai.feature.api.live.base.service.record.LiveSnowAudioRecordBiz;
import ot.a;

public class c implements Handler$Callback	// class@001670
{
    public byte b;
    public String c;
    public c$b d;
    public IAudioRecordEngine e;
    public FileOutputStream f;
    public final Handler g;
    public final c h;

    public void c(c$b p0){
       super();
       this.h = new c$a(this);
       this.d = p0;
       HandlerThread handlerThrea = new HandlerThread("AudioRecordThread");
       handlerThrea.start();
       Handler handler = new Handler(handlerThrea.getLooper(), this);
       this.g = handler;
       handler.sendEmptyMessage(1);
    }
    public void a(int p0,Exception p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, c.class, "12")) {
          return;
       }
       c td = this.d;
       if (td != null) {
          td.a(p0, p1);
       }
       return;
    }
    public boolean b(){
       File obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new File(this.c);
       boolean b = (obj.exists() && obj.delete())? true: false;
       return b;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       c te = this.e;
       if (te == null) {
          return;
       }
       te.stopRecording();
       a.d().a(this.e);
       return;
    }
    public final d d(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a(a.e());
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       this.c = p0;
       File uFile = new File(p0);
       File parentFile = uFile.getParentFile();
       if (!parentFile.exists() && !parentFile.mkdirs()) {
          throw new IOException();
       }
       if (!uFile.exists() && !uFile.createNewFile()) {
          throw new IOException();
       }
       this.f = new FileOutputStream(this.c);
       return;
    }
    public void f(int p0,Exception p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, c.class, "8")) {
          return;
       }
       this.b = 4;
       c tf = this.f;
       if (tf != null) {
          try{
             tf.close();
          }catch(java.io.IOException e0){
             a.l(MerchantCommonLogBiz.BRIDGE, "MerchantAudioRecorder", e0.getMessage(), e0);
          }
       }
    }
    public boolean handleMessage(Message p0){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Message obj = PatchProxy.applyOneRefs(p0, this, c.class, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = p0.what;
       int i = 19;
       if (obj != true) {
          try{
             byte b = 5;
             if (obj != 2) {
                c uoc = 3;
                if (obj != uoc) {
                   if (obj != 4) {
                      if (obj == b) {
                         uoc = this.b;
                         this.b = b;
                         if (this.e != null) {
                            if (uoc == true) {
                               this.c();
                            }
                            this.e.release();
                         }
                         this.e = null;
                         this.d = null;
                         this.g.getLooper().quit();
                      }
                   }else if(this.b == true && this.e != null){
                      this.b = uoc;
                      this.c();
                   }
                }else if(this.b == true && this.e != null){
                   this.b = 2;
                   this.c();
                }
             }else if(this.b == null){
                this.a(i, new IllegalStateException("Arya init failed!"));
             }else if(this.b != true && (this.b != b && this.e != null)){
                this.e(p0.obj);
                this.b = true;
                if (a.d().g(this.e)) {
                   this.e.e(IAudioRecordEngine$RecordAudioFormat.AAC, IAudioRecordEngine$AudioScene.RecordOnly, this.h);
                }
             }
          }catch(java.io.IOException e7){
             this.f(18, e7);
          }
       }else {
          _monitor_enter(this);
          p0 = PatchProxy.apply(null, this, c.class, "5");
          if (p0 != patchProxyRe) {
             b1 = p0.booleanValue();
             _monitor_exit(this);
          }else if(this.e != null){
             _monitor_exit(this);
          }else {
             b1 = -1492894991;
             d.a(b1).G1();
             if (AryaInitManager.b.a() && d.a(b1).zC()) {
                this.e = e.a(d.a(b1).v0(Integer.valueOf(System.identityHashCode(this))), this.d()).a(LiveSnowAudioRecordBiz.MERCHANT_RECORD);
                _monitor_exit(this);
             }else {
                b1 = false;
                _monitor_exit(this);
             }
          }
          b1 = true;
          if (b1) {
             this.b = 2;
          }else {
             this.a(i, new IllegalStateException("Arya init failed!"));
          }
       }
    }
}
