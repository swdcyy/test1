package com.kuaishou.live.audience.course.j;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import erd.a;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.CoursePrepayResponse;
import s31.e0;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.response.CoursePrepayResponse$CoursePrepayInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kuaishou.live.audience.course.h;
import io.reactivex.g;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.PayCourseApiService;
import com.kwai.framework.model.user.QCurrentUser;
import cjd.e;
import s31.d0;
import s31.c0;

public final class j implements o	// class@000c06
{
    public final GifshowActivity b;
    public final a c;
    public final String d;

    public void j(GifshowActivity p0,a p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       t ot;
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       p0 = p0.data;
       if (p0 != null && p0.useH5PayCounter != null) {
          p0 = p0.payCounterUrl;
          ot = PatchProxy.applyThreeRefsWithListener(tb, p0, tc, null, e0.class, "2");
          if (ot != PatchProxyResult.class) {
          }else {
             tc.run();
             ot = t.create(new h(tb, p0));
             PatchProxy.onMethodExit(e0.class, "2");
          }
       }else {
          p0 = PatchProxy.applyThreeRefsWithListener(tb, td, tc, null, e0.class, "3");
          if (p0 != PatchProxyResult.class) {
             ot = p0;
          }else {
             ot = b.a(0x74d268f).addOrder(td, QCurrentUser.me().getId()).map(new e()).flatMap(new d0(tc)).flatMap(new c0(tb));
             PatchProxy.onMethodExit(e0.class, "3");
          }
       }
       return ot;
    }
}
