package com.kwai.feature.api.social.im.jsbridge.model.UserOnlineStatus;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class UserOnlineStatus implements Serializable	// class@001106
{
    public final boolean isOnline;
    public final long lastOffTime;
    public final String userId;

    public void UserOnlineStatus(String p0,boolean p1,long p2){
       a.p(p0, "userId");
       super();
       this.userId = p0;
       this.isOnline = p1;
       this.lastOffTime = p2;
    }
}
