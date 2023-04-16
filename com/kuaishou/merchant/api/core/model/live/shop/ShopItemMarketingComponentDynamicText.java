package com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentDynamicText;
import java.io.Serializable;
import vr3.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentDynamicText$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ShopItemMarketingComponentDynamicText extends a implements Serializable	// class@001552
{
    public String mPattern;
    public int mType;
    public List mValue;
    public static final ShopItemMarketingComponentDynamicText$a Companion;

    static {
       ShopItemMarketingComponentDynamicText.Companion = new ShopItemMarketingComponentDynamicText$a(null);
    }
    public void ShopItemMarketingComponentDynamicText(){
       super();
       this.mPattern = "";
       this.mValue = new ArrayList();
    }
    public static void getMType$annotations(){
    }
    public final String getMPattern(){
       return this.mPattern;
    }
    public final int getMType(){
       return this.mType;
    }
    public final List getMValue(){
       return this.mValue;
    }
    public final void setMPattern(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentDynamicText.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mPattern = p0;
       return;
    }
    public final void setMType(int p0){
       this.mType = p0;
    }
    public final void setMValue(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentDynamicText.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mValue = p0;
       return;
    }
}
