package com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimerPattern;
import java.io.Serializable;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimerPattern$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.a;

public final class ShopItemMarketingComponentTimerPattern implements Serializable	// class@00155b
{
    public List mCondition;
    public String mPattern;
    public String mTextColor;
    public String mTimePattern;
    public int mType;
    public static final ShopItemMarketingComponentTimerPattern$a Companion;

    static {
       ShopItemMarketingComponentTimerPattern.Companion = new ShopItemMarketingComponentTimerPattern$a(null);
    }
    public void ShopItemMarketingComponentTimerPattern(){
       super();
       this.mCondition = new ArrayList();
       this.mPattern = "";
       this.mTimePattern = "";
       this.mTextColor = "";
    }
    public static void getMType$annotations(){
    }
    public final List getCondition(){
       Long[] obj = PatchProxy.apply(null, this, ShopItemMarketingComponentTimerPattern.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = Long.MAX_VALUE;
       int i = 2;
       if (this.mCondition.isEmpty()) {
          obj = new Long[i];
          obj[0] = Long.valueOf(0);
          obj[1] = Long.valueOf(l);
          return CollectionsKt__CollectionsKt.P(obj);
       }else if(this.mCondition.size() == 1){
          obj = new Long[i];
          obj[0] = this.mCondition.get(0);
          obj[1] = Long.valueOf(l);
          return CollectionsKt__CollectionsKt.P(obj);
       }else {
          return this.mCondition;
       }
    }
    public final List getMCondition(){
       return this.mCondition;
    }
    public final String getMPattern(){
       return this.mPattern;
    }
    public final String getMTextColor(){
       return this.mTextColor;
    }
    public final String getMTimePattern(){
       return this.mTimePattern;
    }
    public final int getMType(){
       return this.mType;
    }
    public final void setMCondition(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTimerPattern.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mCondition = p0;
       return;
    }
    public final void setMPattern(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTimerPattern.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mPattern = p0;
       return;
    }
    public final void setMTextColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTimerPattern.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTextColor = p0;
       return;
    }
    public final void setMTimePattern(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTimerPattern.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTimePattern = p0;
       return;
    }
    public final void setMType(int p0){
       this.mType = p0;
    }
}
