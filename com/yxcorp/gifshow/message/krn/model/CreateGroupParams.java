package com.yxcorp.gifshow.message.krn.model.CreateGroupParams;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CreateGroupParams implements Serializable	// class@001d7b
{
    public final String groupHeadUrl;
    public final String groupLocation;
    public final String groupName;
    public final String introduction;
    public final String poiId;
    public final String subCategoryId;

    public void CreateGroupParams(String p0,String p1,String p2,String p3,String p4,String p5){
       super();
       this.subCategoryId = p0;
       this.groupName = p1;
       this.groupHeadUrl = p2;
       this.introduction = p3;
       this.groupLocation = p4;
       this.poiId = p5;
    }
    public static CreateGroupParams copy$default(CreateGroupParams p0,String p1,String p2,String p3,String p4,String p5,String p6,int p7,Object p8){
       CreateGroupParams subCategoryI;
       CreateGroupParams groupName;
       CreateGroupParams groupHeadUrl;
       CreateGroupParams introduction;
       CreateGroupParams groupLocatio;
       CreateGroupParams poiId;
       if (p7 & 0x01) {
          subCategoryI = p0.subCategoryId;
       }
       if (p7 & 0x02) {
          groupName = p0.groupName;
       }
       p8 = groupName;
       if (p7 & 0x04) {
          groupHeadUrl = p0.groupHeadUrl;
       }
       CreateGroupParams uCreateGroup = groupHeadUrl;
       if (p7 & 0x08) {
          introduction = p0.introduction;
       }
       CreateGroupParams uCreateGroup1 = introduction;
       if (p7 & 0x10) {
          groupLocatio = p0.groupLocation;
       }
       CreateGroupParams uCreateGroup2 = groupLocatio;
       if (p7 & 0x20) {
          poiId = p0.poiId;
       }
       return p0.copy(subCategoryI, p8, uCreateGroup, uCreateGroup1, uCreateGroup2, poiId);
    }
    public final String component1(){
       return this.subCategoryId;
    }
    public final String component2(){
       return this.groupName;
    }
    public final String component3(){
       return this.groupHeadUrl;
    }
    public final String component4(){
       return this.introduction;
    }
    public final String component5(){
       return this.groupLocation;
    }
    public final String component6(){
       return this.poiId;
    }
    public final CreateGroupParams copy(String p0,String p1,String p2,String p3,String p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(CreateGroupParams.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, CreateGroupParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       CreateGroupParams uCreateGroup = new CreateGroupParams(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CreateGroupParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CreateGroupParams && (a.g(this.subCategoryId, p0.subCategoryId) && (a.g(this.groupName, p0.groupName) && (a.g(this.groupHeadUrl, p0.groupHeadUrl) && (a.g(this.introduction, p0.introduction) && (a.g(this.groupLocation, p0.groupLocation) && a.g(this.poiId, p0.poiId)))))))) {
          return true;
       }
       return false;
    }
    public final String getGroupHeadUrl(){
       return this.groupHeadUrl;
    }
    public final String getGroupLocation(){
       return this.groupLocation;
    }
    public final String getGroupName(){
       return this.groupName;
    }
    public final String getIntroduction(){
       return this.introduction;
    }
    public final String getPoiId(){
       return this.poiId;
    }
    public final String getSubCategoryId(){
       return this.subCategoryId;
    }
    public int hashCode(){
       CreateGroupParams obj = PatchProxy.apply(null, this, CreateGroupParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subCategoryId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CreateGroupParams tgroupName = this.groupName;
       int i2 = (tgroupName != null)? tgroupName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupName = this.groupHeadUrl;
       i2 = (tgroupName != null)? tgroupName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupName = this.introduction;
       i2 = (tgroupName != null)? tgroupName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupName = this.groupLocation;
       i2 = (tgroupName != null)? tgroupName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupName = this.poiId;
       if (tgroupName != null) {
          i = tgroupName.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CreateGroupParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CreateGroupParams\(subCategoryId="+this.subCategoryId+", groupName="+this.groupName+", groupHeadUrl="+this.groupHeadUrl+", introduction="+this.introduction+", groupLocation="+this.groupLocation+", poiId="+this.poiId+"\)";
    }
}
