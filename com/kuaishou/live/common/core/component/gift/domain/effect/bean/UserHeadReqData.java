package com.kuaishou.live.common.core.component.gift.domain.effect.bean.UserHeadReqData;
import java.io.Serializable;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UserHeadReqData implements Serializable	// class@0011ac
{
    public final List userIds;

    public void UserHeadReqData(){
       super(null, 1, null);
    }
    public void UserHeadReqData(List p0){
       a.p(p0, "userIds");
       super();
       this.userIds = p0;
    }
    public void UserHeadReqData(List p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       super(p0);
       return;
    }
    public static UserHeadReqData copy$default(UserHeadReqData p0,List p1,int p2,Object p3){
       UserHeadReqData userIds;
       if (p2 & 0x01) {
          userIds = p0.userIds;
       }
       return p0.copy(userIds);
    }
    public final List component1(){
       return this.userIds;
    }
    public final UserHeadReqData copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserHeadReqData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userIds");
       return new UserHeadReqData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserHeadReqData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UserHeadReqData && a.g(this.userIds, p0.userIds))) {
          return true;
       }
       return false;
    }
    public final List getUserIds(){
       return this.userIds;
    }
    public int hashCode(){
       UserHeadReqData obj = PatchProxy.apply(null, this, UserHeadReqData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userIds;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UserHeadReqData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UserHeadReqData\(userIds="+this.userIds+"\)";
    }
}
