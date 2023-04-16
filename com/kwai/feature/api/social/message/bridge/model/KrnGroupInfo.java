package com.kwai.feature.api.social.message.bridge.model.KrnGroupInfo;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KrnGroupInfo implements Serializable	// class@00113d
{
    public final String description;
    public final int forbiddenState;
    public final String groupBackName;
    public final long groupExtraSetting;
    public final String groupHeadUrl;
    public final String groupId;
    public final int groupJoinMode;
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
    public final String nickName;
    public final int role;
    public final String tag;
    public final List topMembers;

    public void KrnGroupInfo(int p0,int p1,String p2,int p3,boolean p4,int p5,String p6,String p7,int p8,String p9,String p10,String p11,int p12,String p13,String p14,int p15,String p16,String p17,int p18,int p19,String p20,List p21,long p22){
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
       i.groupExtraSetting = p22;
    }
    public void KrnGroupInfo(int p0,int p1,String p2,int p3,boolean p4,int p5,String p6,String p7,int p8,String p9,String p10,String p11,int p12,String p13,String p14,int p15,String p16,String p17,int p18,int p19,String p20,List p21,long p22,int p23,u p24){
       int i = p23;
       int i1 = (i & 0x01)? 0: p0;
       int i2 = (i & 0x02)? 0: p1;
       int i3 = (i & 0x08)? 0: p3;
       boolean b = (i & 0x10)? false: p4;
       int i4 = (i & 0x20)? 1: p5;
       int i5 = (i & 0x0100)? 0: p8;
       List list = (0x200000 & i)? CollectionsKt__CollectionsKt.E(): p21;
       long l = (i & 0x400000)? 0: p22;
       super(i1, i2, p2, i3, b, i4, p6, p7, i5, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, list, l);
       return;
    }
    public static KrnGroupInfo copy$default(KrnGroupInfo p0,int p1,int p2,String p3,int p4,boolean p5,int p6,String p7,String p8,int p9,String p10,String p11,String p12,int p13,String p14,String p15,int p16,String p17,String p18,int p19,int p20,String p21,List p22,long p23,int p24,Object p25){
       int i1;
       int i2;
       KrnGroupInfo krnGroupInfo = p0;
       int i = p24;
       KrnGroupInfo role = (i & 0x01)? krnGroupInfo.role: p1;
       KrnGroupInfo groupJoinMod = (i & 0x02)? krnGroupInfo.groupJoinMode: p2;
       KrnGroupInfo groupId = (i & 0x04)? krnGroupInfo.groupId: p3;
       KrnGroupInfo maxManagerCo = (i & 0x08)? krnGroupInfo.maxManagerCount: p4;
       KrnGroupInfo isMuteAll = (i & 0x10)? krnGroupInfo.isMuteAll: p5;
       KrnGroupInfo invitePermis = (i & 0x20)? krnGroupInfo.invitePermissionType: p6;
       KrnGroupInfo groupNumber = (i & 0x40)? krnGroupInfo.groupNumber: p7;
       KrnGroupInfo groupHeadUrl = (i & 0x0080)? krnGroupInfo.groupHeadUrl: p8;
       KrnGroupInfo joinPermissi = (i & 0x0100)? krnGroupInfo.joinPermission: p9;
       KrnGroupInfo groupName = (i & 0x0200)? krnGroupInfo.groupName: p10;
       KrnGroupInfo description = (i & 0x0400)? krnGroupInfo.description: p11;
       KrnGroupInfo nickName = (i & 0x0800)? krnGroupInfo.nickName: p12;
       KrnGroupInfo groupType = (i & 0x1000)? krnGroupInfo.groupType: p13;
       KrnGroupInfo tag = (i & 0x2000)? krnGroupInfo.tag: p14;
       KrnGroupInfo krnGroupInfo1 = tag;
       tag = (i & 0x4000)? krnGroupInfo.masterId: p15;
       KrnGroupInfo krnGroupInfo2 = tag;
       tag = (i & 0x8000)? krnGroupInfo.memberCount: p16;
       KrnGroupInfo krnGroupInfo3 = tag;
       tag = (i & 0x10000)? krnGroupInfo.groupBackName: p17;
       KrnGroupInfo krnGroupInfo4 = tag;
       tag = (i & 0x20000)? krnGroupInfo.inviterUid: p18;
       KrnGroupInfo krnGroupInfo5 = tag;
       tag = (i & 0x40000)? krnGroupInfo.forbiddenState: p19;
       KrnGroupInfo krnGroupInfo6 = tag;
       tag = (i & 0x80000)? krnGroupInfo.maxMemberCount: p20;
       KrnGroupInfo krnGroupInfo7 = tag;
       tag = (i & 0x100000)? krnGroupInfo.groupOriginHeadUrl: p21;
       KrnGroupInfo krnGroupInfo8 = tag;
       tag = (i & 0x200000)? krnGroupInfo.topMembers: p22;
       KrnGroupInfo krnGroupInfo9 = groupType;
       KrnGroupInfo krnGroupInfo10 = tag;
       groupType = (i & 0x400000)? krnGroupInfo.groupExtraSetting: p23;
       return p0.copy(role, groupJoinMod, groupId, maxManagerCo, isMuteAll, invitePermis, groupNumber, groupHeadUrl, joinPermissi, groupName, description, nickName, krnGroupInfo9, krnGroupInfo1, krnGroupInfo2, krnGroupInfo3, krnGroupInfo4, krnGroupInfo5, krnGroupInfo6, krnGroupInfo7, krnGroupInfo8, krnGroupInfo10, groupType);
    }
    public final int component1(){
       return this.role;
    }
    public final String component10(){
       return this.groupName;
    }
    public final String component11(){
       return this.description;
    }
    public final String component12(){
       return this.nickName;
    }
    public final int component13(){
       return this.groupType;
    }
    public final String component14(){
       return this.tag;
    }
    public final String component15(){
       return this.masterId;
    }
    public final int component16(){
       return this.memberCount;
    }
    public final String component17(){
       return this.groupBackName;
    }
    public final String component18(){
       return this.inviterUid;
    }
    public final int component19(){
       return this.forbiddenState;
    }
    public final int component2(){
       return this.groupJoinMode;
    }
    public final int component20(){
       return this.maxMemberCount;
    }
    public final String component21(){
       return this.groupOriginHeadUrl;
    }
    public final List component22(){
       return this.topMembers;
    }
    public final long component23(){
       return this.groupExtraSetting;
    }
    public final String component3(){
       return this.groupId;
    }
    public final int component4(){
       return this.maxManagerCount;
    }
    public final boolean component5(){
       return this.isMuteAll;
    }
    public final int component6(){
       return this.invitePermissionType;
    }
    public final String component7(){
       return this.groupNumber;
    }
    public final String component8(){
       return this.groupHeadUrl;
    }
    public final int component9(){
       return this.joinPermission;
    }
    public final KrnGroupInfo copy(int p0,int p1,String p2,int p3,boolean p4,int p5,String p6,String p7,int p8,String p9,String p10,String p11,int p12,String p13,String p14,int p15,String p16,String p17,int p18,int p19,String p20,List p21,long p22){
       KrnGroupInfo obj;
       object oobject = p2;
       if (PatchProxy.isSupport(KrnGroupInfo.class)) {
          Object[] objArray = new Object[23];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = p9;
          objArray[10] = p10;
          objArray[11] = p11;
          objArray[12] = Integer.valueOf(p12);
          objArray[13] = p13;
          objArray[14] = p14;
          objArray[15] = Integer.valueOf(p15);
          objArray[16] = p16;
          objArray[17] = p17;
          objArray[18] = Integer.valueOf(p18);
          objArray[19] = Integer.valueOf(p19);
          objArray[20] = p20;
          objArray[21] = p21;
          objArray[22] = Long.valueOf(p22);
          obj = PatchProxy.apply(objArray, this, KrnGroupInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "groupId");
       obj = new KrnGroupInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22);
       return v25;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnGroupInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KrnGroupInfo && (this.role == p0.role && (this.groupJoinMode == p0.groupJoinMode && (a.g(this.groupId, p0.groupId) && (this.maxManagerCount == p0.maxManagerCount && (this.isMuteAll == p0.isMuteAll && (this.invitePermissionType == p0.invitePermissionType && (a.g(this.groupNumber, p0.groupNumber) && (a.g(this.groupHeadUrl, p0.groupHeadUrl) && (this.joinPermission == p0.joinPermission && (a.g(this.groupName, p0.groupName) && (a.g(this.description, p0.description) && (a.g(this.nickName, p0.nickName) && (this.groupType == p0.groupType && (a.g(this.tag, p0.tag) && (a.g(this.masterId, p0.masterId) && (this.memberCount == p0.memberCount && (a.g(this.groupBackName, p0.groupBackName) && (a.g(this.inviterUid, p0.inviterUid) && (this.forbiddenState == p0.forbiddenState && (this.maxMemberCount == p0.maxMemberCount && (a.g(this.groupOriginHeadUrl, p0.groupOriginHeadUrl) && (a.g(this.topMembers, p0.topMembers) && !this.groupExtraSetting - p0.groupExtraSetting)))))))))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final String getDescription(){
       return this.description;
    }
    public final int getForbiddenState(){
       return this.forbiddenState;
    }
    public final String getGroupBackName(){
       return this.groupBackName;
    }
    public final long getGroupExtraSetting(){
       return this.groupExtraSetting;
    }
    public final String getGroupHeadUrl(){
       return this.groupHeadUrl;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public final int getGroupJoinMode(){
       return this.groupJoinMode;
    }
    public final String getGroupName(){
       return this.groupName;
    }
    public final String getGroupNumber(){
       return this.groupNumber;
    }
    public final String getGroupOriginHeadUrl(){
       return this.groupOriginHeadUrl;
    }
    public final int getGroupType(){
       return this.groupType;
    }
    public final int getInvitePermissionType(){
       return this.invitePermissionType;
    }
    public final String getInviterUid(){
       return this.inviterUid;
    }
    public final int getJoinPermission(){
       return this.joinPermission;
    }
    public final String getMasterId(){
       return this.masterId;
    }
    public final int getMaxManagerCount(){
       return this.maxManagerCount;
    }
    public final int getMaxMemberCount(){
       return this.maxMemberCount;
    }
    public final int getMemberCount(){
       return this.memberCount;
    }
    public final String getNickName(){
       return this.nickName;
    }
    public final int getRole(){
       return this.role;
    }
    public final String getTag(){
       return this.tag;
    }
    public final List getTopMembers(){
       return this.topMembers;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, KrnGroupInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.role * 31) + this.groupJoinMode) * 31;
       KrnGroupInfo tgroupId = this.groupId;
       int i1 = 0;
       int i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (((i + i2) * 31) + this.maxManagerCount) * 31;
       tgroupId = this.isMuteAll;
       if (tgroupId != null) {
          i2 = 1;
       }
       i = (((i + i2) * 31) + this.invitePermissionType) * 31;
       tgroupId = this.groupNumber;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (i + i2) * 31;
       tgroupId = this.groupHeadUrl;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (((i + i2) * 31) + this.joinPermission) * 31;
       tgroupId = this.groupName;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (i + i2) * 31;
       tgroupId = this.description;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (i + i2) * 31;
       tgroupId = this.nickName;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (((i + i2) * 31) + this.groupType) * 31;
       tgroupId = this.tag;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (i + i2) * 31;
       tgroupId = this.masterId;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (((i + i2) * 31) + this.memberCount) * 31;
       tgroupId = this.groupBackName;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (i + i2) * 31;
       tgroupId = this.inviterUid;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (((((i + i2) * 31) + this.forbiddenState) * 31) + this.maxMemberCount) * 31;
       tgroupId = this.groupOriginHeadUrl;
       i2 = (tgroupId != null)? tgroupId.hashCode(): 0;
       i = (i + i2) * 31;
       tgroupId = this.topMembers;
       if (tgroupId != null) {
          i1 = tgroupId.hashCode();
       }
       tgroupId = this.groupExtraSetting;
       return (((i + i1) * 31) + (int)(tgroupId ^ (tgroupId >> 32)));
    }
    public final boolean isMuteAll(){
       return this.isMuteAll;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KrnGroupInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnGroupInfo\(role="+this.role+", groupJoinMode="+this.groupJoinMode+", groupId="+this.groupId+", maxManagerCount="+this.maxManagerCount+", isMuteAll="+this.isMuteAll+", invitePermissionType="+this.invitePermissionType+", groupNumber="+this.groupNumber+", groupHeadUrl="+this.groupHeadUrl+", joinPermission="+this.joinPermission+", groupName="+this.groupName+", description="+this.description+", nickName="+this.nickName+", groupType="+this.groupType+", tag="+this.tag+", masterId="+this.masterId+", memberCount="+this.memberCount+", groupBackName="+this.groupBackName+", inviterUid="+this.inviterUid+", forbiddenState="+this.forbiddenState+", maxMemberCount="+this.maxMemberCount+", groupOriginHeadUrl="+this.groupOriginHeadUrl+", topMembers="+this.topMembers+", groupExtraSetting="+this.groupExtraSetting+"\)";
    }
}
