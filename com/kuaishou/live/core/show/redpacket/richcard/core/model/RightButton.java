package com.kuaishou.live.core.show.redpacket.richcard.core.model.RightButton;
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

public final class RightButton	// class@000f75
{
    public final BackgroundColor backgroundColor;
    public final String text;
    public final String textColor;

    public final String a(){
       return this.text;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RightButton.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RightButton && (a.g(this.backgroundColor, p0.backgroundColor) && (a.g(this.text, p0.text) && a.g(this.textColor, p0.textColor))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       RightButton obj = PatchProxy.apply(null, this, RightButton.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.backgroundColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RightButton ttext = this.text;
       int i2 = (ttext != null)? ttext.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttext = this.textColor;
       if (ttext != null) {
          i = ttext.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RightButton.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RightButton\(backgroundColor="+this.backgroundColor+", text="+this.text+", textColor="+this.textColor+"\)";
    }
}
