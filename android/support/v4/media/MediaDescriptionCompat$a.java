package android.support.v4.media.MediaDescriptionCompat$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.media.MediaDescription;

public class MediaDescriptionCompat$a implements Parcelable$Creator	// class@0003d6
{

    public void MediaDescriptionCompat$a(){
       super();
    }
    public MediaDescriptionCompat a(Parcel p0){
       return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(p0));
    }
    public MediaDescriptionCompat[] b(int p0){
       MediaDescriptionCompat[] mediaDescrip = new MediaDescriptionCompat[p0];
       return mediaDescrip;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
