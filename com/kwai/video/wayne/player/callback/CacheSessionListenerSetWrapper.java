package com.kwai.video.wayne.player.callback.CacheSessionListenerSetWrapper;
import com.kwai.video.cache.CacheSessionListener;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kwai.video.wayne.player.callback.CacheSessionListenerSetWrapper$SessionStartInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class CacheSessionListenerSetWrapper implements CacheSessionListener	// class@000cc9
{
    public Set mCacheSessionListeners;
    public CacheSessionListenerSetWrapper$SessionStartInfo mSessionStartInfo;

    public void CacheSessionListenerSetWrapper(){
       super();
       this.mCacheSessionListeners = new LinkedHashSet();
    }
    public void addCacheSessionListener(CacheSessionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CacheSessionListenerSetWrapper.class, "2")) {
          return;
       }
       this.mCacheSessionListeners.add(p0);
       CacheSessionListenerSetWrapper tmSessionSta = this.mSessionStartInfo;
       if (tmSessionSta != null) {
          p0.onSessionStart(tmSessionSta.mKey, tmSessionSta.mStartPos, tmSessionSta.mCachedBytes, tmSessionSta.mTotalBytes);
       }
       return;
    }
    public void clearListeners(){
       if (PatchProxy.applyVoid(null, this, CacheSessionListenerSetWrapper.class, "4")) {
          return;
       }
       this.mCacheSessionListeners.clear();
       return;
    }
    public int getListenersCount(){
       Object obj = PatchProxy.apply(null, this, CacheSessionListenerSetWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mCacheSessionListeners.size();
    }
    public void onDownloadPaused(){
       if (PatchProxy.applyVoid(null, this, CacheSessionListenerSetWrapper.class, "8")) {
          return;
       }
       Iterator iterator = this.mCacheSessionListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDownloadPaused();
       }
       return;
    }
    public void onDownloadProgress(long p0,long p1){
       CacheSessionListenerSetWrapper uCacheSessio = CacheSessionListenerSetWrapper.class;
       if (PatchProxy.isSupport(uCacheSessio) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uCacheSessio, "7")) {
          return;
       }
       Iterator iterator = this.mCacheSessionListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDownloadProgress(p0, p1);
       }
       return;
    }
    public void onDownloadResumed(){
       if (PatchProxy.applyVoid(null, this, CacheSessionListenerSetWrapper.class, "9")) {
          return;
       }
       Iterator iterator = this.mCacheSessionListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDownloadResumed();
       }
       return;
    }
    public void onDownloadStarted(long p0,String p1,String p2,String p3,int p4,long p5){
       CacheSessionListenerSetWrapper uCacheSessio = this;
       CacheSessionListenerSetWrapper uCacheSessio1 = CacheSessionListenerSetWrapper.class;
       if (PatchProxy.isSupport(uCacheSessio1)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,p3,Integer.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uCacheSessio1, "6")) {
             return;
          }
       }
       Iterator iterator = uCacheSessio.mCacheSessionListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDownloadStarted(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void onDownloadStopped(int p0,long p1,long p2,String p3,int p4,String p5,String p6,String p7,String p8){
       Object obj = this;
       CacheSessionListenerSetWrapper uCacheSessio = CacheSessionListenerSetWrapper.class;
       if (PatchProxy.isSupport(uCacheSessio)) {
          Object[] objArray = new Object[9];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = Long.valueOf(p1);
          objArray[2] = Long.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, obj, uCacheSessio, "10")) {
             return;
          }
       }
       Iterator iterator = obj.mCacheSessionListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onDownloadStopped(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       }
       return;
    }
    public void onSessionClosed(int p0,long p1,long p2,long p3,String p4,boolean p5){
       CacheSessionListenerSetWrapper uCacheSessio = this;
       CacheSessionListenerSetWrapper uCacheSessio1 = CacheSessionListenerSetWrapper.class;
       if (PatchProxy.isSupport(uCacheSessio1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uCacheSessio1, "11")) {
             return;
          }
       }
       Iterator iterator = uCacheSessio.mCacheSessionListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSessionClosed(p0, p1, p2, p3, p4, p5);
       }
       uCacheSessio.mSessionStartInfo = null;
       return;
    }
    public void onSessionStart(String p0,long p1,long p2,long p3){
       CacheSessionListenerSetWrapper uCacheSessio = this;
       if (PatchProxy.isSupport(CacheSessionListenerSetWrapper.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, CacheSessionListenerSetWrapper.class, "5")) {
          return;
       }
       CacheSessionListenerSetWrapper$SessionStartInfo sessionStart = new CacheSessionListenerSetWrapper$SessionStartInfo(p0, p1, p2, p3);
       uCacheSessio.mSessionStartInfo = v0;
       Iterator iterator = uCacheSessio.mCacheSessionListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSessionStart(p0, p1, p2, p3);
       }
       return;
    }
    public void removeCacheSessionListener(CacheSessionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CacheSessionListenerSetWrapper.class, "3")) {
          return;
       }
       this.mCacheSessionListeners.remove(p0);
       return;
    }
}
