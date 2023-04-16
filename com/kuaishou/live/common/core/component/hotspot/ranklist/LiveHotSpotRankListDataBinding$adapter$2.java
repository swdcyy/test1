package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding$adapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding;
import android.app.Activity;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LifecycleOwner;
import yn1.i;
import yn1.h;

public final class LiveHotSpotRankListDataBinding$adapter$2 extends Lambda implements a	// class@00142d
{
    public final Activity $activity;
    public final LiveHotSpotRankListDataBinding this$0;

    public void LiveHotSpotRankListDataBinding$adapter$2(LiveHotSpotRankListDataBinding p0,Activity p1){
       this.this$0 = p0;
       this.$activity = p1;
       super(0);
    }
    public final LiveHotSpotRankListAdapter invoke(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListDataBinding$adapter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveHotSpotRankListDataBinding$adapter$2 tthis$0 = this.this$0;
       return new LiveHotSpotRankListAdapter(tthis$0.i, this.$activity, tthis$0.k, tthis$0.j);
    }
    public Object invoke(){
       return this.invoke();
    }
}
