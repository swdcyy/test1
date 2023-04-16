package com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;

public class PhotoAdvertisement$TkTemplateData$$Parcelable$a implements Parcelable$Creator	// class@000a2d
{

    public void PhotoAdvertisement$TkTemplateData$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$TkTemplateData$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$TkTemplateData$$Parcelable(PhotoAdvertisement$TkTemplateData$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$TkTemplateData$$Parcelable[] b(int p0){
       PhotoAdvertisement$TkTemplateData$$Parcelable[] tkTemplateDa = new PhotoAdvertisement$TkTemplateData$$Parcelable[p0];
       return tkTemplateDa;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
