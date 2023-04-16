package com.kuaishou.live.core.show.subscribe.dosubscribe.l;
import rk2.n;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import android.app.Activity;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import rk2.f0;
import com.kuaishou.live.core.show.subscribe.dosubscribe.k;
import com.kuaishou.live.core.show.subscribe.b$a;
import java.lang.Runnable;
import ekd.k1;

public class l	// class@0010ea
{
    public final n a;
    public final QPhoto b;

    public void l(n p0,QPhoto p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(Activity p0,LiveSubscribedCalendarInfo p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "1")) {
          return;
       }
       if (p1 == null || (p1.mEnableWriteCalendar != null && !j.g(p0, p2, p1))) {
          j.h(p0, p2, p1);
          k1.r(new k(this, p0, new f0(p0, p2, p1)), 1000);
       }
    label_002e :
       return;
    }
}
