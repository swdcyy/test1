package com.kuaishou.live.ad.social.NonAdLogHelper;
import java.lang.Object;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.kwai.framework.model.feed.BaseFeed;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.ad.social.NonAdLogHelper$reportAdLogCheckSwitch$1;
import msd.l;
import com.kwai.sdk.switchconfig.a;
import tkd.b;
import tkd.d;
import ol9.a;
import mxb.j;
import mxb.j0;
import mxb.i0;

public final class NonAdLogHelper	// class@000a06
{
    public static final NonAdLogHelper a;

    static {
       NonAdLogHelper.a = new NonAdLogHelper();
    }
    public void NonAdLogHelper(){
       super();
    }
    public static final void a(int p0,AdDataWrapper$AdLogParamAppender p1,BaseFeed p2,g p3){
       if (PatchProxy.isSupport(NonAdLogHelper.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, NonAdLogHelper.class, "1")) {
          return;
       }
       a.p(p1, "appender");
       a.p(p2, "feed");
       NonAdLogHelper.b(p0, p1, p2, new NonAdLogHelper$reportAdLogCheckSwitch$1(p3));
       return;
    }
    public static final void b(int p0,AdDataWrapper$AdLogParamAppender p1,BaseFeed p2,l p3){
       j0 oj0;
       if (PatchProxy.isSupport(NonAdLogHelper.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, NonAdLogHelper.class, "2")) {
          return;
       }
       a.p(p1, "appender");
       a.p(p2, "feed");
       a.p(p3, "callback");
       if (a.t().d("isBuildAdLogInBiz", true)) {
          oj0 = i0.a().p(p0, d.a(0x4ffa335e).AN(p2));
          a.o(oj0, "PhotoAdvertisementLogRep¡­n\(actionType, logWrapper\)");
       }else {
          oj0 = i0.a().e(p0, p2);
          a.o(oj0, "PhotoAdvertisementLogRep¡­gAction\(actionType, feed\)");
       }
       oj0.f(p1);
       p3.invoke(oj0);
       oj0.a();
       return;
    }
}
