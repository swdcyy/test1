package com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1$a;
import erd.g;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$delayInfoFetchedListener$2;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$LiteEnterRoomGuideConfig;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController;

public final class LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1$a implements g	// class@0008e7
{
    public final LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1 b;
    public final LiveLiteDelayInfoResponse c;

    public void LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1$a(LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1 p0,LiveLiteDelayInfoResponse p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1$a.class, "1")) {
       }else {
          p0 = this.c.mLiteEnterRoomGuideConfig;
          LiveLiteDelayInfoResponse$LiteEnterRoomGuideConfig mSubBizType = p0.mSubBizType;
          a.o(mSubBizType, "it.mSubBizType");
          LiveLiteDelayInfoResponse$LiteEnterRoomGuideConfig mSubBizId = p0.mSubBizId;
          a.o(mSubBizId, "it.mSubBizId");
          this.b.a.this$0.V2(mSubBizType, mSubBizId, p0.mShowDurationMs);
       }
       return;
    }
}
