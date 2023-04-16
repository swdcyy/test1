package com.beloo.widget.chipslayoutmanager.cache.CacheParcelableContainer$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.beloo.widget.chipslayoutmanager.cache.CacheParcelableContainer;

public final class CacheParcelableContainer$a implements Parcelable$Creator	// class@000f0d
{

    public void CacheParcelableContainer$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CacheParcelableContainer(p0);
    }
    public Object[] newArray(int p0){
       CacheParcelableContainer[] uCacheParcel = new CacheParcelableContainer[p0];
       return uCacheParcel;
    }
}
