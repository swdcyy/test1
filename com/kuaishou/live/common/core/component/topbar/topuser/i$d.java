package com.kuaishou.live.common.core.component.topbar.topuser.i$d;
import erd.g;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveWatchingUsersBundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Math;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import java.util.Iterator;
import com.kwai.framework.model.user.UserInfo;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData$SourceType;

public class i$d implements g	// class@00178a
{
    public final i b;

    public void i$d(i p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$d.class, "1")) {
       }else {
          b.c0(LiveLogTag.TOP_USER, "fetched watcher list from API.", "pending duration", Integer.valueOf(p0.getPendingDuration()));
          i$d tb = this.b;
          tb.F = tb.F + 1;
          tb.E = p0;
          tb.D = Math.max(5000, (long)(p0.getPendingDuration() * 1000));
          if (this.b.V8()) {
             this.b.B.clear();
             this.b.B.addAll(p0.getCurrentWatchingUsers());
             tb = this.b;
             List currentWatch = p0.getCurrentWatchingUsers();
             Objects.requireNonNull(tb);
             if (PatchProxy.applyVoidOneRefs(currentWatch, tb, i.class, "3") || (currentWatch != null && !currentWatch.isEmpty())) {
                Iterator iterator = currentWatch.iterator();
                while (iterator.hasNext()) {
                   UserInfo userInfo = iterator.next();
                   b.Z(LiveLogTag.TOP_USER, "user/v3 api response: user: "+userInfo.mName+" display: "+userInfo.mExtraInfo.mDisplayKsCoin);
                }
             }
             this.b.h9();
          }
          this.b.t9(new WatchingCountData(WatchingCountData$SourceType.API_LOOP, (long)p0.getWatchingCount(), p0.getDisplayWatchingCount()));
          this.b.e9((long)p0.getWatchingCount());
          p0 = this.b;
          if (p0.I != null) {
             p0.S8();
          }
       }
       return;
    }
}
