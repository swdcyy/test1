package com.kuaishou.android.live.model.Horse$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.live.model.Horse$$Parcelable;
import xwd.a;
import com.kuaishou.android.live.model.Horse;

public final class Horse$$Parcelable$a implements Parcelable$Creator	// class@0007de
{

    public void Horse$$Parcelable$a(){
       super();
    }
    public Horse$$Parcelable a(Parcel p0){
       return new Horse$$Parcelable(Horse$$Parcelable.read(p0, new a()));
    }
    public Horse$$Parcelable[] b(int p0){
       Horse$$Parcelable[] $ParcelableA = new Horse$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
