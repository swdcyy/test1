package ch1.f;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import java.util.List;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIBackground;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UICorner;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIBorder;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f	// class@0004b9
{
    public final List markLabelList;
    public final UIBackground selectedBackground;
    public final UIBorder selectedBorder;
    public final UIImage selectedGiftIcon;
    public final UIText selectedTextLine1;
    public final UIText selectedTextLine2;
    public final UIText unSelectedTextLine2;
    public final UIBackground unselectedBackground;
    public final UIBorder unselectedBorder;
    public final UIImage unselectedGiftIcon;
    public final UIText unselectedTextLine1;

    public void f(){
       UIImage uIImage = new UIImage(null, 0, false, 7, null);
       UIImage uIImage1 = new UIImage(null, 0, false, 7, null);
       UIBackground uIBackground = new UIBackground(0, null, null, null, null, 31, null);
       UIBackground uIBackground1 = new UIBackground(0, null, null, null, null, 31, null);
       UIBorder uIBorder = new UIBorder(0, null, null, null, 15, null);
       UIBorder uIBorder1 = new UIBorder(0, null, null, null, 15, null);
       UIText uIText = new UIText(0, 0, null, null, 15, null);
       UIText uIText1 = new UIText(0, 0, null, null, 15, null);
       UIText uIText2 = new UIText(0, 0, null, null, 15, null);
       uIText1 = new UIText(0, 0, null, null, 15, null);
       UIImage uIImage2 = v6;
       UIBorder uIBorder2 = uIBorder;
       super(uIImage2, v2, v3, v4, v5, uIBorder2, v15, uIText, v9, v10, null);
    }
    public void f(UIImage p0,UIImage p1,UIBackground p2,UIBackground p3,UIBorder p4,UIBorder p5,UIText p6,UIText p7,UIText p8,UIText p9,List p10){
       a.p(p0, "selectedGiftIcon");
       a.p(p1, "unselectedGiftIcon");
       a.p(p2, "selectedBackground");
       a.p(p3, "unselectedBackground");
       a.p(p4, "selectedBorder");
       a.p(p5, "unselectedBorder");
       a.p(p6, "unselectedTextLine1");
       a.p(p7, "selectedTextLine1");
       a.p(p8, "unSelectedTextLine2");
       a.p(p9, "selectedTextLine2");
       super();
       this.selectedGiftIcon = p0;
       this.unselectedGiftIcon = p1;
       this.selectedBackground = p2;
       this.unselectedBackground = p3;
       this.selectedBorder = p4;
       this.unselectedBorder = p5;
       this.unselectedTextLine1 = p6;
       this.selectedTextLine1 = p7;
       this.unSelectedTextLine2 = p8;
       this.selectedTextLine2 = p9;
       this.markLabelList = p10;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f && (a.g(this.selectedGiftIcon, p0.selectedGiftIcon) && (a.g(this.unselectedGiftIcon, p0.unselectedGiftIcon) && (a.g(this.selectedBackground, p0.selectedBackground) && (a.g(this.unselectedBackground, p0.unselectedBackground) && (a.g(this.selectedBorder, p0.selectedBorder) && (a.g(this.unselectedBorder, p0.unselectedBorder) && (a.g(this.unselectedTextLine1, p0.unselectedTextLine1) && (a.g(this.selectedTextLine1, p0.selectedTextLine1) && (a.g(this.unSelectedTextLine2, p0.unSelectedTextLine2) && (a.g(this.selectedTextLine2, p0.selectedTextLine2) && a.g(this.markLabelList, p0.markLabelList))))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       f obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.selectedGiftIcon;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       f tunselectedG = this.unselectedGiftIcon;
       int i2 = (tunselectedG != null)? tunselectedG.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedG = this.selectedBackground;
       i2 = (tunselectedG != null)? tunselectedG.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedG = this.unselectedBackground;
       i2 = (tunselectedG != null)? tunselectedG.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedG = this.selectedBorder;
       i2 = (tunselectedG != null)? tunselectedG.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedG = this.unselectedBorder;
       i2 = (tunselectedG != null)? tunselectedG.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedG = this.unselectedTextLine1;
       i2 = (tunselectedG != null)? tunselectedG.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedG = this.selectedTextLine1;
       i2 = (tunselectedG != null)? tunselectedG.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedG = this.unSelectedTextLine2;
       i2 = (tunselectedG != null)? tunselectedG.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedG = this.selectedTextLine2;
       i2 = (tunselectedG != null)? tunselectedG.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedG = this.markLabelList;
       if (tunselectedG != null) {
          i = tunselectedG.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIGiftPanelItem\(selectedGiftIcon="+this.selectedGiftIcon+", unselectedGiftIcon="+this.unselectedGiftIcon+", selectedBackground="+this.selectedBackground+", unselectedBackground="+this.unselectedBackground+", selectedBorder="+this.selectedBorder+", unselectedBorder="+this.unselectedBorder+", unselectedTextLine1="+this.unselectedTextLine1+", selectedTextLine1="+this.selectedTextLine1+", unSelectedTextLine2="+this.unSelectedTextLine2+", selectedTextLine2="+this.selectedTextLine2+", markLabelList="+this.markLabelList+"\)";
    }
}
