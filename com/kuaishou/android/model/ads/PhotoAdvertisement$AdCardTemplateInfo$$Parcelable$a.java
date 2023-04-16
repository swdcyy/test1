package com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo;

public class PhotoAdvertisement$AdCardTemplateInfo$$Parcelable$a implements Parcelable$Creator	// class@000897
{

    public void PhotoAdvertisement$AdCardTemplateInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdCardTemplateInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdCardTemplateInfo$$Parcelable(PhotoAdvertisement$AdCardTemplateInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdCardTemplateInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdCardTemplateInfo$$Parcelable[] uAdCardTempl = new PhotoAdvertisement$AdCardTemplateInfo$$Parcelable[p0];
       return uAdCardTempl;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
