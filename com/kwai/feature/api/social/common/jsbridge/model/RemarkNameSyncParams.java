package com.kwai.feature.api.social.common.jsbridge.model.RemarkNameSyncParams;
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

public final class RemarkNameSyncParams implements Serializable	// class@0010c7
{
    public final String userId;
    public final String userName;

    public void RemarkNameSyncParams(String p0,String p1){
       super();
       this.userId = p0;
       this.userName = p1;
    }
    public static RemarkNameSyncParams copy$default(RemarkNameSyncParams p0,String p1,String p2,int p3,Object p4){
       RemarkNameSyncParams userId;
       RemarkNameSyncParams userName;
       if (p3 & 0x01) {
          userId = p0.userId;
       }
       if (p3 & 0x02) {
          userName = p0.userName;
       }
       return p0.copy(userId, userName);
    }
    public final String component1(){
       return this.userId;
    }
    public final String component2(){
       return this.userName;
    }
    public final RemarkNameSyncParams copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RemarkNameSyncParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RemarkNameSyncParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RemarkNameSyncParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RemarkNameSyncParams && (a.g(this.userId, p0.userId) && a.g(this.userName, p0.userName)))) {
          return true;
       }
       return false;
    }
    public final String getUserId(){
       return this.userId;
    }
    public final String getUserName(){
       return this.userName;
    }
    public int hashCode(){
       RemarkNameSyncParams obj = PatchProxy.apply(null, this, RemarkNameSyncParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RemarkNameSyncParams tuserName = this.userName;
       if (tuserName != null) {
          i = tuserName.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RemarkNameSyncParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RemarkNameSyncParams\(userId="+this.userId+", userName="+this.userName+"\)";
    }
}
