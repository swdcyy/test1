package com.kwai.video.player.KsMediaPlayerImpl$1;
import com.kwai.video.cache.CacheSessionListener;
import com.kwai.video.player.KsMediaPlayerImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class KsMediaPlayerImpl$1 implements CacheSessionListener	// class@000aec
{
    public final KsMediaPlayerImpl this$0;

    public void KsMediaPlayerImpl$1(KsMediaPlayerImpl p0){
       this.this$0 = p0;
       super();
    }
    public void onDownloadPaused(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl$1.class, "4")) {
          return;
       }
       KsMediaPlayerImpl mCacheSessio = this.this$0.mCacheSessionListener;
       if (mCacheSessio != null) {
          mCacheSessio.onDownloadPaused();
       }
       return;
    }
    public void onDownloadProgress(long p0,long p1){
       KsMediaPlayerImpl$1 u1 = KsMediaPlayerImpl$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, u1, "3")) {
          return;
       }
       KsMediaPlayerImpl mCacheSessio = this.this$0.mCacheSessionListener;
       if (mCacheSessio != null) {
          mCacheSessio.onDownloadProgress(p0, p1);
       }
       return;
    }
    public void onDownloadResumed(){
       if (PatchProxy.applyVoid(null, this, KsMediaPlayerImpl$1.class, "5")) {
          return;
       }
       KsMediaPlayerImpl mCacheSessio = this.this$0.mCacheSessionListener;
       if (mCacheSessio != null) {
          mCacheSessio.onDownloadResumed();
       }
       return;
    }
    public void onDownloadStarted(long p0,String p1,String p2,String p3,int p4,long p5){
       KsMediaPlayerImpl$1 u1 = this;
       KsMediaPlayerImpl$1 u11 = KsMediaPlayerImpl$1.class;
       if (PatchProxy.isSupport(u11)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,p3,Integer.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, u11, "2")) {
             return;
          }
       }
       KsMediaPlayerImpl mCacheSessio = u1.this$0.mCacheSessionListener;
       if (mCacheSessio != null) {
          mCacheSessio.onDownloadStarted(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void onDownloadStopped(int p0,long p1,long p2,String p3,int p4,String p5,String p6,String p7,String p8){
       Object obj = this;
       KsMediaPlayerImpl$1 u1 = KsMediaPlayerImpl$1.class;
       if (PatchProxy.isSupport(u1)) {
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
          if (PatchProxy.applyVoid(objArray, obj, u1, "6")) {
             return;
          }
       }
       KsMediaPlayerImpl mCacheSessio = obj.this$0.mCacheSessionListener;
       if (mCacheSessio != null) {
          mCacheSessio.onDownloadStopped(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       }
       return;
    }
    public void onSessionClosed(int p0,long p1,long p2,long p3,String p4,boolean p5){
       KsMediaPlayerImpl$1 u1 = this;
       KsMediaPlayerImpl$1 u11 = KsMediaPlayerImpl$1.class;
       if (PatchProxy.isSupport(u11)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, u11, "7")) {
             return;
          }
       }
       KsMediaPlayerImpl mCacheSessio = u1.this$0.mCacheSessionListener;
       if (mCacheSessio != null) {
          mCacheSessio.onSessionClosed(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void onSessionStart(String p0,long p1,long p2,long p3){
       if (PatchProxy.isSupport(KsMediaPlayerImpl$1.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, KsMediaPlayerImpl$1.class, "1")) {
          return;
       }
       KsMediaPlayerImpl mCacheSessio = this.this$0.mCacheSessionListener;
       if (mCacheSessio != null) {
          mCacheSessio.onSessionStart(p0, p1, p2, p3);
       }
       return;
    }
}
