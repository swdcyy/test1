package com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.d;
import erd.r;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo$LiveSubscribeStat;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;

public final class d implements r	// class@00100d
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final boolean test(Object p0){
       boolean b;
       if (p0 != null) {
          p0 = p0.mLiveSubscribeStat;
          if (p0 != null && p0.mBookStatus == LiveSubscribeBookStatus.NOT_BOOK) {
             b = true;
          label_0013 :
             return b;
          }
       }
       b = false;
       goto label_0013 ;
    }
}
