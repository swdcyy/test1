package com.yxcorp.gifshow.growth.home.pymk.g;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import java.lang.Object;
import jga.g;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.User;
import lu7.f;

public final class g implements FollowHelper$a	// class@0013a5
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final void a(boolean p0,g p1){
       if (!p0) {
          f.m(p1.a, User$FollowStatus.UNFOLLOW);
       }
       return;
    }
}
