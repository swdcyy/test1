package com.kwai.feature.api.social.im.jsbridge.model.KrnGroupOnlineStatusInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KrnGroupOnlineStatusInfo implements Serializable	// class@0010f3
{
    public final String groupId;
    public final int onlineMemberCount;

    public void KrnGroupOnlineStatusInfo(String p0,int p1){
       a.p(p0, "groupId");
       super();
       this.groupId = p0;
       this.onlineMemberCount = p1;
    }
}
