package com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransferManagerImpl$lifecycleObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransferManagerImpl;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uf1.b;
import java.lang.Enum;
import java.util.Objects;
import xp5.g;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransfer;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.System;
import java.lang.Long;

public final class LiveLiteBidirectionalDataTransferManagerImpl$lifecycleObserver$1 implements LifecycleEventObserver	// class@0010dd
{
    public final LiveLiteBidirectionalDataTransferManagerImpl b;

    public void LiveLiteBidirectionalDataTransferManagerImpl$lifecycleObserver$1(LiveLiteBidirectionalDataTransferManagerImpl p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       LiveLiteBidirectionalDataTransferManagerImpl$lifecycleObserver$1 tb;
       String liveStreamId;
       LiveLiteLogTag bIDIRECTIONA;
       LiveLiteLogTag liveLiteLogT;
       LiveLiteBidirectionalDataTransferManagerImpl liveLiteBidi = LiveLiteBidirectionalDataTransferManagerImpl.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteBidirectionalDataTransferManagerImpl$lifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       int i = b.a[p1.ordinal()];
       String str = "streamId";
       String str1 = "liveInfoManager.liveStre¡­     \)\n      return\n    }";
       if (i != 1) {
          if (i == 2) {
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, liveLiteBidi, "7")) {
                liveStreamId = tb.d.getLiveStreamId();
                if (liveStreamId != null) {
                   a.o(liveStreamId, str1);
                   if (!PatchProxy.applyVoidOneRefs(liveStreamId, tb, liveLiteBidi, "5")) {
                      a.p(liveStreamId, str);
                      LiveLiteBidirectionalDataTransfer.c.a(liveStreamId);
                   }
                }else {
                   bIDIRECTIONA = LiveLiteLogTag.BIDIRECTIONAL_DATA_TRANSFER;
                   bIDIRECTIONA.appendTag(tb.b);
                   liveLiteLogT = bIDIRECTIONA;
                   b.P(liveLiteLogT, "onStop: liveStreamId is null!");
                }
             }
          }
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, liveLiteBidi, "6")) {
             liveStreamId = tb.d.getLiveStreamId();
             if (liveStreamId != null) {
                a.o(liveStreamId, str1);
                if (!PatchProxy.applyVoidOneRefs(liveStreamId, tb, liveLiteBidi, "4")) {
                   a.p(liveStreamId, str);
                   LiveLiteBidirectionalDataTransfer.c.e(liveStreamId);
                }
                tb.Ge(liveStreamId, "START_WATCH_TIMESTAMP", Long.valueOf(System.currentTimeMillis()));
             }else {
                bIDIRECTIONA = LiveLiteLogTag.BIDIRECTIONAL_DATA_TRANSFER;
                bIDIRECTIONA.appendTag(tb.b);
                liveLiteLogT = bIDIRECTIONA;
                b.P(liveLiteLogT, "onStart: liveStreamId is null!");
             }
          }
       }
       return;
    }
}
