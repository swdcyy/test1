package com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;

public class PhotoAdvertisement$HeaderData$$Parcelable$a implements Parcelable$Creator	// class@000956
{

    public void PhotoAdvertisement$HeaderData$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$HeaderData$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$HeaderData$$Parcelable(PhotoAdvertisement$HeaderData$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$HeaderData$$Parcelable[] b(int p0){
       PhotoAdvertisement$HeaderData$$Parcelable[] headerData$$ = new PhotoAdvertisement$HeaderData$$Parcelable[p0];
       return headerData$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
