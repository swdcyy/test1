package com.kwai.components.nearbymodel.model.NearbyMapFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$$Parcelable$a;
import com.kwai.components.nearbymodel.model.NearbyMapFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag$$Parcelable;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$$Parcelable;
import java.io.Serializable;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RelationTag;
import java.util.List;
import java.util.Iterator;

public class NearbyMapFeed$$Parcelable implements Parcelable, d	// class@000ca0
{
    public NearbyMapFeed nearbyMapFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NearbyMapFeed$$Parcelable.CREATOR = new NearbyMapFeed$$Parcelable$a();
    }
    public void NearbyMapFeed$$Parcelable(NearbyMapFeed p0){
       super();
       this.nearbyMapFeed$$0 = p0;
    }
    public static NearbyMapFeed read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          NearbyMapFeed nearbyMapFee = new NearbyMapFeed();
          p1.f(p1.g(), nearbyMapFee);
          nearbyMapFee.mDefaultText = p0.readString();
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(NearbyMapFeed$Tag$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          nearbyMapFee.mTags = list;
          nearbyMapFee.mAuthorHeaderTagType = p0.readInt();
          nearbyMapFee.mRoleInfo = NearbyMapFeed$RoleInfo$$Parcelable.read(p0, p1);
          nearbyMapFee.mCardStyle = p0.readInt();
          nearbyMapFee.latitude = p0.readDouble();
          nearbyMapFee.mHotCardLeftTagType = p0.readInt();
          nearbyMapFee.mFeedLandingLink = p0.readString();
          nearbyMapFee.mRelationTag = p0.readSerializable();
          nearbyMapFee.longitude = p0.readDouble();
          if (p0.readInt() == 1) {
             b = true;
          }
          nearbyMapFee.mMarkerSelected = b;
          p1.f(i, nearbyMapFee);
          return nearbyMapFee;
       }
    }
    public static void write(NearbyMapFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mDefaultText);
          NearbyMapFeed mTags = p0.mTags;
          if (mTags == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTags.size());
             Iterator iterator = p0.mTags.iterator();
             while (iterator.hasNext()) {
                NearbyMapFeed$Tag$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mAuthorHeaderTagType);
          NearbyMapFeed$RoleInfo$$Parcelable.write(p0.mRoleInfo, p1, p2, p3);
          p1.writeInt(p0.mCardStyle);
          p1.writeDouble(p0.latitude);
          p1.writeInt(p0.mHotCardLeftTagType);
          p1.writeString(p0.mFeedLandingLink);
          p1.writeSerializable(p0.mRelationTag);
          p1.writeDouble(p0.longitude);
          p1.writeInt(p0.mMarkerSelected);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NearbyMapFeed getParcel(){
       return this.nearbyMapFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NearbyMapFeed$$Parcelable.write(this.nearbyMapFeed$$0, p0, p1, new a());
    }
}
