package com.kuaishou.live.core.voiceparty.theater.creation.playsource.PlayListTheaterPlaySource;
import jw2.a;
import android.os.Parcelable;
import com.kuaishou.live.core.voiceparty.theater.creation.playsource.PlayListTheaterPlaySource$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Integer;

public class PlayListTheaterPlaySource implements a, Parcelable	// class@00196c
{
    public final String b;
    public static final Parcelable$Creator CREATOR;

    static {
       PlayListTheaterPlaySource.CREATOR = new PlayListTheaterPlaySource$a();
    }
    public void PlayListTheaterPlaySource(Parcel p0){
       super();
       this.b = p0.readString();
    }
    public void PlayListTheaterPlaySource(String p0){
       super();
       this.b = p0;
    }
    public String a(){
       return this.b;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PlayListTheaterPlaySource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PlayListTheaterPlaySource{mEpisodeOrderId=\'"+this.b+'''+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PlayListTheaterPlaySource.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlayListTheaterPlaySource.class, "2")) {
          return;
       }
       p0.writeString(this.b);
       return;
    }
}
