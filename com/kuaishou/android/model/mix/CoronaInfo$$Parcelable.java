package com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.CoronaInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason$$Parcelable;
import com.kuaishou.android.model.mix.QRecoTag;
import com.kuaishou.android.model.mix.QRecoTag$$Parcelable;
import java.util.HashMap;
import xwd.b;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class CoronaInfo$$Parcelable implements Parcelable, d	// class@000c10
{
    public CoronaInfo coronaInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaInfo$$Parcelable.CREATOR = new CoronaInfo$$Parcelable$a();
    }
    public void CoronaInfo$$Parcelable(CoronaInfo p0){
       super();
       this.coronaInfo$$0 = p0;
    }
    public static CoronaInfo read(Parcel p0,a p1){
       Map map;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaInfo uCoronaInfo = new CoronaInfo();
          p1.f(p1.g(), uCoronaInfo);
          uCoronaInfo.mCardStyleType = p0.readInt();
          uCoronaInfo.mNegativeReason = FeedNegativeFeedback$NegativeReason$$Parcelable.read(p0, p1);
          uCoronaInfo.mNegativeTimestamp = p0.readLong();
          uCoronaInfo.mBgColor = p0.readString();
          uCoronaInfo.mNegativeDetailReason = QRecoTag$$Parcelable.read(p0, p1);
          uCoronaInfo.mTitle = p0.readString();
          uCoronaInfo.mDarkBgColor = p0.readString();
          int i1 = p0.readInt();
          if (i1 < 0) {
             map = null;
          }else {
             HashMap hashMap = new HashMap(b.a(i1));
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                hashMap.put(p0.readString(), p0.readString());
             }
             map = hashMap;
          }
          uCoronaInfo.mExpParams = map;
          uCoronaInfo.mCardPlayType = p0.readInt();
          uCoronaInfo.mCover = p0.readString();
          uCoronaInfo.mSubTitle = p0.readString();
          p1.f(i, uCoronaInfo);
          return uCoronaInfo;
       }
    }
    public static void write(CoronaInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mCardStyleType);
          FeedNegativeFeedback$NegativeReason$$Parcelable.write(p0.mNegativeReason, p1, p2, p3);
          p1.writeLong(p0.mNegativeTimestamp);
          p1.writeString(p0.mBgColor);
          QRecoTag$$Parcelable.write(p0.mNegativeDetailReason, p1, p2, p3);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mDarkBgColor);
          CoronaInfo mExpParams = p0.mExpParams;
          if (mExpParams == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mExpParams.size());
             Iterator iterator = p0.mExpParams.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeInt(p0.mCardPlayType);
          p1.writeString(p0.mCover);
          p1.writeString(p0.mSubTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaInfo getParcel(){
       return this.coronaInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaInfo$$Parcelable.write(this.coronaInfo$$0, p0, p1, new a());
    }
}
