package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.h;
import ekd.q$b;
import java.lang.Object;
import com.kwai.framework.model.user.User;

public final class h implements q$b	// class@00176e
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final boolean a(Object p0){
       return (p0.isFollowingOrFollowRequesting() ^ 0x01);
    }
}
