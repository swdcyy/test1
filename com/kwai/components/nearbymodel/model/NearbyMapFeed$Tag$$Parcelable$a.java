package com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$Tag;

public class NearbyMapFeed$Tag$$Parcelable$a implements Parcelable$Creator	// class@000cb2
{

    public void NearbyMapFeed$Tag$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NearbyMapFeed$Tag$$Parcelable(NearbyMapFeed$Tag$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NearbyMapFeed$Tag$$Parcelable[] tag$$Parcela = new NearbyMapFeed$Tag$$Parcelable[p0];
       return tag$$Parcela;
    }
}
