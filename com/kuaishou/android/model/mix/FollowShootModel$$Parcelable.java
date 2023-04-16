package com.kuaishou.android.model.mix.FollowShootModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.FollowShootModel$$Parcelable$a;
import com.kuaishou.android.model.mix.FollowShootModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class FollowShootModel$$Parcelable implements Parcelable, d	// class@000c8c
{
    public FollowShootModel followShootModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FollowShootModel$$Parcelable.CREATOR = new FollowShootModel$$Parcelable$a();
    }
    public void FollowShootModel$$Parcelable(FollowShootModel p0){
       super();
       this.followShootModel$$0 = p0;
    }
    public static FollowShootModel read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FollowShootModel uFollowShoot = new FollowShootModel();
          p1.f(p1.g(), uFollowShoot);
          int i1 = 0;
          boolean b = true;
          int b1 = (p0.readInt() == b)? true: false;
          uFollowShoot.mIsLipsSyncPhoto = b1;
          if (p0.readInt() != b) {
             b = false;
          }
          uFollowShoot.mDisableFollowShoot = b;
          b1 = p0.readInt();
          if (b1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(b1);
             for (; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uFollowShoot.mLrcUrls = list;
          p1.f(i, uFollowShoot);
          return uFollowShoot;
       }
    }
    public static void write(FollowShootModel p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsLipsSyncPhoto);
          p1.writeInt(p0.mDisableFollowShoot);
          FollowShootModel mLrcUrls = p0.mLrcUrls;
          if (mLrcUrls == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mLrcUrls.size());
             Iterator iterator = p0.mLrcUrls.iterator();
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
    public FollowShootModel getParcel(){
       return this.followShootModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FollowShootModel$$Parcelable.write(this.followShootModel$$0, p0, p1, new a());
    }
}
