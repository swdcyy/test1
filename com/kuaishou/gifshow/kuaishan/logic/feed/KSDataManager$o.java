package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$o;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.a;
import u80.e;
import q87.c;
import java.util.Objects;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupListResponse;
import java.lang.reflect.Type;
import java.util.Collection;

public final class KSDataManager$o implements o	// class@001a2d
{
    public final KSDataManager b;

    public void KSDataManager$o(KSDataManager p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSDataManager$o obj = PatchProxy.applyOneRefs(p0, this, KSDataManager$o.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "throwable");
          int i = 0;
          Object[] objArray = new Object[i];
          e.D().s("KSDataManager", "fetchGroups: onErrorReturn\(\) called", objArray);
          obj = this.b;
          Objects.requireNonNull(obj);
          Object[] objArray1 = null;
          obj = PatchProxy.apply(objArray1, obj, KSDataManager.class, "28");
          if (obj != patchProxyRe) {
          }else {
             Object[] objArray2 = new Object[i];
             e.D().w("KSDataManager", "loadGroupResponseCache:", objArray2);
             KSFeedGroupListResponse kSFeedGroupL = b.a(0x5f2ddeb4).g("KSDataManager_group_cache", KSFeedGroupListResponse.class);
             if (kSFeedGroupL != null) {
                objArray1 = kSFeedGroupL.mGroupList;
             }
             objArray2 = objArray1;
          }
          if (obj == null || obj.isEmpty()) {
             i = 1;
          }
          if (i) {
             throw p0;
          }
       }
       return obj;
    }
}
