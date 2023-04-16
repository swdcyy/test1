package com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextContent;
import java.io.Serializable;
import vr3.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextContent$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ShopItemMarketingComponentTextContent extends a implements Serializable	// class@001556
{
    public String mContent;
    public int type;
    public static final ShopItemMarketingComponentTextContent$a Companion;

    static {
       ShopItemMarketingComponentTextContent.Companion = new ShopItemMarketingComponentTextContent$a(null);
    }
    public void ShopItemMarketingComponentTextContent(){
       super();
       this.mContent = "";
    }
    public static void getType$annotations(){
    }
    public final String getMContent(){
       return this.mContent;
    }
    public final int getType(){
       return this.type;
    }
    public final void setMContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTextContent.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mContent = p0;
       return;
    }
    public final void setType(int p0){
       this.type = p0;
    }
}
