package com.kuaishou.live.core.show.subscribe.subscribelist.a$a;
import erd.g;
import com.kuaishou.live.core.show.subscribe.subscribelist.a;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedAnchorInfo$LiveSubscribedAnchor;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e17.i;

public class a$a implements g	// class@001168
{
    public final LiveSubscribedAnchorInfo$LiveSubscribedAnchor b;
    public final a c;

    public void a$a(a p0,LiveSubscribedAnchorInfo$LiveSubscribedAnchor p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          this.c.R8();
          p0.mBookStatus = LiveSubscribeBookStatus.NOT_BOOK;
          if (j.d(this.b.mSubscribeId)) {
             j.b(this.c.getActivity(), this.b.mSubscribeId);
          }else {
             j.c(this.c.getActivity(), this.b.mSubscribeId);
             i.a(R.style.arg_RES_7f11066a, 0x7f102bcb);
          }
          j.i(this.b.mSubscribeId, 1);
       }
       return;
    }
}
