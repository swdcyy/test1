package com.smile.gifmaker.mvps.utils.SyncableProvider$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.smile.gifmaker.mvps.utils.SyncableProvider$$Parcelable;
import xwd.a;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public final class SyncableProvider$$Parcelable$a implements Parcelable$Creator	// class@000c2f
{

    public void SyncableProvider$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SyncableProvider$$Parcelable(SyncableProvider$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SyncableProvider$$Parcelable[] $ParcelableA = new SyncableProvider$$Parcelable[p0];
       return $ParcelableA;
    }
}
