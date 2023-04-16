package com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo;

public class NeoLiveBottomPendantInfo$$Parcelable$a implements Parcelable$Creator	// class@000875
{

    public void NeoLiveBottomPendantInfo$$Parcelable$a(){
       super();
    }
    public NeoLiveBottomPendantInfo$$Parcelable a(Parcel p0){
       return new NeoLiveBottomPendantInfo$$Parcelable(NeoLiveBottomPendantInfo$$Parcelable.read(p0, new a()));
    }
    public NeoLiveBottomPendantInfo$$Parcelable[] b(int p0){
       NeoLiveBottomPendantInfo$$Parcelable[] $ParcelableA = new NeoLiveBottomPendantInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
