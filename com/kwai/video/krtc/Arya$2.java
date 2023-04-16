package com.kwai.video.krtc.Arya$2;
import com.kwai.video.krtc.observers.AryaCallObserverInner;
import com.kwai.video.krtc.Arya;
import android.os.Looper;
import com.kwai.video.krtc.observers.AryaCallObserver;
import java.lang.String;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kwai.video.krtc.a;
import com.kwai.video.krtc.ChannelSummaryInfo;
import com.kwai.video.krtc.KWAryaStats$KWAryaLocalAudioStats;
import java.lang.Boolean;
import com.kwai.video.krtc.KWAryaStats$KWAryaLocalVideoStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaNetworkStats;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.a$a;
import com.kwai.video.krtc.AudioServerConfig;
import com.kwai.video.krtc.AryaContext;
import com.kwai.video.krtc.KWAryaStats$KWAryaRemoteAudioStats;
import com.kwai.video.krtc.KWAryaStats$KWAryaRemoteVideoStats;

public class Arya$2 extends AryaCallObserverInner	// class@000651
{
    public final Arya this$0;
    public final AryaCallObserver val$callObserver;

    public void Arya$2(Arya p0,Looper p1,AryaCallObserver p2){
       this.this$0 = p0;
       this.val$callObserver = p2;
       super(p1);
    }
    public void onAudioPassThroughMsg(String p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$2.class, "4")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onAudioPassThroughMsg(p0, p1);
       }
       return;
    }
    public void onClientRoleChangeFailed(String p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Arya$2.class, "29")) {
          return;
       }
       super.onClientRoleChangeFailed(p0, p1, p2);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onClientRoleChangeFailed(p0, p1, p2);
       }
       return;
    }
    public void onClientRoleChanged(String p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Arya$2.class, "28")) {
          return;
       }
       super.onClientRoleChanged(p0, p1, p2);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onClientRoleChanged(p0, p1, p2);
       }
       return;
    }
    public void onConnectionLost(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$2.class, "23")) {
          return;
       }
       super.onConnectionLost(p0);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onConnectionLost(p0);
       }
       return;
    }
    public void onConnectionStateChanged(String p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Arya$2.class, "26")) {
          return;
       }
       super.onConnectionStateChanged(p0, p1, p2);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onConnectionStateChanged(p0, p1, p2);
       }
       return;
    }
    public void onDebugInfo(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$2.class, "11")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onDebugInfo(p0, p1+"Stannis Tips:\n"+Arya.d(this.this$0).g());
       }
       return;
    }
    public void onJoinChannelSuccess(String p0,String p1,int p2){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, Arya$2.class, "35")) {
          return;
       }
       super.onJoinChannelSuccess(p0, p1, p2);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onJoinChannelSuccess(p0, p1, p2);
       }
       return;
    }
    public void onLastmileQuality(int p0){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u2, "34")) {
          return;
       }
       super.onLastmileQuality(p0);
       u2 = this.val$callObserver;
       if (u2 != null) {
          u2.onLastmileQuality(p0);
       }
       return;
    }
    public void onLeaveChannel(String p0,int p1,int p2,ChannelSummaryInfo p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, Arya$2.class, "36")) {
          return;
       }
       super.onLeaveChannel(p0, p1, p2, p3);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onLeaveChannel(p0, p1, p2, p3);
       }
       return;
    }
    public void onLocalAudioStats(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$2.class, "8")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onLocalAudioStats(new KWAryaStats$KWAryaLocalAudioStats(p0));
       }
       return;
    }
    public void onLocalPublishFallbackToAudioOnly(String p0,boolean p1){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, u2, "40")) {
          return;
       }
       super.onLocalPublishFallbackToAudioOnly(p0, p1);
       u2 = this.val$callObserver;
       if (u2 != null) {
          u2.onLocalPublishFallbackToAudioOnly(p0, p1);
       }
       return;
    }
    public void onLocalScreenCaptureSizeChanged(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, Arya$2.class, "43")) {
          return;
       }
       super.onLocalScreenCaptureSizeChanged(p0, p1, p2, p3);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onLocalScreenCaptureSizeChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void onLocalVideoSizeChanged(String p0,String p1,int p2,int p3,int p4){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, u2, "41")) {
             return;
          }
       }
       super.onLocalVideoSizeChanged(p0, p1, p2, p3, p4);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onLocalVideoSizeChanged(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onLocalVideoStats(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$2.class, "6")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onLocalVideoStats(new KWAryaStats$KWAryaLocalVideoStats(p0));
       }
       return;
    }
    public void onMediaServerInfo(String p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, Arya$2.class, "2")) {
          return;
       }
       if (p3) {
          Arya.d(this.this$0, p0);
       }else {
          Arya.b(this.this$0, p0);
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onMediaServerInfo(p0, p1, p2, p3);
       }
       return;
    }
    public void onNetworkQuality(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$2.class, "10")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onNetworkQuality(new KWAryaStats$KWAryaNetworkStats(p0));
       }
       return;
    }
    public void onNotify(String p0,int p1,int p2,int p3,String p4,String p5){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, u2, "1")) {
             return;
          }
       }
       if (p2 == 50 || p2 == 115) {
          p2 = Integer.parseInt(p4);
       }else {
          int i = 28;
          if (p2 == i) {
             if (p2 == i && p2 != 62) {
                Arya.b(this.this$0, p0);
             }
             if (p1 != 3) {
                if (p1 != 8) {
                   if (p1 != 5) {
                      if (p1 == 6) {
                         p2 = 13;
                      }
                   }else {
                      p2 = 10;
                   }
                }else {
                   p2 = 25;
                }
             }else {
                p2 = 7;
             }
          }else {
             i = 29;
             if (p2 == i) {
                if (p2 == i && p2 != 24) {
                   Arya.b(this.this$0, "");
                }
                Arya.c(this.this$0, "");
                if (p1 != 3) {
                   if (p1 != 8) {
                      if (p1 != 5) {
                         if (p1 == 6) {
                            p2 = 14;
                         }
                      }else {
                         p2 = 12;
                      }
                   }else {
                      p2 = 26;
                   }
                }else {
                   p2 = 8;
                }
             }else if(p2 == 33){
                this.this$0.setMuteMicrophone(1);
             }else if(p2 == 34){
                this.this$0.setMuteMicrophone(0);
             }
          }
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onNotify(p0, p2, p3, p5);
       }
       return;
    }
    public void onNotifyInnerAddArx(String p0,int p1,int p2,int p3,String p4){
       Arya$2 u2 = Arya$2.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(u2)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, u2, "15")) {
             return;
          }
       }
       String str = "Arya";
       if (this.this$0.c != null) {
          Log.i(str, "[Arya] setHrtfMode high");
          Arya.d(this.this$0).b(p1, i);
       }else {
          Log.i(str, "[Arya] setHrtfMode common");
          Arya.d(this.this$0).b(p1, i1);
       }
       Arya.d(this.this$0).a(p1, Arya.h(this.this$0), p2, p3, p4, false, 2);
       return;
    }
    public void onNotifyInnerChangeAudioScene(String p0,int p1,boolean p2,Object p3,int p4){
       if (PatchProxy.isSupport(Arya$2.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, Arya$2.class, "14")) {
             return;
          }
       }
       Arya.a(this.this$0, p1);
       if (Arya.e(this.this$0) && !Arya.f(this.this$0)) {
          return;
       }else if(!Arya.g(this.this$0)){
          Log.i("Arya", "[Arya] onNotifyInnerChangeAudioScene, wrong status: arya was uninted");
          return;
       }else if(p2){
          Arya.d(this.this$0).a(p3);
       }
       Arya.d(this.this$0).a(p1, Arya.h(this.this$0), p4);
       Arya.d(this.this$0).a(Arya.i(this.this$0));
       Arya.j(this.this$0);
       if (!Arya.k(this.this$0) || this.this$0.a == null) {
          Arya.d(this.this$0).r();
       }
       return;
    }
    public void onNotifyInnerDisableAudioRecord(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$2.class, "18")) {
          return;
       }
       Arya.d(this.this$0).e(false);
       return;
    }
    public void onNotifyInnerEnableAudioRecord(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$2.class, "17")) {
          return;
       }
       if (Arya.l(this.this$0)) {
          Arya.d(this.this$0).e(true);
       }
       return;
    }
    public void onNotifyInnerGuestAudioInfoUpdated(String p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$2.class, "21")) {
          return;
       }
       Arya.a(this.this$0, p1);
       return;
    }
    public void onNotifyInnerKtvBgmStart(String p0,int p1){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u2, "19")) {
          return;
       }
       Arya$2 tthis$0 = this.this$0;
       Arya b = tthis$0.b;
       if (p1 == b) {
          tthis$0.resumeBgm();
       }else if(p1 > b){
          tthis$0.resumeBgm();
          this.this$0.seekBgm(p1);
       }
       return;
    }
    public void onNotifyInnerRemoteBgmProgressUpdate(String p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Arya$2.class, "20")) {
          return;
       }
       super.onNotifyInnerRemoteBgmProgressUpdate(p0, p1, p2);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteBgmProgressUpdate(p0, p1, p2);
       }
       return;
    }
    public void onNotifyInnerRemoveArx(String p0,int p1){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, Arya$2.class, "16")) {
          return;
       }
       Arya.d(this.this$0).a(p1);
       return;
    }
    public void onNotifyInnerStopStannis(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$2.class, "22")) {
          return;
       }
       Arya.d(this.this$0).a(Arya.h(this.this$0));
       return;
    }
    public void onPassThroughDataReceived(String p0,String p1,int p2,byte[] p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, Arya$2.class, "33")) {
          return;
       }
       super.onPassThroughDataReceived(p0, p1, p2, p3);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onPassThroughDataReceived(p0, p1, p2, p3);
       }
       return;
    }
    public void onRejoinChannelSuccess(String p0,int p1){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u2, "37")) {
          return;
       }
       super.onRejoinChannelSuccess(p0, p1);
       u2 = this.val$callObserver;
       if (u2 != null) {
          u2.onRejoinChannelSuccess(p0, p1);
       }
       return;
    }
    public void onRemoteAudioMute(String p0,String p1,boolean p2,int p3,int p4){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, u2, "31")) {
             return;
          }
       }
       super.onRemoteAudioMute(p0, p1, p2, p3, p4);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteAudioMute(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onRemoteAudioStateChanged(String p0,String p1,int p2,int p3,int p4){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, u2, "45")) {
             return;
          }
       }
       super.onRemoteAudioStateChanged(p0, p1, p2, p3, p4);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteAudioStateChanged(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onRemoteAudioStats(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$2.class, "9")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteAudioStats(new KWAryaStats$KWAryaRemoteAudioStats(p0));
       }
       return;
    }
    public void onRemoteScreenCaptureSizeChanged(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, Arya$2.class, "44")) {
          return;
       }
       super.onRemoteScreenCaptureSizeChanged(p0, p1, p2, p3);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteScreenCaptureSizeChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void onRemoteSubscribeFallbackToAudioOnly(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, Arya$2.class, "39")) {
          return;
       }
       super.onRemoteSubscribeFallbackToAudioOnly(p0, p1, p2);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteSubscribeFallbackToAudioOnly(p0, p1, p2);
       }
       return;
    }
    public void onRemoteUserEnter(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, Arya$2.class, "12")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteUserEnter(p0, p1, p2, p3);
       }
       return;
    }
    public void onRemoteUserLeave(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, Arya$2.class, "13")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteUserLeave(p0, p1, p2, p3);
       }
       return;
    }
    public void onRemoteVideoMute(String p0,String p1,boolean p2,int p3,int p4){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, u2, "32")) {
             return;
          }
       }
       super.onRemoteVideoMute(p0, p1, p2, p3, p4);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteVideoMute(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onRemoteVideoSizeChanged(String p0,String p1,int p2,int p3,int p4){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, u2, "42")) {
             return;
          }
       }
       super.onRemoteVideoSizeChanged(p0, p1, p2, p3, p4);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteVideoSizeChanged(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onRemoteVideoStateChanged(String p0,String p1,int p2,int p3,int p4){
       Arya$2 u2 = Arya$2.class;
       if (PatchProxy.isSupport(u2)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, u2, "46")) {
             return;
          }
       }
       super.onRemoteVideoStateChanged(p0, p1, p2, p3, p4);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteVideoStateChanged(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onRemoteVideoStats(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$2.class, "7")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRemoteVideoStats(new KWAryaStats$KWAryaRemoteVideoStats(p0));
       }
       return;
    }
    public void onRtcStats(String p0){
    }
    public void onRtmpStreamingStateChanged(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, Arya$2.class, "27")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onRtmpStreamingStateChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void onScreenCaptureRemoteStart(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$2.class, "24")) {
          return;
       }
       super.onScreenCaptureRemoteStart(p0, p1);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onScreenCaptureRemoteStart(p0, p1);
       }
       return;
    }
    public void onScreenCaptureRemoteStop(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$2.class, "25")) {
          return;
       }
       super.onScreenCaptureRemoteStop(p0, p1);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onScreenCaptureRemoteStop(p0, p1);
       }
       return;
    }
    public void onStreamMessageError(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, Arya$2.class, "38")) {
          return;
       }
       super.onStreamMessageError(p0, p1, p2, p3);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onStreamMessageError(p0, p1, p2, p3);
       }
       return;
    }
    public void onVideoMixTypeChanged(String p0,int p1,int p2){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, Arya$2.class, "30")) {
          return;
       }
       super.onVideoMixTypeChanged(p0, p1, p2);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onVideoMixTypeChanged(p0, p1, p2);
       }
       return;
    }
    public void onVideoSendParamChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya$2.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Arya$2.class, "3")) {
          return;
       }
       Log.i("Arya", "[Arya] onVideoSendParamChanged: width="+p1+", height="+p2+", fps="+p3);
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          Arya$2 tthis$0 = this.this$0;
          tval$callObs.onVideoSendParamChanged(p1, p2, p3, Arya.a(tthis$0, Arya.c(tthis$0), p0));
       }
       Arya$2 tthis$01 = this.this$0;
       if (Arya.a(tthis$01, Arya.c(tthis$01)) && (p1 * p2)) {
          Arya.a(this.this$0, p0, p1, p2);
       }
       return;
    }
    public void onVoiceComment(String p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Arya$2.class, "5")) {
          return;
       }
       Arya$2 tval$callObs = this.val$callObserver;
       if (tval$callObs != null) {
          tval$callObs.onVoiceComment(p0, p1);
       }
       return;
    }
}
