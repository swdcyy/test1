package android.support.v4.media.session.MediaSessionCompat$Token$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ClassLoader;
import android.os.Parcelable;

public class MediaSessionCompat$Token$a implements Parcelable$Creator	// class@0003ee
{

    public void MediaSessionCompat$Token$a(){
       super();
    }
    public MediaSessionCompat$Token a(Parcel p0){
       return new MediaSessionCompat$Token(p0.readParcelable(null));
    }
    public MediaSessionCompat$Token[] b(int p0){
       MediaSessionCompat$Token[] tokenArray = new MediaSessionCompat$Token[p0];
       return tokenArray;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
