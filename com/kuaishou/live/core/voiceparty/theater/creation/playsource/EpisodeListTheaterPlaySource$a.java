package com.kuaishou.live.core.voiceparty.theater.creation.playsource.EpisodeListTheaterPlaySource$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.creation.playsource.EpisodeListTheaterPlaySource;

public class EpisodeListTheaterPlaySource$a implements Parcelable$Creator	// class@001969
{

    public void EpisodeListTheaterPlaySource$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       EpisodeListTheaterPlaySource uEpisodeList = PatchProxy.applyOneRefs(p0, this, EpisodeListTheaterPlaySource$a.class, "1");
       if (uEpisodeList != PatchProxyResult.class) {
       }else {
          uEpisodeList = new EpisodeListTheaterPlaySource(p0);
       }
       return uEpisodeList;
    }
    public Object[] newArray(int p0){
       EpisodeListTheaterPlaySource[] uEpisodeList = new EpisodeListTheaterPlaySource[p0];
       return uEpisodeList;
    }
}
