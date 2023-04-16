package com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo;

public class PhotoAdvertisement$ExitDialogInfo$$Parcelable$a implements Parcelable$Creator	// class@000922
{

    public void PhotoAdvertisement$ExitDialogInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ExitDialogInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ExitDialogInfo$$Parcelable(PhotoAdvertisement$ExitDialogInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ExitDialogInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$ExitDialogInfo$$Parcelable[] uExitDialogI = new PhotoAdvertisement$ExitDialogInfo$$Parcelable[p0];
       return uExitDialogI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
