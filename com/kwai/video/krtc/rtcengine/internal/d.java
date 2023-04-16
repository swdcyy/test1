package com.kwai.video.krtc.rtcengine.internal.d;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import java.lang.System;
import java.lang.Integer;
import com.kwai.video.krtc.rtcengine.AudioMixingParam;
import java.util.Iterator;
import com.kwai.video.krtc.rtcengine.internal.d$1;
import com.kwai.video.krtc.observers.BgmObserver;
import java.lang.Boolean;
import java.util.Collection;

public class d	// class@00086a
{
    public Arya a;
    public z b;
    public boolean c;
    public int d;
    public AtomicInteger e;
    public AtomicInteger f;
    public int g;
    public boolean h;
    public CopyOnWriteArrayList i;

    public void d(Arya p0,z p1){
       super();
       this.c = false;
       this.e = new AtomicInteger(-1);
       this.f = new AtomicInteger(-1);
       this.h = false;
       this.i = new CopyOnWriteArrayList();
       this.a = p0;
       this.b = p1;
    }
    public static z a(d p0){
       return p0.b;
    }
    public static ArrayList a(d p0,CopyOnWriteArrayList p1){
       return p0.a(p1);
    }
    public static AtomicInteger b(d p0){
       return p0.e;
    }
    public static AtomicInteger c(d p0){
       return p0.f;
    }
    public static CopyOnWriteArrayList d(d p0){
       return p0.i;
    }
    public int a(){
       d obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineAudioMix", "stopAudioMixing mode:"+this.g+", publishBgmOffset:"+this.h);
       System.currentTimeMillis();
       obj = this.g;
       if (obj != null) {
          if (obj == 1) {
             this.a.stopVoicePartyKtvMode();
          }
       }else if(this.c != null){
          this.a.setMuteMicrophone(0);
       }
       this.a.stopBgm();
       if (this.h != null) {
          this.a.SetEnablePublishBgmOffset(0, 0);
       }
       this.i.clear();
       return 0;
    }
    public int a(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       System.currentTimeMillis();
       float f = (float)p0 / 100.00f;
       this.a.setBgmVolume(f);
       this.a.setRemoteBgmVolume(f);
       return 0;
    }
    public int a(AudioMixingParam p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.i("RtcEngineAudioMix", "startAudioMixing instance:"+p0.instanceId+", mode:"+p0.mode+", publishBgmOffset:"+p0.publishBgmOffset);
       obj = p0.urlList.iterator();
       while (obj.hasNext()) {
          this.i.add(obj.next());
       }
       System.currentTimeMillis();
       this.g = p0.mode;
       this.h = p0.publishBgmOffset;
       d$1 u1 = new d$1(this, p0.instanceId);
       d tg = this.g;
       if (tg != null) {
          if (tg == 1) {
             this.a.startVoicePartyKtvMode(p0.role, p0.bgmId, p0.bgmStartPos, p0.urlList, p0.progressIntervalMs, u1);
          }
       }else {
          this.d = p0.mixIntoChannelProfile;
          int i = -1;
          this.e.set(i);
          this.f.set(i);
          AudioMixingParam mixIntoChann = p0.mixIntoChannelProfile;
          if (mixIntoChann != 1) {
             if (mixIntoChann != 2) {
                if (mixIntoChann == 4) {
                   this.a.setMuteChatOutBgm(1);
                   this.a.setMuteLiveStreamOutBgm(1);
                }
             }else {
                this.a.setMuteLiveStreamOutBgm(1);
             }
          }else {
             this.a.setMuteChatOutBgm(1);
          }
          mixIntoChann = p0.replace;
          this.c = mixIntoChann;
          if (mixIntoChann != null) {
             this.a.setMuteMicrophone(1);
          }
          boolean b = (p0.cycle == i)? true: false;
          this.a.startBgm(p0.urlList, p0.keyList, b, p0.progressIntervalMs, u1);
          if (this.h != null) {
             this.a.SetEnablePublishBgmOffset(1, p0.bgmId);
          }
       }
       return 0;
    }
    public final ArrayList a(CopyOnWriteArrayList p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(p0);
       return obj;
    }
    public boolean a(int p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       System.currentTimeMillis();
       return this.a.updateBgmIndex(p0, p1);
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       System.currentTimeMillis();
       if (this.c != null) {
          this.a.setMuteMicrophone(0);
       }
       this.a.pauseBgm();
       return 0;
    }
    public int b(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       System.currentTimeMillis();
       this.a.setBgmVolume(((float)p0 / 50.00f));
       return 0;
    }
    public void b(int p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "16")) {
          return;
       }
       this.a.SetAudioProfile(p0, p1);
       return;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       System.currentTimeMillis();
       if (this.c != null) {
          this.a.setMuteMicrophone(1);
       }
       this.a.resumeBgm();
       return 0;
    }
    public int c(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       System.currentTimeMillis();
       this.a.setRemoteBgmVolume(((float)p0 / 100.00f));
       return 0;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       System.currentTimeMillis();
       this.a.setMuteBgm(true);
       this.a.setMuteLiveStreamOutBgm(true);
       this.a.setMuteChatOutBgm(true);
       return 0;
    }
    public int d(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       System.currentTimeMillis();
       this.a.seekBgm(p0);
       return 0;
    }
    public int e(){
       d obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       System.currentTimeMillis();
       this.a.setMuteBgm(false);
       obj = this.d;
       if (obj != null) {
          if (obj != 1) {
             if (obj == 2) {
                this.a.setMuteChatOutBgm(false);
             }
          }else {
             this.a.setMuteLiveStreamOutBgm(false);
          }
       }else {
          this.a.setMuteChatOutBgm(false);
          this.a.setMuteLiveStreamOutBgm(false);
       }
       return false;
    }
    public int e(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       System.currentTimeMillis();
       this.a.setBgmPitch(p0);
       return 0;
    }
    public int f(){
       return -1;
    }
    public void f(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "17")) {
          return;
       }
       this.a.setVocalBgmDelay(p0);
       return;
    }
    public int g(){
       return -1;
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.get();
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.get();
    }
}
