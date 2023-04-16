package android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a;
import android.os.Parcel;
import java.lang.Object;
import android.os.ResultReceiver;
import android.os.Parcelable$Creator;

public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable	// class@0003ed
{
    public ResultReceiver b;
    public static final Parcelable$Creator CREATOR;

    static {
       MediaSessionCompat$ResultReceiverWrapper.CREATOR = new MediaSessionCompat$ResultReceiverWrapper$a();
    }
    public void MediaSessionCompat$ResultReceiverWrapper(Parcel p0){
       super();
       this.b = ResultReceiver.CREATOR.createFromParcel(p0);
    }
    public void MediaSessionCompat$ResultReceiverWrapper(ResultReceiver p0){
       super();
       this.b = p0;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       this.b.writeToParcel(p0, p1);
    }
}
