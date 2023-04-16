package com.kuaishou.live.core.show.activityredpacket.z;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyInfo;

public final class z implements o	// class@0009b1
{
    public static final z b;

    static {
       z.b = new z();
    }
    public void z(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = false;
       if (p0 == null) {
       }else if(p0.mUserInfo != null){
          b = true;
       }
       return b;
    }
}
