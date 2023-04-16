package com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo$$Parcelable$a;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.api.core.model.Commodity$$Parcelable;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class MerchantInterpretationInfo$$Parcelable implements Parcelable, d	// class@001845
{
    public MerchantInterpretationInfo merchantInterpretationInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MerchantInterpretationInfo$$Parcelable.CREATOR = new MerchantInterpretationInfo$$Parcelable$a();
    }
    public void MerchantInterpretationInfo$$Parcelable(MerchantInterpretationInfo p0){
       super();
       this.merchantInterpretationInfo$$0 = p0;
    }
    public static MerchantInterpretationInfo read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MerchantInterpretationInfo merchantInte = new MerchantInterpretationInfo();
          p1.f(p1.g(), merchantInte);
          int i1 = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          merchantInte.requestNetwork = b;
          merchantInte.commodity = Commodity$$Parcelable.read(p0, p1);
          int i2 = p0.readInt();
          List list = null;
          if (i2 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i2);
             for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                list1.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          merchantInte.photoUrls = list1;
          merchantInte.channel = p0.readInt();
          merchantInte.searchSessionId = p0.readString();
          merchantInte.entranceType = p0.readInt();
          merchantInte.serverExpTag = p0.readString();
          merchantInte.sellerId = p0.readString();
          merchantInte.liveStreamId = p0.readString();
          merchantInte.mPayload = p0.readString();
          merchantInte.pageUrl = p0.readString();
          merchantInte.mLiveJumpUrl = p0.readString();
          i2 = p0.readInt();
          if (i2 >= 0) {
             list = new ArrayList(i2);
             for (; i1 < i2; i1 = i1 + 1) {
                list.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          merchantInte.coverUrls = list;
          p1.f(i, merchantInte);
          return merchantInte;
       }
    }
    public static void write(MerchantInterpretationInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.requestNetwork);
          Commodity$$Parcelable.write(p0.commodity, p1, p2, p3);
          MerchantInterpretationInfo photoUrls = p0.photoUrls;
          if (photoUrls == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(photoUrls.size());
             Iterator iterator1 = p0.photoUrls.iterator();
             while (iterator1.hasNext()) {
                CDNUrl$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.channel);
          p1.writeString(p0.searchSessionId);
          p1.writeInt(p0.entranceType);
          p1.writeString(p0.serverExpTag);
          p1.writeString(p0.sellerId);
          p1.writeString(p0.liveStreamId);
          p1.writeString(p0.mPayload);
          p1.writeString(p0.pageUrl);
          p1.writeString(p0.mLiveJumpUrl);
          photoUrls = p0.coverUrls;
          if (photoUrls == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(photoUrls.size());
             Iterator iterator = p0.coverUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MerchantInterpretationInfo getParcel(){
       return this.merchantInterpretationInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MerchantInterpretationInfo$$Parcelable.write(this.merchantInterpretationInfo$$0, p0, p1, new a());
    }
}
