package android.support.v4.media.session.ParcelableVolumeInfo;
import android.os.Parcelable;
import android.support.v4.media.session.ParcelableVolumeInfo$a;
import android.os.Parcel;
import java.lang.Object;

public class ParcelableVolumeInfo implements Parcelable	// class@0003fc
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public static final Parcelable$Creator CREATOR;

    static {
       ParcelableVolumeInfo.CREATOR = new ParcelableVolumeInfo$a();
    }
    public void ParcelableVolumeInfo(Parcel p0){
       super();
       this.b = p0.readInt();
       this.d = p0.readInt();
       this.e = p0.readInt();
       this.f = p0.readInt();
       this.c = p0.readInt();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeInt(this.d);
       p0.writeInt(this.e);
       p0.writeInt(this.f);
       p0.writeInt(this.c);
    }
}
