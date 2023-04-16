package com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$AdSurveyInfo$$Parcelable implements Parcelable, d	// class@0008b3
{
    public PhotoAdvertisement$AdSurveyInfo adSurveyInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdSurveyInfo$$Parcelable.CREATOR = new PhotoAdvertisement$AdSurveyInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdSurveyInfo$$Parcelable(PhotoAdvertisement$AdSurveyInfo p0){
       super();
       this.adSurveyInfo$$0 = p0;
    }
    public static PhotoAdvertisement$AdSurveyInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$AdSurveyInfo uAdSurveyInf = new PhotoAdvertisement$AdSurveyInfo();
          p1.f(p1.g(), uAdSurveyInf);
          uAdSurveyInf.mFrequencyType = p0.readInt();
          uAdSurveyInf.mTemplateId = p0.readString();
          p1.f(i, uAdSurveyInf);
          return uAdSurveyInf;
       }
    }
    public static void write(PhotoAdvertisement$AdSurveyInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mFrequencyType);
          p1.writeString(p0.mTemplateId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdSurveyInfo getParcel(){
       return this.adSurveyInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdSurveyInfo$$Parcelable.write(this.adSurveyInfo$$0, p0, p1, new a());
    }
}
