package com.kuaishou.android.live.model.Round$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.live.model.Round$$Parcelable;
import xwd.a;
import com.kuaishou.android.live.model.Round;

public final class Round$$Parcelable$a implements Parcelable$Creator	// class@000833
{

    public void Round$$Parcelable$a(){
       super();
    }
    public Round$$Parcelable a(Parcel p0){
       return new Round$$Parcelable(Round$$Parcelable.read(p0, new a()));
    }
    public Round$$Parcelable[] b(int p0){
       Round$$Parcelable[] $ParcelableA = new Round$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
