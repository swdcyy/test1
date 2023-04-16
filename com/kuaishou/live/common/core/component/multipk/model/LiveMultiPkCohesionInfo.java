package com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkCohesionInfo;
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

public final class LiveMultiPkCohesionInfo	// class@00164a
{
    public int[] giftIdList;

    public void LiveMultiPkCohesionInfo(){
       super(null);
    }
    public void LiveMultiPkCohesionInfo(int[] p0){
       super();
       this.giftIdList = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkCohesionInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiPkCohesionInfo && a.g(this.giftIdList, p0.giftIdList))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveMultiPkCohesionInfo obj = PatchProxy.apply(null, this, LiveMultiPkCohesionInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.giftIdList;
       int i = (obj != null)? Arrays.hashCode(obj): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkCohesionInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkCohesionInfo\(giftIdList="+Arrays.toString(this.giftIdList)+"\)";
    }
}
