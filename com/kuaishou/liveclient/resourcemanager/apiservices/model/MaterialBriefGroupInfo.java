package com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefGroupInfo;
import java.io.Serializable;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefGroupInfo$a;
import nsd.u;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefGroupExtraInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MaterialBriefGroupInfo implements Serializable	// class@00105b
{
    public List briefInfoList;
    public MaterialBriefGroupExtraInfo extraInfo;
    public String groupId;
    public String groupName;
    public Integer groupRank;
    public Integer groupType;
    public List simpleInfoList;
    public long version;
    public static final MaterialBriefGroupInfo$a Companion;
    public static final long serialVersionUID;

    static {
       MaterialBriefGroupInfo.Companion = new MaterialBriefGroupInfo$a(null);
    }
    public void MaterialBriefGroupInfo(){
       super(null, null, null, null, null, 0, null, 127, null);
    }
    public void MaterialBriefGroupInfo(Integer p0,Integer p1,String p2,String p3,List p4,long p5,MaterialBriefGroupExtraInfo p6){
       super();
       this.groupType = p0;
       this.groupRank = p1;
       this.groupId = p2;
       this.groupName = p3;
       this.simpleInfoList = p4;
       this.version = p5;
       this.extraInfo = p6;
    }
    public void MaterialBriefGroupInfo(Integer p0,Integer p1,String p2,String p3,List p4,long p5,MaterialBriefGroupExtraInfo p6,int p7,u p8){
       int i = 0;
       int i1 = (p7 & 0x01)? i: p0;
       int i2 = (p7 & 0x02)? i: p1;
       int i3 = (p7 & 0x04)? i: p2;
       int i4 = (p7 & 0x08)? i: p3;
       int i5 = (p7 & 0x10)? i: p4;
       int i6 = (p7 & 0x20)? 0: p5;
       if (!(p7 & 0x40)) {
          i = p6;
       }
       super(i1, i2, i3, i4, i5, i6, i);
       return;
    }
    public static MaterialBriefGroupInfo copy$default(MaterialBriefGroupInfo p0,Integer p1,Integer p2,String p3,String p4,List p5,long p6,MaterialBriefGroupExtraInfo p7,int p8,Object p9){
       MaterialBriefGroupInfo materialBrie = p0;
       MaterialBriefGroupInfo groupType = (p8 & 0x01)? materialBrie.groupType: p1;
       MaterialBriefGroupInfo groupRank = (p8 & 0x02)? materialBrie.groupRank: p2;
       MaterialBriefGroupInfo groupId = (p8 & 0x04)? materialBrie.groupId: p3;
       MaterialBriefGroupInfo groupName = (p8 & 0x08)? materialBrie.groupName: p4;
       MaterialBriefGroupInfo simpleInfoLi = (p8 & 0x10)? materialBrie.simpleInfoList: p5;
       MaterialBriefGroupInfo version = (p8 & 0x20)? materialBrie.version: p6;
       MaterialBriefGroupInfo extraInfo = (p8 & 0x40)? materialBrie.extraInfo: p7;
       return p0.copy(groupType, groupRank, groupId, groupName, simpleInfoLi, version, extraInfo);
    }
    public final Integer component1(){
       return this.groupType;
    }
    public final Integer component2(){
       return this.groupRank;
    }
    public final String component3(){
       return this.groupId;
    }
    public final String component4(){
       return this.groupName;
    }
    public final List component5(){
       return this.simpleInfoList;
    }
    public final long component6(){
       return this.version;
    }
    public final MaterialBriefGroupExtraInfo component7(){
       return this.extraInfo;
    }
    public final MaterialBriefGroupInfo copy(Integer p0,Integer p1,String p2,String p3,List p4,long p5,MaterialBriefGroupExtraInfo p6){
       Object obj;
       if (PatchProxy.isSupport(MaterialBriefGroupInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Long.valueOf(p5),p6};
          obj = PatchProxy.apply(objArray, this, MaterialBriefGroupInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       MaterialBriefGroupInfo materialBrie = new MaterialBriefGroupInfo(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MaterialBriefGroupInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MaterialBriefGroupInfo && (a.g(this.groupType, p0.groupType) && (a.g(this.groupRank, p0.groupRank) && (a.g(this.groupId, p0.groupId) && (a.g(this.groupName, p0.groupName) && (a.g(this.simpleInfoList, p0.simpleInfoList) && (!this.version - p0.version && a.g(this.extraInfo, p0.extraInfo))))))))) {
          return true;
       }
       return false;
    }
    public final List getBriefInfoList(){
       return this.briefInfoList;
    }
    public final MaterialBriefGroupExtraInfo getExtraInfo(){
       return this.extraInfo;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public final String getGroupName(){
       return this.groupName;
    }
    public final Integer getGroupRank(){
       return this.groupRank;
    }
    public final Integer getGroupType(){
       return this.groupType;
    }
    public final List getSimpleInfoList(){
       return this.simpleInfoList;
    }
    public final long getVersion(){
       return this.version;
    }
    public int hashCode(){
       MaterialBriefGroupInfo obj = PatchProxy.apply(null, this, MaterialBriefGroupInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MaterialBriefGroupInfo tgroupRank = this.groupRank;
       int i2 = (tgroupRank != null)? tgroupRank.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupRank = this.groupId;
       i2 = (tgroupRank != null)? tgroupRank.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupRank = this.groupName;
       i2 = (tgroupRank != null)? tgroupRank.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupRank = this.simpleInfoList;
       i2 = (tgroupRank != null)? tgroupRank.hashCode(): 0;
       tgroupRank = this.version;
       i1 = (((i1 + i2) * 31) + (int)(tgroupRank ^ (tgroupRank >> 32))) * 31;
       tgroupRank = this.extraInfo;
       if (tgroupRank != null) {
          i = tgroupRank.hashCode();
       }
       return (i1 + i);
    }
    public final void setBriefInfoList(List p0){
       this.briefInfoList = p0;
    }
    public final void setExtraInfo(MaterialBriefGroupExtraInfo p0){
       this.extraInfo = p0;
    }
    public final void setGroupId(String p0){
       this.groupId = p0;
    }
    public final void setGroupName(String p0){
       this.groupName = p0;
    }
    public final void setGroupRank(Integer p0){
       this.groupRank = p0;
    }
    public final void setGroupType(Integer p0){
       this.groupType = p0;
    }
    public final void setSimpleInfoList(List p0){
       this.simpleInfoList = p0;
    }
    public final void setVersion(long p0){
       this.version = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MaterialBriefGroupInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MaterialBriefGroupInfo\(groupType="+this.groupType+", groupRank="+this.groupRank+", groupId="+this.groupId+", groupName="+this.groupName+", simpleInfoList="+this.simpleInfoList+", version="+this.version+", extraInfo="+this.extraInfo+"\)";
    }
}
