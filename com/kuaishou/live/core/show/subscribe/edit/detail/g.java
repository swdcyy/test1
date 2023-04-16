package com.kuaishou.live.core.show.subscribe.edit.detail.g;
import erd.g;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import java.lang.Object;
import qk2.o;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import java.util.Collection;
import ekd.q;
import tk2.n;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.util.List;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribePhoto;
import com.kuaishou.live.core.show.subscribe.edit.detail.i;
import d61.k0$a;
import d61.k0;

public final class g implements g	// class@00110c
{
    public final LiveSubscribeDetailFragment b;

    public void g(LiveSubscribeDetailFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveSubscribeDetailFragment.class, "26")) {
       }else {
          LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail mSubscribeIn = tb.k.mSubscribeInfoList;
          if (!q.f(mSubscribeIn)) {
             LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo liveSubscrib = y.y(mSubscribeIn, new n(p0)).orNull();
             if (liveSubscrib != null) {
                p0 = p0.a;
                liveSubscrib.mIsPhotoRelated = q.f(p0) ^ 1;
                if (p0.size() == 1) {
                   liveSubscrib.mPhotoDesc = k0.a(p0.get(0), i.a).orNull();
                }
                tb.kh(tb.k);
             }
          }
       }
       return;
    }
}
