package com.kuaishou.live.common.core.component.multipk.oninvite.LiveMultiInteractiveForbidInvitedInfoV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveMultiInteractiveForbidInvitedInfoV2	// class@001651
{
    public int forbidInvitedType;
    public String tipText;

    public final int a(){
       return this.forbidInvitedType;
    }
    public final String b(){
       return this.tipText;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiInteractiveForbidInvitedInfoV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiInteractiveForbidInvitedInfoV2 && (a.g(this.tipText, p0.tipText) && this.forbidInvitedType == p0.forbidInvitedType))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveMultiInteractiveForbidInvitedInfoV2 obj = PatchProxy.apply(null, this, LiveMultiInteractiveForbidInvitedInfoV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.tipText;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.forbidInvitedType);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiInteractiveForbidInvitedInfoV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiInteractiveForbidInvitedInfoV2\(tipText="+this.tipText+", forbidInvitedType="+this.forbidInvitedType+"\)";
    }
}
