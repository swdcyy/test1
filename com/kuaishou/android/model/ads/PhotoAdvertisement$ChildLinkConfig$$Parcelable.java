package com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$ChildLinkConfig$$Parcelable implements Parcelable, d	// class@0008d9
{
    public PhotoAdvertisement$ChildLinkConfig childLinkConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ChildLinkConfig$$Parcelable.CREATOR = new PhotoAdvertisement$ChildLinkConfig$$Parcelable$a();
    }
    public void PhotoAdvertisement$ChildLinkConfig$$Parcelable(PhotoAdvertisement$ChildLinkConfig p0){
       super();
       this.childLinkConfig$$0 = p0;
    }
    public static PhotoAdvertisement$ChildLinkConfig read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$ChildLinkConfig uChildLinkCo = new PhotoAdvertisement$ChildLinkConfig();
          p1.f(p1.g(), uChildLinkCo);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$ChildLink$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uChildLinkCo.mChildLinks = list;
          p1.f(i, uChildLinkCo);
          return uChildLinkCo;
       }
    }
    public static void write(PhotoAdvertisement$ChildLinkConfig p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$ChildLinkConfig mChildLinks = p0.mChildLinks;
          if (mChildLinks == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mChildLinks.size());
             Iterator iterator = p0.mChildLinks.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$ChildLink$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ChildLinkConfig getParcel(){
       return this.childLinkConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ChildLinkConfig$$Parcelable.write(this.childLinkConfig$$0, p0, p1, new a());
    }
}
