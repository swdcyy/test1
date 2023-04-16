package com.kuaishou.live.core.show.subscribe.edit.b;
import u07.u;
import com.kuaishou.live.core.show.subscribe.edit.o;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import wk2.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import sk2.l;
import sk2.p;
import com.kuaishou.live.core.show.subscribe.b$a;
import java.lang.Runnable;
import ekd.k1;

public final class b implements u	// class@0010f7
{
    public final o b;
    public final LiveSubscribedCalendarInfo c;

    public void b(o p0,LiveSubscribedCalendarInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       b tb = this.b;
       b tc = this.c;
       s.m("ADD_NOTICE", tb.f());
       if (PatchProxy.applyVoidOneRefs(tc, tb, o.class, "17")) {
       }else {
          j.h(tb.c(), tc.mSubscribeId, tc);
          k1.s(new p(tb, new l(tb, tc)), tb, 1000);
       }
       return;
    }
}
