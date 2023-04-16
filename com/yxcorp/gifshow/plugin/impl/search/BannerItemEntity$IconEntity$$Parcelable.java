package com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$IconEntity$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$IconEntity$$Parcelable$a;
import com.yxcorp.gifshow.plugin.impl.search.BannerItemEntity$IconEntity;
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

public class BannerItemEntity$IconEntity$$Parcelable implements Parcelable, d	// class@000fce
{
    public BannerItemEntity$IconEntity iconEntity$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       BannerItemEntity$IconEntity$$Parcelable.CREATOR = new BannerItemEntity$IconEntity$$Parcelable$a();
    }
    public void BannerItemEntity$IconEntity$$Parcelable(BannerItemEntity$IconEntity p0){
       super();
       this.iconEntity$$0 = p0;
    }
    public static BannerItemEntity$IconEntity read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          BannerItemEntity$IconEntity iconEntity = new BannerItemEntity$IconEntity();
          p1.f(p1.g(), iconEntity);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          iconEntity.mUrl = list;
          iconEntity.mExtParams = p0.readString();
          iconEntity.mLinkUrl = p0.readString();
          p1.f(i, iconEntity);
          return iconEntity;
       }
    }
    public static void write(BannerItemEntity$IconEntity p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          BannerItemEntity$IconEntity mUrl = p0.mUrl;
          if (mUrl == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mUrl.size());
             Iterator iterator = p0.mUrl.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mExtParams);
          p1.writeString(p0.mLinkUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BannerItemEntity$IconEntity getParcel(){
       return this.iconEntity$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       BannerItemEntity$IconEntity$$Parcelable.write(this.iconEntity$$0, p0, p1, new a());
    }
}
