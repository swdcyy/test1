package com.yxcorp.gifshow.follow.common.data.b;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import nga.c;
import pe6.a;
import cjd.e;
import erd.o;
import nga.e;
import erd.g;
import com.yxcorp.gifshow.follow.common.data.a;
import nga.f;
import qvb.n0;
import com.yxcorp.gifshow.follow.common.data.FeedsLiveResponse;

public class b extends f	// class@001030
{
    public final int p;
    public static final int q;

    public void b(int p0){
       super();
       this.p = p0;
    }
    public boolean E1(){
       return false;
    }
    public t I1(){
       String obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowLivePageList"), "onCreateRequest");
       obj = (QCurrentUser.ME.isLogined())? QCurrentUser.ME.getToken(): "";
       return b.a(0x5eeadcc5).g(6, 0, obj, 20, a.a(), this.h2(), 0, false, this.p).map(new e()).doOnNext(new e(this)).doOnNext(a.b).doOnError(new f(this));
    }
    public final String h2(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().mCursor;
       }
       return objArray;
    }
    public boolean i(){
       return false;
    }
}
