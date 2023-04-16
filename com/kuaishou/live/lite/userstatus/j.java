package com.kuaishou.live.lite.userstatus.j;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import com.kwai.framework.model.user.QCurrentUser;

public final class j implements g	// class@000b9b
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void accept(Object p0){
       QCurrentUser.me().setLiveRedPackRainKoi(p0.mIsKoi);
    }
}
