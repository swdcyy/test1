package com.kuaishou.live.common.core.component.admin.user.b;
import lb1.b;
import com.kuaishou.live.common.core.component.admin.user.LiveUserListFragment;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ib1.h;
import erd.g;

public class b extends b	// class@000f58
{
    public final LiveUserListFragment q;

    public void b(LiveUserListFragment p0,String p1){
       this.q = p0;
       super(p1);
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.I1().doOnNext(new h(this));
    }
}
