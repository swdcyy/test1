package com.kwai.feature.api.corona.model.CoronaTvFilm$Directors$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.corona.model.CoronaTvFilm$Directors$$Parcelable;
import xwd.a;
import com.kwai.feature.api.corona.model.CoronaTvFilm$Directors;

public class CoronaTvFilm$Directors$$Parcelable$a implements Parcelable$Creator	// class@000e03
{

    public void CoronaTvFilm$Directors$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaTvFilm$Directors$$Parcelable(CoronaTvFilm$Directors$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaTvFilm$Directors$$Parcelable[] uDirectors$$ = new CoronaTvFilm$Directors$$Parcelable[p0];
       return uDirectors$$;
    }
}
