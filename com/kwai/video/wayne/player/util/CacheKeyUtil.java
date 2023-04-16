package com.kwai.video.wayne.player.util.CacheKeyUtil;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.LruCache;
import android.net.Uri;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.hodor.util.HodorCacheUtil;

public class CacheKeyUtil	// class@000db8
{
    public static LruCache sCacheKeyCache;

    public void CacheKeyUtil(){
       super();
    }
    public static void ensureCacheKeyCache(){
       if (PatchProxy.applyVoid(null, null, CacheKeyUtil.class, "3")) {
          return;
       }
       if (CacheKeyUtil.sCacheKeyCache == null) {
          _monitor_enter(CacheKeyUtil.class);
          if (CacheKeyUtil.sCacheKeyCache == null) {
             CacheKeyUtil.sCacheKeyCache = new LruCache(10);
          }
          _monitor_exit(CacheKeyUtil.class);
       }
       return;
    }
    public static String getCacheKey(Uri p0,boolean p1){
       String obj;
       CacheKeyUtil uCacheKeyUti = CacheKeyUtil.class;
       if (PatchProxy.isSupport(uCacheKeyUti)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uCacheKeyUti, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = CacheKeyUtil.tryGetCacheKey(p0);
       if (!TextUtils.isEmpty(obj)) {
          return obj;
       }else {
          String cacheKey = HodorCacheUtil.getCacheKey(p0, p1);
          CacheKeyUtil.putCacheKeyToCache(p0, cacheKey);
          return cacheKey;
       }
    }
    public static String getCacheKey(String p0,boolean p1){
       String obj;
       CacheKeyUtil uCacheKeyUti = CacheKeyUtil.class;
       if (PatchProxy.isSupport(uCacheKeyUti)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uCacheKeyUti, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = CacheKeyUtil.tryGetCacheKey(p0);
       if (!TextUtils.isEmpty(obj)) {
          return obj;
       }else {
          String cacheKey = HodorCacheUtil.getCacheKey(p0, p1);
          CacheKeyUtil.putCacheKeyToCache(p0, cacheKey);
          return cacheKey;
       }
    }
    public static void putCacheKeyToCache(Object p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, CacheKeyUtil.class, "5")) {
          return;
       }
       if (p0 != null && p1 != null) {
          CacheKeyUtil.ensureCacheKeyCache();
          LruCache sCacheKeyCac = CacheKeyUtil.sCacheKeyCache;
          if (sCacheKeyCac != null) {
             sCacheKeyCac.put(p0, p1);
          }
       }
       return;
    }
    public static String tryGetCacheKey(Object p0){
       LruCache obj = PatchProxy.applyOneRefs(p0, null, CacheKeyUtil.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       CacheKeyUtil.ensureCacheKeyCache();
       obj = CacheKeyUtil.sCacheKeyCache;
       if (obj != null) {
          return obj.get(p0);
       }
       return null;
    }
}
