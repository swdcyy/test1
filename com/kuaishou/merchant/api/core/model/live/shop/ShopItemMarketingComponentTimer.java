package com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer;
import java.io.Serializable;
import vr3.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer$a;
import nsd.u;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ShopItemMarketingComponentTimer extends a implements Serializable	// class@001559
{
    public List mPatterns;
    public String mText;
    public long mTime;
    public static final ShopItemMarketingComponentTimer$a Companion;

    static {
       ShopItemMarketingComponentTimer.Companion = new ShopItemMarketingComponentTimer$a(null);
    }
    public void ShopItemMarketingComponentTimer(){
       super();
       this.mPatterns = new ArrayList();
       this.mText = "";
    }
    public final List getMPatterns(){
       return this.mPatterns;
    }
    public final String getMText(){
       return this.mText;
    }
    public final long getMTime(){
       return this.mTime;
    }
    public final void setMPatterns(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTimer.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mPatterns = p0;
       return;
    }
    public final void setMText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTimer.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mText = p0;
       return;
    }
    public final void setMTime(long p0){
       this.mTime = p0;
    }
}
