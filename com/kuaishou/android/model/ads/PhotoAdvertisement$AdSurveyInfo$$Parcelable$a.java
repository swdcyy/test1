package com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo;

public class PhotoAdvertisement$AdSurveyInfo$$Parcelable$a implements Parcelable$Creator	// class@0008b2
{

    public void PhotoAdvertisement$AdSurveyInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdSurveyInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdSurveyInfo$$Parcelable(PhotoAdvertisement$AdSurveyInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdSurveyInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdSurveyInfo$$Parcelable[] uAdSurveyInf = new PhotoAdvertisement$AdSurveyInfo$$Parcelable[p0];
       return uAdSurveyInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
