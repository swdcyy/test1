package com.kuaishou.live.common.core.component.gift.data.giftbox.UIMarkLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIStaticTextLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIDynamicTextLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImageLabel;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class UIMarkLabel	// class@001155
{
    public final UIDynamicTextLabel dynamicTextLabel;
    public final UIImageLabel imgLabel;
    public final int markLabelStyle;
    public final int position;
    public final UIStaticTextLabel staticTextLabel;

    public void UIMarkLabel(){
       super(0, 0, null, null, null, 31, null);
    }
    public void UIMarkLabel(int p0,int p1,UIStaticTextLabel p2,UIDynamicTextLabel p3,UIImageLabel p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = 0;
       }
       if (p5 & 0x02) {
          p1 = 1;
       }
       if (p5 & 0x04) {
          p2 = null;
       }
       if (p5 & 0x08) {
          p3 = null;
       }
       if (p5 & 0x10) {
          p4 = null;
       }
       super();
       this.markLabelStyle = p0;
       this.position = p1;
       this.staticTextLabel = p2;
       this.dynamicTextLabel = p3;
       this.imgLabel = p4;
       return;
    }
    public final long a(){
       UIMarkLabel obj = PatchProxy.apply(null, this, UIMarkLabel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.dynamicTextLabel;
       UIDynamicTextLabel coolDownTime = (obj != null)? obj.coolDownTimeMS: 0x927c0;
       return coolDownTime;
    }
    public final String b(){
       String str;
       UIMarkLabel obj = PatchProxy.apply(null, this, UIMarkLabel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.dynamicTextLabel;
       if (obj != null) {
          UIDynamicTextLabel foldText = obj.foldText;
          if (foldText != null) {
             str = foldText.b();
             if (str != null) {
             label_0021 :
                return str;
             }
          }
       }
       str = "";
       goto label_0021 ;
    }
    public final UIDynamicTextLabel c(){
       return this.dynamicTextLabel;
    }
    public final UIImageLabel d(){
       return this.imgLabel;
    }
    public final int e(){
       return this.markLabelStyle;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIMarkLabel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UIMarkLabel && (this.markLabelStyle == p0.markLabelStyle && (this.position == p0.position && (a.g(this.staticTextLabel, p0.staticTextLabel) && (a.g(this.dynamicTextLabel, p0.dynamicTextLabel) && a.g(this.imgLabel, p0.imgLabel))))))) {
          return true;
       }
       return false;
    }
    public final UIStaticTextLabel f(){
       return this.staticTextLabel;
    }
    public final boolean g(){
       boolean b = true;
       if (this.markLabelStyle != b || this.dynamicTextLabel == null) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, UIMarkLabel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.markLabelStyle * 31) + this.position) * 31;
       UIMarkLabel tstaticTextL = this.staticTextLabel;
       int i1 = 0;
       int i2 = (tstaticTextL != null)? tstaticTextL.hashCode(): 0;
       i = (i + i2) * 31;
       tstaticTextL = this.dynamicTextLabel;
       i2 = (tstaticTextL != null)? tstaticTextL.hashCode(): 0;
       i = (i + i2) * 31;
       tstaticTextL = this.imgLabel;
       if (tstaticTextL != null) {
          i1 = tstaticTextL.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UIMarkLabel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIMarkLabel\(markLabelStyle="+this.markLabelStyle+", position="+this.position+", staticTextLabel="+this.staticTextLabel+", dynamicTextLabel="+this.dynamicTextLabel+", imgLabel="+this.imgLabel+"\)";
    }
}
