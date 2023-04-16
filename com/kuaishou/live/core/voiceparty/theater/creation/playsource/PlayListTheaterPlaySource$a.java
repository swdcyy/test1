package com.kuaishou.live.core.voiceparty.theater.creation.playsource.PlayListTheaterPlaySource$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.creation.playsource.PlayListTheaterPlaySource;

public class PlayListTheaterPlaySource$a implements Parcelable$Creator	// class@00196b
{

    public void PlayListTheaterPlaySource$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       PlayListTheaterPlaySource playListThea = PatchProxy.applyOneRefs(p0, this, PlayListTheaterPlaySource$a.class, "1");
       if (playListThea != PatchProxyResult.class) {
       }else {
          playListThea = new PlayListTheaterPlaySource(p0);
       }
       return playListThea;
    }
    public Object[] newArray(int p0){
       PlayListTheaterPlaySource[] playListThea = new PlayListTheaterPlaySource[p0];
       return playListThea;
    }
}
