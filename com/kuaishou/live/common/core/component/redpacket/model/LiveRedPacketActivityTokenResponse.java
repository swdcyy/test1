package com.kuaishou.live.common.core.component.redpacket.model.LiveRedPacketActivityTokenResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.j$b;
import ok.j;
import com.yxcorp.utility.TextUtils;

public class LiveRedPacketActivityTokenResponse implements Serializable	// class@00175e
{
    public long mGrabRequestMaxDelayMillis;
    public String mGrabToken;
    public boolean mIsLuckyUser;
    public static final long serialVersionUID = 0x7b5d62aecf044fa0;

    public void LiveRedPacketActivityTokenResponse(){
       super();
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, LiveRedPacketActivityTokenResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.c("grabToken", TextUtils.k(this.mGrabToken));
       obj.b("mGrabRequestMaxDelayMillis", this.mGrabRequestMaxDelayMillis);
       obj.d("mIsLuckyUser", this.mIsLuckyUser);
       return obj.toString();
    }
}
