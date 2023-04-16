package com.kuaishou.android.model.mix.DynamicTabInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.DynamicTabInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.DynamicTabInfo;

public class DynamicTabInfo$$Parcelable$a implements Parcelable$Creator	// class@000c5c
{

    public void DynamicTabInfo$$Parcelable$a(){
       super();
    }
    public DynamicTabInfo$$Parcelable a(Parcel p0){
       return new DynamicTabInfo$$Parcelable(DynamicTabInfo$$Parcelable.read(p0, new a()));
    }
    public DynamicTabInfo$$Parcelable[] b(int p0){
       DynamicTabInfo$$Parcelable[] $ParcelableA = new DynamicTabInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
