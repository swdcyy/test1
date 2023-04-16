package com.kuaishou.live.lite.square.a;
import erd.g;
import com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig;
import kd3.k;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import crd.b;
import lnc.b9;
import kd3.d;
import ok.x;
import com.kuaishou.android.live.model.LiveStreamModel;
import brd.t;
import cjd.e;
import erd.o;
import kd3.b;
import com.kuaishou.live.lite.square.b;

public final class a implements g	// class@000b66
{
    public final LiveNewNoticeEntryDataModel b;

    public void a(LiveNewNoticeEntryDataModel p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveNewNoticeEntryDataModel.class, "4")) {
       }else {
          p0 = LiveLiteLogTag.SQUARE;
          b.Z(p0, "get notice feed");
          if (!k.b(tb.b)) {
             b.Z(p0, "should NOT show notice");
          }else if(tb.a.mLiveStreamModel == null){
             b.j0(p0, "feed is null");
          }else {
             b9.a(tb.e);
             tb.e = d.a.get().a(tb.a.mLiveStreamModel.mLiveStreamId).map(new e()).subscribe(new b(tb), b.b);
          }
       }
       return;
    }
}
