package com.kuaishou.live.core.show.subscribe.dosubscribe.d;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import xk2.a;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import android.app.Activity;
import java.lang.String;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import rk2.a0;
import com.kuaishou.live.core.show.subscribe.b$a;

public final class d implements g	// class@0010e1
{
    public final RxFragmentActivity b;
    public final a c;

    public void d(RxFragmentActivity p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       if (p0 == null || (p0.mEnableWriteCalendar != null && !j.g(tb, tc.mSubscribeId, p0))) {
          j.h(tb, tc.mSubscribeId, p0);
          j.a(tb, new a0(tb, tc, p0));
       }
    label_0022 :
       return;
    }
}
