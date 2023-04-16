package com.kuaishou.live.core.show.subscribe.subscribelist.LiveSubscribeAnchorListFragment$a;
import qvb.f;
import com.kuaishou.live.core.show.subscribe.subscribelist.LiveSubscribeAnchorListFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribedAnchorInfo;
import pk2.c;
import pk2.b;
import cjd.e;
import erd.o;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;

public class LiveSubscribeAnchorListFragment$a extends f	// class@001165
{
    public final LiveSubscribeAnchorListFragment p;

    public void LiveSubscribeAnchorListFragment$a(LiveSubscribeAnchorListFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       String str;
       LiveSubscribedAnchorInfo obj = PatchProxy.apply(null, this, LiveSubscribeAnchorListFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!this.K() && (this.L0() != null && this.L0().mCursor != null))? this.L0().mCursor: "";
       return b.b().x0(1, obj).map(new e()).compose(this.p.ge());
    }
}
