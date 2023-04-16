package com.kwai.feature.api.corona.model.CoronaTvFilm$EpisodeModuleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.model.CoronaTvFilm$EpisodeModuleInfo$$Parcelable$a;
import com.kwai.feature.api.corona.model.CoronaTvFilm$EpisodeModuleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaTvFilm$EpisodeModuleInfo$$Parcelable implements Parcelable, d	// class@000e07
{
    public CoronaTvFilm$EpisodeModuleInfo episodeModuleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaTvFilm$EpisodeModuleInfo$$Parcelable.CREATOR = new CoronaTvFilm$EpisodeModuleInfo$$Parcelable$a();
    }
    public void CoronaTvFilm$EpisodeModuleInfo$$Parcelable(CoronaTvFilm$EpisodeModuleInfo p0){
       super();
       this.episodeModuleInfo$$0 = p0;
    }
    public static CoronaTvFilm$EpisodeModuleInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaTvFilm$EpisodeModuleInfo uEpisodeModu = new CoronaTvFilm$EpisodeModuleInfo();
          p1.f(p1.g(), uEpisodeModu);
          uEpisodeModu.mRightTopText = p0.readString();
          uEpisodeModu.mCoverRightBottomText = p0.readString();
          uEpisodeModu.mCoverLeftTopIconText = p0.readString();
          uEpisodeModu.mEpisodeTitle = p0.readString();
          p1.f(i, uEpisodeModu);
          return uEpisodeModu;
       }
    }
    public static void write(CoronaTvFilm$EpisodeModuleInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mRightTopText);
          p1.writeString(p0.mCoverRightBottomText);
          p1.writeString(p0.mCoverLeftTopIconText);
          p1.writeString(p0.mEpisodeTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaTvFilm$EpisodeModuleInfo getParcel(){
       return this.episodeModuleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaTvFilm$EpisodeModuleInfo$$Parcelable.write(this.episodeModuleInfo$$0, p0, p1, new a());
    }
}
