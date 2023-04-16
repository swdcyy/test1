package com.kwai.feature.api.social.message.bridge.model.GroupManagerInfo;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GroupManagerInfo implements Serializable	// class@001120
{
    public final String groupId;
    public int maxManagerCount;
    public final List members;
    public int role;

    public void GroupManagerInfo(String p0,int p1,int p2,List p3){
       a.p(p0, "groupId");
       a.p(p3, "members");
       super();
       this.groupId = p0;
       this.maxManagerCount = p1;
       this.role = p2;
       this.members = p3;
    }
    public void GroupManagerInfo(String p0,int p1,int p2,List p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "";
       }
       if (p4 & 0x02) {
          p1 = 0;
       }
       if (p4 & 0x04) {
          p2 = 2;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static GroupManagerInfo copy$default(GroupManagerInfo p0,String p1,int p2,int p3,List p4,int p5,Object p6){
       GroupManagerInfo groupId;
       GroupManagerInfo maxManagerCo;
       GroupManagerInfo role;
       GroupManagerInfo members;
       if (p5 & 0x01) {
          groupId = p0.groupId;
       }
       if (p5 & 0x02) {
          maxManagerCo = p0.maxManagerCount;
       }
       if (p5 & 0x04) {
          role = p0.role;
       }
       if (p5 & 0x08) {
          members = p0.members;
       }
       return p0.copy(groupId, maxManagerCo, role, members);
    }
    public final String component1(){
       return this.groupId;
    }
    public final int component2(){
       return this.maxManagerCount;
    }
    public final int component3(){
       return this.role;
    }
    public final List component4(){
       return this.members;
    }
    public final GroupManagerInfo copy(String p0,int p1,int p2,List p3){
       if (PatchProxy.isSupport(GroupManagerInfo.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, GroupManagerInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "groupId");
       a.p(p3, "members");
       return new GroupManagerInfo(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GroupManagerInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GroupManagerInfo && (a.g(this.groupId, p0.groupId) && (this.maxManagerCount == p0.maxManagerCount && (this.role == p0.role && a.g(this.members, p0.members)))))) {
          return true;
       }
       return false;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public final int getMaxManagerCount(){
       return this.maxManagerCount;
    }
    public final List getMembers(){
       return this.members;
    }
    public final int getRole(){
       return this.role;
    }
    public int hashCode(){
       GroupManagerInfo obj = PatchProxy.apply(null, this, GroupManagerInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.maxManagerCount) * 31) + this.role) * 31;
       GroupManagerInfo tmembers = this.members;
       if (tmembers != null) {
          i = tmembers.hashCode();
       }
       return (i1 + i);
    }
    public final void setMaxManagerCount(int p0){
       this.maxManagerCount = p0;
    }
    public final void setRole(int p0){
       this.role = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GroupManagerInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GroupManagerInfo\(groupId="+this.groupId+", maxManagerCount="+this.maxManagerCount+", role="+this.role+", members="+this.members+"\)";
    }
}
