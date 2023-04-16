package com.kuaishou.android.model.mix.PhotoCommonTagInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo;

public class PhotoCommonTagInfo$$Parcelable$a implements Parcelable$Creator	// class@000d3b
{

    public void PhotoCommonTagInfo$$Parcelable$a(){
       super();
    }
    public PhotoCommonTagInfo$$Parcelable a(Parcel p0){
       return new PhotoCommonTagInfo$$Parcelable(PhotoCommonTagInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoCommonTagInfo$$Parcelable[] b(int p0){
       PhotoCommonTagInfo$$Parcelable[] $ParcelableA = new PhotoCommonTagInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
