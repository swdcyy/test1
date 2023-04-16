package android.support.v4.media.session.PlaybackStateCompat$CustomAction$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;

public class PlaybackStateCompat$CustomAction$a implements Parcelable$Creator	// class@0003fd
{

    public void PlaybackStateCompat$CustomAction$a(){
       super();
    }
    public PlaybackStateCompat$CustomAction a(Parcel p0){
       return new PlaybackStateCompat$CustomAction(p0);
    }
    public PlaybackStateCompat$CustomAction[] b(int p0){
       PlaybackStateCompat$CustomAction[] uCustomActio = new PlaybackStateCompat$CustomAction[p0];
       return uCustomActio;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
