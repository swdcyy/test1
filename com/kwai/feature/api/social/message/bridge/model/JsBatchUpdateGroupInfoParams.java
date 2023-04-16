package com.kwai.feature.api.social.message.bridge.model.JsBatchUpdateGroupInfoParams;
import java.io.Serializable;
import java.lang.String;
import com.kwai.imsdk.internal.db.GroupLocation;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JsBatchUpdateGroupInfoParams implements Serializable	// class@001123
{
    public final String brief;
    public final String callback;
    public final String groupHeadUrl;
    public final String groupId;
    public final GroupLocation groupLocation;
    public final String groupName;
    public final String tag;

    public void JsBatchUpdateGroupInfoParams(String p0,String p1,String p2,String p3,GroupLocation p4,String p5,String p6){
       super();
       this.groupId = p0;
       this.groupName = p1;
       this.groupHeadUrl = p2;
       this.tag = p3;
       this.groupLocation = p4;
       this.brief = p5;
       this.callback = p6;
    }
    public static JsBatchUpdateGroupInfoParams copy$default(JsBatchUpdateGroupInfoParams p0,String p1,String p2,String p3,String p4,GroupLocation p5,String p6,String p7,int p8,Object p9){
       JsBatchUpdateGroupInfoParams groupId;
       JsBatchUpdateGroupInfoParams groupName;
       JsBatchUpdateGroupInfoParams groupHeadUrl;
       JsBatchUpdateGroupInfoParams tag;
       JsBatchUpdateGroupInfoParams groupLocatio;
       JsBatchUpdateGroupInfoParams brief;
       JsBatchUpdateGroupInfoParams callback;
       if (p8 & 0x01) {
          groupId = p0.groupId;
       }
       if (p8 & 0x02) {
          groupName = p0.groupName;
       }
       p9 = groupName;
       if (p8 & 0x04) {
          groupHeadUrl = p0.groupHeadUrl;
       }
       JsBatchUpdateGroupInfoParams jsBatchUpdat = groupHeadUrl;
       if (p8 & 0x08) {
          tag = p0.tag;
       }
       JsBatchUpdateGroupInfoParams jsBatchUpdat1 = tag;
       if (p8 & 0x10) {
          groupLocatio = p0.groupLocation;
       }
       JsBatchUpdateGroupInfoParams jsBatchUpdat2 = groupLocatio;
       if (p8 & 0x20) {
          brief = p0.brief;
       }
       JsBatchUpdateGroupInfoParams jsBatchUpdat3 = brief;
       if (p8 & 0x40) {
          callback = p0.callback;
       }
       return p0.copy(groupId, p9, jsBatchUpdat, jsBatchUpdat1, jsBatchUpdat2, jsBatchUpdat3, callback);
    }
    public final String component1(){
       return this.groupId;
    }
    public final String component2(){
       return this.groupName;
    }
    public final String component3(){
       return this.groupHeadUrl;
    }
    public final String component4(){
       return this.tag;
    }
    public final GroupLocation component5(){
       return this.groupLocation;
    }
    public final String component6(){
       return this.brief;
    }
    public final String component7(){
       return this.callback;
    }
    public final JsBatchUpdateGroupInfoParams copy(String p0,String p1,String p2,String p3,GroupLocation p4,String p5,String p6){
       Object obj;
       if (PatchProxy.isSupport(JsBatchUpdateGroupInfoParams.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          obj = PatchProxy.apply(objArray, this, JsBatchUpdateGroupInfoParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       JsBatchUpdateGroupInfoParams jsBatchUpdat = new JsBatchUpdateGroupInfoParams(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsBatchUpdateGroupInfoParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JsBatchUpdateGroupInfoParams && (a.g(this.groupId, p0.groupId) && (a.g(this.groupName, p0.groupName) && (a.g(this.groupHeadUrl, p0.groupHeadUrl) && (a.g(this.tag, p0.tag) && (a.g(this.groupLocation, p0.groupLocation) && (a.g(this.brief, p0.brief) && a.g(this.callback, p0.callback))))))))) {
          return true;
       }
       return false;
    }
    public final String getBrief(){
       return this.brief;
    }
    public final String getCallback(){
       return this.callback;
    }
    public final String getGroupHeadUrl(){
       return this.groupHeadUrl;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public final GroupLocation getGroupLocation(){
       return this.groupLocation;
    }
    public final String getGroupName(){
       return this.groupName;
    }
    public final String getTag(){
       return this.tag;
    }
    public int hashCode(){
       JsBatchUpdateGroupInfoParams obj = PatchProxy.apply(null, this, JsBatchUpdateGroupInfoParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       JsBatchUpdateGroupInfoParams tgroupName = this.groupName;
       int i2 = (tgroupName != null)? tgroupName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupName = this.groupHeadUrl;
       i2 = (tgroupName != null)? tgroupName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupName = this.tag;
       i2 = (tgroupName != null)? tgroupName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupName = this.groupLocation;
       i2 = (tgroupName != null)? tgroupName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupName = this.brief;
       i2 = (tgroupName != null)? tgroupName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupName = this.callback;
       if (tgroupName != null) {
          i = tgroupName.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsBatchUpdateGroupInfoParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsBatchUpdateGroupInfoParams\(groupId="+this.groupId+", groupName="+this.groupName+", groupHeadUrl="+this.groupHeadUrl+", tag="+this.tag+", groupLocation="+this.groupLocation+", brief="+this.brief+", callback="+this.callback+"\)";
    }
}
