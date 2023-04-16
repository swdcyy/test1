package com.kuaishou.live.common.core.component.gift.domain.effect.bean.UserHeadAckData;
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

public final class UserHeadAckData implements Serializable	// class@0011ab
{
    public final List userHeaders;

    public void UserHeadAckData(){
       super(null, 1, null);
    }
    public void UserHeadAckData(List p0){
       a.p(p0, "userHeaders");
       super();
       this.userHeaders = p0;
    }
    public void UserHeadAckData(List p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = CollectionsKt__CollectionsKt.E();
       }
       super(p0);
       return;
    }
    public static UserHeadAckData copy$default(UserHeadAckData p0,List p1,int p2,Object p3){
       UserHeadAckData userHeaders;
       if (p2 & 0x01) {
          userHeaders = p0.userHeaders;
       }
       return p0.copy(userHeaders);
    }
    public final List component1(){
       return this.userHeaders;
    }
    public final UserHeadAckData copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserHeadAckData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userHeaders");
       return new UserHeadAckData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserHeadAckData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UserHeadAckData && a.g(this.userHeaders, p0.userHeaders))) {
          return true;
       }
       return false;
    }
    public final List getUserHeaders(){
       return this.userHeaders;
    }
    public int hashCode(){
       UserHeadAckData obj = PatchProxy.apply(null, this, UserHeadAckData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userHeaders;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UserHeadAckData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UserHeadAckData\(userHeaders="+this.userHeaders+"\)";
    }
}
