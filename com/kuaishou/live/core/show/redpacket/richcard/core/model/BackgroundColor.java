package com.kuaishou.live.core.show.redpacket.richcard.core.model.BackgroundColor;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BackgroundColor	// class@000f70
{
    public final String endColor;
    public final boolean isLeftToRight;
    public final String startColor;

    public final String a(){
       return this.endColor;
    }
    public final String b(){
       return this.startColor;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BackgroundColor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BackgroundColor && (this.isLeftToRight == p0.isLeftToRight && (a.g(this.startColor, p0.startColor) && a.g(this.endColor, p0.endColor))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       BackgroundColor obj = PatchProxy.apply(null, this, BackgroundColor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.isLeftToRight;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       BackgroundColor tstartColor = this.startColor;
       int i1 = 0;
       int i2 = (tstartColor != null)? tstartColor.hashCode(): 0;
       i = (i + i2) * 31;
       tstartColor = this.endColor;
       if (tstartColor != null) {
          i1 = tstartColor.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BackgroundColor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BackgroundColor\(isLeftToRight="+this.isLeftToRight+", startColor="+this.startColor+", endColor="+this.endColor+"\)";
    }
}
