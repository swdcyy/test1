package com.kuaishou.live.common.core.component.gift.data.giftbox.UIImageLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UIImageLabel	// class@001154
{
    public final UIImage img;
    public final int maxLabelWidthDp;

    public void UIImageLabel(){
       super(null, 0, 3, null);
    }
    public void UIImageLabel(UIImage p0,int p1){
       a.p(p0, "img");
       super();
       this.img = p0;
       this.maxLabelWidthDp = p1;
    }
    public void UIImageLabel(UIImage p0,int p1,int p2,u p3){
       if (p2 & 0x01) {
          UIImage uIImage = new UIImage(null, 0, false, 7, null);
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public final UIImage a(){
       return this.img;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIImageLabel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UIImageLabel && (a.g(this.img, p0.img) && this.maxLabelWidthDp == p0.maxLabelWidthDp))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UIImageLabel obj = PatchProxy.apply(null, this, UIImageLabel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.img;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.maxLabelWidthDp);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UIImageLabel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIImageLabel\(img="+this.img+", maxLabelWidthDp="+this.maxLabelWidthDp+"\)";
    }
}
