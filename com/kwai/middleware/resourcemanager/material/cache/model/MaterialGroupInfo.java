package com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import cb7.b;
import java.io.Serializable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo$a;
import nsd.u;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class MaterialGroupInfo implements b, Serializable	// class@000f54
{
    public List detailInfoList;
    public String groupId;
    public String groupName;
    public Integer groupRank;
    public Integer groupType;
    public List simpleInfoList;
    public long version;
    public static final MaterialGroupInfo$a Companion;
    public static final long serialVersionUID;

    static {
       MaterialGroupInfo.Companion = new MaterialGroupInfo$a(null);
    }
    public void MaterialGroupInfo(){
       super(null, null, null, null, null, 0, 63, null);
    }
    public void MaterialGroupInfo(Integer p0,Integer p1,String p2,String p3,List p4,long p5){
       super();
       this.groupType = p0;
       this.groupRank = p1;
       this.groupId = p2;
       this.groupName = p3;
       this.simpleInfoList = p4;
       this.version = p5;
    }
    public void MaterialGroupInfo(Integer p0,Integer p1,String p2,String p3,List p4,long p5,int p6,u p7){
       int i = 0;
       int i1 = (p6 & 0x01)? i: p0;
       int i2 = (p6 & 0x02)? i: p1;
       int i3 = (p6 & 0x04)? i: p2;
       int i4 = (p6 & 0x08)? i: p3;
       if (!(p6 & 0x10)) {
          i = p4;
       }
       if (p6 & 0x20) {
          p5 = 0;
       }
       super(i1, i2, i3, i4, i, p5);
       return;
    }
    public static MaterialGroupInfo copy$default(MaterialGroupInfo p0,Integer p1,Integer p2,String p3,String p4,List p5,long p6,int p7,Object p8){
       MaterialGroupInfo groupType;
       MaterialGroupInfo groupRank;
       MaterialGroupInfo version;
       if (p7 & 0x01) {
          groupType = p0.groupType;
       }
       if (p7 & 0x02) {
          groupRank = p0.groupRank;
       }
       p8 = groupRank;
       if (p7 & 0x04) {
          p3 = p0.getGroupId();
       }
       String str = p3;
       if (p7 & 0x08) {
          p4 = p0.getGroupName();
       }
       String str1 = p4;
       if (p7 & 0x10) {
          p5 = p0.getSimpleInfoList();
       }
       List list = p5;
       if (p7 & 0x20) {
          version = p0.version;
       }
       return p0.copy(groupType, p8, str, str1, list, version);
    }
    public final Integer component1(){
       return this.groupType;
    }
    public final Integer component2(){
       return this.groupRank;
    }
    public final String component3(){
       return this.getGroupId();
    }
    public final String component4(){
       return this.getGroupName();
    }
    public final List component5(){
       return this.getSimpleInfoList();
    }
    public final long component6(){
       return this.version;
    }
    public final MaterialGroupInfo copy(Integer p0,Integer p1,String p2,String p3,List p4,long p5){
       MaterialGroupInfo materialGrou = new MaterialGroupInfo(p0, p1, p2, p3, p4, p5);
       return v8;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof MaterialGroupInfo && (a.g(this.groupType, p0.groupType) && (a.g(this.groupRank, p0.groupRank) && (a.g(this.getGroupId(), p0.getGroupId()) && (a.g(this.getGroupName(), p0.getGroupName()) && (a.g(this.getSimpleInfoList(), p0.getSimpleInfoList()) && !this.version - p0.version))))))) {
          return true;
       }
       return false;
    }
    public List getDetailInfoList(){
       return this.detailInfoList;
    }
    public String getGroupId(){
       return this.groupId;
    }
    public String getGroupName(){
       return this.groupName;
    }
    public final Integer getGroupRank(){
       return this.groupRank;
    }
    public final Integer getGroupType(){
       return this.groupType;
    }
    public List getSimpleInfoList(){
       return this.simpleInfoList;
    }
    public final long getVersion(){
       return this.version;
    }
    public int hashCode(){
       MaterialGroupInfo tgroupType = this.groupType;
       int i = 0;
       int i1 = (tgroupType != null)? tgroupType.hashCode(): 0;
       i1 = i1 * 31;
       MaterialGroupInfo tgroupRank = this.groupRank;
       int i2 = (tgroupRank != null)? tgroupRank.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       String groupId = this.getGroupId();
       i2 = (groupId != null)? groupId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       groupId = this.getGroupName();
       i2 = (groupId != null)? groupId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       List simpleInfoLi = this.getSimpleInfoList();
       if (simpleInfoLi != null) {
          i = simpleInfoLi.hashCode();
       }
       MaterialGroupInfo tversion = this.version;
       return (((i1 + i) * 31) + (int)(tversion ^ (tversion >> 32)));
    }
    public void setDetailInfoList(List p0){
       this.detailInfoList = p0;
    }
    public void setGroupId(String p0){
       this.groupId = p0;
    }
    public void setGroupName(String p0){
       this.groupName = p0;
    }
    public final void setGroupRank(Integer p0){
       this.groupRank = p0;
    }
    public final void setGroupType(Integer p0){
       this.groupType = p0;
    }
    public void setSimpleInfoList(List p0){
       this.simpleInfoList = p0;
    }
    public final void setVersion(long p0){
       this.version = p0;
    }
    public String toString(){
       return "MaterialGroupInfo\(groupType="+this.groupType+", groupRank="+this.groupRank+", groupId="+this.getGroupId()+", groupName="+this.getGroupName()+", simpleInfoList="+this.getSimpleInfoList()+", version="+this.version+"\)";
    }
}
