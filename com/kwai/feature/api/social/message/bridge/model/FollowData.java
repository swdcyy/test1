package com.kwai.feature.api.social.message.bridge.model.FollowData;
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

public final class FollowData implements Serializable	// class@00111d
{
    public final List users;

    public void FollowData(List p0){
       super();
       this.users = p0;
    }
    public static FollowData copy$default(FollowData p0,List p1,int p2,Object p3){
       FollowData users;
       if (p2 & 0x01) {
          users = p0.users;
       }
       return p0.copy(users);
    }
    public final List component1(){
       return this.users;
    }
    public final FollowData copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FollowData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FollowData && a.g(this.users, p0.users))) {
          return true;
       }
       return false;
    }
    public final List getUsers(){
       return this.users;
    }
    public int hashCode(){
       FollowData obj = PatchProxy.apply(null, this, FollowData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.users;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowData\(users="+this.users+"\)";
    }
}
