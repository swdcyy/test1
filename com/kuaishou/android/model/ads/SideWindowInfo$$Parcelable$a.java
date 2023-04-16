package com.kuaishou.android.model.ads.SideWindowInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.SideWindowInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.SideWindowInfo;

public class SideWindowInfo$$Parcelable$a implements Parcelable$Creator	// class@000a7a
{

    public void SideWindowInfo$$Parcelable$a(){
       super();
    }
    public SideWindowInfo$$Parcelable a(Parcel p0){
       return new SideWindowInfo$$Parcelable(SideWindowInfo$$Parcelable.read(p0, new a()));
    }
    public SideWindowInfo$$Parcelable[] b(int p0){
       SideWindowInfo$$Parcelable[] $ParcelableA = new SideWindowInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
