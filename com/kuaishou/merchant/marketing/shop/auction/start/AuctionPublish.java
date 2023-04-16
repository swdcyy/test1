package com.kuaishou.merchant.marketing.shop.auction.start.AuctionPublish;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ot3.p0;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$AuctionThreshold;
import com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$a;
import com.kuaishou.merchant.live.basic.common.sandeabiz.SandeBizPublishException;
import java.lang.Long;
import lnc.a1;
import com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$AuctionThreshold$MarginSetting;
import lnc.o5;
import java.util.List;
import j14.c;

public class AuctionPublish extends DefaultObservable	// class@001bc3
{
    public String mAuditId;
    public long mDuration;
    public String mDurationHint;
    public File mImageFile;
    public long mIncrementPriceCent;
    public String mIncrementPriceHint;
    public String mInputIncrementPrice;
    public int mInputServiceFee;
    public String mInputStartPrice;
    public boolean mIsEditCategory;
    public boolean mIsOpenDelay;
    public String mName;
    public String mNameHint;
    public List mSelectCategoryList;
    public AuctionStartConfig$a mSelectIncrementMode;
    public int mSelectedDurationPosition;
    public AuctionStartConfig$AuctionThreshold mSelectedThreshold;
    public String mServiceFee;
    public long mStartPriceCent;
    public String mStartPriceHint;
    public String mThresholdHint;
    public static final long serialVersionUID = 0x1e71796876f87d28;

    public void AuctionPublish(){
       super();
       this.mSelectedDurationPosition = -1;
    }
    public static long parseStringToCent(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AuctionPublish.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!TextUtils.x(p0)) {
          return p0.p(p0);
       }
    }
    public boolean allowPublish(){
       AuctionPublish obj = PatchProxy.apply(null, this, AuctionPublish.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!q.f(this.mSelectCategoryList) && !TextUtils.x(this.mName)) {
          obj = this.mSelectedThreshold;
          if (obj != null && (obj.isValidSelected() && !TextUtils.x(this.mInputStartPrice))) {
             obj = this.mSelectIncrementMode;
             if (obj != null && (obj.mType == b || (!TextUtils.x(this.mInputIncrementPrice) && this.mDuration > 0))) {
             label_0051 :
                return b;
             }
          }
       }
    label_0050 :
       b = false;
       goto label_0051 ;
    }
    public void checkCategory(){
       if (PatchProxy.applyVoid(null, this, AuctionPublish.class, "4")) {
          return;
       }
       if (!q.f(this.mSelectCategoryList)) {
          return;
       }
       throw new SandeBizPublishException(0x7f100290);
    }
    public void checkDuration(){
       if (PatchProxy.applyVoid(null, this, AuctionPublish.class, "12")) {
          return;
       }
       if (this.mDuration > 0) {
          return;
       }
       throw new SandeBizPublishException(this.mDurationHint);
    }
    public void checkIncrementMode(){
       if (PatchProxy.applyVoid(null, this, AuctionPublish.class, "7")) {
          return;
       }
       if (this.mSelectIncrementMode != null) {
          return;
       }
       throw new SandeBizPublishException("请选择一个加价模式");
    }
    public void checkIncrementPrice(long p0,long p1){
       if (PatchProxy.isSupport(AuctionPublish.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, AuctionPublish.class, "10")) {
          return;
       }
       if (TextUtils.x(this.mInputIncrementPrice)) {
          throw new SandeBizPublishException(0x7f10028c);
       }
       long l = AuctionPublish.parseStringToCent(this.mInputIncrementPrice);
       this.mIncrementPriceCent = l;
       if (l - p0 >= 0) {
          if (l - p1 <= 0) {
             return;
          }
          Object[] objArray = new Object[]{a1.p(0x7f100255),p0.m(p1)};
          throw new SandeBizPublishException(String.format("%s不能大于%s", objArray));
       }else {
          Object[] objArray1 = new Object[]{a1.p(0x7f100255),p0.m(p0)};
          throw new SandeBizPublishException(String.format("%s不能小于%s", objArray1));
       }
    }
    public void checkMarginPrice(){
       if (PatchProxy.applyVoid(null, this, AuctionPublish.class, "8")) {
          return;
       }
       AuctionPublish tmSelectedTh = this.mSelectedThreshold;
       if (tmSelectedTh == null || tmSelectedTh.mType != 4) {
          return;
       }
       long marginMinAmo = tmSelectedTh.getMarginMinAmount();
       long marginMaxAmo = this.mSelectedThreshold.getMarginMaxAmount();
       AuctionStartConfig$AuctionThreshold mMarginSetti = this.mSelectedThreshold.mMarginSetting;
       if (mMarginSetti == null) {
          throw new SandeBizPublishException(a1.p(0x7f100281));
       }
       AuctionStartConfig$AuctionThreshold$MarginSetting marginAmount = mMarginSetti.marginAmount;
       if (TextUtils.x(marginAmount)) {
          throw new SandeBizPublishException(a1.p(0x7f100281));
       }
       long l = AuctionPublish.parseStringToCent(marginAmount);
       if (l - marginMinAmo >= 0) {
          if (l - marginMaxAmo <= 0) {
             return;
          }
          Object[] objArray = new Object[]{p0.m(marginMaxAmo)};
          throw new SandeBizPublishException(String.format("保证金金额不能大于%s", objArray));
       }else {
          Object[] objArray1 = new Object[]{p0.m(marginMinAmo)};
          throw new SandeBizPublishException(String.format("保证金金额不能小于%s", objArray1));
       }
    }
    public void checkName(){
       if (PatchProxy.applyVoid(null, this, AuctionPublish.class, "5")) {
          return;
       }
       if (!TextUtils.x(this.mName)) {
          return;
       }
       throw new SandeBizPublishException(0x7f10028d);
    }
    public void checkServiceFee(long p0,long p1){
       Object[] objArray;
       if (PatchProxy.isSupport(AuctionPublish.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, AuctionPublish.class, "11")) {
          return;
       }
       int i = o5.b(this.mServiceFee, 0);
       this.mInputServiceFee = i;
       if ((long)i - p1 <= 0) {
          if ((long)i - p0 >= 0) {
             return;
          }
          objArray = new Object[]{Long.valueOf(p1)};
          throw new SandeBizPublishException(String.format("买家手续费不能小于%s%%", objArray));
       }else {
          objArray = new Object[]{Long.valueOf(p1)};
          throw new SandeBizPublishException(String.format("买家手续费不能大于%s%%", objArray));
       }
    }
    public void checkStartPrice(long p0,long p1){
       if (PatchProxy.isSupport(AuctionPublish.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, AuctionPublish.class, "9")) {
          return;
       }
       if (TextUtils.x(this.mInputStartPrice)) {
          throw new SandeBizPublishException(0x7f10028f);
       }
       long l = AuctionPublish.parseStringToCent(this.mInputStartPrice);
       this.mStartPriceCent = l;
       if (l - p0 >= 0) {
          if (l - p1 <= 0) {
             return;
          }
          Object[] objArray = new Object[]{a1.p(0x7f100298),p0.m(p1)};
          throw new SandeBizPublishException(String.format("%s不能大于%s", objArray));
       }else {
          Object[] objArray1 = new Object[]{a1.p(0x7f100298),p0.m(p0)};
          throw new SandeBizPublishException(String.format("%s不能小于%s", objArray1));
       }
    }
    public void checkThreshold(){
       if (PatchProxy.applyVoid(null, this, AuctionPublish.class, "6")) {
          return;
       }
       AuctionPublish tmSelectedTh = this.mSelectedThreshold;
       if (tmSelectedTh != null && tmSelectedTh.isValidSelected()) {
          return;
       }
       throw new SandeBizPublishException(this.mThresholdHint);
    }
    public String getCategoryIds(){
       Object obj = PatchProxy.apply(null, this, AuctionPublish.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.c(this.mSelectCategoryList);
    }
    public boolean isEdited(){
       Object obj = PatchProxy.apply(null, this, AuctionPublish.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mIsEditCategory == null && (TextUtils.x(this.mName) && (this.mSelectedThreshold == null && (TextUtils.x(this.mInputStartPrice) && (TextUtils.x(this.mInputIncrementPrice) && (TextUtils.x(this.mServiceFee) && (this.mSelectIncrementMode != null || this.mSelectedDurationPosition != -1)))))))? true: false;
       return b;
    }
}
