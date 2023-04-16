package com.kuaishou.android.model.feed.AccompanyInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.AccompanyInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.AccompanyInfo;

public class AccompanyInfo$$Parcelable$a implements Parcelable$Creator	// class@000acb
{

    public void AccompanyInfo$$Parcelable$a(){
       super();
    }
    public AccompanyInfo$$Parcelable a(Parcel p0){
       return new AccompanyInfo$$Parcelable(AccompanyInfo$$Parcelable.read(p0, new a()));
    }
    public AccompanyInfo$$Parcelable[] b(int p0){
       AccompanyInfo$$Parcelable[] $ParcelableA = new AccompanyInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
