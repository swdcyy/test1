package com.kuaishou.live.lite.userstatus.LiveRoomVipGradeItemUIInfo;
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

public final class LiveRoomVipGradeItemUIInfo	// class@000b90
{
    public String[] color;
    public int level;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRoomVipGradeItemUIInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveRoomVipGradeItemUIInfo && (a.g(this.color, p0.color) && this.level == p0.level))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveRoomVipGradeItemUIInfo obj = PatchProxy.apply(null, this, LiveRoomVipGradeItemUIInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.color;
       int i = (obj != null)? Arrays.hashCode(obj): 0;
       return ((i * 31) + this.level);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRoomVipGradeItemUIInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRoomVipGradeItemUIInfo\(color="+Arrays.toString(this.color)+", level="+this.level+"\)";
    }
}
