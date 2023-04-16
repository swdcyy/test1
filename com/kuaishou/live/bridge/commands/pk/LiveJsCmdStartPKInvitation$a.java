package com.kuaishou.live.bridge.commands.pk.LiveJsCmdStartPKInvitation$a;
import com.kuaishou.live.bridge.commands.pk.LiveJsCmdStartPKInvitation$PkInviteInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdStartPKInvitation$a	// class@000e29
{
    public final String extraInfo;
    public final LiveJsCmdStartPKInvitation$PkInviteInfo pkInviteInfo;

    public final LiveJsCmdStartPKInvitation$PkInviteInfo a(){
       return this.pkInviteInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdStartPKInvitation$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdStartPKInvitation$a && (a.g(this.pkInviteInfo, p0.pkInviteInfo) && a.g(this.extraInfo, p0.extraInfo)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdStartPKInvitation$a obj = PatchProxy.apply(null, this, LiveJsCmdStartPKInvitation$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.pkInviteInfo;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdStartPKInvitation$a textraInfo = this.extraInfo;
       if (textraInfo != null) {
          i = textraInfo.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdStartPKInvitation$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(pkInviteInfo="+this.pkInviteInfo+", extraInfo="+this.extraInfo+"\)";
    }
}
