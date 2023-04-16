package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.e;
import ekd.q$b;
import java.lang.Object;
import com.kwai.framework.model.user.User;

public final class e implements q$b	// class@001792
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final boolean a(Object p0){
       return (p0.isFollowingOrFollowRequesting() ^ 0x01);
    }
}
