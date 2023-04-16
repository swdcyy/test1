package com.kuaishou.android.model.mix.DetailStrongButtonConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig;

public class DetailStrongButtonConfig$$Parcelable$a implements Parcelable$Creator	// class@000c58
{

    public void DetailStrongButtonConfig$$Parcelable$a(){
       super();
    }
    public DetailStrongButtonConfig$$Parcelable a(Parcel p0){
       return new DetailStrongButtonConfig$$Parcelable(DetailStrongButtonConfig$$Parcelable.read(p0, new a()));
    }
    public DetailStrongButtonConfig$$Parcelable[] b(int p0){
       DetailStrongButtonConfig$$Parcelable[] $ParcelableA = new DetailStrongButtonConfig$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
