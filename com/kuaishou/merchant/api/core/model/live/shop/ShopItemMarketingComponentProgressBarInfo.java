package com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentProgressBarInfo;
import java.io.Serializable;
import vr3.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ShopItemMarketingComponentProgressBarInfo extends a implements Serializable	// class@001553
{
    public int current;
    public String pattern;
    public List progressTexts;
    public String rightText;
    public String text;
    public int total;

    public void ShopItemMarketingComponentProgressBarInfo(){
       super();
       this.pattern = "";
       this.text = "";
       this.progressTexts = CollectionsKt__CollectionsKt.E();
       this.rightText = "";
    }
    public final int getCurrent(){
       return this.current;
    }
    public final String getPattern(){
       return this.pattern;
    }
    public final List getProgressTexts(){
       return this.progressTexts;
    }
    public final String getRightText(){
       return this.rightText;
    }
    public final String getText(){
       return this.text;
    }
    public final int getTotal(){
       return this.total;
    }
    public final void setCurrent(int p0){
       this.current = p0;
    }
    public final void setPattern(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentProgressBarInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.pattern = p0;
       return;
    }
    public final void setProgressTexts(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentProgressBarInfo.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.progressTexts = p0;
       return;
    }
    public final void setRightText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentProgressBarInfo.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.rightText = p0;
       return;
    }
    public final void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentProgressBarInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.text = p0;
       return;
    }
    public final void setTotal(int p0){
       this.total = p0;
    }
}
