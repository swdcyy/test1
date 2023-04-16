package com.kuaishou.merchant.api.core.model.Commodity$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.api.core.model.Commodity$$Parcelable$a;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel;
import com.kuaishou.merchant.api.core.model.Commodity$GatherPopularityInfo;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import java.util.HashMap;
import xwd.b;
import com.kuaishou.merchant.api.core.model.Commodity$InterpretationInfo;
import com.kuaishou.merchant.api.core.model.Commodity$ItemMark;
import com.kuaishou.merchant.api.core.model.Commodity$ExtraInfo;
import com.kuaishou.merchant.api.core.model.Commodity$CustomPrice;
import com.kuaishou.merchant.api.core.model.CommoditySellingPoint;
import com.kuaishou.merchant.api.core.model.Commodity$TodayHotSale;
import com.kuaishou.merchant.api.core.model.BaseComponentData;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;

public class Commodity$$Parcelable implements Parcelable, d	// class@001512
{
    public Commodity commodity$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       Commodity$$Parcelable.CREATOR = new Commodity$$Parcelable$a();
    }
    public void Commodity$$Parcelable(Commodity p0){
       super();
       this.commodity$$0 = p0;
    }
    public static Commodity read(Parcel p0,a p1){
       List list;
       Map map;
       int[] ointArray;
       int i2;
       ArrayList uArrayList;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          Commodity uCommodity = new Commodity();
          p1.f(p1.g(), uCommodity);
          uCommodity.mCurrentFrame = p0.readSerializable();
          uCommodity.mTotalStock = p0.readInt();
          uCommodity.mGatherPopularityInfo = p0.readSerializable();
          uCommodity.mCurrencyContent = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uCommodity.mAlwaysShowCustomPrice = b1;
          uCommodity.mBuyUrl = p0.readString();
          uCommodity.mButtonJumpUrl = p0.readString();
          uCommodity.mCurrentFrameIndex = p0.readInt();
          uCommodity.mCurrencyPosition = p0.readInt();
          uCommodity.mJumpToken = p0.readString();
          uCommodity.mPayDepositUrl = p0.readString();
          b1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          if (b1 < 0) {
             list = uCDNUrlArray;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          uCommodity.mImageUrls = list;
          b1 = (p0.readInt() == 1)? true: false;
          uCommodity.mIsHighlight = b1;
          uCommodity.mThumbTag = p0.readSerializable();
          uCommodity.mCurrentStock = p0.readLong();
          b1 = p0.readInt();
          if (b1 < 0) {
             map = uCDNUrlArray;
          }else {
             map = new HashMap(b.a(b1));
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                map.put(p0.readString(), p0.readString());
             }
          }
          uCommodity.mItemTraceMap = map;
          uCommodity.mItemType = p0.readInt();
          uCommodity.mCurrency = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          uCommodity.mIsShowLogged = b1;
          uCommodity.mInterpretationInfo = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          uCommodity.mBuyButtonSuccess = b1;
          uCommodity.mSequence = p0.readInt();
          uCommodity.mThumbTopComponent = p0.readInt();
          uCommodity.buttonText = p0.readString();
          uCommodity.mItemMark = p0.readSerializable();
          uCommodity.mExtraInfo = p0.readSerializable();
          uCommodity.mId = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list = uCDNUrlArray;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          uCommodity.mLiveShopFrames = list;
          b1 = (p0.readInt() == 1)? true: false;
          uCommodity.isCopyForInterpret = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             ointArray = uCDNUrlArray;
          }else {
             ointArray = new int[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                ointArray[i2] = p0.readInt();
             }
          }
          uCommodity.mShowIconList = ointArray;
          uCommodity.mCustomPrice = p0.readSerializable();
          b1 = p0.readInt();
          if (b1 >= 0) {
             uCDNUrlArray = new CDNUrl[b1];
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                uCDNUrlArray[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCommodity.mBuyButtonImageUrls = uCDNUrlArray;
          b1 = (p0.readInt() == 1)? true: false;
          uCommodity.mStartTwinkleAnimation = b1;
          uCommodity.mDisplayPrice = p0.readString();
          uCommodity.mSellingPoint = p0.readSerializable();
          uCommodity.mTimeStamp = p0.readLong();
          uCommodity.mTodayHotSaleInfo = p0.readSerializable();
          if (p0.readInt() == 1) {
             b = true;
          }
          uCommodity.mLeftRegionBottomButtonSuccess = b;
          uCommodity.mSourceTypeName = p0.readString();
          uCommodity.mOrderId = p0.readString();
          uCommodity.mTitle = p0.readString();
          uCommodity.mJumpUrl = p0.readString();
          uCommodity.mBizId = p0.readString();
          uCommodity.mBizType = p0.readInt();
          p1.f(i, uCommodity);
          return uCommodity;
       }
    }
    public static void write(Commodity p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mCurrentFrame);
          p1.writeInt(p0.mTotalStock);
          p1.writeSerializable(p0.mGatherPopularityInfo);
          p1.writeString(p0.mCurrencyContent);
          p1.writeInt(p0.mAlwaysShowCustomPrice);
          p1.writeString(p0.mBuyUrl);
          p1.writeString(p0.mButtonJumpUrl);
          p1.writeInt(p0.mCurrentFrameIndex);
          p1.writeInt(p0.mCurrencyPosition);
          p1.writeString(p0.mJumpToken);
          p1.writeString(p0.mPayDepositUrl);
          Commodity mImageUrls = p0.mImageUrls;
          if (mImageUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImageUrls.size());
             iterator = p0.mImageUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mIsHighlight);
          p1.writeSerializable(p0.mThumbTag);
          p1.writeLong(p0.mCurrentStock);
          mImageUrls = p0.mItemTraceMap;
          if (mImageUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImageUrls.size());
             iterator = p0.mItemTraceMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeInt(p0.mItemType);
          p1.writeInt(p0.mCurrency);
          p1.writeInt(p0.mIsShowLogged);
          p1.writeSerializable(p0.mInterpretationInfo);
          p1.writeInt(p0.mBuyButtonSuccess);
          p1.writeInt(p0.mSequence);
          p1.writeInt(p0.mThumbTopComponent);
          p1.writeString(p0.buttonText);
          p1.writeSerializable(p0.mItemMark);
          p1.writeSerializable(p0.mExtraInfo);
          p1.writeString(p0.mId);
          mImageUrls = p0.mLiveShopFrames;
          if (mImageUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImageUrls.size());
             iterator = p0.mLiveShopFrames.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.isCopyForInterpret);
          mImageUrls = p0.mShowIconList;
          int i2 = 0;
          if (mImageUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImageUrls.length);
             mImageUrls = p0.mShowIconList;
             int len = mImageUrls.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                p1.writeInt(mImageUrls[i3]);
             }
          }
          p1.writeSerializable(p0.mCustomPrice);
          mImageUrls = p0.mBuyButtonImageUrls;
          if (mImageUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mImageUrls.length);
             mImageUrls = p0.mBuyButtonImageUrls;
             i1 = mImageUrls.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mImageUrls[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mStartTwinkleAnimation);
          p1.writeString(p0.mDisplayPrice);
          p1.writeSerializable(p0.mSellingPoint);
          p1.writeLong(p0.mTimeStamp);
          p1.writeSerializable(p0.mTodayHotSaleInfo);
          p1.writeInt(p0.mLeftRegionBottomButtonSuccess);
          p1.writeString(p0.mSourceTypeName);
          p1.writeString(p0.mOrderId);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mJumpUrl);
          p1.writeString(p0.mBizId);
          p1.writeInt(p0.mBizType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public Commodity getParcel(){
       return this.commodity$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       Commodity$$Parcelable.write(this.commodity$$0, p0, p1, new a());
    }
}
