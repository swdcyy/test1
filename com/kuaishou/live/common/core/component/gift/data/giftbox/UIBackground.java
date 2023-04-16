package com.kuaishou.live.common.core.component.gift.data.giftbox.UIBackground;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UICorner;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UIBackground	// class@00114e
{
    public final String bgColor;
    public final List bgGradientColorList;
    public final UIImage bgImage;
    public final int bgStyle;
    public final UICorner corner;

    public void UIBackground(){
       super(0, null, null, null, null, 31, null);
    }
    public void UIBackground(int p0,String p1,List p2,UIImage p3,UICorner p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = 0;
       }
       if (p5 & 0x02) {
          p1 = null;
       }
       if (p5 & 0x10) {
          p4 = null;
       }
       super();
       this.bgStyle = p0;
       this.bgColor = p1;
       this.bgGradientColorList = null;
       this.bgImage = null;
       this.corner = p4;
       return;
    }
    public final String a(){
       return this.bgColor;
    }
    public final UICorner b(){
       return this.corner;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIBackground.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UIBackground && (this.bgStyle == p0.bgStyle && (a.g(this.bgColor, p0.bgColor) && (a.g(this.bgGradientColorList, p0.bgGradientColorList) && (a.g(this.bgImage, p0.bgImage) && a.g(this.corner, p0.corner))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, UIBackground.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.bgStyle * 31;
       UIBackground tbgColor = this.bgColor;
       int i1 = 0;
       int i2 = (tbgColor != null)? tbgColor.hashCode(): 0;
       i = (i + i2) * 31;
       tbgColor = this.bgGradientColorList;
       i2 = (tbgColor != null)? tbgColor.hashCode(): 0;
       i = (i + i2) * 31;
       tbgColor = this.bgImage;
       i2 = (tbgColor != null)? tbgColor.hashCode(): 0;
       i = (i + i2) * 31;
       tbgColor = this.corner;
       if (tbgColor != null) {
          i1 = tbgColor.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UIBackground.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIBackground\(bgStyle="+this.bgStyle+", bgColor="+this.bgColor+", bgGradientColorList="+this.bgGradientColorList+", bgImage="+this.bgImage+", corner="+this.corner+"\)";
    }
}
