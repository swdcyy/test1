package com.kuaishou.live.core.show.redpacket.richcard.core.model.UnusedStyle;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.RightButton;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.BackgroundColor;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class UnusedStyle	// class@000f76
{
    public final BackgroundColor backgroundColor;
    public final CDNUrl[] leftIconUrls;
    public final RightButton rightButton;
    public final String textColor;

    public final CDNUrl[] a(){
       return this.leftIconUrls;
    }
    public final RightButton b(){
       return this.rightButton;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UnusedStyle.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UnusedStyle && (a.g(this.backgroundColor, p0.backgroundColor) && (a.g(this.leftIconUrls, p0.leftIconUrls) && (a.g(this.textColor, p0.textColor) && a.g(this.rightButton, p0.rightButton)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UnusedStyle obj = PatchProxy.apply(null, this, UnusedStyle.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.backgroundColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       UnusedStyle tleftIconUrl = this.leftIconUrls;
       int i2 = (tleftIconUrl != null)? Arrays.hashCode(tleftIconUrl): 0;
       i1 = (i1 + i2) * 31;
       tleftIconUrl = this.textColor;
       i2 = (tleftIconUrl != null)? tleftIconUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tleftIconUrl = this.rightButton;
       if (tleftIconUrl != null) {
          i = tleftIconUrl.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UnusedStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UnusedStyle\(backgroundColor="+this.backgroundColor+", leftIconUrls="+Arrays.toString(this.leftIconUrls)+", textColor="+this.textColor+", rightButton="+this.rightButton+"\)";
    }
}
