package com.kuaishou.live.common.core.component.gift.data.giftbox.UICorner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UICorner	// class@001150
{
    public final int leftBottomRadiusDp;
    public final int leftTopRadiusDp;
    public final int rightBottomRadiusDp;
    public final int rightTopRadiusDp;

    public void UICorner(){
       super(0, 0, 0, 0);
    }
    public void UICorner(int p0,int p1,int p2,int p3){
       super();
       this.leftTopRadiusDp = p0;
       this.rightTopRadiusDp = p1;
       this.leftBottomRadiusDp = p2;
       this.rightBottomRadiusDp = p3;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof UICorner && (this.leftTopRadiusDp == p0.leftTopRadiusDp && (this.rightTopRadiusDp == p0.rightTopRadiusDp && (this.leftBottomRadiusDp == p0.leftBottomRadiusDp && this.rightBottomRadiusDp == p0.rightBottomRadiusDp))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, UICorner.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((((this.leftTopRadiusDp * 31) + this.rightTopRadiusDp) * 31) + this.leftBottomRadiusDp) * 31) + this.rightBottomRadiusDp);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UICorner.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UICorner\(leftTopRadiusDp="+this.leftTopRadiusDp+", rightTopRadiusDp="+this.rightTopRadiusDp+", leftBottomRadiusDp="+this.leftBottomRadiusDp+", rightBottomRadiusDp="+this.rightBottomRadiusDp+"\)";
    }
}
