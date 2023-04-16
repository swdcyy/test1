package com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.kuaishou.merchant.live.cart.onsale.audience.model.TabInfo;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;
import java.lang.Integer;

public class CommodityListGuestResponse implements Serializable, a	// class@00194a
{
    public boolean isCacheResponse;
    public String mAnchorId;
    public List mBottomArea;
    public CacheConfig mCacheConfig;
    public List mCloseMenu;
    public String mContext;
    public String mCursor;
    public String mCustomerServiceUrl;
    public boolean mDisableSkin;
    public List mHeaderArea;
    public List mItemListArea;
    public MerchantLimitRetryRespond mLimitRetryRespond;
    public List mPendantArea;
    public List mTabInfos;
    public List mTopArea;
    public int mVersion;
    public static CommodityListGuestResponse EMPTY;
    public static final long serialVersionUID;

    static {
       CommodityListGuestResponse.EMPTY = new CommodityListGuestResponse();
    }
    public void CommodityListGuestResponse(){
       super();
       this.isCacheResponse = false;
    }
    public void afterDeserialize(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommodityListGuestResponse.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, CommodityListGuestResponse.class, "4")) {
          boolean b = true;
          if (q.f(this.mTabInfos)) {
             this.mTabInfos = new ArrayList();
             TabInfo tabInfo = new TabInfo();
             tabInfo.mTabDesc = "全部商品";
             tabInfo.mIsDummy = b;
             tabInfo.mCurrent = b;
             this.mTabInfos.add(tabInfo);
          }else if(this.mTabInfos.get(0).mCurrent == null){
             int i = 1;
             while (true) {
                if (i < this.mTabInfos.size()) {
                   if (this.mTabInfos.get(i).mCurrent == null) {
                      i = i + 1;
                   }
                }else {
                   this.mTabInfos.get(0).mCurrent = b;
                   break ;
                }
             }
          }
       }
       return;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, CommodityListGuestResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public boolean isForbidComponent(int p0){
       if (PatchProxy.isSupport(CommodityListGuestResponse.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CommodityListGuestResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (q.f(this.mCloseMenu)) {
          return false;
       }else {
          return this.mCloseMenu.contains(Integer.valueOf(p0));
       }
    }
    public boolean isV4Style(){
       boolean b = (this.mVersion == 4)? true: false;
       return b;
    }
}
