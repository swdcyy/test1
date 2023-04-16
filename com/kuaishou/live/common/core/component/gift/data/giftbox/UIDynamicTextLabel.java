package com.kuaishou.live.common.core.component.gift.data.giftbox.UIDynamicTextLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import java.lang.String;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIBackground;
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

public final class UIDynamicTextLabel	// class@001151
{
    public final UIBackground background;
    public final long coolDownTimeMS;
    public final UIText expandText;
    public final long expireTimeMS;
    public final UIText foldText;

    public void UIDynamicTextLabel(){
       UIText uIText = new UIText(0, 0, null, null, 15, null);
       UIText uIText1 = new UIText(0, 0, null, null, 15, null);
       UIBackground uIBackground = new UIBackground(0, null, null, null, null, 31, null);
       super(v7, v2, v3, 0, 0x927c0);
    }
    public void UIDynamicTextLabel(UIText p0,UIText p1,UIBackground p2,long p3,long p4){
       a.p(p0, "foldText");
       a.p(p1, "expandText");
       a.p(p2, "background");
       super();
       this.foldText = p0;
       this.expandText = p1;
       this.background = p2;
       this.expireTimeMS = p3;
       this.coolDownTimeMS = p4;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIDynamicTextLabel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UIDynamicTextLabel && (a.g(this.foldText, p0.foldText) && (a.g(this.expandText, p0.expandText) && (a.g(this.background, p0.background) && (!this.expireTimeMS - p0.expireTimeMS && !this.coolDownTimeMS - p0.coolDownTimeMS)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UIDynamicTextLabel obj = PatchProxy.apply(null, this, UIDynamicTextLabel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.foldText;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       UIDynamicTextLabel texpandText = this.expandText;
       int i2 = (texpandText != null)? texpandText.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       texpandText = this.background;
       if (texpandText != null) {
          i = texpandText.hashCode();
       }
       UIDynamicTextLabel texpireTimeM = this.expireTimeMS;
       texpireTimeM = this.coolDownTimeMS;
       return (((((i1 + i) * 31) + (int)(texpireTimeM ^ (texpireTimeM >> 32))) * 31) + (int)(texpireTimeM ^ (texpireTimeM >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UIDynamicTextLabel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIDynamicTextLabel\(foldText="+this.foldText+", expandText="+this.expandText+", background="+this.background+", expireTimeMS="+this.expireTimeMS+", coolDownTimeMS="+this.coolDownTimeMS+"\)";
    }
}
