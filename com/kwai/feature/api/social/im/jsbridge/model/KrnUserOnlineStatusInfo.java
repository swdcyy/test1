package com.kwai.feature.api.social.im.jsbridge.model.KrnUserOnlineStatusInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KrnUserOnlineStatusInfo implements Serializable	// class@0010f8
{
    public final long lastOfflineTime;
    public final int status;
    public final String userId;

    public void KrnUserOnlineStatusInfo(String p0,int p1,long p2){
       a.p(p0, "userId");
       super();
       this.userId = p0;
       this.status = p1;
       this.lastOfflineTime = p2;
    }
}
