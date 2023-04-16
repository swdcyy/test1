package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverItem;

public class PhotoAdvertisement$CoverItem$$Parcelable$a implements Parcelable$Creator	// class@000902
{

    public void PhotoAdvertisement$CoverItem$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CoverItem$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CoverItem$$Parcelable(PhotoAdvertisement$CoverItem$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CoverItem$$Parcelable[] b(int p0){
       PhotoAdvertisement$CoverItem$$Parcelable[] uCoverItem$$ = new PhotoAdvertisement$CoverItem$$Parcelable[p0];
       return uCoverItem$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
