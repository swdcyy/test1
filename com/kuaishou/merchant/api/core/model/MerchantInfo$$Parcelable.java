package com.kuaishou.merchant.api.core.model.MerchantInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.api.core.model.MerchantInfo$$Parcelable$a;
import com.kuaishou.merchant.api.core.model.MerchantInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.api.core.model.Commodity$$Parcelable;
import java.io.Serializable;
import com.kuaishou.merchant.api.core.model.AnchorNeedCallBackendTool;
import java.util.List;
import java.util.Iterator;

public class MerchantInfo$$Parcelable implements Parcelable, d	// class@00152a
{
    public MerchantInfo merchantInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MerchantInfo$$Parcelable.CREATOR = new MerchantInfo$$Parcelable$a();
    }
    public void MerchantInfo$$Parcelable(MerchantInfo p0){
       super();
       this.merchantInfo$$0 = p0;
    }
    public static MerchantInfo read(Parcel p0,a p1){
       List list1;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MerchantInfo merchantInfo = new MerchantInfo();
          p1.f(p1.g(), merchantInfo);
          boolean i1 = p0.readInt();
          List list = null;
          boolean b = false;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                list1.add(Commodity$$Parcelable.read(p0, p1));
             }
          }
          merchantInfo.mChosenCommodities = list1;
          i1 = (p0.readInt() == 1)? true: false;
          merchantInfo.mIsSandeagoOpen = i1;
          i1 = (p0.readInt() == 1)? true: false;
          merchantInfo.mIsAuctionOpen = i1;
          i1 = (p0.readInt() == 1)? true: false;
          merchantInfo.mHasChooseCommodity = i1;
          merchantInfo.mLivePlanBindStatus = p0.readInt();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                list.add(p0.readSerializable());
             }
          }
          merchantInfo.mAnchorNeedCallBackendTools = list;
          merchantInfo.mModuleType = p0.readString();
          merchantInfo.mToken = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          merchantInfo.mChosenCommodityChanged = b;
          merchantInfo.mBrandUserId = p0.readString();
          merchantInfo.mType = p0.readString();
          merchantInfo.mLivePlanId = p0.readLong();
          p1.f(i, merchantInfo);
          return merchantInfo;
       }
    }
    public static void write(MerchantInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          MerchantInfo mChosenCommo = p0.mChosenCommodities;
          if (mChosenCommo == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChosenCommo.size());
             Iterator iterator1 = p0.mChosenCommodities.iterator();
             while (iterator1.hasNext()) {
                Commodity$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mIsSandeagoOpen);
          p1.writeInt(p0.mIsAuctionOpen);
          p1.writeInt(p0.mHasChooseCommodity);
          p1.writeInt(p0.mLivePlanBindStatus);
          MerchantInfo mAnchorNeedC = p0.mAnchorNeedCallBackendTools;
          if (mAnchorNeedC == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAnchorNeedC.size());
             Iterator iterator = p0.mAnchorNeedCallBackendTools.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeString(p0.mModuleType);
          p1.writeString(p0.mToken);
          p1.writeInt(p0.mChosenCommodityChanged);
          p1.writeString(p0.mBrandUserId);
          p1.writeString(p0.mType);
          p1.writeLong(p0.mLivePlanId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MerchantInfo getParcel(){
       return this.merchantInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MerchantInfo$$Parcelable.write(this.merchantInfo$$0, p0, p1, new a());
    }
}
