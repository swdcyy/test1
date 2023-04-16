package android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;

public class MediaSessionCompat$ResultReceiverWrapper$a implements Parcelable$Creator	// class@0003ec
{

    public void MediaSessionCompat$ResultReceiverWrapper$a(){
       super();
    }
    public MediaSessionCompat$ResultReceiverWrapper a(Parcel p0){
       return new MediaSessionCompat$ResultReceiverWrapper(p0);
    }
    public MediaSessionCompat$ResultReceiverWrapper[] b(int p0){
       MediaSessionCompat$ResultReceiverWrapper[] resultReceiv = new MediaSessionCompat$ResultReceiverWrapper[p0];
       return resultReceiv;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
