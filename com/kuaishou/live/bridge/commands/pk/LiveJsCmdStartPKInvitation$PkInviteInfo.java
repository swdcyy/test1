package com.kuaishou.live.bridge.commands.pk.LiveJsCmdStartPKInvitation$PkInviteInfo;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdStartPKInvitation$PkInviteInfo	// class@000e28
{
    public final Integer pkInviteSource;
    public final Integer pkInviteType;
    public final String selfLiveStreamId;
    public final UserInfo userInfo;

    public final Integer a(){
       return this.pkInviteSource;
    }
    public final Integer b(){
       return this.pkInviteType;
    }
    public final String c(){
       return this.selfLiveStreamId;
    }
    public final UserInfo d(){
       return this.userInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdStartPKInvitation$PkInviteInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdStartPKInvitation$PkInviteInfo && (a.g(this.userInfo, p0.userInfo) && (a.g(this.selfLiveStreamId, p0.selfLiveStreamId) && (a.g(this.pkInviteType, p0.pkInviteType) && a.g(this.pkInviteSource, p0.pkInviteSource)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdStartPKInvitation$PkInviteInfo obj = PatchProxy.apply(null, this, LiveJsCmdStartPKInvitation$PkInviteInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userInfo;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCmdStartPKInvitation$PkInviteInfo tselfLiveStr = this.selfLiveStreamId;
       int i2 = (tselfLiveStr != null)? tselfLiveStr.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tselfLiveStr = this.pkInviteType;
       i2 = (tselfLiveStr != null)? tselfLiveStr.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tselfLiveStr = this.pkInviteSource;
       if (tselfLiveStr != null) {
          i = tselfLiveStr.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdStartPKInvitation$PkInviteInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PkInviteInfo\(userInfo="+this.userInfo+", selfLiveStreamId="+this.selfLiveStreamId+", pkInviteType="+this.pkInviteType+", pkInviteSource="+this.pkInviteSource+"\)";
    }
}
