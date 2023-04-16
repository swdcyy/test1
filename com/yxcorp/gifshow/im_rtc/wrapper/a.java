package com.yxcorp.gifshow.im_rtc.wrapper.a;
import qq6.h;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import ixa.h;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.HandlerThread;
import ixa.d;
import android.os.Looper;
import qo6.k1;
import java.lang.Throwable;
import dc5.c;
import zwa.b;
import zwa.a;
import qo6.m;
import brd.a0;
import gxa.c;
import java.util.Objects;
import ixa.b;
import ixa.c;
import erd.g;
import crd.b;
import rq6.c;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.os.Message;
import android.os.Bundle;
import android.os.Handler;
import qq6.i;
import java.lang.Integer;
import java.util.Map;
import wv4.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import tr.d;
import com.kuaishou.aryainstance.config.SnowConfig;
import xf6.i;
import wkd.b;
import j80.c;
import java.io.File;
import tr.a$c;
import tr.a;
import tr.c;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import com.yxcorp.gifshow.util.resource.n;
import tkd.b;
import tkd.d;
import os5.l;
import com.yxcorp.gifshow.im_rtc.wrapper.AryaInitManager;
import xv4.c;

public class a implements h	// class@001940
{
    public b a;
    public String b;
    public String c;
    public i d;
    public Handler e;
    public final List f;
    public final List g;
    public final h h;
    public final Map i;
    public static boolean j;

    public void a(){
       super();
       CopyOnWriteArrayList uCopyOnWrite = new CopyOnWriteArrayList();
       this.f = uCopyOnWrite;
       CopyOnWriteArrayList uCopyOnWrite1 = new CopyOnWriteArrayList();
       this.g = uCopyOnWrite1;
       this.h = new h(uCopyOnWrite, uCopyOnWrite1);
       this.i = new ConcurrentHashMap();
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "5")) {
       }else {
          HandlerThread handlerThrea = new HandlerThread(uoa.getSimpleName());
          handlerThrea.start();
          this.e = new d(this, handlerThrea.getLooper());
       }
       return;
    }
    public static void w(String p0,k1 p1,Throwable p2){
       c.c("RtcClient", "refreshToken failed");
       a.a().interruptRTCCall(p0);
       p1.onError(-1, p2.getMessage());
    }
    public void a(String p0,k1 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "30")) {
          return;
       }
       c.g("RtcClient", "refreshToken");
       Objects.requireNonNull(p1);
       c.a(true).R(new b(p1), new c(p0, p1));
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       if (p0 != null) {
          this.f.add(p0);
       }
       return;
    }
    public void c(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "15")) {
          return;
       }
       c.g("RtcClient", "changeSelfMuteStatus: "+p0);
       Message message = Message.obtain();
       message.what = 3;
       Bundle uBundle = new Bundle();
       uBundle.putBoolean("muteStatus", p0);
       message.setData(uBundle);
       this.e.sendMessage(message);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "31")) {
          return;
       }
       c.g("RtcClient", "clear");
       a te = this.e;
       if (te != null) {
          te.removeCallbacksAndMessages(null);
       }
       this.n();
       this.g.clear();
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       Message message = Message.obtain();
       message.what = 4;
       Bundle uBundle = new Bundle();
       uBundle.putString("rtcToken", p0);
       message.setData(uBundle);
       this.e.sendMessage(message);
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "32")) {
          return;
       }
       this.n();
       return;
    }
    public void e(i p0){
       this.d = p0;
    }
    public void f(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "22")) {
          return;
       }
       c.g("RtcClient", "changeSelfCameraStatus: "+p0);
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       c.g("RtcClient", "disconnectWithRoomId: "+p0);
       Message message = Message.obtain();
       message.what = 2;
       Bundle uBundle = new Bundle();
       uBundle.putString("roomId", p0);
       message.setData(uBundle);
       this.e.sendMessage(message);
       return;
    }
    public void h(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "21")) {
          return;
       }
       c.g("RtcClient", "changeSelfSpeakerStatus: "+p0);
       Message message = Message.obtain();
       message.what = 5;
       Bundle uBundle = new Bundle();
       uBundle.putBoolean("speakerPhoneStatus", p0);
       message.setData(uBundle);
       this.e.sendMessage(message);
       return;
    }
    public void i(String p0){
       this.c = p0;
    }
    public void j(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "18")) {
          return;
       }
       this.f.remove(p0);
       return;
    }
    public void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       c.g("RtcClient", "connectWithRoomId: "+p0);
       Message message = Message.obtain();
       message.what = 1;
       Bundle uBundle = new Bundle();
       uBundle.putString("roomId", p0);
       message.setData(uBundle);
       this.e.sendMessage(message);
       return;
    }
    public void l(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       p0 = Message.obtain(p0);
       Message what = p0.what;
       a uoa = (what != 6 && (what == 3 || what == 5))? 1: null;
       if (uoa) {
          this.i.put(Integer.valueOf(what), p0);
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.i.clear();
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "33")) {
          return;
       }
       c.g("RtcClient", "destroy rtcEngine");
       Message message = Message.obtain();
       message.what = 7;
       this.e.sendMessage(message);
       return;
    }
    public void o(Message p0,b p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "8")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "28");
       float f = 0;
       if (obj != PatchProxyResult.class) {
          f = obj.floatValue();
       }else {
          Bundle data = p0.getData();
          if (data != null) {
             f = data.getFloat("mediaVolume", f);
          }
       }
       p1.m(f);
       c.g("RtcClient", "adjustPlaybackVolume volume: "+f);
       return;
    }
    public void p(Message p0,b p1){
       int b;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "6")) {
          return;
       }
       String obj = PatchProxy.applyOneRefs(p0, this, uoa, "26");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Bundle data = p0.getData();
          b = (data != null && data.getBoolean("muteStatus"))? true: false;
       }
       obj = "3960305413";
       b = (b)? p1.v(obj): p1.k(obj);
       c.g("RtcClient", "microphoneStatus result: "+b);
       return;
    }
    public void q(Message p0,b p1){
       int b;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "7")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "27");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Bundle data = p0.getData();
          b = (data != null && data.getBoolean("speakerPhoneStatus"))? true: false;
       }
       b = (b)? p1.i(): p1.d();
       c.g("RtcClient", "speakerPhoneStatus result: "+b);
       return;
    }
    public final void r(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       if (!this.i.isEmpty()) {
          Iterator iterator = this.i.keySet().iterator();
          while (iterator.hasNext()) {
             Integer integer = iterator.next();
             Message message = this.i.get(integer);
             if (message == null) {
                c.c("RtcClient", "executeRtcEngineOptions msg is null");
                return;
             }else if(integer.intValue() == 6){
                this.o(message, p0);
             }else if(integer.intValue() == 3){
                this.p(message, p0);
             }else if(integer.intValue() == 5){
                this.q(message, p0);
             }
          }
       }
       return;
    }
    public final d s(i p0){
       SnowConfig obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SnowConfig();
       obj.appName = p0.getAppName();
       obj.appUserId = p0.b();
       obj.appId = p0.getAppId();
       obj.appVersion = p0.getAppVersion();
       obj.deviceId = p0.getDeviceId();
       obj.makeCallTimeoutMs = p0.a();
       obj.isAnchor = true;
       obj.enableVideoRequest = true;
       obj.videoEnableCutForVoiceParty = false;
       obj.enableDebugInfo = true;
       if (i.c("KEY_IM_RTC_VIDEO_DUMP")) {
          obj.dumpEnableFlag = 0xffffffff;
          obj.dumpPath = b.a(-1504323719).j("im_video_dump").getAbsolutePath();
       }
       return c.b(a$c.c, obj);
    }
    public final String t(){
       String str;
       Category obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Category.MAGIC_YCNN_KTP_LIVE_CHAT;
       if (!p.h(obj)) {
          n.l(obj);
          c.g("RtcClient", "downloadYcnnSceneIfNeeded: download ycnn ktp live chat");
          str = "";
       }else {
          str = obj.getResourceDir();
          c.g("RtcClient", "get ktp rtc model path, ktpRtcModelPath: "+str);
       }
       return str;
    }
    public String u(Message p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Bundle data = p0.getData();
       String str = (data != null)? data.getString("roomId"): "";
       return str;
    }
    public final boolean v(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.j) {
          return true;
       }
       int i = -1492894991;
       d.a(i).G1();
       if (!AryaInitManager.b.c() || !d.a(i).zC()) {
          return false;
       }
       a.j = true;
       return true;
    }
    public void x(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       c.g("RtcClient", "realDestroyRtcEngine ");
       p0.p(this.h);
       p0.release();
       this.a = null;
       this.m();
       return;
    }
}
