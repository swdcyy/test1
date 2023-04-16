package com.kuaishou.android.model.mix.AggregateV6Model$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.AggregateV6Model$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.AggregateV6Model;

public class AggregateV6Model$$Parcelable$a implements Parcelable$Creator	// class@000bb3
{

    public void AggregateV6Model$$Parcelable$a(){
       super();
    }
    public AggregateV6Model$$Parcelable a(Parcel p0){
       return new AggregateV6Model$$Parcelable(AggregateV6Model$$Parcelable.read(p0, new a()));
    }
    public AggregateV6Model$$Parcelable[] b(int p0){
       AggregateV6Model$$Parcelable[] $ParcelableA = new AggregateV6Model$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
