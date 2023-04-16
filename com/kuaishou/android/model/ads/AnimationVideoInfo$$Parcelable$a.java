package com.kuaishou.android.model.ads.AnimationVideoInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.AnimationVideoInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.AnimationVideoInfo;

public class AnimationVideoInfo$$Parcelable$a implements Parcelable$Creator	// class@000851
{

    public void AnimationVideoInfo$$Parcelable$a(){
       super();
    }
    public AnimationVideoInfo$$Parcelable a(Parcel p0){
       return new AnimationVideoInfo$$Parcelable(AnimationVideoInfo$$Parcelable.read(p0, new a()));
    }
    public AnimationVideoInfo$$Parcelable[] b(int p0){
       AnimationVideoInfo$$Parcelable[] $ParcelableA = new AnimationVideoInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
