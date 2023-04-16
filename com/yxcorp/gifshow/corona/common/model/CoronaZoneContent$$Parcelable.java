package com.yxcorp.gifshow.corona.common.model.CoronaZoneContent$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneContent$$Parcelable$a;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneContent;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import java.lang.Class;
import org.parceler.a;
import java.util.List;
import java.util.Iterator;
import org.parceler.a$c;

public class CoronaZoneContent$$Parcelable implements Parcelable, d	// class@00122a
{
    public CoronaZoneContent coronaZoneContent$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaZoneContent$$Parcelable.CREATOR = new CoronaZoneContent$$Parcelable$a();
    }
    public void CoronaZoneContent$$Parcelable(CoronaZoneContent p0){
       super();
       this.coronaZoneContent$$0 = p0;
    }
    public static CoronaZoneContent read(Parcel p0,a p1){
       List list;
       CDNUrl[] uCDNUrlArray1;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaZoneContent uCoronaZoneC = new CoronaZoneContent();
          p1.f(p1.g(), uCoronaZoneC);
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             list = uCDNUrlArray;
          }else {
             list = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                list.add(QPhoto$$Parcelable.read(p0, p1));
             }
          }
          uCoronaZoneC.mFeeds = list;
          uCoronaZoneC.mZoneUpRightName = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoronaZoneC.mDarkModeLeftTopIcon = uCDNUrlArray1;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uCoronaZoneC.mCanSlideToScheme = b;
          uCoronaZoneC.mMiniAppServerParams = p0.readString();
          uCoronaZoneC.mPage = p0.readInt();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCoronaZoneC.mLeftTopIcon = uCDNUrlArray;
          uCoronaZoneC.mName = p0.readString();
          uCoronaZoneC.mTabId = p0.readInt();
          uCoronaZoneC.mScheme = p0.readString();
          a.d(SyncableProviderContainer.class, uCoronaZoneC, "dataMap", new c().d(p0));
          p1.f(i, uCoronaZoneC);
          return uCoronaZoneC;
       }
    }
    public static void write(CoronaZoneContent p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaZoneContent mFeeds = p0.mFeeds;
          if (mFeeds == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mFeeds.size());
             Iterator iterator = p0.mFeeds.iterator();
             while (iterator.hasNext()) {
                QPhoto$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mZoneUpRightName);
          mFeeds = p0.mDarkModeLeftTopIcon;
          int i2 = 0;
          if (mFeeds == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mFeeds.length);
             mFeeds = p0.mDarkModeLeftTopIcon;
             int len = mFeeds.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mFeeds[i3], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mCanSlideToScheme);
          p1.writeString(p0.mMiniAppServerParams);
          p1.writeInt(p0.mPage);
          mFeeds = p0.mLeftTopIcon;
          if (mFeeds == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mFeeds.length);
             mFeeds = p0.mLeftTopIcon;
             i1 = mFeeds.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mFeeds[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mName);
          p1.writeInt(p0.mTabId);
          p1.writeString(p0.mScheme);
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaZoneContent getParcel(){
       return this.coronaZoneContent$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaZoneContent$$Parcelable.write(this.coronaZoneContent$$0, p0, p1, new a());
    }
}
