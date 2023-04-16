package com.kwai.player.live.KwaiPlayerLiveListenerBridge;
import java.lang.Object;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveExtraInfoListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveInterActiveListener;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSrvTsptInfoListener;

public class KwaiPlayerLiveListenerBridge	// class@0012e8
{

    public void KwaiPlayerLiveListenerBridge(){
       super();
    }
    public static IKwaiMediaPlayer$OnLiveExtraInfoListener getExtraListener(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiPlayerLiveListenerBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get();
    }
    public static IKwaiMediaPlayer$OnLiveInterActiveListener getListener(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiPlayerLiveListenerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get();
    }
    public static void onLiveTypeChangeExtra(Object p0,int p1){
       KwaiPlayerLiveListenerBridge kwaiPlayerLi = KwaiPlayerLiveListenerBridge.class;
       if (PatchProxy.isSupport(kwaiPlayerLi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, kwaiPlayerLi, "9")) {
          return;
       }
       p0 = KwaiPlayerLiveListenerBridge.getExtraListener(p0);
       if (p0 != null) {
          p0.onLiveTypeChangeExtra(p1);
       }
       return;
    }
    public static void onParseAdSei(Object p0,long p1,int p2,String p3){
       if (PatchProxy.isSupport(KwaiPlayerLiveListenerBridge.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), p3, null, KwaiPlayerLiveListenerBridge.class, "4")) {
          return;
       }
       p0 = KwaiPlayerLiveListenerBridge.getListener(p0);
       if (p0 != null) {
          p0.onParseAdSei(p1, p2, p3);
       }
       return;
    }
    public static void onSeiInfo(Object p0,byte[] p1,int p2,int p3){
       if (PatchProxy.isSupport(KwaiPlayerLiveListenerBridge.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, KwaiPlayerLiveListenerBridge.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0 = p0.get();
       if (p0 != null) {
          p0.onSeiInfo(p1, p2, p3);
       }
       return;
    }
    public static void onSrvTsptInfo(Object p0,byte[] p1,int p2){
       if (PatchProxy.isSupport(KwaiPlayerLiveListenerBridge.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, KwaiPlayerLiveListenerBridge.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0 = p0.get();
       if (p0 != null) {
          p0.onSrvTsptInfo(p1, p2);
       }
       return;
    }
    public static void onTsptInfo(Object p0,byte[] p1,int p2){
       if (PatchProxy.isSupport(KwaiPlayerLiveListenerBridge.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, KwaiPlayerLiveListenerBridge.class, "5")) {
          return;
       }
       p0 = KwaiPlayerLiveListenerBridge.getListener(p0);
       if (p0 != null) {
          p0.onTsptInfo(p1, p2);
       }
       return;
    }
    public static void onVideoFrameRender(Object p0,long p1){
       KwaiPlayerLiveListenerBridge kwaiPlayerLi = KwaiPlayerLiveListenerBridge.class;
       if (PatchProxy.isSupport(kwaiPlayerLi) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, kwaiPlayerLi, "3")) {
          return;
       }
       p0 = KwaiPlayerLiveListenerBridge.getListener(p0);
       if (p0 != null) {
          p0.onVideoFrameRender(p1);
       }
       return;
    }
    public static void onVideoSizeChangeExtra(Object p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiPlayerLiveListenerBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, KwaiPlayerLiveListenerBridge.class, "8")) {
          return;
       }
       p0 = KwaiPlayerLiveListenerBridge.getExtraListener(p0);
       if (p0 != null) {
          p0.onVideoSizeChangeExtra(p1, p2);
       }
       return;
    }
}
