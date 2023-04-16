package com.kuaishou.merchant.transaction.detail.skupanel.model.SkuPanelResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.transaction.detail.skupanel.model.SkuPanelResponse$$Parcelable$a;
import com.kuaishou.merchant.transaction.detail.skupanel.model.SkuPanelResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailResponse$SkuBottomTips;
import java.util.ArrayList;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.ItemInfo;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.bottombar.model.BuyButton;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.bottombar.model.BuyButton$$Parcelable;
import com.kuaishou.merchant.transaction.detail.skupanel.model.PurchaseMethodInfo;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailHiddenConfig;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailSkuPreviewImageInfo;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import java.util.List;
import java.util.Iterator;

public class SkuPanelResponse$$Parcelable implements Parcelable, d	// class@000785
{
    public SkuPanelResponse skuPanelResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SkuPanelResponse$$Parcelable.CREATOR = new SkuPanelResponse$$Parcelable$a();
    }
    public void SkuPanelResponse$$Parcelable(SkuPanelResponse p0){
       super();
       this.skuPanelResponse$$0 = p0;
    }
    public static SkuPanelResponse read(Parcel p0,a p1){
       List list1;
       ArrayList uArrayList;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SkuPanelResponse skuPanelResp = new SkuPanelResponse();
          p1.f(p1.g(), skuPanelResp);
          skuPanelResp.mSkuBottomTips = p0.readSerializable();
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          skuPanelResp.mSkuSpecifications = list1;
          skuPanelResp.mItemInfo = p0.readSerializable();
          skuPanelResp.mBuyUrl = p0.readString();
          skuPanelResp.mBuyButton = BuyButton$$Parcelable.read(p0, p1);
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          skuPanelResp.mPurchaseMethods = list1;
          skuPanelResp.mHiddenConfig = p0.readSerializable();
          skuPanelResp.mPreviewImageInfo = p0.readSerializable();
          skuPanelResp.mSelectedSkuInfo = p0.readSerializable();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(p0.readSerializable());
             }
          }
          skuPanelResp.mSkuInfos = list;
          p1.f(i, skuPanelResp);
          return skuPanelResp;
       }
    }
    public static void write(SkuPanelResponse p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mSkuBottomTips);
          SkuPanelResponse mSkuSpecific = p0.mSkuSpecifications;
          if (mSkuSpecific == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mSkuSpecific.size());
             Iterator iterator2 = p0.mSkuSpecifications.iterator();
             while (iterator2.hasNext()) {
                p1.writeSerializable(iterator2.next());
             }
          }
          p1.writeSerializable(p0.mItemInfo);
          p1.writeString(p0.mBuyUrl);
          BuyButton$$Parcelable.write(p0.mBuyButton, p1, p2, p3);
          SkuPanelResponse mPurchaseMet = p0.mPurchaseMethods;
          if (mPurchaseMet == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mPurchaseMet.size());
             Iterator iterator1 = p0.mPurchaseMethods.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeSerializable(p0.mHiddenConfig);
          p1.writeSerializable(p0.mPreviewImageInfo);
          p1.writeSerializable(p0.mSelectedSkuInfo);
          mPurchaseMet = p0.mSkuInfos;
          if (mPurchaseMet == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mPurchaseMet.size());
             Iterator iterator = p0.mSkuInfos.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SkuPanelResponse getParcel(){
       return this.skuPanelResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SkuPanelResponse$$Parcelable.write(this.skuPanelResponse$$0, p0, p1, new a());
    }
}
