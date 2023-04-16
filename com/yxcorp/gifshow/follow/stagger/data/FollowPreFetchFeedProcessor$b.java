package com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor$b;
import sc5.f;
import com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.Collection;
import ekd.q;
import crd.b;
import lnc.b9;
import java.util.Set;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor$b$a;
import erd.g;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import java.lang.StringBuilder;
import yga.c;

public final class FollowPreFetchFeedProcessor$b implements f	// class@00116c
{
    public final FollowPreFetchFeedProcessor a;

    public void FollowPreFetchFeedProcessor$b(FollowPreFetchFeedProcessor p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       FollowPreFetchFeedProcessor a;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPreFetchFeedProcessor$b.class, "1")) {
          return;
       }
       a.p(p0, "userIdsStatus");
       a = this.a.a;
       List items = (a != null)? a.getItems(): null;
       if (q.f(items)) {
          return;
       }else {
          b9.a(this.a.f);
          this.a.f = t.just(p0.entrySet()).observeOn(d.a).subscribe(new FollowPreFetchFeedProcessor$b$a(this));
          FollowPreFetchFeedProcessor a1 = this.a.a;
          if (a1 != null) {
             List items1 = a1.getItems();
             if (items1 != null) {
                i = items1.size();
             label_0057 :
                c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("FollowPreFetchFeedProcessor"), "onLiveStatusResponse - curSize "+i);
                this.a.c();
                return;
             }
          }
          i = 0;
          goto label_0057 ;
       }
    }
}
