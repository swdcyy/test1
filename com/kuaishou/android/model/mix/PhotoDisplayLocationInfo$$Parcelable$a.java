package com.kuaishou.android.model.mix.PhotoDisplayLocationInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;

public class PhotoDisplayLocationInfo$$Parcelable$a implements Parcelable$Creator	// class@000d4b
{

    public void PhotoDisplayLocationInfo$$Parcelable$a(){
       super();
    }
    public PhotoDisplayLocationInfo$$Parcelable a(Parcel p0){
       return new PhotoDisplayLocationInfo$$Parcelable(PhotoDisplayLocationInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoDisplayLocationInfo$$Parcelable[] b(int p0){
       PhotoDisplayLocationInfo$$Parcelable[] $ParcelableA = new PhotoDisplayLocationInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
