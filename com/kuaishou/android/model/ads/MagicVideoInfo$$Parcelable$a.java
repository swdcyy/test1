package com.kuaishou.android.model.ads.MagicVideoInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.MagicVideoInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.MagicVideoInfo;

public class MagicVideoInfo$$Parcelable$a implements Parcelable$Creator	// class@000869
{

    public void MagicVideoInfo$$Parcelable$a(){
       super();
    }
    public MagicVideoInfo$$Parcelable a(Parcel p0){
       return new MagicVideoInfo$$Parcelable(MagicVideoInfo$$Parcelable.read(p0, new a()));
    }
    public MagicVideoInfo$$Parcelable[] b(int p0){
       MagicVideoInfo$$Parcelable[] $ParcelableA = new MagicVideoInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
