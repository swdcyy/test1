package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$i;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.System;
import java.lang.reflect.Type;

public final class KSDataManager$i implements g	// class@001a21
{
    public final KSDataManager b;
    public final boolean c;
    public final String d;

    public void KSDataManager$i(KSDataManager p0,boolean p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$i.class, "1")) {
       }else {
          KSDataManager$i tb = this.b;
          KSDataManager$i tc = this.c;
          KSDataManager$i td = this.d;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(KSDataManager.class) || (PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(tc), td, tb, KSDataManager.class, "25") || (p0 != null && tc != null))) {
             Object[] objArray = new Object[0];
             e.D().w("KSDataManager", "saveFeedResponseToDiskCache: "+p0, objArray);
             KSTemplateFeedListResponse kSTemplateFe = new KSTemplateFeedListResponse();
             kSTemplateFe.mTemplateList = Lists.c(p0.mTemplateList);
             kSTemplateFe.mCursor = p0.mCursor;
             b.a(0x5f2ddeb4).c("KSDataManager_feed_cache_"+td, kSTemplateFe, KSTemplateFeedListResponse.class, (System.currentTimeMillis() + 0x240c8400));
          }
       }
       return;
    }
}
