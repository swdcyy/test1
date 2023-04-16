package com.yxcorp.gifshow.gamezone.model.GameZoneModels$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels;

public class GameZoneModels$$Parcelable$a implements Parcelable$Creator	// class@0012bc
{

    public void GameZoneModels$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new GameZoneModels$$Parcelable(GameZoneModels$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       GameZoneModels$$Parcelable[] $ParcelableA = new GameZoneModels$$Parcelable[p0];
       return $ParcelableA;
    }
}
