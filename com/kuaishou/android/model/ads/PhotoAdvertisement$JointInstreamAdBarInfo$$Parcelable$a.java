package com.kuaishou.android.model.ads.PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$JointInstreamAdBarInfo;

public class PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable$a implements Parcelable$Creator	// class@000982
{

    public void PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable(PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable[] jointInstrea = new PhotoAdvertisement$JointInstreamAdBarInfo$$Parcelable[p0];
       return jointInstrea;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
