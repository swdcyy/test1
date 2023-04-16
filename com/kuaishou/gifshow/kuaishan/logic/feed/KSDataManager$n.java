package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$n;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupListResponse;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.System;
import java.lang.reflect.Type;

public final class KSDataManager$n implements g	// class@001a2b
{
    public final KSDataManager b;

    public void KSDataManager$n(KSDataManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$n.class, "1")) {
       }else {
          KSDataManager$n tb = this.b;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, KSDataManager.class, "26") || (p0 != null && !p0.isEmpty())) {
             tb.x0(p0);
             Object[] objArray = new Object[0];
             e.D().w("KSDataManager", "saveGroupResponseToDiskCache: "+p0, objArray);
             KSFeedGroupListResponse kSFeedGroupL = new KSFeedGroupListResponse();
             kSFeedGroupL.mGroupList = Lists.c(p0);
             b.a(0x5f2ddeb4).c("KSDataManager_group_cache", kSFeedGroupL, KSFeedGroupListResponse.class, (System.currentTimeMillis() + 0x240c8400));
          }
       }
       return;
    }
}
