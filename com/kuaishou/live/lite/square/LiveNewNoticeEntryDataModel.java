package com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel$a;
import java.lang.Object;
import com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel$1;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig;
import java.lang.reflect.Type;
import wg3.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kd3.k;
import z83.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Math;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.kuaishou.live.lite.square.a;
import erd.g;

public class LiveNewNoticeEntryDataModel	// class@000b64
{
    public final LiveStreamFeed a;
    public final LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig b;
    public final LiveNewNoticeEntryDataModel$a c;
    public b d;
    public b e;
    public LiveStreamFeed f;
    public final DefaultLifecycleObserver g;

    public void LiveNewNoticeEntryDataModel(LifecycleOwner p0,LiveStreamFeed p1,LiveNewNoticeEntryDataModel$a p2){
       super();
       LiveNewNoticeEntryDataModel$1 u1 = new LiveNewNoticeEntryDataModel$1(this);
       this.g = u1;
       this.b = a.J(LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig.class);
       this.a = p1;
       this.c = p2;
       this.a();
       p0.getLifecycle().addObserver(u1);
    }
    public void a(){
       long l1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveNewNoticeEntryDataModel.class, "2")) {
          return;
       }
       if (!k.b(this.b)) {
          b.Z(LiveLiteLogTag.SQUARE, "no loop query notice today:"+a.c()+","+this.b.mLiveSquareMaxNoticeShowCount);
          return;
       }else {
          long l = Math.max(0x1d4c0, this.b.mLiveSquareNoticeShowIntervalMs);
          LiveNewNoticeEntryDataModel tb = this.b;
          Object obj = PatchProxy.applyOneRefs(tb, objArray, k.class, "5");
          if (obj != PatchProxyResult.class) {
             l1 = obj.longValue();
          }else {
             LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig mLiveSquareN = tb.mLiveSquareNoticeShowIntervalMs;
             l1 = ((System.currentTimeMillis() - a.a()) - mLiveSquareN > 0)? tb.mDelayStartLoopNoticeMs: Math.max(tb.mDelayStartLoopNoticeMs, (mLiveSquareN - (System.currentTimeMillis() - a.a())));
          }
          b.Z(LiveLiteLogTag.SQUARE, "interval:"+l+",delay:"+l1+", duration:"+this.b.mNoticeEntranceShowDurationMs);
          b9.a(this.d);
          this.d = t.interval(l1, l, TimeUnit.MILLISECONDS).subscribe(new a(this));
          return;
       }
    }
}
