package com.yxcorp.plugin.setting.http.response.KnockedDialogInfo;
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

public final class KnockedDialogInfo implements Serializable	// class@0008c5
{
    public final List users;

    public void KnockedDialogInfo(List p0){
       super();
       this.users = p0;
    }
    public static KnockedDialogInfo copy$default(KnockedDialogInfo p0,List p1,int p2,Object p3){
       KnockedDialogInfo users;
       if (p2 & 0x01) {
          users = p0.users;
       }
       return p0.copy(users);
    }
    public final List component1(){
       return this.users;
    }
    public final KnockedDialogInfo copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KnockedDialogInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KnockedDialogInfo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KnockedDialogInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KnockedDialogInfo && a.g(this.users, p0.users))) {
          return true;
       }
       return false;
    }
    public final List getUsers(){
       return this.users;
    }
    public int hashCode(){
       KnockedDialogInfo obj = PatchProxy.apply(null, this, KnockedDialogInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.users;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KnockedDialogInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KnockedDialogInfo\(users="+this.users+"\)";
    }
}
