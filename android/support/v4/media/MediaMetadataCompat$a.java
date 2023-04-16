package android.support.v4.media.MediaMetadataCompat$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;

public class MediaMetadataCompat$a implements Parcelable$Creator	// class@0003d9
{

    public void MediaMetadataCompat$a(){
       super();
    }
    public MediaMetadataCompat a(Parcel p0){
       return new MediaMetadataCompat(p0);
    }
    public MediaMetadataCompat[] b(int p0){
       MediaMetadataCompat[] mediaMetadat = new MediaMetadataCompat[p0];
       return mediaMetadat;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
