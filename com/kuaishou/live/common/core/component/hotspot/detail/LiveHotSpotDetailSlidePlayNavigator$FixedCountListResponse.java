package com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailSlidePlayNavigator$FixedCountListResponse;
import la6.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class LiveHotSpotDetailSlidePlayNavigator$FixedCountListResponse implements b	// class@001368
{
    public final List originList;

    public void LiveHotSpotDetailSlidePlayNavigator$FixedCountListResponse(List p0){
       a.p(p0, "originList");
       super();
       this.originList = p0;
    }
    public List getItems(){
       LiveHotSpotDetailSlidePlayNavigator$FixedCountListResponse obj = PatchProxy.apply(null, this, LiveHotSpotDetailSlidePlayNavigator$FixedCountListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.originList;
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(new QPhoto(iterator.next()));
       }
       return CollectionsKt___CollectionsKt.J5(uArrayList);
    }
    public boolean hasMore(){
       return false;
    }
}
