package com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData;

public class PhotoAdvertisement$CollapsedTextData$$Parcelable$a implements Parcelable$Creator	// class@0008de
{

    public void PhotoAdvertisement$CollapsedTextData$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CollapsedTextData$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CollapsedTextData$$Parcelable(PhotoAdvertisement$CollapsedTextData$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CollapsedTextData$$Parcelable[] b(int p0){
       PhotoAdvertisement$CollapsedTextData$$Parcelable[] uCollapsedTe = new PhotoAdvertisement$CollapsedTextData$$Parcelable[p0];
       return uCollapsedTe;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
