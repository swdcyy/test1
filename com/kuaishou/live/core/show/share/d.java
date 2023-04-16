package com.kuaishou.live.core.show.share.d;
import msd.l;
import com.kuaishou.live.core.show.share.e;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel$c;
import java.util.Objects;
import com.yxcorp.gifshow.share.OperationModel$Type;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.IMShareData;
import ekd.n0;
import pj2.s;

public final class d implements l	// class@00100f
{
    public final e b;
    public final LiveStreamFeed c;

    public void d(e p0,LiveStreamFeed p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       p0.n(OperationModel$Type.LIVE_PLAY);
       p0.k(tc);
       IMShareData iMShareData = PatchProxy.applyOneRefs(tc, tb, e.class, "8");
       if (iMShareData != PatchProxyResult.class) {
       }else {
          iMShareData = new IMShareData();
          iMShareData.mFeed = tc;
       }
       p0.h(iMShareData);
       p0.c(true);
       Object[] objArray = new Object[true];
       objArray[0] = tc.getId();
       p0.o(n0.a("kwai://live/play/%s", objArray));
       p0.j(tc.getId());
       p0.i(true);
       p0.f(new s(tc));
       return null;
    }
}
