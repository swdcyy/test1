package com.kuaishou.live.lite.share.b;
import msd.l;
import com.kuaishou.live.lite.share.c;
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
import dd3.e;

public final class b implements l	// class@000b14
{
    public final c b;
    public final LiveStreamFeed c;

    public void b(c p0,LiveStreamFeed p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(Object p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       p0.n(OperationModel$Type.LIVE_PLAY);
       p0.k(tc);
       IMShareData iMShareData = PatchProxy.applyOneRefs(tc, tb, c.class, "6");
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
       p0.f(new e(tc));
       return null;
    }
}
