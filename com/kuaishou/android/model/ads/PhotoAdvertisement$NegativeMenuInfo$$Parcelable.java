package com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$NegativeMenuInfo$$Parcelable implements Parcelable, d	// class@0009ac
{
    public PhotoAdvertisement$NegativeMenuInfo negativeMenuInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$NegativeMenuInfo$$Parcelable.CREATOR = new PhotoAdvertisement$NegativeMenuInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$NegativeMenuInfo$$Parcelable(PhotoAdvertisement$NegativeMenuInfo p0){
       super();
       this.negativeMenuInfo$$0 = p0;
    }
    public static PhotoAdvertisement$NegativeMenuInfo read(Parcel p0,a p1){
       List list1;
       ArrayList uArrayList;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$NegativeMenuInfo negativeMenu = new PhotoAdvertisement$NegativeMenuInfo();
          p1.f(p1.g(), negativeMenu);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(PhotoAdvertisement$NegativeMenu$$Parcelable.read(p0, p1));
             }
          }
          negativeMenu.negativeMenus = list1;
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(PhotoAdvertisement$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          negativeMenu.detailNegativeMenu = list1;
          negativeMenu.negativeStyle = p0.readInt();
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(PhotoAdvertisement$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          negativeMenu.feedNegativeMenu = list1;
          negativeMenu.feedNegativeStyle = p0.readInt();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(PhotoAdvertisement$NegativeReason$$Parcelable.read(p0, p1));
             }
          }
          negativeMenu.thanosDetailNegativeMenu = list;
          p1.f(i, negativeMenu);
          return negativeMenu;
       }
    }
    public static void write(PhotoAdvertisement$NegativeMenuInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$NegativeMenuInfo negativeMenu = p0.negativeMenus;
          if (negativeMenu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(negativeMenu.size());
             iterator1 = p0.negativeMenus.iterator();
             while (iterator1.hasNext()) {
                PhotoAdvertisement$NegativeMenu$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          negativeMenu = p0.detailNegativeMenu;
          if (negativeMenu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(negativeMenu.size());
             iterator1 = p0.detailNegativeMenu.iterator();
             while (iterator1.hasNext()) {
                PhotoAdvertisement$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.negativeStyle);
          negativeMenu = p0.feedNegativeMenu;
          if (negativeMenu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(negativeMenu.size());
             iterator1 = p0.feedNegativeMenu.iterator();
             while (iterator1.hasNext()) {
                PhotoAdvertisement$NegativeReason$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.feedNegativeStyle);
          negativeMenu = p0.thanosDetailNegativeMenu;
          if (negativeMenu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(negativeMenu.size());
             Iterator iterator = p0.thanosDetailNegativeMenu.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$NegativeReason$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$NegativeMenuInfo getParcel(){
       return this.negativeMenuInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$NegativeMenuInfo$$Parcelable.write(this.negativeMenuInfo$$0, p0, p1, new a());
    }
}
