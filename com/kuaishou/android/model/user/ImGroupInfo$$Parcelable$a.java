package com.kuaishou.android.model.user.ImGroupInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.user.ImGroupInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.user.ImGroupInfo;

public class ImGroupInfo$$Parcelable$a implements Parcelable$Creator	// class@000e97
{

    public void ImGroupInfo$$Parcelable$a(){
       super();
    }
    public ImGroupInfo$$Parcelable a(Parcel p0){
       return new ImGroupInfo$$Parcelable(ImGroupInfo$$Parcelable.read(p0, new a()));
    }
    public ImGroupInfo$$Parcelable[] b(int p0){
       ImGroupInfo$$Parcelable[] $ParcelableA = new ImGroupInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
