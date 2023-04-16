package com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeBannedInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import java.lang.Math;

public class LiveAnchorSubscriberCreateConfig$LiveSubscribeBannedInfo implements Serializable	// class@001131
{
    public long mBannedEndTimestampMs;
    public static final long serialVersionUID = 0x5ff71a5ed6811f74;

    public void LiveAnchorSubscriberCreateConfig$LiveSubscribeBannedInfo(){
       super();
    }
    public long getBannedLeftTimeMs(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorSubscriberCreateConfig$LiveSubscribeBannedInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Math.max(0, (this.mBannedEndTimestampMs - System.currentTimeMillis()));
    }
}
