package com.kuaishou.live.lite.userstatus.LiteRoomVipConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class LiteRoomVipConfig	// class@000b8c
{
    public boolean disableAuthorRoomVip;
    public boolean enableRoomVipWatchingList;
    public LiveRoomVipGradeItemUIInfo[] liveRoomVipGrade;

    public final boolean a(){
       return this.disableAuthorRoomVip;
    }
    public final boolean b(){
       return this.enableRoomVipWatchingList;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteRoomVipConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiteRoomVipConfig && (this.disableAuthorRoomVip == p0.disableAuthorRoomVip && (this.enableRoomVipWatchingList == p0.enableRoomVipWatchingList && a.g(this.liveRoomVipGrade, p0.liveRoomVipGrade))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       LiteRoomVipConfig tliveRoomVip;
       LiteRoomVipConfig obj = PatchProxy.apply(null, this, LiteRoomVipConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.disableAuthorRoomVip;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       LiteRoomVipConfig tenableRoomV = this.enableRoomVipWatchingList;
       if (tenableRoomV == null) {
          tliveRoomVip = tenableRoomV;
       }
       i1 = (i1 + i) * 31;
       tliveRoomVip = this.liveRoomVipGrade;
       i = (tliveRoomVip != null)? Arrays.hashCode(tliveRoomVip): 0;
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiteRoomVipConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiteRoomVipConfig\(disableAuthorRoomVip="+this.disableAuthorRoomVip+", enableRoomVipWatchingList="+this.enableRoomVipWatchingList+", liveRoomVipGrade="+Arrays.toString(this.liveRoomVipGrade)+"\)";
    }
}
