package com.kuaishou.live.core.show.subscribe.edit.detail.k;
import z1.a;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$d;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.lang.Object;
import tk2.c0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;

public final class k implements a	// class@001110
{
    public final LiveSubscribeDetailFragment$d a;
    public final LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo b;

    public void k(LiveSubscribeDetailFragment$d p0,LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       k ta = this.a;
       k tb = this.b;
       ta.a.dh(tb, new c0(ta, tb));
    }
}
