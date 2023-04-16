package com.kuaishou.android.model.mix.RankMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.RankMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.RankMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class RankMeta$$Parcelable implements Parcelable, d	// class@000dde
{
    public RankMeta rankMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RankMeta$$Parcelable.CREATOR = new RankMeta$$Parcelable$a();
    }
    public void RankMeta$$Parcelable(RankMeta p0){
       super();
       this.rankMeta$$0 = p0;
    }
    public static RankMeta read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RankMeta rankMeta = new RankMeta();
          p1.f(p1.g(), rankMeta);
          rankMeta.mContent = p0.readString();
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             list = uCDNUrlArray;
          }else {
             list = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list.add(User$$Parcelable.read(p0, p1));
             }
          }
          rankMeta.mUsers = list;
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          rankMeta.mIconUrls = uCDNUrlArray;
          rankMeta.mId = p0.readString();
          rankMeta.mTitle = p0.readString();
          rankMeta.mCategory = p0.readString();
          p1.f(i, rankMeta);
          return rankMeta;
       }
    }
    public static void write(RankMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContent);
          RankMeta mUsers = p0.mUsers;
          if (mUsers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mUsers.size());
             Iterator iterator = p0.mUsers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          mUsers = p0.mIconUrls;
          if (mUsers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mUsers.length);
             mUsers = p0.mIconUrls;
             i1 = mUsers.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mUsers[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mId);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mCategory);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RankMeta getParcel(){
       return this.rankMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RankMeta$$Parcelable.write(this.rankMeta$$0, p0, p1, new a());
    }
}
