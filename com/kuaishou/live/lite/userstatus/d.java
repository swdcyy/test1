package com.kuaishou.live.lite.userstatus.d;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import com.kwai.framework.model.user.QCurrentUser;

public final class d implements g	// class@000b94
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       QCurrentUser.me().setLiveRedPackRainKoi(p0.mIsKoi);
    }
}
