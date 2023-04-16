package android.support.v4.media.RatingCompat$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.RatingCompat;

public class RatingCompat$a implements Parcelable$Creator	// class@0003dc
{

    public void RatingCompat$a(){
       super();
    }
    public RatingCompat a(Parcel p0){
       return new RatingCompat(p0.readInt(), p0.readFloat());
    }
    public RatingCompat[] b(int p0){
       RatingCompat[] ratingCompat = new RatingCompat[p0];
       return ratingCompat;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
