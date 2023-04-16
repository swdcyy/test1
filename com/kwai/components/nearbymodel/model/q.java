package com.kwai.components.nearbymodel.model.q;
import com.yxcorp.gifshow.entity.QPhoto$b;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import kp.r1;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed;
import java.lang.Class;
import tl8.d;
import java.util.List;
import com.kwai.components.nearbymodel.model.s;

public final class q implements QPhoto$b	// class@000cd3
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public final Boolean a(BaseFeed p0){
       Boolean fALSE = (r1.U2(p0) && (p0.a(LocalCoverAggregateFeed.class).isTimelineCard() || (p0.a(LocalCoverAggregateFeed.class).isTimelineCardV2() && (s.a(p0) != null && s.a(p0).size() > 2))))? Boolean.FALSE: null;
       return fALSE;
    }
}
