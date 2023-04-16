package com.kwai.video.wayne.player.main.KSVodPlayHistoryManager;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.LinkedHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.Map;
import com.kwai.video.wayne.player.util.DebugLog;
import java.util.Set;
import java.util.Iterator;
import com.kwai.video.wayne.player.main.KSVodPlayHistoryManager$PlayStat;
import com.kwai.video.wayne.player.main.KSVodPlayHistoryManager$1;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import com.kwai.video.cache.AwesomeCache;
import java.util.Collection;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Long;

public class KSVodPlayHistoryManager	// class@000d69
{
    public AtomicInteger mLaunchPlayCount;
    public final Object mLock;
    public Map mPlayStatMap;
    public static KSVodPlayHistoryManager mVodPlayStatManager;

    public void KSVodPlayHistoryManager(){
       super();
       this.mLock = new Object();
       this.mLaunchPlayCount = new AtomicInteger(0);
       this.mPlayStatMap = new LinkedHashMap(100);
       this.mLaunchPlayCount.set(0);
    }
    public static synchronized KSVodPlayHistoryManager getInstance(){
       _monitor_enter(KSVodPlayHistoryManager.class);
       Object obj = PatchProxy.apply(null, null, KSVodPlayHistoryManager.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KSVodPlayHistoryManager.class);
          return obj;
       }else if(KSVodPlayHistoryManager.mVodPlayStatManager == null){
          KSVodPlayHistoryManager.mVodPlayStatManager = new KSVodPlayHistoryManager();
       }
       _monitor_exit(KSVodPlayHistoryManager.class);
       return KSVodPlayHistoryManager.mVodPlayStatManager;
    }
    public String addWithKey(String p0){
       KSVodPlayHistoryManager obj = PatchProxy.applyOneRefs(p0, this, KSVodPlayHistoryManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = null;
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       DebugLog.v("KSVodPlayStatManager", "size:"+this.mPlayStatMap.size()+", add key:"+p0);
       obj = this.mLock;
       _monitor_enter(obj);
       if (this.mPlayStatMap.size() >= 100) {
          int i = 0;
          Iterator iterator = this.mPlayStatMap.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next();
             iterator.remove();
             i = i + 1;
             if (i < 20) {
             }
          }
       }
       if (this.mPlayStatMap.containsKey(p0)) {
          _monitor_exit(obj);
          return p0;
       }else {
          KSVodPlayHistoryManager$PlayStat playStat = new KSVodPlayHistoryManager$PlayStat(this, str);
          if (WaynePlayerInitor.isSoLoadCompleted()) {
             playStat.isFullyCached = AwesomeCache.isFullyCached(p0);
          }
          this.mPlayStatMap.put(p0, playStat);
          _monitor_exit(obj);
          return p0;
       }
    }
    public void clearCacheStatus(){
       if (PatchProxy.applyVoid(null, this, KSVodPlayHistoryManager.class, "6")) {
          return;
       }
       KSVodPlayHistoryManager tmLock = this.mLock;
       _monitor_enter(tmLock);
       Iterator iterator = this.mPlayStatMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().isFullyCached = false;
       }
       _monitor_exit(tmLock);
       return;
    }
    public boolean getCacheStatus(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSVodPlayHistoryManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isFullyCached(p0);
    }
    public AtomicInteger getLaunchPlayCount(){
       return this.mLaunchPlayCount;
    }
    public long getPlayPositionWithKey(String p0){
       KSVodPlayHistoryManager obj = PatchProxy.applyOneRefs(p0, this, KSVodPlayHistoryManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (TextUtils.isEmpty(p0)) {
          return l;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (!this.mPlayStatMap.containsKey(p0)) {
          _monitor_exit(obj);
          return l;
       }else {
          KSVodPlayHistoryManager$PlayStat playStat = this.mPlayStatMap.get(p0);
          if (playStat != null) {
             _monitor_exit(obj);
             return playStat.playPosition;
          }else {
             _monitor_exit(obj);
             return l;
          }
       }
    }
    public final boolean isFullyCached(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSVodPlayHistoryManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!WaynePlayerInitor.isSoLoadCompleted()) {
          return false;
       }
       return AwesomeCache.isFullyCached(p0);
    }
    public void updatePlayPositionWithKey(String p0,long p1){
       KSVodPlayHistoryManager kSVodPlayHis = KSVodPlayHistoryManager.class;
       if (PatchProxy.isSupport(kSVodPlayHis) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, kSVodPlayHis, "5")) {
          return;
       }
       if (TextUtils.isEmpty(p0) || p1 - null < 0) {
          return;
       }
       kSVodPlayHis = this.mLock;
       _monitor_enter(kSVodPlayHis);
       if (!this.mPlayStatMap.containsKey(p0)) {
          this.addWithKey(p0);
       }
       KSVodPlayHistoryManager$PlayStat playStat = this.mPlayStatMap.get(p0);
       if (playStat != null) {
          playStat.playPosition = p1;
       }
       _monitor_exit(kSVodPlayHis);
       return;
    }
}
