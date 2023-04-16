package com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo$$Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$InspireAction$$Parcelable implements Parcelable, d	// class@00095f
{
    public PhotoAdvertisement$InspireAction inspireAction$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$InspireAction$$Parcelable.CREATOR = new PhotoAdvertisement$InspireAction$$Parcelable$a();
    }
    public void PhotoAdvertisement$InspireAction$$Parcelable(PhotoAdvertisement$InspireAction p0){
       super();
       this.inspireAction$$0 = p0;
    }
    public static PhotoAdvertisement$InspireAction read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$InspireAction inspireActio = new PhotoAdvertisement$InspireAction();
          p1.f(p1.g(), inspireActio);
          inspireActio.mSecondNeoInfo = PhotoAdvertisement$SecondNeoInfo$$Parcelable.read(p0, p1);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
             list = uArrayList;
          }
          inspireActio.mFakeComment = list;
          inspireActio.mAwardType = p0.readString();
          inspireActio.mActionBar = p0.readString();
          inspireActio.mFakeCommentUrl = p0.readString();
          inspireActio.mMinActionTimeMs = p0.readInt();
          inspireActio.mPecType = p0.readInt();
          inspireActio.mPecStyle = p0.readInt();
          inspireActio.mActiveAppRewardValue = p0.readInt();
          p1.f(i, inspireActio);
          return inspireActio;
       }
    }
    public static void write(PhotoAdvertisement$InspireAction p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$SecondNeoInfo$$Parcelable.write(p0.mSecondNeoInfo, p1, p2, p3);
          PhotoAdvertisement$InspireAction mFakeComment = p0.mFakeComment;
          if (mFakeComment == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFakeComment.size());
             Iterator iterator = p0.mFakeComment.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mAwardType);
          p1.writeString(p0.mActionBar);
          p1.writeString(p0.mFakeCommentUrl);
          p1.writeInt(p0.mMinActionTimeMs);
          p1.writeInt(p0.mPecType);
          p1.writeInt(p0.mPecStyle);
          p1.writeInt(p0.mActiveAppRewardValue);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$InspireAction getParcel(){
       return this.inspireAction$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$InspireAction$$Parcelable.write(this.inspireAction$$0, p0, p1, new a());
    }
}
