package com.kuaishou.android.model.mix.PostShowInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.PostShowInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.PostShowInfo;

public class PostShowInfo$$Parcelable$a implements Parcelable$Creator	// class@000db8
{

    public void PostShowInfo$$Parcelable$a(){
       super();
    }
    public PostShowInfo$$Parcelable a(Parcel p0){
       return new PostShowInfo$$Parcelable(PostShowInfo$$Parcelable.read(p0, new a()));
    }
    public PostShowInfo$$Parcelable[] b(int p0){
       PostShowInfo$$Parcelable[] $ParcelableA = new PostShowInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
