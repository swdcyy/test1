package com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.gamezone.model.GameZoneModels$GameInfo;

public class GameZoneModels$GameInfo$$Parcelable$a implements Parcelable$Creator	// class@0012be
{

    public void GameZoneModels$GameInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new GameZoneModels$GameInfo$$Parcelable(GameZoneModels$GameInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       GameZoneModels$GameInfo$$Parcelable[] gameInfo$$Pa = new GameZoneModels$GameInfo$$Parcelable[p0];
       return gameInfo$$Pa;
    }
}
