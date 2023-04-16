package com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveCustomGift;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.models.Gift;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveGiftGroupItemViewData;
import ok.j$b;
import ok.j;
import java.lang.Integer;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemPromptInfo;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import rm1.f;
import java.util.ArrayList;
import java.lang.Boolean;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import ekd.j;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.FansGroupGift;

public class GiftPanelItem implements Serializable	// class@001313
{
    public int index;
    public boolean mCanGiftNaming;
    public GiftPanelItem mCurrentSelectedAlbumPanelItem;
    public LiveCustomGift mCustomGift;
    public Gift mGift;
    public GiftPanelItem$LiveGiftGroupBtnInfo mGiftGroupBtnInfo;
    public LiveGiftGroupItemViewData mGiftGroupItemViewData;
    public GiftPanelItemPromptInfo mGiftPanelItemPromptInfo;
    public GiftPanelItemViewData mGiftPanelItemViewData;
    public boolean mIsGiftType;
    public LiveGiftItemHint mItemHint;
    public int mItemType;
    public String mJumpLink;
    public int mLastSelectAlbumIndex;
    public GiftPanelItem$LiveFansGroupInfo mLiveFansGroupInfo;
    public LivePreviewEffectInfo mLivePreviewEffectInfo;
    public long mLiveVipGradeScore;
    public List mLoadingIconUrls;
    public LiveProp mProp;
    public int mRecoBatchSize;
    public String mSendExtraInfo;
    public List mSubPanelItems;
    public long mWealthGradeScore;
    public int sortIndex;
    public static final long serialVersionUID = 0x60699b8b073d75b7;

    public void GiftPanelItem(int p0){
       super();
       this.mIsGiftType = true;
       this.mItemType = p0;
    }
    public LiveCustomGift getCustomGift(){
       Object obj = PatchProxy.apply(null, this, GiftPanelItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mCustomGift == null) {
          this.mCustomGift = new LiveCustomGift();
       }
       return this.mCustomGift;
    }
    public Gift getDefaultAlbumGift(){
       Object[] objArray = null;
       GiftPanelItem obj = PatchProxy.apply(objArray, this, GiftPanelItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSubPanelItems;
       if (obj == null || obj.size() <= 0) {
          return objArray;
       }
       obj = this.mLastSelectAlbumIndex;
       if (obj >= null && obj < this.mSubPanelItems.size()) {
          return this.mSubPanelItems.get(this.mLastSelectAlbumIndex).getGift();
       }
       return this.mSubPanelItems.get(0).getGift();
    }
    public Gift getGift(){
       return this.mGift;
    }
    public LiveGiftGroupItemViewData getGiftGroupItemViewData(){
       return this.mGiftGroupItemViewData;
    }
    public String getLogString(){
       j$b obj = PatchProxy.apply(null, this, GiftPanelItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       GiftPanelItem tmGift = this.mGift;
       String str = "";
       String str1 = (tmGift == null)? str: Integer.valueOf(tmGift.mId);
       obj.c("giftId", str1);
       tmGift = this.mGiftPanelItemPromptInfo;
       if (tmGift != null) {
          str = TextUtils.k(tmGift.mDescription);
       }
       obj.c("giftName", str);
       obj.b("wealthGradeScore", this.mWealthGradeScore);
       return obj.toString();
    }
    public List getSubPanelItems(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, GiftPanelItem.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.isCustomGift() && q.f(this.mSubPanelItems)) {
          obj = PatchProxy.applyOneRefs(this, objArray, f.class, "14");
          if (obj != patchProxyRe) {
          }else {
             obj = new ArrayList();
             for (int i = 0; i < 3; i = i + 1) {
                GiftPanelItem giftPanelIte = new GiftPanelItem(1);
                Gift gift = this.getCustomGift().getGift();
                if (gift != null) {
                   giftPanelIte.setGift(gift.cloneValue(new Gift()));
                }
                obj.add(giftPanelIte);
             }
          }
          this.mSubPanelItems = obj;
       }
       return this.mSubPanelItems;
    }
    public boolean hasDynamicIcon(){
       GiftPanelItem obj = PatchProxy.apply(null, this, GiftPanelItem.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mGiftPanelItemViewData;
       boolean b = (obj != null && !j.h(obj.mDynamicGiftIconUrls))? true: false;
       return b;
    }
    public boolean hasDynamicTag(){
       GiftPanelItem obj = PatchProxy.apply(null, this, GiftPanelItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mGiftPanelItemViewData;
       boolean b = (obj != null && (!TextUtils.x(obj.mDynamicCornerShortText) && !TextUtils.x(this.mGiftPanelItemViewData.mDynamicCornerText)))? true: false;
       return b;
    }
    public boolean isCustomGift(){
       boolean b = (this.mItemType == 9)? true: false;
       return b;
    }
    public boolean isEnableJumpByLink(){
       Object obj = PatchProxy.apply(null, this, GiftPanelItem.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.mJumpLink) ^ 0x01);
    }
    public boolean isFansGroupType(){
       boolean b = (this.mItemType == 3)? true: false;
       return b;
    }
    public boolean isGiftType(){
       return this.mIsGiftType;
    }
    public void parseGift(){
       if (PatchProxy.applyVoid(null, this, GiftPanelItem.class, "3")) {
          return;
       }
       if (this.isFansGroupType()) {
          GiftPanelItem tmGift = this.mGift;
          if (tmGift != null) {
             FansGroupGift uFansGroupGi = tmGift.cloneValue(new FansGroupGift());
             uFansGroupGi.mLiveFansGroupInfo = this.mLiveFansGroupInfo;
             this.setGift(uFansGroupGi);
          }
       }
       return;
    }
    public void setGift(Gift p0){
       this.mGift = p0;
    }
    public void setSubPanelItems(List p0){
       this.mSubPanelItems = p0;
    }
}
