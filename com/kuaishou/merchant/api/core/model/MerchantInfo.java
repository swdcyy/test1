package com.kuaishou.merchant.api.core.model.MerchantInfo;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.model.a;
import ok.h;
import com.google.common.collect.Lists;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class MerchantInfo	// class@00152b
{
    public List mAnchorNeedCallBackendTools;
    public String mBrandUserId;
    public List mChosenCommodities;
    public boolean mChosenCommodityChanged;
    public boolean mHasChooseCommodity;
    public boolean mIsAuctionOpen;
    public boolean mIsSandeagoOpen;
    public int mLivePlanBindStatus;
    public long mLivePlanId;
    public String mModuleType;
    public String mToken;
    public String mType;

    public void MerchantInfo(){
       super();
       this.mLivePlanBindStatus = 0;
       this.mAnchorNeedCallBackendTools = new ArrayList();
    }
    public static String lambda$generateChosenIdList$0(Commodity p0){
       String str;
       p0 = (p0 != null)? p0.mId: "";
       return p0;
    }
    public List generateChosenIdList(){
       Object obj = PatchProxy.apply(null, this, MerchantInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Lists.h(this.mChosenCommodities, a.b);
    }
    public boolean isChosen(){
       Object obj = PatchProxy.apply(null, this, MerchantInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!q.f(this.mChosenCommodities) || this.mIsSandeagoOpen != null)? true: false;
       return b;
    }
    public void reset(){
       this.mChosenCommodities = null;
       this.mIsSandeagoOpen = false;
       this.mIsAuctionOpen = false;
       this.mChosenCommodityChanged = false;
       this.mModuleType = null;
       this.mBrandUserId = null;
       this.mType = null;
       this.mLivePlanId = 0;
       this.mLivePlanBindStatus = 0;
    }
}
