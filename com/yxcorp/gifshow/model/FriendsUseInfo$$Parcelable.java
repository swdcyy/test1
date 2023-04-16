package com.yxcorp.gifshow.model.FriendsUseInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.FriendsUseInfo$$Parcelable$a;
import com.yxcorp.gifshow.model.FriendsUseInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class FriendsUseInfo$$Parcelable implements Parcelable, d	// class@001e1e
{
    public FriendsUseInfo friendsUseInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FriendsUseInfo$$Parcelable.CREATOR = new FriendsUseInfo$$Parcelable$a();
    }
    public void FriendsUseInfo$$Parcelable(FriendsUseInfo p0){
       super();
       this.friendsUseInfo$$0 = p0;
    }
    public static FriendsUseInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FriendsUseInfo uFriendsUseI = new FriendsUseInfo();
          p1.f(p1.g(), uFriendsUseI);
          uFriendsUseI.mUseCount = p0.readInt();
          uFriendsUseI.mDefaultTitle = p0.readString();
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
          uFriendsUseI.mAvatarUrlList = list;
          p1.f(i, uFriendsUseI);
          return uFriendsUseI;
       }
    }
    public static void write(FriendsUseInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mUseCount);
          p1.writeString(p0.mDefaultTitle);
          FriendsUseInfo mAvatarUrlLi = p0.mAvatarUrlList;
          if (mAvatarUrlLi == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAvatarUrlLi.size());
             Iterator iterator = p0.mAvatarUrlList.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FriendsUseInfo getParcel(){
       return this.friendsUseInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FriendsUseInfo$$Parcelable.write(this.friendsUseInfo$$0, p0, p1, new a());
    }
}
