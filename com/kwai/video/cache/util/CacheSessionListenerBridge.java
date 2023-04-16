package com.kwai.video.cache.util.CacheSessionListenerBridge;
import java.lang.Object;
import com.kwai.video.cache.CacheSessionListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class CacheSessionListenerBridge	// class@0019f9
{

    public void CacheSessionListenerBridge(){
       super();
    }
    public static CacheSessionListener getListener(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CacheSessionListenerBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get();
    }
    public static void onDownloadPaused(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, CacheSessionListenerBridge.class, "5")) {
          return;
       }
       p0 = CacheSessionListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.onDownloadPaused();
       return;
    }
    public static void onDownloadProgress(Object p0,long p1,long p2){
       if (PatchProxy.isSupport(CacheSessionListenerBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), null, CacheSessionListenerBridge.class, "4")) {
          return;
       }
       p0 = CacheSessionListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.onDownloadProgress(p1, p2);
       return;
    }
    public static void onDownloadResumed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, CacheSessionListenerBridge.class, "6")) {
          return;
       }
       p0 = CacheSessionListenerBridge.getListener(p0);
       if (p0 == null) {
          return;
       }
       p0.onDownloadResumed();
       return;
    }
    public static void onDownloadStarted(Object p0,long p1,String p2,String p3,String p4,int p5,long p6){
       CacheSessionListenerBridge uCacheSessio = CacheSessionListenerBridge.class;
       if (PatchProxy.isSupport(uCacheSessio)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,p3,p4,Integer.valueOf(p5),Long.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uCacheSessio, "3")) {
             return;
          }
       }
       CacheSessionListener listener = CacheSessionListenerBridge.getListener(p0);
       if (listener == null) {
          return;
       }else {
          listener.onDownloadStarted(p1, p2, p3, p4, p5, p6);
          return;
       }
    }
    public static void onDownloadStopped(Object p0,int p1,long p2,long p3,String p4,int p5,String p6,String p7,String p8,String p9){
       CacheSessionListenerBridge uCacheSessio = CacheSessionListenerBridge.class;
       if (PatchProxy.isSupport(uCacheSessio)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Long.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, null, uCacheSessio, "7")) {
             return;
          }
       }
       CacheSessionListener listener = CacheSessionListenerBridge.getListener(p0);
       if (listener == null) {
          return;
       }else {
          listener.onDownloadStopped(p1, p2, p3, p4, p5, p6, p7, p8, p9);
          return;
       }
    }
    public static void onSessionClosed(Object p0,int p1,long p2,long p3,long p4,String p5,boolean p6){
       CacheSessionListenerBridge uCacheSessio = CacheSessionListenerBridge.class;
       if (PatchProxy.isSupport(uCacheSessio)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4),p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uCacheSessio, "8")) {
             return;
          }
       }
       CacheSessionListener listener = CacheSessionListenerBridge.getListener(p0);
       if (listener == null) {
          return;
       }else {
          listener.onSessionClosed(p1, p2, p3, p4, p5, p6);
          return;
       }
    }
    public static void onSessionStart(Object p0,String p1,long p2,long p3,long p4){
       CacheSessionListenerBridge uCacheSessio = CacheSessionListenerBridge.class;
       if (PatchProxy.isSupport(uCacheSessio)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uCacheSessio, "2")) {
             return;
          }
       }
       CacheSessionListener listener = CacheSessionListenerBridge.getListener(p0);
       if (listener == null) {
          return;
       }else {
          listener.onSessionStart(p1, p2, p3, p4);
          return;
       }
    }
}
