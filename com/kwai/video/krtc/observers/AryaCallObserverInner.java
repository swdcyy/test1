package com.kwai.video.krtc.observers.AryaCallObserverInner;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.String;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.observers.AryaCallObserverInner$3;
import java.lang.Runnable;
import java.lang.Integer;
import com.kwai.video.krtc.observers.AryaCallObserverInner$20;
import com.kwai.video.krtc.observers.AryaCallObserverInner$19;
import com.kwai.video.krtc.observers.AryaCallObserverInner$16;
import com.kwai.video.krtc.observers.AryaCallObserverInner$22;
import com.kwai.video.krtc.observers.AryaCallObserverInner$11;
import com.kwai.video.krtc.observers.AryaCallObserverInner$29;
import com.kwai.video.krtc.observers.AryaCallObserverInner$28;
import com.kwai.video.krtc.ChannelSummaryInfo;
import com.kwai.video.krtc.observers.AryaCallObserverInner$30;
import com.kwai.video.krtc.observers.AryaCallObserverInner$8;
import java.lang.Boolean;
import com.kwai.video.krtc.observers.AryaCallObserverInner$33;
import com.kwai.video.krtc.observers.AryaCallObserverInner$38;
import com.kwai.video.krtc.observers.AryaCallObserverInner$41;
import com.kwai.video.krtc.observers.AryaCallObserverInner$39;
import com.kwai.video.krtc.observers.AryaCallObserverInner$6;
import com.kwai.video.krtc.observers.AryaCallObserverInner$12;
import com.kwai.video.krtc.observers.AryaCallObserverInner$10;
import com.kwai.video.krtc.observers.AryaCallObserverInner$45;
import com.kwai.video.krtc.observers.AryaCallObserverInner$34;
import com.kwai.video.krtc.observers.AryaCallObserverInner$36;
import com.kwai.video.krtc.observers.AryaCallObserverInner$35;
import com.kwai.video.krtc.observers.AryaCallObserverInner$2;
import com.kwai.video.krtc.observers.AryaCallObserverInner$47;
import com.kwai.video.krtc.observers.AryaCallObserverInner$48;
import com.kwai.video.krtc.observers.AryaCallObserverInner$46;
import com.kwai.video.krtc.observers.AryaCallObserverInner$49;
import com.kwai.video.krtc.observers.AryaCallObserverInner$1;
import com.kwai.video.krtc.observers.AryaCallObserverInner$27;
import com.kwai.video.krtc.observers.AryaCallObserverInner$31;
import com.kwai.video.krtc.observers.AryaCallObserverInner$25;
import com.kwai.video.krtc.observers.AryaCallObserverInner$43;
import com.kwai.video.krtc.observers.AryaCallObserverInner$9;
import com.kwai.video.krtc.observers.AryaCallObserverInner$42;
import com.kwai.video.krtc.observers.AryaCallObserverInner$37;
import com.kwai.video.krtc.observers.AryaCallObserverInner$13;
import com.kwai.video.krtc.observers.AryaCallObserverInner$14;
import com.kwai.video.krtc.observers.AryaCallObserverInner$15;
import com.kwai.video.krtc.observers.AryaCallObserverInner$26;
import com.kwai.video.krtc.observers.AryaCallObserverInner$40;
import com.kwai.video.krtc.observers.AryaCallObserverInner$44;
import com.kwai.video.krtc.observers.AryaCallObserverInner$7;
import com.kwai.video.krtc.observers.AryaCallObserverInner$5;
import com.kwai.video.krtc.observers.AryaCallObserverInner$24;
import com.kwai.video.krtc.observers.AryaCallObserverInner$17;
import com.kwai.video.krtc.observers.AryaCallObserverInner$18;
import com.kwai.video.krtc.observers.AryaCallObserverInner$32;
import com.kwai.video.krtc.observers.AryaCallObserverInner$21;
import com.kwai.video.krtc.observers.AryaCallObserverInner$23;
import com.kwai.video.krtc.observers.AryaCallObserverInner$4;

public abstract class AryaCallObserverInner	// class@0007b8
{
    public Handler handler;

    public void AryaCallObserverInner(){
       super();
       this.handler = new Handler(Looper.myLooper());
    }
    public void AryaCallObserverInner(Looper p0){
       super();
       this.handler = new Handler(p0);
    }
    public void onAudioPassThroughMsg(String p0,ByteBuffer p1){
    }
    public void onAudioPassThroughMsgOnNativeThread(String p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaCallObserverInner.class, "11")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$3(this, p0, p1));
       return;
    }
    public void onClientRoleChangeFailed(String p0,int p1,int p2){
    }
    public void onClientRoleChangeFailedOnNativeThread(String p0,int p1,int p2){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AryaCallObserverInner.class, "27")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$20(this, p0, p1, p2));
       return;
    }
    public void onClientRoleChanged(String p0,int p1,int p2){
    }
    public void onClientRoleChangedOnNativeThread(String p0,int p1,int p2){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AryaCallObserverInner.class, "26")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$19(this, p0, p1, p2));
       return;
    }
    public void onConnectionLost(String p0){
    }
    public void onConnectionLostOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "23")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$16(this, p0));
       return;
    }
    public void onConnectionStateChanged(String p0,int p1,int p2){
    }
    public void onConnectionStateChangedOnNativeThread(String p0,int p1,int p2){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AryaCallObserverInner.class, "29")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$22(this, p0, p1, p2));
       return;
    }
    public void onDebugInfo(String p0,String p1){
    }
    public void onDebugInfoOnNativeThread(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaCallObserverInner.class, "19")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$11(this, p0, p1));
       return;
    }
    public void onJoinChannelSuccess(String p0,String p1,int p2){
    }
    public void onJoinChannelSuccessOnNativeThread(String p0,String p1,int p2){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, AryaCallObserverInner.class, "35")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$29(this, p0, p1, p2));
       return;
    }
    public void onLastmileQuality(int p0){
    }
    public void onLastmileQualityOnNativeThread(int p0){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaCallObs, "34")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$28(this, p0));
       return;
    }
    public void onLeaveChannel(String p0,int p1,int p2,ChannelSummaryInfo p3){
    }
    public void onLeaveChannelOnNativeThread(String p0,int p1,int p2,Object p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, AryaCallObserverInner.class, "36")) {
          return;
       }
       AryaCallObserverInner$30 u30 = new AryaCallObserverInner$30(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onLocalAudioStats(String p0){
    }
    public void onLocalAudioStatsOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "16")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$8(this, p0));
       return;
    }
    public void onLocalMutedRemoteVideo(String p0,String p1,boolean p2){
    }
    public void onLocalMutedRemoteVideoOnNativeThread(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, AryaCallObserverInner.class, "39")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$33(this, p0, p1, p2));
       return;
    }
    public void onLocalPublishFallbackToAudioOnly(String p0,boolean p1){
    }
    public void onLocalPublishFallbackToAudioOnlyOnNativeThread(String p0,boolean p1){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uAryaCallObs, "43")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$38(this, p0, p1));
       return;
    }
    public void onLocalScreenCaptureSizeChanged(String p0,String p1,int p2,int p3){
    }
    public void onLocalScreenCaptureSizeChangedOnNativeThread(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, AryaCallObserverInner.class, "46")) {
          return;
       }
       AryaCallObserverInner$41 u41 = new AryaCallObserverInner$41(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onLocalVideoSizeChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onLocalVideoSizeChangedOnNativeThread(String p0,String p1,int p2,int p3,int p4){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaCallObs, "44")) {
             return;
          }
       }
       AryaCallObserverInner$39 u39 = new AryaCallObserverInner$39(this, p0, p1, p2, p3, p4);
       this.handler.post(v8);
       return;
    }
    public void onLocalVideoStats(String p0){
    }
    public void onLocalVideoStatsOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "14")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$6(this, p0));
       return;
    }
    public abstract void onMediaServerInfo(String p0,String p1,int p2,boolean p3);
    public final void onMediaServerInfoOnNativeThread(String p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, AryaCallObserverInner.class, "2")) {
          return;
       }
       AryaCallObserverInner$12 u12 = new AryaCallObserverInner$12(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onNetworkQuality(String p0){
    }
    public void onNetworkQualityOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "18")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$10(this, p0));
       return;
    }
    public abstract void onNotify(String p0,int p1,int p2,int p3,String p4,String p5);
    public void onNotifyInnerAddArx(String p0,int p1,int p2,int p3,String p4){
    }
    public final void onNotifyInnerAddArxOnNativeThread(String p0,int p1,int p2,int p3,String p4){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uAryaCallObs, "5")) {
             return;
          }
       }
       AryaCallObserverInner$45 u45 = new AryaCallObserverInner$45(this, p0, p1, p2, p3, p4);
       this.handler.post(v8);
       return;
    }
    public void onNotifyInnerChangeAudioScene(String p0,int p1,boolean p2,Object p3,int p4){
    }
    public final void onNotifyInnerChangeAudioSceneOnNativeThread(String p0,int p1,boolean p2,Object p3,int p4){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaCallObs, "4")) {
             return;
          }
       }
       AryaCallObserverInner$34 u34 = new AryaCallObserverInner$34(this, p0, p1, p2, p3, p4);
       this.handler.post(v8);
       return;
    }
    public void onNotifyInnerDisableAudioRecord(String p0){
    }
    public final void onNotifyInnerDisableAudioRecordOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "41")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$36(this, p0));
       return;
    }
    public void onNotifyInnerEnableAudioRecord(String p0){
    }
    public final void onNotifyInnerEnableAudioRecordOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "40")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$35(this, p0));
       return;
    }
    public void onNotifyInnerGuestAudioInfoUpdated(String p0,byte[] p1){
    }
    public final void onNotifyInnerGuestAudioInfoUpdatedOnNativeThread(String p0,byte[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaCallObserverInner.class, "10")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$2(this, p0, p1));
       return;
    }
    public void onNotifyInnerKtvBgmStart(String p0,int p1){
    }
    public final void onNotifyInnerKtvBgmStartOnNativeThread(String p0,int p1){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAryaCallObs, "7")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$47(this, p0, p1));
       return;
    }
    public void onNotifyInnerRemoteBgmProgressUpdate(String p0,int p1,int p2){
    }
    public final void onNotifyInnerRemoteBgmProgressUpdateOnNativeThread(String p0,int p1,int p2){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AryaCallObserverInner.class, "8")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$48(this, p0, p1, p2));
       return;
    }
    public void onNotifyInnerRemoveArx(String p0,int p1){
    }
    public final void onNotifyInnerRemoveArxOnNativeThread(String p0,int p1){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAryaCallObs, "6")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$46(this, p0, p1));
       return;
    }
    public void onNotifyInnerStopStannis(String p0){
    }
    public final void onNotifyInnerStopStannisOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "9")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$49(this, p0));
       return;
    }
    public final void onNotifyOnNativeThread(String p0,int p1,int p2,int p3,String p4,String p5){
       AryaCallObserverInner uAryaCallObs = this;
       AryaCallObserverInner uAryaCallObs1 = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uAryaCallObs1, "1")) {
             return;
          }
       }
       AryaCallObserverInner$1 u1 = new AryaCallObserverInner$1(this, p0, p1, p2, p3, p4, p5);
       uAryaCallObs.handler.post(v10);
       return;
    }
    public void onPassThroughDataReceived(String p0,String p1,int p2,byte[] p3){
    }
    public void onPassThroughDataReceivedOnNativeThread(String p0,String p1,int p2,byte[] p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, AryaCallObserverInner.class, "33")) {
          return;
       }
       AryaCallObserverInner$27 u27 = new AryaCallObserverInner$27(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onRejoinChannelSuccess(String p0,int p1){
    }
    public void onRejoinChannelSuccessOnNativeThread(String p0,int p1){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAryaCallObs, "37")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$31(this, p0, p1));
       return;
    }
    public void onRemoteAudioMute(String p0,String p1,boolean p2,int p3,int p4){
    }
    public void onRemoteAudioMuteOnNativeThread(String p0,String p1,boolean p2,int p3,int p4){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaCallObs, "31")) {
             return;
          }
       }
       AryaCallObserverInner$25 u25 = new AryaCallObserverInner$25(this, p0, p1, p2, p3, p4);
       this.handler.post(v8);
       return;
    }
    public void onRemoteAudioStateChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onRemoteAudioStateChangedOnNativeThread(String p0,String p1,int p2,int p3,int p4){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaCallObs, "48")) {
             return;
          }
       }
       AryaCallObserverInner$43 u43 = new AryaCallObserverInner$43(this, p0, p1, p2, p3, p4);
       this.handler.post(v8);
       return;
    }
    public void onRemoteAudioStats(String p0){
    }
    public void onRemoteAudioStatsOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "17")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$9(this, p0));
       return;
    }
    public void onRemoteScreenCaptureSizeChanged(String p0,String p1,int p2,int p3){
    }
    public void onRemoteScreenCaptureSizeChangedOnNativeThread(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, AryaCallObserverInner.class, "47")) {
          return;
       }
       AryaCallObserverInner$42 u42 = new AryaCallObserverInner$42(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onRemoteSubscribeFallbackToAudioOnly(String p0,String p1,boolean p2){
    }
    public void onRemoteSubscribeFallbackToAudioOnlyOnNativeThread(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, AryaCallObserverInner.class, "42")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$37(this, p0, p1, p2));
       return;
    }
    public void onRemoteUserEnter(String p0,String p1,int p2,int p3){
    }
    public void onRemoteUserEnterOnNatvieThread(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, AryaCallObserverInner.class, "20")) {
          return;
       }
       AryaCallObserverInner$13 u13 = new AryaCallObserverInner$13(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onRemoteUserLeave(String p0,String p1,int p2,int p3){
    }
    public void onRemoteUserLeaveOnNatvieThread(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, AryaCallObserverInner.class, "21")) {
          return;
       }
       AryaCallObserverInner$14 u14 = new AryaCallObserverInner$14(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onRemoteVideoFrozen(String p0,String p1,boolean p2,int p3){
    }
    public void onRemoteVideoFrozenOnNativeThread(String p0,String p1,boolean p2,int p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, AryaCallObserverInner.class, "22")) {
          return;
       }
       AryaCallObserverInner$15 u15 = new AryaCallObserverInner$15(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onRemoteVideoMute(String p0,String p1,boolean p2,int p3,int p4){
    }
    public void onRemoteVideoMuteOnNativeThread(String p0,String p1,boolean p2,int p3,int p4){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaCallObs, "32")) {
             return;
          }
       }
       AryaCallObserverInner$26 u26 = new AryaCallObserverInner$26(this, p0, p1, p2, p3, p4);
       this.handler.post(v8);
       return;
    }
    public void onRemoteVideoSizeChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onRemoteVideoSizeChangedOnNativeThread(String p0,String p1,int p2,int p3,int p4){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaCallObs, "45")) {
             return;
          }
       }
       AryaCallObserverInner$40 u40 = new AryaCallObserverInner$40(this, p0, p1, p2, p3, p4);
       this.handler.post(v8);
       return;
    }
    public void onRemoteVideoStateChanged(String p0,String p1,int p2,int p3,int p4){
    }
    public void onRemoteVideoStateChangedOnNativeThread(String p0,String p1,int p2,int p3,int p4){
       AryaCallObserverInner uAryaCallObs = AryaCallObserverInner.class;
       if (PatchProxy.isSupport(uAryaCallObs)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaCallObs, "49")) {
             return;
          }
       }
       AryaCallObserverInner$44 u44 = new AryaCallObserverInner$44(this, p0, p1, p2, p3, p4);
       this.handler.post(v8);
       return;
    }
    public void onRemoteVideoStats(String p0){
    }
    public void onRemoteVideoStatsOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "15")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$7(this, p0));
       return;
    }
    public void onRtcStats(String p0){
    }
    public void onRtcStatsOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaCallObserverInner.class, "13")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$5(this, p0));
       return;
    }
    public void onRtmpStreamingStateChanged(String p0,String p1,int p2,int p3){
    }
    public void onRtmpStreamingStateChangedOnNativeThread(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, AryaCallObserverInner.class, "30")) {
          return;
       }
       AryaCallObserverInner$24 u24 = new AryaCallObserverInner$24(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onScreenCaptureRemoteStart(String p0,String p1){
    }
    public void onScreenCaptureRemoteStartOnNativeThread(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaCallObserverInner.class, "24")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$17(this, p0, p1));
       return;
    }
    public void onScreenCaptureRemoteStop(String p0,String p1){
    }
    public void onScreenCaptureRemoteStopOnNativeThread(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaCallObserverInner.class, "25")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$18(this, p0, p1));
       return;
    }
    public void onStreamMessageError(String p0,String p1,int p2,int p3){
    }
    public void onStreamMessageErrorOnNativeThread(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, AryaCallObserverInner.class, "38")) {
          return;
       }
       AryaCallObserverInner$32 u32 = new AryaCallObserverInner$32(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onVideoMixTypeChanged(String p0,int p1,int p2){
    }
    public void onVideoMixTypeChangedOnNativeThread(String p0,int p1,int p2){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AryaCallObserverInner.class, "28")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$21(this, p0, p1, p2));
       return;
    }
    public abstract void onVideoSendParamChanged(int p0,int p1,int p2,int p3);
    public final void onVideoSendParamChangedOnNativeThread(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaCallObserverInner.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AryaCallObserverInner.class, "3")) {
          return;
       }
       AryaCallObserverInner$23 u23 = new AryaCallObserverInner$23(this, p0, p1, p2, p3);
       this.handler.post(v7);
       return;
    }
    public void onVoiceComment(String p0,ByteBuffer p1){
    }
    public void onVoiceCommentOnNativeThread(String p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaCallObserverInner.class, "12")) {
          return;
       }
       this.handler.post(new AryaCallObserverInner$4(this, p0, p1));
       return;
    }
}
