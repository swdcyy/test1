package com.kwai.feature.api.social.im.jsbridge.model.JsMuteGroupMemberParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;

public final class JsMuteGroupMemberParams implements Serializable	// class@0010e8
{
    public final String groupId;
    public final boolean isMute;
    public final Integer muteTime;
    public final String subBiz;
    public final String userId;

    public void JsMuteGroupMemberParams(String p0,boolean p1,String p2,String p3,Integer p4){
       super();
       this.subBiz = p0;
       this.isMute = p1;
       this.userId = p2;
       this.groupId = p3;
       this.muteTime = p4;
    }
}
