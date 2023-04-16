package com.kuaishou.live.core.show.redpacket.richcard.core.model.UsingStyle;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BackgroundColor;
import java.lang.StringBuilder;

public final class UsingStyle	// class@000f77
{
    public final BackgroundColor backgroundColor;
    public final String bottomTextColor;
    public final String countDownBgColor;
    public final String countDownTextColor;
    public final String rightButtonTextColor;
    public final String topTextColor;

    public final String a(){
       return this.countDownBgColor;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UsingStyle.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UsingStyle && (a.g(this.backgroundColor, p0.backgroundColor) && (a.g(this.topTextColor, p0.topTextColor) && (a.g(this.bottomTextColor, p0.bottomTextColor) && (a.g(this.rightButtonTextColor, p0.rightButtonTextColor) && (a.g(this.countDownTextColor, p0.countDownTextColor) && a.g(this.countDownBgColor, p0.countDownBgColor)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UsingStyle obj = PatchProxy.apply(null, this, UsingStyle.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.backgroundColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       UsingStyle ttopTextColo = this.topTextColor;
       int i2 = (ttopTextColo != null)? ttopTextColo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttopTextColo = this.bottomTextColor;
       i2 = (ttopTextColo != null)? ttopTextColo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttopTextColo = this.rightButtonTextColor;
       i2 = (ttopTextColo != null)? ttopTextColo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttopTextColo = this.countDownTextColor;
       i2 = (ttopTextColo != null)? ttopTextColo.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttopTextColo = this.countDownBgColor;
       if (ttopTextColo != null) {
          i = ttopTextColo.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UsingStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UsingStyle\(backgroundColor="+this.backgroundColor+", topTextColor="+this.topTextColor+", bottomTextColor="+this.bottomTextColor+", rightButtonTextColor="+this.rightButtonTextColor+", countDownTextColor="+this.countDownTextColor+", countDownBgColor="+this.countDownBgColor+"\)";
    }
}
