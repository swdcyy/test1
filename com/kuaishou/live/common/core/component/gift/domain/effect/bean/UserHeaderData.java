package com.kuaishou.live.common.core.component.gift.domain.effect.bean.UserHeaderData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UserHeaderData implements Serializable	// class@0011ad
{
    public final String path;
    public final String userId;

    public void UserHeaderData(String p0,String p1){
       a.p(p0, "userId");
       a.p(p1, "path");
       super();
       this.userId = p0;
       this.path = p1;
    }
    public static UserHeaderData copy$default(UserHeaderData p0,String p1,String p2,int p3,Object p4){
       UserHeaderData userId;
       UserHeaderData path;
       if (p3 & 0x01) {
          userId = p0.userId;
       }
       if (p3 & 0x02) {
          path = p0.path;
       }
       return p0.copy(userId, path);
    }
    public final String component1(){
       return this.userId;
    }
    public final String component2(){
       return this.path;
    }
    public final UserHeaderData copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, UserHeaderData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       a.p(p1, "path");
       return new UserHeaderData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserHeaderData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UserHeaderData && (a.g(this.userId, p0.userId) && a.g(this.path, p0.path)))) {
          return true;
       }
       return false;
    }
    public final String getPath(){
       return this.path;
    }
    public final String getUserId(){
       return this.userId;
    }
    public int hashCode(){
       UserHeaderData obj = PatchProxy.apply(null, this, UserHeaderData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       UserHeaderData tpath = this.path;
       if (tpath != null) {
          i = tpath.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UserHeaderData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UserHeaderData\(userId="+this.userId+", path="+this.path+"\)";
    }
}
