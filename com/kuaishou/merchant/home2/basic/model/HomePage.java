package com.kuaishou.merchant.home2.basic.model.HomePage;
import java.io.Serializable;
import bx3.c;
import bx3.d;
import java.lang.Object;
import java.lang.Boolean;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.merchant.home2.magnet.toolbar.model.ToolBarItem;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;
import bx3.a;
import java.util.Iterator;

public class HomePage implements Serializable, c, d	// class@0016e7
{
    public List mBannerItems;
    public List mComponentConfigs;
    public HashMap mComponentDataMap;
    public SearchSwitcherSkin mDarkModeSearchSwitcherSkin;
    public List mFeedChannelList;
    public boolean mIsGuarantee;
    public boolean mIsLocalCache;
    public FeedChannelInfo$MoreTabButtonConfig mMoreTabConfig;
    public String mOpenShopIconUrl;
    public String mOpenShopUrl;
    public String mRedDotContext;
    public String mResponseStr;
    public long mResponseTime;
    public List mSearchHints;
    public String mSearchJumpUrl;
    public SearchSwitcherSkin mSearchSwitcherSkin;
    public String mShoppingCartIconUrl;
    public String mShoppingCartUrl;
    public boolean mShouldHideSearchBox;
    public boolean mShowSearchIcon;
    public Boolean mShowShoppingCart;
    public List mTitleImgCdnUrl;
    public String mTitleImgUrl;
    public List mToolBarItems;
    public List mTopBackgroundImgCdnUrl;
    public String mTopBackgroundImgUrl;
    public static final long serialVersionUID = 0x5d5d63c5961e181;

    public void HomePage(){
       super();
       this.mShowShoppingCart = Boolean.FALSE;
       this.mShowSearchIcon = false;
       this.mShoppingCartIconUrl = "";
       this.mShoppingCartUrl = "";
       this.mRedDotContext = "";
       this.mComponentDataMap = new HashMap();
    }
    public static HomePage createDefault(){
       HomePage obj = PatchProxy.apply(null, null, HomePage.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HomePage();
       obj.mToolBarItems = ToolBarItem.createDefault();
       obj.mIsGuarantee = true;
       return obj;
    }
    public void fillRequiredData(){
       if (PatchProxy.applyVoid(null, this, HomePage.class, "1")) {
          return;
       }
       if (q.f(this.mToolBarItems)) {
          this.mToolBarItems = ToolBarItem.createDefault();
          a.g(MerchantHomeLogBiz.Common, "HomePage", "ToolBarItems is Empty");
       }
       return;
    }
    public a getComponentConfig(String p0){
       a uoa;
       HomePage obj = PatchProxy.applyOneRefs(p0, this, HomePage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mComponentConfigs;
       if (obj == null) {
          return null;
       }
       Iterator iterator = obj.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uoa = iterator.next();
          if (p0.equals(uoa.a())) {
             break ;
          }
       }
       return uoa;
    }
}
