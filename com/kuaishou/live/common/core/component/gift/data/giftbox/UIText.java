package com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UIText	// class@001157
{
    public final String textColor;
    public final String textContent;
    public final int textSize;
    public final int textStyle;

    public void UIText(){
       super(0, 0, null, null, 15, null);
    }
    public void UIText(int p0,int p1,String p2,String p3){
       a.p(p2, "textContent");
       a.p(p3, "textColor");
       super();
       this.textStyle = p0;
       this.textSize = p1;
       this.textContent = p2;
       this.textColor = p3;
    }
    public void UIText(int p0,int p1,String p2,String p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = 0;
       }
       if (p4 & 0x02) {
          p1 = 12;
       }
       if (p4 & 0x04) {
          p2 = "";
       }
       if (p4 & 0x08) {
          p3 = "#ffffff";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final String a(){
       return this.textColor;
    }
    public final String b(){
       return this.textContent;
    }
    public final int c(){
       return this.textSize;
    }
    public final int d(){
       return this.textStyle;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UIText.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UIText && (this.textStyle == p0.textStyle && (this.textSize == p0.textSize && (a.g(this.textContent, p0.textContent) && a.g(this.textColor, p0.textColor)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, UIText.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.textStyle * 31) + this.textSize) * 31;
       UIText ttextContent = this.textContent;
       int i1 = 0;
       int i2 = (ttextContent != null)? ttextContent.hashCode(): 0;
       i = (i + i2) * 31;
       ttextContent = this.textColor;
       if (ttextContent != null) {
          i1 = ttextContent.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UIText.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UIText\(textStyle="+this.textStyle+", textSize="+this.textSize+", textContent="+this.textContent+", textColor="+this.textColor+"\)";
    }
}
