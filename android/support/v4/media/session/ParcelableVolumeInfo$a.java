package android.support.v4.media.session.ParcelableVolumeInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import android.support.v4.media.session.ParcelableVolumeInfo;

public class ParcelableVolumeInfo$a implements Parcelable$Creator	// class@0003fb
{

    public void ParcelableVolumeInfo$a(){
       super();
    }
    public ParcelableVolumeInfo a(Parcel p0){
       return new ParcelableVolumeInfo(p0);
    }
    public ParcelableVolumeInfo[] b(int p0){
       ParcelableVolumeInfo[] parcelableVo = new ParcelableVolumeInfo[p0];
       return parcelableVo;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
