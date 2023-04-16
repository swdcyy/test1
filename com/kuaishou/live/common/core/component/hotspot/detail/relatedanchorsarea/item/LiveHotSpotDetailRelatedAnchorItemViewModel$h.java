package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$h;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel;
import java.lang.Object;
import jga.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class LiveHotSpotDetailRelatedAnchorItemViewModel$h implements FollowHelper$a	// class@001408
{
    public final LiveHotSpotDetailRelatedAnchorItemViewModel a;

    public void LiveHotSpotDetailRelatedAnchorItemViewModel$h(LiveHotSpotDetailRelatedAnchorItemViewModel p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0,g p1){
       if (PatchProxy.isSupport(LiveHotSpotDetailRelatedAnchorItemViewModel$h.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveHotSpotDetailRelatedAnchorItemViewModel$h.class, "1")) {
          return;
       }
       if (p0) {
          LiveHotSpotDetailRelatedAnchorItemViewModel$h ta = this.a;
          ta.r0(ta.w0()).setValue(Boolean.TRUE);
       }
       return;
    }
}
