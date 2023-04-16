package com.kwai.feature.api.feed.growth.model.HotInsertPageStartUpConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.feed.growth.model.HotInsertPageStartUpConfig$$Parcelable$a;
import com.kwai.feature.api.feed.growth.model.HotInsertPageStartUpConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.api.feed.growth.model.HotInsertPageStartUpConfig$InsertPageItemConfig;
import com.kwai.feature.api.feed.growth.model.HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable;
import java.io.Serializable;
import com.kwai.feature.api.feed.growth.model.HotInsertPageStartUpConfig$FollowRecommendConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class HotInsertPageStartUpConfig$$Parcelable implements Parcelable, d	// class@000ec2
{
    public HotInsertPageStartUpConfig hotInsertPageStartUpConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HotInsertPageStartUpConfig$$Parcelable.CREATOR = new HotInsertPageStartUpConfig$$Parcelable$a();
    }
    public void HotInsertPageStartUpConfig$$Parcelable(HotInsertPageStartUpConfig p0){
       super();
       this.hotInsertPageStartUpConfig$$0 = p0;
    }
    public static HotInsertPageStartUpConfig read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          HotInsertPageStartUpConfig hotInsertPag = new HotInsertPageStartUpConfig();
          p1.f(p1.g(), hotInsertPag);
          hotInsertPag.mInterestTagPageConfig = HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable.read(p0, p1);
          hotInsertPag.mFollowRecommendConfig = p0.readSerializable();
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
          hotInsertPag.mInsertPagePriority = list;
          p1.f(i, hotInsertPag);
          return hotInsertPag;
       }
    }
    public static void write(HotInsertPageStartUpConfig p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          HotInsertPageStartUpConfig$InsertPageItemConfig$$Parcelable.write(p0.mInterestTagPageConfig, p1, p2, p3);
          p1.writeSerializable(p0.mFollowRecommendConfig);
          HotInsertPageStartUpConfig mInsertPageP = p0.mInsertPagePriority;
          if (mInsertPageP == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mInsertPageP.size());
             Iterator iterator = p0.mInsertPagePriority.iterator();
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
    public HotInsertPageStartUpConfig getParcel(){
       return this.hotInsertPageStartUpConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HotInsertPageStartUpConfig$$Parcelable.write(this.hotInsertPageStartUpConfig$$0, p0, p1, new a());
    }
}
