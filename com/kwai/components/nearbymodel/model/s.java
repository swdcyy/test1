package com.kwai.components.nearbymodel.model.s;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed;
import com.kwai.components.nearbymodel.model.r;
import tl8.d;
import ok.h;
import tl8.e;

public class s	// class@000cd5
{

    public void s(){
       super();
    }
    public static List a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, LocalCoverAggregateFeed.class, r.b);
    }
}
