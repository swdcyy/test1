package com.kuaishou.live.core.show.redpacket.richcard.core.model.BottomBarInfo;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.UnusedStyle;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.UsingStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BottomBarInfo	// class@000f71
{
    public final UnusedStyle unusedStyle;
    public final UsingStyle usingStyle;

    public final UnusedStyle a(){
       return this.unusedStyle;
    }
    public final UsingStyle b(){
       return this.usingStyle;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomBarInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BottomBarInfo && (a.g(this.unusedStyle, p0.unusedStyle) && a.g(this.usingStyle, p0.usingStyle)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       BottomBarInfo obj = PatchProxy.apply(null, this, BottomBarInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.unusedStyle;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       BottomBarInfo tusingStyle = this.usingStyle;
       if (tusingStyle != null) {
          i = tusingStyle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BottomBarInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BottomBarInfo\(unusedStyle="+this.unusedStyle+", usingStyle="+this.usingStyle+"\)";
    }
}
