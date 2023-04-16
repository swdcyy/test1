package com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo;

public class PhotoAdvertisement$InteractionInfo$$Parcelable$a implements Parcelable$Creator	// class@00096a
{

    public void PhotoAdvertisement$InteractionInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$InteractionInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$InteractionInfo$$Parcelable(PhotoAdvertisement$InteractionInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$InteractionInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$InteractionInfo$$Parcelable[] interactionI = new PhotoAdvertisement$InteractionInfo$$Parcelable[p0];
       return interactionI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
