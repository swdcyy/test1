package com.kwai.feature.api.social.im.jsbridge.model.KrnGroupMemberInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class KrnGroupMemberInfo implements Serializable	// class@0010f2
{
    public final long createTime;
    public final String groupId;
    public final String invitedUserId;
    public final long joinTime;
    public final String nickName;
    public final int role;
    public final long silenceDeadline;
    public final int status;
    public final long updateTime;
    public final String userId;

    public void KrnGroupMemberInfo(String p0,String p1,String p2,String p3,long p4,long p5,long p6,int p7,int p8,long p9){
       a.p(p0, "groupId");
       a.p(p1, "userId");
       super();
       this.groupId = p0;
       this.userId = p1;
       this.nickName = p2;
       this.invitedUserId = p3;
       this.joinTime = p4;
       this.createTime = p5;
       this.updateTime = p6;
       this.role = p7;
       this.status = p8;
       this.silenceDeadline = p9;
    }
    public void KrnGroupMemberInfo(String p0,String p1,String p2,String p3,long p4,long p5,long p6,int p7,int p8,long p9,int p10,u p11){
       int i = p10;
       int i1 = (i & 0x0080)? 1: p7;
       long l = (i & 0x0200)? 0: p9;
       super(p0, p1, p2, p3, p4, p5, p6, i1, p8, l);
       return;
    }
}
