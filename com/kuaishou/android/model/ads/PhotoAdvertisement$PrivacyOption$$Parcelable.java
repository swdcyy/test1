package com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo$$Parcelable;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$PrivacyOption$$Parcelable implements Parcelable, d	// class@0009ea
{
    public PhotoAdvertisement$PrivacyOption privacyOption$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PrivacyOption$$Parcelable.CREATOR = new PhotoAdvertisement$PrivacyOption$$Parcelable$a();
    }
    public void PhotoAdvertisement$PrivacyOption$$Parcelable(PhotoAdvertisement$PrivacyOption p0){
       super();
       this.privacyOption$$0 = p0;
    }
    public static PhotoAdvertisement$PrivacyOption read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$PrivacyOption privacyOptio = new PhotoAdvertisement$PrivacyOption();
          p1.f(p1.g(), privacyOptio);
          privacyOptio.mPrivacyAppInfo = PhotoAdvertisement$PrivacyAppInfo$$Parcelable.read(p0, p1);
          privacyOptio.mPhotoRiskTipUrl = p0.readString();
          privacyOptio.mAppDisplayText = p0.readString();
          privacyOptio.mRiskTipText = p0.readString();
          boolean b = false;
          int b1 = (p0.readInt() == 1)? true: false;
          privacyOptio.mShowH5RiskTip = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(b1);
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(PhotoAdvertisement$AppInfoLink$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          privacyOptio.mAppInfoLinkList = list;
          privacyOptio.mDisplayPosition = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          privacyOptio.mShowPhotoRiskTip = b;
          privacyOptio.mStyle = p0.readInt();
          p1.f(i, privacyOptio);
          return privacyOptio;
       }
    }
    public static void write(PhotoAdvertisement$PrivacyOption p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$PrivacyAppInfo$$Parcelable.write(p0.mPrivacyAppInfo, p1, p2, p3);
          p1.writeString(p0.mPhotoRiskTipUrl);
          p1.writeString(p0.mAppDisplayText);
          p1.writeString(p0.mRiskTipText);
          p1.writeInt(p0.mShowH5RiskTip);
          PhotoAdvertisement$PrivacyOption mAppInfoLink = p0.mAppInfoLinkList;
          if (mAppInfoLink == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAppInfoLink.size());
             Iterator iterator = p0.mAppInfoLinkList.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$AppInfoLink$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mDisplayPosition);
          p1.writeInt(p0.mShowPhotoRiskTip);
          p1.writeInt(p0.mStyle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PrivacyOption getParcel(){
       return this.privacyOption$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PrivacyOption$$Parcelable.write(this.privacyOption$$0, p0, p1, new a());
    }
}
