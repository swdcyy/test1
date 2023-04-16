package com.kuaishou.live.core.show.subscribe.edit.detail.b;
import erd.g;
import com.kuaishou.live.core.show.subscribe.edit.detail.e;
import java.lang.String;
import com.kuaishou.live.core.show.subscribe.edit.detail.e$a;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribeDeleteSubscribeResponse;
import android.app.Activity;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import lnc.a1;
import vk2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.x;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import java.util.Collection;
import ekd.q;
import tk2.a;
import java.lang.Iterable;
import ok.o;
import qk.y;

public final class b implements g	// class@001106
{
    public final e b;
    public final String c;
    public final e$a d;

    public void b(e p0,String p1,e$a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       j.c(tb.b(), tc);
       if (p0.mIsBanned == null) {
          b.e(a1.p(R.string.arg_RES_7f102cce));
          e uoe = e.class;
          if (!PatchProxy.applyVoidOneRefs(tc, tb, uoe, "6")) {
             LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail liveEntrySub = PatchProxy.apply(null, tb, uoe, "8");
             if (liveEntrySub == PatchProxyResult.class) {
                liveEntrySub = tb.c.get();
             }
             if (liveEntrySub != null) {
                LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail mSubscribeIn = liveEntrySub.mSubscribeInfoList;
                if (!q.f(mSubscribeIn)) {
                   y.q(mSubscribeIn, new a(tc));
                }
                liveEntrySub.mShouldShowSuccessTips = false;
             }
          }
       }
       td.a(tc, p0.mIsBanned);
       return;
    }
}
