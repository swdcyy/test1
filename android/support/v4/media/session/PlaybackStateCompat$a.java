package android.support.v4.media.session.PlaybackStateCompat$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;

public class PlaybackStateCompat$a implements Parcelable$Creator	// class@0003ff
{

    public void PlaybackStateCompat$a(){
       super();
    }
    public PlaybackStateCompat a(Parcel p0){
       return new PlaybackStateCompat(p0);
    }
    public PlaybackStateCompat[] b(int p0){
       PlaybackStateCompat[] playbackStat = new PlaybackStateCompat[p0];
       return playbackStat;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
