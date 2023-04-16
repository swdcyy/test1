package com.kuaishou.live.common.core.component.gift.data.giftbox.UIBorder;
import java.lang.String;
import java.lang.Integer;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UIBorder	// class@00114f
{
    public final String borderColor;
    public final Integer borderMarqueeSpeed;
    public final int borderStyle;
    public final Integer borderWidthDp;

    public void UIBorder(){
       super(0, null, null, null, 15, null);
    }
    public void UIBorder(int p0,String p1,Integer p2,Integer p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = 1;
       }
       super();
       this.borderStyle = p0;
       this.borderColor = null;
       this.borderWidthDp = null;
       this.borderMarqueeSpeed = null;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIBorder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UIBorder && (this.borderStyle == p0.borderStyle && (a.g(this.borderColor, p0.borderColor) && (a.g(this.borderWidthDp, p0.borderWidthDp) && a.g(this.borderMarqueeSpeed, p0.borderMarqueeSpeed)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, UIBorder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.borderStyle * 31;
       UIBorder tborderColor = this.borderColor;
       int i1 = 0;
       int i2 = (tborderColor != null)? tborderColor.hashCode(): 0;
       i = (i + i2) * 31;
       tborderColor = this.borderWidthDp;
       i2 = (tborderColor != null)? tborderColor.hashCode(): 0;
       i = (i + i2) * 31;
       tborderColor = this.borderMarqueeSpeed;
       if (tborderColor != null) {
          i1 = tborderColor.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UIBorder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIBorder\(borderStyle="+this.borderStyle+", borderColor="+this.borderColor+", borderWidthDp="+this.borderWidthDp+", borderMarqueeSpeed="+this.borderMarqueeSpeed+"\)";
    }
}
