package com.kuaishou.live.bridge.LiveKrnUserInfoExtra;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveKrnUserInfoExtra	// class@000ddb
{
    public final String mBase64Segments;
    public final List roleInfos;

    public void LiveKrnUserInfoExtra(List p0,String p1){
       super();
       this.roleInfos = p0;
       this.mBase64Segments = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveKrnUserInfoExtra.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveKrnUserInfoExtra && (a.g(this.roleInfos, p0.roleInfos) && a.g(this.mBase64Segments, p0.mBase64Segments)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveKrnUserInfoExtra obj = PatchProxy.apply(null, this, LiveKrnUserInfoExtra.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.roleInfos;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveKrnUserInfoExtra tmBase64Segm = this.mBase64Segments;
       if (tmBase64Segm != null) {
          i = tmBase64Segm.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveKrnUserInfoExtra.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveKrnUserInfoExtra\(roleInfos="+this.roleInfos+", mBase64Segments="+this.mBase64Segments+"\)";
    }
}
