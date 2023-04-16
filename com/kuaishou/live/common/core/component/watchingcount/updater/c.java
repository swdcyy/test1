package com.kuaishou.live.common.core.component.watchingcount.updater.c;
import com.kuaishou.live.common.core.component.watchingcount.updater.a;
import z1.k;
import java.lang.Object;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData$SourceType;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import xy1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class c implements a	// class@0017cc
{
    public final k a;
    public final k b;

    public void c(k p0,k p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(WatchingCountData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       LiveLogTag tOP_USER = LiveLogTag.TOP_USER;
       String str = "input";
       b.c0(tOP_USER, this.c("updateWatchingCount"), str, p0);
       WatchingCountData a = p0.a;
       if (a != WatchingCountData$SourceType.API_START_PLAY_OF_TOTAL && a != WatchingCountData$SourceType.SC_ACTIVITY_LIVE_INFO) {
          b.c0(tOP_USER, this.c("updateWatchingCount | dropped | unsupported type"), str, p0);
          return;
       }else if(TextUtils.isEmpty(p0.c)){
          b.Z(tOP_USER, this.c("updateWatchingCount | dropped | EMPTY DisplayWatchingCount!!!"));
          return;
       }else {
          TextView textView = this.a.get();
          if (textView == null) {
             b.Z(tOP_USER, this.c("updateWatchingCount | dropped | null view!!!"));
             return;
          }else {
             b.c0(tOP_USER, this.c("updateWatchingCount | applied"), "input:", p0);
             b.a(textView, p0.c);
             return;
          }
       }
    }
    public long b(){
       return 0;
    }
    public final String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TotalUpdater {liveStreamId:"+this.b.get()+"}"+p0;
    }
    public void reset(){
    }
}
