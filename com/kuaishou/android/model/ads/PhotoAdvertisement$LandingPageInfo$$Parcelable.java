package com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageType;
import java.lang.Class;
import java.lang.Enum;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$LandingPageInfo$$Parcelable implements Parcelable, d	// class@00098b
{
    public PhotoAdvertisement$LandingPageInfo landingPageInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$LandingPageInfo$$Parcelable.CREATOR = new PhotoAdvertisement$LandingPageInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$LandingPageInfo$$Parcelable(PhotoAdvertisement$LandingPageInfo p0){
       super();
       this.landingPageInfo$$0 = p0;
    }
    public static PhotoAdvertisement$LandingPageInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$LandingPageInfo landingPageI = new PhotoAdvertisement$LandingPageInfo();
          p1.f(p1.g(), landingPageI);
          landingPageI.mActionBarDisplayName = p0.readString();
          landingPageI.mLandingPageTitle = p0.readString();
          landingPageI.mActionBarShowTime = p0.readLong();
          int i1 = p0.readInt();
          PhotoAdvertisement$LandingPageType landingPageT = null;
          boolean b = false;
          if (i1 < 0) {
             list = landingPageT;
          }else {
             list = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                list.add(p0.readString());
             }
          }
          landingPageI.mAllowedDeeplinkPrefixList = list;
          if (p0.readInt() == 1) {
             b = true;
          }
          landingPageI.mCommentTagVisible = b;
          landingPageI.mPopLandingPageHeightPct = p0.readInt();
          String str = p0.readString();
          if (str != null) {
             landingPageT = Enum.valueOf(PhotoAdvertisement$LandingPageType.class, str);
          }
          landingPageI.mLandingPageStyle = landingPageT;
          p1.f(i, landingPageI);
          return landingPageI;
       }
    }
    public static void write(PhotoAdvertisement$LandingPageInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mActionBarDisplayName);
          p1.writeString(p0.mLandingPageTitle);
          p1.writeLong(p0.mActionBarShowTime);
          PhotoAdvertisement$LandingPageInfo mAllowedDeep = p0.mAllowedDeeplinkPrefixList;
          if (mAllowedDeep == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mAllowedDeep.size());
             Iterator iterator = p0.mAllowedDeeplinkPrefixList.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeInt(p0.mCommentTagVisible);
          p1.writeInt(p0.mPopLandingPageHeightPct);
          p0 = p0.mLandingPageStyle;
          String str = (p0 == null)? null: p0.name();
          p1.writeString(str);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$LandingPageInfo getParcel(){
       return this.landingPageInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$LandingPageInfo$$Parcelable.write(this.landingPageInfo$$0, p0, p1, new a());
    }
}
