package com.kwai.feature.api.corona.model.CoronaTvFilm$Actor$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.corona.model.CoronaTvFilm$Actor$$Parcelable;
import xwd.a;
import com.kwai.feature.api.corona.model.CoronaTvFilm$Actor;

public class CoronaTvFilm$Actor$$Parcelable$a implements Parcelable$Creator	// class@000e00
{

    public void CoronaTvFilm$Actor$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaTvFilm$Actor$$Parcelable(CoronaTvFilm$Actor$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaTvFilm$Actor$$Parcelable[] uActor$$Parc = new CoronaTvFilm$Actor$$Parcelable[p0];
       return uActor$$Parc;
    }
}
