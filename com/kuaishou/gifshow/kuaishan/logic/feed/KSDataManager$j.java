package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$j;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import kotlin.jvm.internal.a;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import java.lang.Boolean;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;

public final class KSDataManager$j implements o	// class@001a23
{
    public final KSDataManager b;
    public final boolean c;
    public final String d;

    public void KSDataManager$j(KSDataManager p0,boolean p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSDataManager$j obj = PatchProxy.applyOneRefs(p0, this, KSDataManager$j.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "throwable");
          Object[] objArray = new Object[0];
          e.D().s("KSDataManager", "createGroupTemplateFetchingRequest: onErrorReturn\(\) called with: "+p0, objArray);
          obj = this.b;
          KSDataManager$j tc = this.c;
          KSDataManager$j td = this.d;
          Objects.requireNonNull(obj);
          if (PatchProxy.isSupport(KSDataManager.class)) {
             obj = PatchProxy.applyTwoRefs(Boolean.valueOf(tc), td, obj, KSDataManager.class, "29");
             if (obj != patchProxyRe) {
             label_0086 :
                if (obj == null) {
                   throw p0;
                }
             }
          }
          if (tc == null) {
             patchProxyRe = 0;
          }else {
             Object[] objArray1 = new Object[0];
             e.D().w("KSDataManager", "loadFeedResponseCache:", objArray1);
             KSTemplateFeedListResponse kSTemplateFe = b.a(0x5f2ddeb4).g("KSDataManager_feed_cache_"+td, KSTemplateFeedListResponse.class);
          }
          obj = patchProxyRe;
          goto label_0086 ;
       }
       return obj;
    }
}
