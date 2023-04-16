package com.kwai.feature.api.social.message.bridge.model.GroupData;
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

public final class GroupData implements Serializable	// class@00111f
{
    public final String groupId;

    public void GroupData(String p0){
       super();
       this.groupId = p0;
    }
    public static GroupData copy$default(GroupData p0,String p1,int p2,Object p3){
       GroupData groupId;
       if (p2 & 0x01) {
          groupId = p0.groupId;
       }
       return p0.copy(groupId);
    }
    public final String component1(){
       return this.groupId;
    }
    public final GroupData copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GroupData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GroupData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GroupData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GroupData && a.g(this.groupId, p0.groupId))) {
          return true;
       }
       return false;
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public int hashCode(){
       GroupData obj = PatchProxy.apply(null, this, GroupData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.groupId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GroupData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GroupData\(groupId="+this.groupId+"\)";
    }
}
