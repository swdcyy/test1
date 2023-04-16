package com.yxcorp.gifshow.detail.util.b;
import ok.h;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Boolean;

public final class b implements h	// class@001a2d
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       boolean b = (p0.mFollowStatus == User$FollowStatus.FOLLOWING)? true: false;
       return Boolean.valueOf(b);
    }
}
