package com.kwai.components.nearbymodel.model.NearbyCommonMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.NearbyCommonMeta$$Parcelable$a;
import com.kwai.components.nearbymodel.model.NearbyCommonMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.components.nearbymodel.model.NearbyLocalLifePoiV2;
import com.kwai.components.nearbymodel.model.NearbyMapFeed;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$$Parcelable;
import com.kwai.components.nearbymodel.model.NearbyFeedBottomCard;
import com.kwai.components.nearbymodel.model.NearbyPhotoMapFastCommentGuide;

public class NearbyCommonMeta$$Parcelable implements Parcelable, d	// class@000c94
{
    public NearbyCommonMeta nearbyCommonMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearbyCommonMeta$$Parcelable.CREATOR = new NearbyCommonMeta$$Parcelable$a();
    }
    public void NearbyCommonMeta$$Parcelable(NearbyCommonMeta p0){
       super();
       this.nearbyCommonMeta$$0 = p0;
    }
    public static NearbyCommonMeta read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          NearbyCommonMeta nearbyCommon = new NearbyCommonMeta();
          p1.f(p1.g(), nearbyCommon);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          nearbyCommon.mNearbyShowTime = b1;
          nearbyCommon.mNearbyLocalLifePoiV2 = p0.readSerializable();
          nearbyCommon.mNearbyMapFeed = NearbyMapFeed$$Parcelable.read(p0, p1);
          if (p0.readInt() == 1) {
             b = true;
          }
          nearbyCommon.mIsChatted = b;
          nearbyCommon.mNearbyRecoSlideInfo = p0.readString();
          nearbyCommon.momentCategory = p0.readInt();
          nearbyCommon.mNearbyFeedBottomCard = p0.readSerializable();
          nearbyCommon.mMomentId = p0.readString();
          nearbyCommon.mLinkUrl = p0.readString();
          nearbyCommon.mPhotoMapFastCommentGuide = p0.readSerializable();
          p1.f(i, nearbyCommon);
          return nearbyCommon;
       }
    }
    public static void write(NearbyCommonMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mNearbyShowTime);
          p1.writeSerializable(p0.mNearbyLocalLifePoiV2);
          NearbyMapFeed$$Parcelable.write(p0.mNearbyMapFeed, p1, p2, p3);
          p1.writeInt(p0.mIsChatted);
          p1.writeString(p0.mNearbyRecoSlideInfo);
          p1.writeInt(p0.momentCategory);
          p1.writeSerializable(p0.mNearbyFeedBottomCard);
          p1.writeString(p0.mMomentId);
          p1.writeString(p0.mLinkUrl);
          p1.writeSerializable(p0.mPhotoMapFastCommentGuide);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NearbyCommonMeta getParcel(){
       return this.nearbyCommonMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearbyCommonMeta$$Parcelable.write(this.nearbyCommonMeta$$0, p0, p1, new a());
    }
}
