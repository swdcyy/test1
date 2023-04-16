package com.kuaishou.android.live.model.Race$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.live.model.Race$$Parcelable;
import xwd.a;
import com.kuaishou.android.live.model.Race;

public final class Race$$Parcelable$a implements Parcelable$Creator	// class@00082f
{

    public void Race$$Parcelable$a(){
       super();
    }
    public Race$$Parcelable a(Parcel p0){
       return new Race$$Parcelable(Race$$Parcelable.read(p0, new a()));
    }
    public Race$$Parcelable[] b(int p0){
       Race$$Parcelable[] $ParcelableA = new Race$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
