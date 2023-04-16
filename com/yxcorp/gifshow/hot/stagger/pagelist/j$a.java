package com.yxcorp.gifshow.hot.stagger.pagelist.j$a;
import hkd.d;
import com.yxcorp.gifshow.hot.stagger.pagelist.j;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Objects;
import java.lang.Integer;
import wkd.b;
import com.kwai.framework.network.degrade.e;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import vjc.a;
import com.kwai.feature.api.feed.home.model.DiscoveryPageFeed;
import mva.b;
import mva.a;
import com.google.gson.Gson;
import brd.t;

public class j$a extends d	// class@0018b3
{
    public final HomeFeedResponse b;
    public final j c;

    public void j$a(j p0,HomeFeedResponse p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "1")) {
          return;
       }
       j$a tc = this.c;
       List items = this.b.getItems();
       HomeFeedResponse mLlsid = this.b.mLlsid;
       Objects.requireNonNull(tc);
       if (!PatchProxy.isSupport(j.class) || (!PatchProxy.applyVoidThreeRefs(items, Integer.valueOf(7), mLlsid, tc, j.class, "24") && b.a(-1538291188).e().mDisableFeedStat == null)) {
          ArrayList uArrayList = new ArrayList(items.size());
          Iterator iterator = items.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (a.a(qPhoto.mEntity)) {
                continue ;
             }
             DiscoveryPageFeed uDiscoveryPa = new DiscoveryPageFeed();
             uDiscoveryPa.mPhotoId = qPhoto.getPhotoId();
             uDiscoveryPa.mUserId = qPhoto.getUserId();
             uDiscoveryPa.mRecoReason = qPhoto.getRecoReason();
             uArrayList.add(uDiscoveryPa);
          }
          a.a().postFeedStat(7, mLlsid, new Gson().q(uArrayList)).blockingFirst();
       }
       return;
    }
}
