package com.kwai.feature.post.api.liveavatar.CoverColor;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CoverColor	// class@0013f5
{
    public final String endColor;
    public final String startColor;

    public void CoverColor(String p0,String p1){
       a.p(p0, "startColor");
       a.p(p1, "endColor");
       super();
       this.startColor = p0;
       this.endColor = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoverColor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CoverColor && (a.g(this.startColor, p0.startColor) && a.g(this.endColor, p0.endColor)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CoverColor obj = PatchProxy.apply(null, this, CoverColor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.startColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CoverColor tendColor = this.endColor;
       if (tendColor != null) {
          i = tendColor.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CoverColor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CoverColor\(startColor="+this.startColor+", endColor="+this.endColor+"\)";
    }
}
