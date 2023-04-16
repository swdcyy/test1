package com.yxcorp.gifshow.ad.reserve.model.LocalReserveAppData;
import java.io.Serializable;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yx.j0;
import o56.a;
import java.lang.IllegalArgumentException;
import java.util.concurrent.ConcurrentMap;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;

public class LocalReserveAppData implements Serializable	// class@0017c9
{
    public ConcurrentMap mFeedMap;
    public static final long serialVersionUID = 0x9d1af0299ed6049e;

    public void LocalReserveAppData(){
       super();
       this.mFeedMap = new ConcurrentHashMap();
    }
    public void addReserveApp(String p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalReserveAppData.class, "3")) {
          return;
       }
       if (p1 == null) {
          Object[] objArray = new Object[0];
          j0.c("LocalReserveAppDate", "feed must not null", objArray);
          if (!a.d()) {
             return;
          }
          throw new IllegalArgumentException("feed must not null");
       }else {
          this.mFeedMap.put(p0, p1);
          return;
       }
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, LocalReserveAppData.class, "5")) {
          return;
       }
       this.mFeedMap.clear();
       return;
    }
    public BaseFeed getFeed(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalReserveAppData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mFeedMap.get(p0);
    }
    public Set getOrderIds(){
       Object obj = PatchProxy.apply(null, this, LocalReserveAppData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mFeedMap.keySet();
    }
    public BaseFeed removeFeed(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalReserveAppData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mFeedMap.remove(p0);
    }
}
