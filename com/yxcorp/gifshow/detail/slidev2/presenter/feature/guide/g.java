package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.g;
import erd.o;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Boolean;

public final class g implements o	// class@00198e
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.isFollowingOrFollowRequesting());
    }
}
