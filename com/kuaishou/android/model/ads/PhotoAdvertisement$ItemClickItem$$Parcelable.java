package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$$Parcelable;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$ItemClickItem$$Parcelable implements Parcelable, d	// class@000977
{
    public PhotoAdvertisement$ItemClickItem itemClickItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ItemClickItem$$Parcelable.CREATOR = new PhotoAdvertisement$ItemClickItem$$Parcelable$a();
    }
    public void PhotoAdvertisement$ItemClickItem$$Parcelable(PhotoAdvertisement$ItemClickItem p0){
       super();
       this.itemClickItem$$0 = p0;
    }
    public static PhotoAdvertisement$ItemClickItem read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$ItemClickItem itemClickIte = new PhotoAdvertisement$ItemClickItem();
          p1.f(p1.g(), itemClickIte);
          itemClickIte.mItemClickUrl = PhotoAdvertisement$ItemClickUrl$$Parcelable.read(p0, p1);
          int i1 = p0.readInt();
          List list = null;
          if (i1 >= 0) {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                List list1 = (p0.readInt() < 0)? list: Integer.valueOf(p0.readInt());
                uArrayList.add(list1);
             }
             list = uArrayList;
          }
          itemClickIte.mItemClickTypeList = list;
          p1.f(i, itemClickIte);
          return itemClickIte;
       }
    }
    public static void write(PhotoAdvertisement$ItemClickItem p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$ItemClickUrl$$Parcelable.write(p0.mItemClickUrl, p1, p2, p3);
          PhotoAdvertisement$ItemClickItem mItemClickTy = p0.mItemClickTypeList;
          if (mItemClickTy == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mItemClickTy.size());
             Iterator iterator = p0.mItemClickTypeList.iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(integer.intValue());
                }
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ItemClickItem getParcel(){
       return this.itemClickItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ItemClickItem$$Parcelable.write(this.itemClickItem$$0, p0, p1, new a());
    }
}
