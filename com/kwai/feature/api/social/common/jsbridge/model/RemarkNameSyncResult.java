package com.kwai.feature.api.social.common.jsbridge.model.RemarkNameSyncResult;
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

public final class RemarkNameSyncResult implements Serializable	// class@0010c8
{
    public final String remarkName;

    public void RemarkNameSyncResult(String p0){
       super();
       this.remarkName = p0;
    }
    public static RemarkNameSyncResult copy$default(RemarkNameSyncResult p0,String p1,int p2,Object p3){
       RemarkNameSyncResult remarkName;
       if (p2 & 0x01) {
          remarkName = p0.remarkName;
       }
       return p0.copy(remarkName);
    }
    public final String component1(){
       return this.remarkName;
    }
    public final RemarkNameSyncResult copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RemarkNameSyncResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RemarkNameSyncResult(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RemarkNameSyncResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RemarkNameSyncResult && a.g(this.remarkName, p0.remarkName))) {
          return true;
       }
       return false;
    }
    public final String getRemarkName(){
       return this.remarkName;
    }
    public int hashCode(){
       RemarkNameSyncResult obj = PatchProxy.apply(null, this, RemarkNameSyncResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.remarkName;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RemarkNameSyncResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RemarkNameSyncResult\(remarkName="+this.remarkName+"\)";
    }
}
