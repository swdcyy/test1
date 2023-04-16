package com.kuaishou.live.core.show.subscribe.choose.b;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pk2.c;
import pk2.b;
import com.kwai.framework.model.user.QCurrentUser;
import qvb.n0;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribePhotoResponse;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import qk2.j;
import erd.g;

public class b extends f	// class@0010d2
{
    public final String p;
    public g q;

    public void b(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       c obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.b();
       String id = QCurrentUser.me().getId();
       b tp = this.p;
       LiveAnchorSubscribePhotoResponse mCursor = (!this.K() && this.L0() != null)? this.L0().mCursor: "";
       return obj.t0(id, tp, mCursor).map(new e()).observeOn(d.a).doOnNext(new j(this));
    }
}
