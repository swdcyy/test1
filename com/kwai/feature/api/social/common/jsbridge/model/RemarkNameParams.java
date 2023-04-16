package com.kwai.feature.api.social.common.jsbridge.model.RemarkNameParams;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RemarkNameParams implements Serializable	// class@0010c6
{
    public final List userIds;

    public void RemarkNameParams(List p0){
       super();
       this.userIds = p0;
    }
    public static RemarkNameParams copy$default(RemarkNameParams p0,List p1,int p2,Object p3){
       RemarkNameParams userIds;
       if (p2 & 0x01) {
          userIds = p0.userIds;
       }
       return p0.copy(userIds);
    }
    public final List component1(){
       return this.userIds;
    }
    public final RemarkNameParams copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RemarkNameParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RemarkNameParams(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RemarkNameParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RemarkNameParams && a.g(this.userIds, p0.userIds))) {
          return true;
       }
       return false;
    }
    public final List getUserIds(){
       return this.userIds;
    }
    public int hashCode(){
       RemarkNameParams obj = PatchProxy.apply(null, this, RemarkNameParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userIds;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RemarkNameParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RemarkNameParams\(userIds="+this.userIds+"\)";
    }
}
