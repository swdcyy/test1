package com.kuaishou.live.core.voiceparty.theater.creation.playsource.EpisodeListTheaterPlaySource;
import jw2.a;
import android.os.Parcelable;
import com.kuaishou.live.core.voiceparty.theater.creation.playsource.EpisodeListTheaterPlaySource$a;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Integer;

public class EpisodeListTheaterPlaySource implements a, Parcelable	// class@00196a
{
    public final int mEpisodeNumber;
    public final String mPhotoId;
    public final String mTubeId;
    public final int mType;
    public static final Parcelable$Creator CREATOR;

    static {
       EpisodeListTheaterPlaySource.CREATOR = new EpisodeListTheaterPlaySource$a();
    }
    public void EpisodeListTheaterPlaySource(Parcel p0){
       super();
       this.mTubeId = p0.readString();
       this.mEpisodeNumber = p0.readInt();
       this.mPhotoId = p0.readString();
       this.mType = p0.readInt();
    }
    public void EpisodeListTheaterPlaySource(String p0,int p1,String p2,int p3){
       super();
       this.mTubeId = p0;
       this.mEpisodeNumber = p1;
       this.mPhotoId = p2;
       this.mType = p3;
    }
    public int a(){
       return this.mEpisodeNumber;
    }
    public String b(){
       return this.mPhotoId;
    }
    public String c(){
       return this.mTubeId;
    }
    public int d(){
       return this.mType;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EpisodeListTheaterPlaySource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EpisodeListTheaterPlaySource{mTubeId=\'"+this.mTubeId+'''+", mEpisodeNumber="+this.mEpisodeNumber+", mPhotoId=\'"+this.mPhotoId+'''+", mType="+this.mType+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(EpisodeListTheaterPlaySource.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EpisodeListTheaterPlaySource.class, "2")) {
          return;
       }
       p0.writeString(this.mTubeId);
       p0.writeInt(this.mEpisodeNumber);
       p0.writeString(this.mPhotoId);
       p0.writeInt(this.mType);
       return;
    }
}
