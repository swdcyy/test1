package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$logClickEvent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel;
import java.lang.Object;
import lnc.i3;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msd.a;
import java.lang.Number;
import java.lang.Integer;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;

public final class LiveHotSpotDetailRelatedAnchorItemViewModel$logClickEvent$1 extends Lambda implements l	// class@00140a
{
    public final LiveHotSpotDetailRelatedAnchorItemViewModel this$0;

    public void LiveHotSpotDetailRelatedAnchorItemViewModel$logClickEvent$1(LiveHotSpotDetailRelatedAnchorItemViewModel p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailRelatedAnchorItemViewModel$logClickEvent$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.c("index", Integer.valueOf((this.this$0.m.invoke().intValue() + 1)));
       p0.a("is_living", this.this$0.x0().getValue());
       p0.d("related_author_id", this.this$0.getUserId());
       return;
    }
}