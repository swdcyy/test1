package com.kuaishou.merchant.live.cart.salemanager.model.CommodityListAuthorResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.live.cart.basic.model.ItemCard;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.LinkedList;
import com.kuaishou.merchant.live.cart.salemanager.model.a;
import java.util.Comparator;
import java.util.Collections;
import com.kuaishou.merchant.live.cart.salemanager.model.CommodityListAuthorResponse$AuthorExtraInfo;
import js3.a;
import java.lang.Boolean;
import la6.a;

public class CommodityListAuthorResponse implements Serializable, a	// class@0019e8
{
    public boolean hasSandeagoAuthority;
    public boolean isSandeagoShow;
    public List mAllTools;
    public LiveAnchorConfig mAnchorConfig;
    public List mCommodityList;
    public String mCursor;
    public CommodityListAuthorResponse$AuthorExtraInfo mExtraInfo;
    public String mGroupCursor;
    public List mItemCardList;
    public int mMaxCommodityQuantity;
    public String mModulePageUrl;
    public LiveAnchorToolsInfo mPermanentTools;
    public TabBarInfo mTabBarInfo;
    public TopNoticeBarInfo mTopNoticeBarInfo;
    public TopToolBar mTopToolBar;
    public String sandeagoForbiddenReason;
    public static final long serialVersionUID = 0xcc7e0c57221ad0d2;

    public void CommodityListAuthorResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, CommodityListAuthorResponse.class, "3")) {
          return;
       }
       if (this.mCommodityList != null && this.mItemCardList == null) {
          this.mItemCardList = new ArrayList();
          Iterator iterator = this.mCommodityList.iterator();
          while (iterator.hasNext()) {
             ItemCard itemCard = new ItemCard();
             itemCard.mType = 1;
             itemCard.mCommodity = iterator.next();
             this.mItemCardList.add(itemCard);
          }
       }
       return;
    }
    public List generateChosenList(){
       ArrayList obj = PatchProxy.apply(null, this, CommodityListAuthorResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (!q.f(this.mItemCardList)) {
          LinkedList linkedList = new LinkedList();
          Iterator iterator = this.mItemCardList.iterator();
          while (iterator.hasNext()) {
             ItemCard itemCard = iterator.next();
             if (itemCard.mType == 1) {
                itemCard = itemCard.mCommodity;
                if (itemCard != null && itemCard.mSequence > null) {
                   linkedList.add(itemCard);
                }
             }
          }
          Collections.sort(linkedList, a.b);
          obj.addAll(linkedList);
       }
       return obj;
    }
    public CommodityListAuthorResponse$AuthorExtraInfo getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, CommodityListAuthorResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraInfo == null) {
          this.mExtraInfo = new CommodityListAuthorResponse$AuthorExtraInfo();
       }
       return this.mExtraInfo;
    }
    public a getSandeagoInfo(){
       a obj = PatchProxy.apply(null, this, CommodityListAuthorResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.a = this.isSandeagoShow;
       obj.b = this.hasSandeagoAuthority;
       obj.c = this.sandeagoForbiddenReason;
       return obj;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, CommodityListAuthorResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
