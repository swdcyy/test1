package com.kuaishou.live.core.show.subscribe.subscribelist.a$b;
import erd.g;
import com.kuaishou.live.core.show.subscribe.subscribelist.a;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedAnchorInfo$LiveSubscribedAnchor;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedCalendarInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e17.i;
import dl2.d;
import com.kuaishou.live.core.show.subscribe.b$a;

public class a$b implements g	// class@001169
{
    public final LiveSubscribedAnchorInfo$LiveSubscribedAnchor b;
    public final a c;

    public void a$b(a p0,LiveSubscribedAnchorInfo$LiveSubscribedAnchor p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          this.c.t.mBookStatus = LiveSubscribeBookStatus.BOOKED;
          j.i(this.b.mSubscribeId, 2);
          this.c.S8();
          if (p0 != null && p0.mEnableWriteCalendar != null) {
             int i = 0x7f11066a;
             if (j.g(this.c.getActivity(), this.b.mSubscribeId, p0)) {
                i.a(i, R.string.arg_RES_7f102cd3);
             }else {
                i.a(i, R.string.arg_RES_7f102bcc);
                j.h(this.c.getActivity(), this.b.mSubscribeId, p0);
                j.a(this.c.getActivity(), new d(this, this.b, p0));
             }
          }
       }
       return;
    }
}
