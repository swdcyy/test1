package com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1;
import qa3.a;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$delayInfoFetchedListener$2;
import java.lang.Object;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$LiteEnterRoomGuideConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import java.lang.Math;
import py1.b;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger$UserAction;
import py1.b$a;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController;
import brd.t;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1$a;
import erd.g;
import crd.b;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1$1;
import androidx.lifecycle.LifecycleOwner;
import msd.a;
import u63.a;

public final class LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1 implements a	// class@0008e8
{
    public final LiveLiteSideEntryDetailController$delayInfoFetchedListener$2 a;

    public void LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1(LiveLiteSideEntryDetailController$delayInfoFetchedListener$2 p0){
       this.a = p0;
       super();
    }
    public final void a(LiveLiteDelayInfoResponse p0){
       b$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1.class, "1")) {
          return;
       }
       a.p(p0, "delayInfoResponse");
       LiveLiteDelayInfoResponse mLiteEnterRo = p0.mLiteEnterRoomGuideConfig;
       LiveLiteDelayInfoResponse$LiteEnterRoomGuideConfig mSubBizType = (mLiteEnterRo != null)? mLiteEnterRo.mSubBizType: null;
       if (!TextUtils.isEmpty(mSubBizType)) {
          a = b.a;
          b uob = a.a(a.b(LiveActionTrigger$UserAction.ForegroundWatchLite1Sec), (int)((double)p0.mLiteEnterRoomGuideConfig.mTimeSecondsThreshold - Math.ceil(((double)System.currentTimeMillis() / 0x408f400000000000))));
          a.a(this.a.this$0, new LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1$1(this.a.this$0.v.c(uob).subscribe(new LiveLiteSideEntryDetailController$delayInfoFetchedListener$2$1$a(this, p0))));
       }
       return;
    }
}
