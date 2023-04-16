package com.kuaishou.live.common.core.component.gift.data.giftbox.UIGiftPanelTab;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIBackground;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import nsd.u;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UICorner;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UIGiftPanelTab	// class@001152
{
    public final UIBackground selectedBackground;
    public final UIImage selectedImg;
    public final UIText selectedText;
    public final boolean showRedDot;
    public final UIBackground unselectedBackground;
    public final UIImage unselectedImg;
    public final UIText unselectedText;

    public void UIGiftPanelTab(){
       super(null, null, null, null, null, null, false, 127, null);
    }
    public void UIGiftPanelTab(UIBackground p0,UIBackground p1,UIText p2,UIText p3,UIImage p4,UIImage p5,boolean p6,int p7,u p8){
       UIBackground uIBackground;
       UIBackground uIBackground1;
       UIText uIText;
       int i = this;
       if (p7 & 0x01) {
          uIBackground = new UIBackground(0, null, null, null, null, 31, null);
       }else {
          UIBackground uIBackground2 = p0;
       }
       if (p7 & 0x02) {
          uIBackground1 = new UIBackground(0, null, null, null, null, 31, null);
       }else {
          uIBackground = p1;
       }
       if (p7 & 0x04) {
          uIText = new UIText(0, 0, null, null, 15, null);
       }else {
          UIText uIText2 = p2;
       }
       if (p7 & 0x08) {
          UIText uIText1 = new UIText(0, 0, null, null, 15, null);
       }else {
          uIText = p3;
       }
       boolean b = (p7 & 0x40)? false: p6;
       a.p(v1, "selectedBackground");
       a.p(uIBackground, "unselectedBackground");
       a.p(uIBackground1, "selectedText");
       a.p(uIText, "unselectedText");
       super();
       i.selectedBackground = v1;
       i.unselectedBackground = uIBackground;
       i.selectedText = uIBackground1;
       i.unselectedText = uIText;
       i.selectedImg = null;
       i.unselectedImg = null;
       i.showRedDot = b;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIGiftPanelTab.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UIGiftPanelTab && (a.g(this.selectedBackground, p0.selectedBackground) && (a.g(this.unselectedBackground, p0.unselectedBackground) && (a.g(this.selectedText, p0.selectedText) && (a.g(this.unselectedText, p0.unselectedText) && (a.g(this.selectedImg, p0.selectedImg) && (a.g(this.unselectedImg, p0.unselectedImg) && this.showRedDot == p0.showRedDot)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UIGiftPanelTab obj = PatchProxy.apply(null, this, UIGiftPanelTab.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.selectedBackground;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       UIGiftPanelTab tunselectedB = this.unselectedBackground;
       int i2 = (tunselectedB != null)? tunselectedB.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedB = this.selectedText;
       i2 = (tunselectedB != null)? tunselectedB.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedB = this.unselectedText;
       i2 = (tunselectedB != null)? tunselectedB.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedB = this.selectedImg;
       i2 = (tunselectedB != null)? tunselectedB.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tunselectedB = this.unselectedImg;
       if (tunselectedB != null) {
          i = tunselectedB.hashCode();
       }
       i1 = (i1 + i) * 31;
       UIGiftPanelTab tshowRedDot = this.showRedDot;
       if (tshowRedDot != null) {
          tshowRedDot = 1;
       }
       return (i1 + tshowRedDot);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UIGiftPanelTab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIGiftPanelTab\(selectedBackground="+this.selectedBackground+", unselectedBackground="+this.unselectedBackground+", selectedText="+this.selectedText+", unselectedText="+this.unselectedText+", selectedImg="+this.selectedImg+", unselectedImg="+this.unselectedImg+", showRedDot="+this.showRedDot+"\)";
    }
}
