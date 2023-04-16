package com.kuaishou.merchant.api.commercial.MarqueeDisplay$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.api.commercial.MarqueeDisplay$$Parcelable$a;
import com.kuaishou.merchant.api.commercial.MarqueeDisplay;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay;

public class MarqueeDisplay$$Parcelable implements Parcelable, d	// class@0014f1
{
    public MarqueeDisplay marqueeDisplay$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MarqueeDisplay$$Parcelable.CREATOR = new MarqueeDisplay$$Parcelable$a();
    }
    public void MarqueeDisplay$$Parcelable(MarqueeDisplay p0){
       super();
       this.marqueeDisplay$$0 = p0;
    }
    public static MarqueeDisplay read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MarqueeDisplay marqueeDispl = new MarqueeDisplay();
          p1.f(p1.g(), marqueeDispl);
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
          marqueeDispl.mIcon = uCDNUrlArray;
          marqueeDispl.mFontColor = p0.readString();
          marqueeDispl.mTitle = p0.readString();
          marqueeDispl.mMerchantEnhanceDisplayType = p0.readInt();
          p1.f(i, marqueeDispl);
          return marqueeDispl;
       }
    }
    public static void write(MarqueeDisplay p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          MarqueeDisplay mIcon = p0.mIcon;
          if (mIcon == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIcon.length);
             mIcon = p0.mIcon;
             i1 = mIcon.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mIcon[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mFontColor);
          p1.writeString(p0.mTitle);
          p1.writeInt(p0.mMerchantEnhanceDisplayType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MarqueeDisplay getParcel(){
       return this.marqueeDisplay$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MarqueeDisplay$$Parcelable.write(this.marqueeDisplay$$0, p0, p1, new a());
    }
}
