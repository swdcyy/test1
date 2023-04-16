package com.kwai.video.krtc.rtcengine.internal.o$a;
import com.kwai.video.krtc.observers.AryaCallObserver;
import com.kwai.video.krtc.rtcengine.internal.o;
import android.os.Looper;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import com.kwai.video.krtc.ChannelSummaryInfo;
import com.kwai.video.krtc.KWAryaStats$KWAryaLocalAudioStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaLocalVideoStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaNetworkStats;
import java.lang.String;
import com.kwai.video.krtc.KWAryaStats$KWAryaRemoteAudioStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaRemoteVideoStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaRtcStats;
import com.kwai.video.krtc.rtcengine.RtcEngineConfig;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import java.lang.Integer;
import sv7.o0;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import sv7.n0;
import java.lang.StringBuilder;
import sv7.w0;
import sv7.x0;
import sv7.k0;
import sv7.u0;
import sv7.e1;
import sv7.h1;
import sv7.h0;
import sv7.v1;
import sv7.w1;
import java.lang.Boolean;
import sv7.u1;
import sv7.t0;
import sv7.z0;
import sv7.x1;
import com.kwai.video.krtc.rtcengine.internal.u;
import sv7.n1;
import sv7.y1;
import com.kwai.video.krtc.rtcengine.internal.a;
import sv7.p0;
import sv7.f1;
import sv7.g1;
import sv7.l0;
import sv7.m0;
import sv7.s0;
import sv7.d1;
import com.kwai.video.krtc.rtcengine.internal.b0;
import com.kwai.video.krtc.rtcengine.internal.d0;
import com.kwai.video.krtc.rtcengine.internal.c0;
import com.kwai.video.krtc.Arya;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import sv7.t1;
import sv7.p1;
import sv7.j0;
import sv7.s1;
import sv7.m1;
import sv7.z1;
import sv7.q0;
import sv7.r0;
import sv7.q1;
import sv7.i1;
import sv7.c1;
import sv7.r1;
import sv7.y0;
import sv7.l1;
import sv7.a2;
import sv7.i0;
import sv7.k1;
import sv7.b1;
import sv7.a1;
import sv7.j1;
import sv7.v0;
import sv7.o1;

public class o$a extends AryaCallObserver	// class@00088b
{
    public final o a;

    public void o$a(o p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public static void a(int p0,int p1,int p2,boolean p3,IRtcEngineEventHandler p4){
       p4.onVideoSendParamChanged(p0, p1, p2, p3);
    }
    public static void a(int p0,IRtcEngineEventHandler p1){
       p1.onLastmileQuality(p0);
    }
    public static void a(ChannelSummaryInfo p0,IRtcEngineEventHandler p1){
       p1.onLeaveChannel(p0);
    }
    public static void a(KWAryaStats$KWAryaLocalAudioStats p0,IRtcEngineEventHandler p1){
       p1.onLocalAudioStats(p0);
    }
    public static void a(KWAryaStats$KWAryaLocalVideoStats p0,IRtcEngineEventHandler p1){
       p1.onLocalVideoStats(p0);
    }
    public static void a(KWAryaStats$KWAryaNetworkStats p0,IRtcEngineEventHandler p1){
       p1.onNetworkQuality(p0.channelId, p0.uid, p0.txQuality, p0.rxQuality);
    }
    public static void a(KWAryaStats$KWAryaRemoteAudioStats p0,IRtcEngineEventHandler p1){
       p1.onRemoteAudioStats(p0);
    }
    public static void a(KWAryaStats$KWAryaRemoteVideoStats p0,IRtcEngineEventHandler p1){
       p1.onRemoteVideoStats(p0);
    }
    public static void a(KWAryaStats$KWAryaRtcStats p0,IRtcEngineEventHandler p1){
       p1.onRtcStats(p0);
    }
    public static void a(IRtcEngineEventHandler p0){
       p0.onAudioOutputDeviceChanged();
    }
    public static void a(o$a p0,String p1,int p2,IRtcEngineEventHandler p3){
       p0.a(p1, p2, p3);
    }
    public static void a(String p0,int p1,int p2,int p3,IRtcEngineEventHandler p4){
       p4.onVideoSizeChanged(p0, p1, p2, p3);
    }
    public static void a(String p0,int p1,int p2,IRtcEngineEventHandler p3){
       p3.onRemoteAudioMixingProgressUpdate(p0, p1, p2);
    }
    private void a(String p0,int p1,IRtcEngineEventHandler p2){
       p2.onRejoinChannelSuccess(p0, o.e(this.a).mUserId, p1);
    }
    public static void a(String p0,IRtcEngineEventHandler p1){
       p1.onConnectionLost(p0);
    }
    public static void a(String p0,String p1,int p2,int p3,int p4,IRtcEngineEventHandler p5){
       p5.onRemoteVideoStateChanged(p0, p1, p2, p3, p4);
    }
    public static void a(String p0,String p1,int p2,int p3,IRtcEngineEventHandler p4){
       p4.onStreamMessageError(p0, p1, p2, p3);
    }
    public static void a(String p0,String p1,int p2,IRtcEngineEventHandler p3){
       p3.onJoinChannelSuccess(p0, p1, p2);
    }
    public static void a(String p0,String p1,int p2,boolean p3,IRtcEngineEventHandler p4){
       p4.onMediaServerInfo(p0, p1, p2, p3);
    }
    public static void a(String p0,String p1,int p2,byte[] p3,IRtcEngineEventHandler p4){
       p4.onReceiveStreamMessage(p0, p1, p2, p3);
    }
    public static void a(String p0,String p1,IRtcEngineEventHandler p2){
       p2.onRemoteScreenCaptureStopped(p0, p1);
    }
    public static void a(String p0,String p1,boolean p2,int p3,int p4,IRtcEngineEventHandler p5){
       p5.onRemoteVideoMute(p0, p1, p2, p3, p4);
    }
    public static void a(String p0,String p1,boolean p2,IRtcEngineEventHandler p3){
       p3.onRemoteSubscribeFallbackToAudioOnly(p0, p1, p2);
    }
    public static void a(String p0,ArrayList p1,IRtcEngineEventHandler p2){
       p2.onActiveSpeaker(p0, p1);
    }
    public static void a(String p0,boolean p1,IRtcEngineEventHandler p2){
       p2.onLocalPublishFallbackToAudioOnly(p0, p1);
    }
    public static void b(int p0,IRtcEngineEventHandler p1){
       p1.onFirstLocalVideoFramePublished(p0);
    }
    public static void b(IRtcEngineEventHandler p0){
       p0.onScreenCastStop();
    }
    public static void b(String p0,int p1,int p2,int p3,IRtcEngineEventHandler p4){
       p4.onVideoSizeChanged(p0, p1, p2, p3);
    }
    public static void b(String p0,int p1,int p2,IRtcEngineEventHandler p3){
       p3.onScreenCaptureSizeChanged(p0, p1, p2);
    }
    public static void b(String p0,int p1,IRtcEngineEventHandler p2){
       p2.onWarning(p0, p1);
    }
    public static void b(String p0,IRtcEngineEventHandler p1){
       p1.onLocalScreenCaptureStopped(p0);
    }
    public static void b(String p0,String p1,int p2,int p3,int p4,IRtcEngineEventHandler p5){
       p5.onRemoteAudioStateChanged(p0, p1, p2, p3, p4);
    }
    public static void b(String p0,String p1,int p2,int p3,IRtcEngineEventHandler p4){
       p4.onRtmpStreamingStateChanged(p0, p1, p2, p3);
    }
    public static void b(String p0,String p1,int p2,IRtcEngineEventHandler p3){
       p3.onUserJoined(p0, p1, p2);
    }
    public static void b(String p0,String p1,IRtcEngineEventHandler p2){
       p2.onRemoteScreenCaptureStarted(p0, p1);
    }
    public static void b(String p0,String p1,boolean p2,int p3,int p4,IRtcEngineEventHandler p5){
       p5.onRemoteAudioMute(p0, p1, p2, p3, p4);
    }
    public static void c(int p0,IRtcEngineEventHandler p1){
       p1.onFirstLocalAudioFramePublished(p0);
    }
    public static void c(IRtcEngineEventHandler p0){
       p0.onHowlingDetected();
    }
    public static void c(String p0,int p1,int p2,IRtcEngineEventHandler p3){
       p3.onScreenCaptureSizeChanged(p0, p1, p2);
    }
    public static void c(String p0,int p1,IRtcEngineEventHandler p2){
       p2.onError(p0, p1);
    }
    public static void c(String p0,IRtcEngineEventHandler p1){
       p1.onLocalScreenCaptureStarted(p0);
    }
    public static void c(String p0,String p1,IRtcEngineEventHandler p2){
       p2.onUserOffline(p0, p1, 0);
    }
    public static void d(String p0,int p1,int p2,IRtcEngineEventHandler p3){
       p3.onConnectionStateChanged(p0, p1, p2);
    }
    public static void d(String p0,int p1,IRtcEngineEventHandler p2){
       p2.onNotifyWithChannelId(p0, p1);
    }
    public static void d(String p0,String p1,IRtcEngineEventHandler p2){
       p2.onDebugInfo(p0, p1);
    }
    public static void e(String p0,int p1,int p2,IRtcEngineEventHandler p3){
       p3.onVideoMixTypeChanged(p0, p1, p2);
    }
    public static void e(String p0,String p1,IRtcEngineEventHandler p2){
       p2.onRemoteScreenCaptureStopped(p0, p1);
    }
    public static void f(String p0,int p1,int p2,IRtcEngineEventHandler p3){
       p3.onClientRoleChangeFailed(p0, p1, p2);
    }
    public static void f(String p0,String p1,IRtcEngineEventHandler p2){
       p2.onRemoteScreenCaptureStarted(p0, p1);
    }
    public static void g(String p0,int p1,int p2,IRtcEngineEventHandler p3){
       p3.onClientRoleChanged(p0, p1, p2);
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "27")) {
          return;
       }
       if (o.d(this.a) != null) {
          Iterator iterator = o.d(this.a).iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (str.startsWith(p0)) {
                o.d(this.a).remove(str);
             }
          }
       }
       return;
    }
    public final void a(String p0,int p1,int p2){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, o$a.class, "8")) {
          return;
       }
       if (!p2) {
          return;
       }
       if (p2 == 1) {
          this.a.a(new o0(p0, p1));
       }else if(p2 == 2){
          this.a.a(new n0(p0, p1));
       }
       return;
    }
    public final void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o$a.class, "26")) {
          return;
       }
       if (o.d(this.a) != null) {
          Iterator iterator = o.d(this.a).iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (str.startsWith(p0+"_"+p1)) {
                o.d(this.a).remove(str);
             }
          }
       }
       return;
    }
    public void onClientRoleChangeFailed(String p0,int p1,int p2){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, o$a.class, "3")) {
          return;
       }
       this.a.a(new w0(p0, p1, p2));
       return;
    }
    public void onClientRoleChanged(String p0,int p1,int p2){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, o$a.class, "2")) {
          return;
       }
       this.a.a(new x0(p0, p1, p2));
       return;
    }
    public void onConnectionLost(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "21")) {
          return;
       }
       super.onConnectionLost(p0);
       this.a.a(new k0(p0));
       return;
    }
    public void onConnectionStateChanged(String p0,int p1,int p2){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, o$a.class, "24")) {
          return;
       }
       super.onConnectionStateChanged(p0, p1, p2);
       this.a.a(new u0(p0, p1, p2));
       return;
    }
    public void onDebugInfo(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o$a.class, "17")) {
          return;
       }
       this.a.a(new e1(p0, p1));
       return;
    }
    public void onJoinChannelSuccess(String p0,String p1,int p2){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, o$a.class, "28")) {
          return;
       }
       super.onJoinChannelSuccess(p0, p1, p2);
       this.a.a(new h1(p0, p1, p2));
       return;
    }
    public void onLastmileQuality(int p0){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       super.onLastmileQuality(p0);
       this.a.a(new h0(p0));
       return;
    }
    public void onLeaveChannel(String p0,int p1,int p2,ChannelSummaryInfo p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, o$a.class, "29")) {
          return;
       }
       super.onLeaveChannel(p0, p1, p2, p3);
       this.a(p0);
       this.a.a(new v1(p3));
       return;
    }
    public void onLocalAudioStats(KWAryaStats$KWAryaLocalAudioStats p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "13")) {
          return;
       }
       this.a.a(new w1(p0));
       return;
    }
    public void onLocalPublishFallbackToAudioOnly(String p0,boolean p1){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "33")) {
          return;
       }
       super.onLocalPublishFallbackToAudioOnly(p0, p1);
       this.a.a(new u1(p0, p1));
       return;
    }
    public void onLocalScreenCaptureSizeChanged(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, o$a.class, "36")) {
          return;
       }
       super.onLocalScreenCaptureSizeChanged(p0, p1, p2, p3);
       this.a.a(new t0(p1, p2, p3));
       return;
    }
    public void onLocalVideoSizeChanged(String p0,String p1,int p2,int p3,int p4){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "34")) {
             return;
          }
       }
       super.onLocalVideoSizeChanged(p0, p1, p2, p3, p4);
       this.a.a(new z0(p1, p2, p3, p4));
       return;
    }
    public void onLocalVideoStats(KWAryaStats$KWAryaLocalVideoStats p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "11")) {
          return;
       }
       this.a.a(new x1(p0));
       return;
    }
    public void onMediaServerInfo(String p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, o$a.class, "20")) {
          return;
       }
       o.b(this.a).b();
       o.c(this.a).b();
       this.a.a(new n1(p0, p1, p2, p3));
       return;
    }
    public void onNetworkQuality(KWAryaStats$KWAryaNetworkStats p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "15")) {
          return;
       }
       this.a.a(new y1(p0));
       return;
    }
    public void onNotify(String p0,int p1,int p2,String p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, o$a.class, "1")) {
          return;
       }
       a uoa = this.a.e();
       this.a(p0, p1, p2);
       o$a uoa1 = -1;
       if (p1 != 103) {
          if (p1 != 104) {
             switch (p1){
                 case 2017:
                 case 2019:
                 case 2020:
                 case 2018:
                   p2 = p1;
                   break;
                 default:
                   p2 = -1;
             }
          }else {
             p2 = 2006;
          }
       }else {
          p2 = 2005;
       }
       if (p2 != uoa1) {
          this.a.a(new p0(p0, p2));
       }
       if (p1 != 9) {
          if (p1 != 27) {
             if (p1 != 35) {
                if (p1 != 52) {
                   if (p1 != 70) {
                      if (p1 != 71) {
                         if (p1 != 119) {
                            if (p1 != 120) {
                               if (p1 != 130) {
                                  if (p1 == 131) {
                                     this.a.a(new f1(p0, p3));
                                  }
                               }else {
                                  this.a.a(new g1(p0, p3));
                               }
                            }else {
                               this.a.stopScreenCapture(p0);
                               this.a.a(new l0(p0));
                            }
                         }else {
                            this.a.a(new m0(p0));
                         }
                      }else {
                         this.a.a(new s0(uoa.a(p0)));
                      }
                   }else {
                      this.a.a(new d1(uoa.a(p0)));
                   }
                }else {
                   this.a.a(b0.a);
                }
             }else {
                this.a.a(d0.a);
             }
          }else {
             this.a.a(c0.a);
          }
       }else {
          this.a.a(new t1(p0, new ArrayList(Arrays.asList(o.a(this.a).getActiveSpeakers()))));
       }
       return;
    }
    public void onPassThroughDataReceived(String p0,String p1,int p2,byte[] p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, o$a.class, "16")) {
          return;
       }
       this.a.a(new p1(p0, p1, p2, p3));
       return;
    }
    public void onRejoinChannelSuccess(String p0,int p1){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "30")) {
          return;
       }
       super.onRejoinChannelSuccess(p0, p1);
       this.a.a(new j0(this, p0, p1));
       return;
    }
    public void onRemoteAudioMute(String p0,String p1,boolean p2,int p3,int p4){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             return;
          }
       }
       super.onRemoteAudioMute(p0, p1, p2, p3, p4);
       s1 os1 = new s1(p0, p1, p2, p3, p4);
       this.a.a(v7);
       return;
    }
    public void onRemoteAudioStateChanged(String p0,String p1,int p2,int p3,int p4){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "39")) {
             return;
          }
       }
       super.onRemoteAudioStateChanged(p0, p1, p2, p3, p4);
       m1 om1 = new m1(p0, p1, p2, p3, p4);
       this.a.a(v7);
       return;
    }
    public void onRemoteAudioStats(KWAryaStats$KWAryaRemoteAudioStats p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "14")) {
          return;
       }
       this.a.a(new z1(p0));
       return;
    }
    public void onRemoteBgmProgressUpdate(String p0,int p1,int p2){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, o$a.class, "38")) {
          return;
       }
       super.onRemoteBgmProgressUpdate(p0, p1, p2);
       this.a.a(new q0(p0, p1, p2));
       return;
    }
    public void onRemoteScreenCaptureSizeChanged(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, o$a.class, "37")) {
          return;
       }
       super.onRemoteScreenCaptureSizeChanged(p0, p1, p2, p3);
       this.a.a(new r0(p1, p2, p3));
       return;
    }
    public void onRemoteSubscribeFallbackToAudioOnly(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, o$a.class, "32")) {
          return;
       }
       super.onRemoteSubscribeFallbackToAudioOnly(p0, p1, p2);
       this.a.a(new q1(p0, p1, p2));
       return;
    }
    public void onRemoteUserEnter(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, o$a.class, "18")) {
          return;
       }
       this.a.a(new i1(p0, p1, p3));
       return;
    }
    public void onRemoteUserLeave(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, o$a.class, "19")) {
          return;
       }
       this.a.a(new c1(p0, p1));
       this.a(p0, p1);
       return;
    }
    public void onRemoteVideoMute(String p0,String p1,boolean p2,int p3,int p4){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
             return;
          }
       }
       super.onRemoteVideoMute(p0, p1, p2, p3, p4);
       r1 or1 = new r1(p0, p1, p2, p3, p4);
       this.a.a(v7);
       return;
    }
    public void onRemoteVideoSizeChanged(String p0,String p1,int p2,int p3,int p4){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "35")) {
             return;
          }
       }
       super.onRemoteVideoSizeChanged(p0, p1, p2, p3, p4);
       this.a.a(new y0(p1, p2, p3, p4));
       return;
    }
    public void onRemoteVideoStateChanged(String p0,String p1,int p2,int p3,int p4){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "40")) {
             return;
          }
       }
       super.onRemoteVideoStateChanged(p0, p1, p2, p3, p4);
       l1 ol1 = new l1(p0, p1, p2, p3, p4);
       this.a.a(v7);
       return;
    }
    public void onRemoteVideoStats(KWAryaStats$KWAryaRemoteVideoStats p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "12")) {
          return;
       }
       this.a.a(new a2(p0));
       return;
    }
    public void onRtcStats(KWAryaStats$KWAryaRtcStats p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "10")) {
          return;
       }
       this.a.a(new i0(p0));
       return;
    }
    public void onRtmpStreamingStateChanged(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, o$a.class, "25")) {
          return;
       }
       this.a.a(new k1(p0, p1, p2, p3));
       return;
    }
    public void onScreenCaptureRemoteStart(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o$a.class, "22")) {
          return;
       }
       super.onScreenCaptureRemoteStart(p0, p1);
       this.a.a(new b1(p0, p1));
       return;
    }
    public void onScreenCaptureRemoteStop(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o$a.class, "23")) {
          return;
       }
       super.onScreenCaptureRemoteStop(p0, p1);
       this.a.a(new a1(p0, p1));
       return;
    }
    public void onStreamMessageError(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, o$a.class, "31")) {
          return;
       }
       super.onStreamMessageError(p0, p1, p2, p3);
       this.a.a(new j1(p0, p1, p2, p3));
       return;
    }
    public void onVideoMixTypeChanged(String p0,int p1,int p2){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, o$a.class, "4")) {
          return;
       }
       super.onVideoMixTypeChanged(p0, p1, p2);
       this.a.a(new v0(p0, p1, p2));
       return;
    }
    public void onVideoSendParamChanged(int p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(o$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, o$a.class, "9")) {
          return;
       }
       this.a.a(new o1(p0, p1, p2, p3));
       return;
    }
}
