package com.kwai.feature.api.social.im.jsbridge.model.KrnGroupInfo;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class KrnGroupInfo implements Serializable	// class@0010f1
{
    public final String description;
    public final int forbiddenState;
    public final String groupBackName;
    public final String groupHeadUrl;
    public final String groupId;
    public final int groupJoinMode;
    public final int groupMemberStatus;
    public final String groupName;
    public final String groupNumber;
    public final String groupOriginHeadUrl;
    public final int groupType;
    public final int invitePermissionType;
    public final String inviterUid;
    public final boolean isMuteAll;
    public final int joinPermission;
    public final String masterId;
    public final int maxManagerCount;
    public final int maxMemberCount;
    public final int memberCount;
    public final List multiForbiddenStates;
    public final String nickName;
    public final int role;
    public final String tag;
    public final List topMembers;

    public void KrnGroupInfo(int p0,int p1,String p2,int p3,boolean p4,int p5,String p6,String p7,int p8,String p9,String p10,String p11,int p12,String p13,String p14,int p15,String p16,String p17,int p18,int p19,String p20,List p21,List p22,int p23){
       int i = this;
       a.p(p2, "groupId");
       super();
       i.role = p0;
       i.groupJoinMode = p1;
       i.groupId = p2;
       i.maxManagerCount = p3;
       i.isMuteAll = p4;
       i.invitePermissionType = p5;
       i.groupNumber = p6;
       i.groupHeadUrl = p7;
       i.joinPermission = p8;
       i.groupName = p9;
       i.description = p10;
       i.nickName = p11;
       i.groupType = p12;
       i.tag = p13;
       i.masterId = p14;
       i.memberCount = p15;
       i.groupBackName = p16;
       i.inviterUid = p17;
       i.forbiddenState = p18;
       i.maxMemberCount = p19;
       i.groupOriginHeadUrl = p20;
       i.topMembers = p21;
       i.multiForbiddenStates = p22;
       i.groupMemberStatus = p23;
    }
    public void KrnGroupInfo(int p0,int p1,String p2,int p3,boolean p4,int p5,String p6,String p7,int p8,String p9,String p10,String p11,int p12,String p13,String p14,int p15,String p16,String p17,int p18,int p19,String p20,List p21,List p22,int p23,int p24,u p25){
       int i = p24;
       int i1 = (i & 0x01)? 0: p0;
       int i2 = (i & 0x02)? 0: p1;
       int i3 = (i & 0x08)? 0: p3;
       boolean b = (i & 0x10)? false: p4;
       int i4 = (i & 0x20)? 1: p5;
       int i5 = (i & 0x0100)? 0: p8;
       List list = (0x200000 & i)? CollectionsKt__CollectionsKt.E(): p21;
       List list1 = (i & 0x400000)? CollectionsKt__CollectionsKt.E(): p22;
       super(i1, i2, p2, i3, b, i4, p6, p7, i5, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, list, list1, p23);
       return;
    }
}
