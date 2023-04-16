package com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$onCreateRequest$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import jb5.d;

public final class HotSpotFeedPageList$onCreateRequest$1 extends FunctionReferenceImpl implements l	// class@001823
{

    public void HotSpotFeedPageList$onCreateRequest$1(HotSpotFeedPageList p0){
       super(1, p0, HotSpotFeedPageList.class, "onCompletedEvent", "onCompletedEvent\(Lcom/yxcorp/gifshow/model/response/feed/HomeFeedResponse;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(HomeFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotFeedPageList$onCreateRequest$1.class, "1")) {
          return;
       }
       this.receiver.onCompletedEvent(p0);
       return;
    }
}
