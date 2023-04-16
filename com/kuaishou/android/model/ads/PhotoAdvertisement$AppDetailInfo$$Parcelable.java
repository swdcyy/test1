package com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$AppDetailInfo$$Parcelable implements Parcelable, d	// class@0008bf
{
    public PhotoAdvertisement$AppDetailInfo appDetailInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AppDetailInfo$$Parcelable.CREATOR = new PhotoAdvertisement$AppDetailInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$AppDetailInfo$$Parcelable(PhotoAdvertisement$AppDetailInfo p0){
       super();
       this.appDetailInfo$$0 = p0;
    }
    public static PhotoAdvertisement$AppDetailInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$AppDetailInfo uAppDetailIn = new PhotoAdvertisement$AppDetailInfo();
          p1.f(p1.g(), uAppDetailIn);
          uAppDetailIn.mAppIconUrl = p0.readString();
          uAppDetailIn.mAppVersion = p0.readString();
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
          uAppDetailIn.mCdnScreenShortUrls = list;
          uAppDetailIn.mScreenWidth = p0.readInt();
          uAppDetailIn.mScreenHeight = p0.readInt();
          uAppDetailIn.mUpdateTime = p0.readString();
          uAppDetailIn.mDownloadNum = p0.readString();
          uAppDetailIn.mAppDescription = p0.readString();
          uAppDetailIn.mAppSize = p0.readDouble();
          uAppDetailIn.mAppCategory = p0.readString();
          uAppDetailIn.mAppScore = p0.readDouble();
          uAppDetailIn.mOfficialTag = p0.readString();
          uAppDetailIn.mAppName = p0.readString();
          uAppDetailIn.mDeveloperName = p0.readString();
          p1.f(i, uAppDetailIn);
          return uAppDetailIn;
       }
    }
    public static void write(PhotoAdvertisement$AppDetailInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mAppIconUrl);
          p1.writeString(p0.mAppVersion);
          PhotoAdvertisement$AppDetailInfo mCdnScreenSh = p0.mCdnScreenShortUrls;
          if (mCdnScreenSh == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCdnScreenSh.size());
             Iterator iterator = p0.mCdnScreenShortUrls.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeInt(p0.mScreenWidth);
          p1.writeInt(p0.mScreenHeight);
          p1.writeString(p0.mUpdateTime);
          p1.writeString(p0.mDownloadNum);
          p1.writeString(p0.mAppDescription);
          p1.writeDouble(p0.mAppSize);
          p1.writeString(p0.mAppCategory);
          p1.writeDouble(p0.mAppScore);
          p1.writeString(p0.mOfficialTag);
          p1.writeString(p0.mAppName);
          p1.writeString(p0.mDeveloperName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AppDetailInfo getParcel(){
       return this.appDetailInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AppDetailInfo$$Parcelable.write(this.appDetailInfo$$0, p0, p1, new a());
    }
}
