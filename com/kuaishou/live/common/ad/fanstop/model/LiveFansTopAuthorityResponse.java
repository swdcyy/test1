package com.kuaishou.live.common.ad.fanstop.model.LiveFansTopAuthorityResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveFansTopAuthorityResponse implements Serializable	// class@000e69
{
    public boolean mIsEnableLiveFansTop;
    public static final long serialVersionUID = 0x6557d3537bbf5d4d;

    public void LiveFansTopAuthorityResponse(){
       super();
    }
    public static LiveFansTopAuthorityResponse createFakeErrorResponse(){
       LiveFansTopAuthorityResponse obj = PatchProxy.apply(null, null, LiveFansTopAuthorityResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveFansTopAuthorityResponse();
       obj.mIsEnableLiveFansTop = false;
       return obj;
    }
}
