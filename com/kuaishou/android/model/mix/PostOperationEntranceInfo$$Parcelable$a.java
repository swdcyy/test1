package com.kuaishou.android.model.mix.PostOperationEntranceInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PostOperationEntranceInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PostOperationEntranceInfo;

public class PostOperationEntranceInfo$$Parcelable$a implements Parcelable$Creator	// class@000db4
{

    public void PostOperationEntranceInfo$$Parcelable$a(){
       super();
    }
    public PostOperationEntranceInfo$$Parcelable a(Parcel p0){
       return new PostOperationEntranceInfo$$Parcelable(PostOperationEntranceInfo$$Parcelable.read(p0, new a()));
    }
    public PostOperationEntranceInfo$$Parcelable[] b(int p0){
       PostOperationEntranceInfo$$Parcelable[] $ParcelableA = new PostOperationEntranceInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
