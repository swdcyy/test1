package com.kuaishou.live.common.core.component.gift.data.giftbox.UIStaticTextLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIBackground;
import nsd.u;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UICorner;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UIStaticTextLabel	// class@001156
{
    public final UIBackground background;
    public final UIText text;

    public void UIStaticTextLabel(){
       super(null, null, 3, null);
    }
    public void UIStaticTextLabel(UIText p0,UIBackground p1,int p2,u p3){
       if (p2 & 0x01) {
          UIText uIText = new UIText(0, 0, null, null, 15, null);
       }
       if (p2 & 0x02) {
          UIBackground uIBackground = new UIBackground(0, null, null, null, null, 31, null);
       }else {
          p1 = null;
       }
       a.p(p0, "text");
       a.p((p2 & 0x02), "background");
       super();
       this.text = p0;
       this.background = p2 & 0x02;
       return;
    }
    public final UIText a(){
       return this.text;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIStaticTextLabel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UIStaticTextLabel && (a.g(this.text, p0.text) && a.g(this.background, p0.background)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UIStaticTextLabel obj = PatchProxy.apply(null, this, UIStaticTextLabel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.text;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       UIStaticTextLabel tbackground = this.background;
       if (tbackground != null) {
          i = tbackground.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UIStaticTextLabel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIStaticTextLabel\(text="+this.text+", background="+this.background+"\)";
    }
}
