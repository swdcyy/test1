package com.yxcorp.gifshow.entity.GameInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.GameInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.GameInfo;

public class GameInfo$$Parcelable$a implements Parcelable$Creator	// class@000d60
{

    public void GameInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new GameInfo$$Parcelable(GameInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       GameInfo$$Parcelable[] $ParcelableA = new GameInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}
