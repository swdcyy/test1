package com.kuaishou.merchant.api.commercial.ShoppingCartDisplay$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.api.commercial.ShoppingCartDisplay$$Parcelable$a;
import com.kuaishou.merchant.api.commercial.ShoppingCartDisplay;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.merchant.api.commercial.MerchantCardMore;
import com.kuaishou.merchant.api.commercial.MerchantCardMore$$Parcelable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay;

public class ShoppingCartDisplay$$Parcelable implements Parcelable, d	// class@0014f7
{
    public ShoppingCartDisplay shoppingCartDisplay$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ShoppingCartDisplay$$Parcelable.CREATOR = new ShoppingCartDisplay$$Parcelable$a();
    }
    public void ShoppingCartDisplay$$Parcelable(ShoppingCartDisplay p0){
       super();
       this.shoppingCartDisplay$$0 = p0;
    }
    public static ShoppingCartDisplay read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ShoppingCartDisplay shoppingCart = new ShoppingCartDisplay();
          p1.f(p1.g(), shoppingCart);
          shoppingCart.mPrice = p0.readString();
          shoppingCart.mMore = MerchantCardMore$$Parcelable.read(p0, p1);
          shoppingCart.mShowDelayMs = p0.readLong();
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          shoppingCart.mThumbnails = uCDNUrlArray;
          shoppingCart.mTitle = p0.readString();
          shoppingCart.mSaleInfo = p0.readString();
          shoppingCart.mMerchantEnhanceDisplayType = p0.readInt();
          p1.f(i, shoppingCart);
          return shoppingCart;
       }
    }
    public static void write(ShoppingCartDisplay p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPrice);
          MerchantCardMore$$Parcelable.write(p0.mMore, p1, p2, p3);
          p1.writeLong(p0.mShowDelayMs);
          ShoppingCartDisplay mThumbnails = p0.mThumbnails;
          if (mThumbnails == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mThumbnails.length);
             mThumbnails = p0.mThumbnails;
             i1 = mThumbnails.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mThumbnails[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mSaleInfo);
          p1.writeInt(p0.mMerchantEnhanceDisplayType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ShoppingCartDisplay getParcel(){
       return this.shoppingCartDisplay$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ShoppingCartDisplay$$Parcelable.write(this.shoppingCartDisplay$$0, p0, p1, new a());
    }
}
