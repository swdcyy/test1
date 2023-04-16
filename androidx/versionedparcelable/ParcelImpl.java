package androidx.versionedparcelable.ParcelImpl;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl$a;
import android.os.Parcel;
import java.lang.Object;
import g3.b;
import g3.c;
import androidx.versionedparcelable.a;

public class ParcelImpl implements Parcelable	// class@0009fd
{
    public final c b;
    public static final Parcelable$Creator CREATOR;

    static {
       ParcelImpl.CREATOR = new ParcelImpl$a();
    }
    public void ParcelImpl(Parcel p0){
       super();
       this.b = new b(p0).y();
    }
    public void ParcelImpl(c p0){
       super();
       this.b = p0;
    }
    public c a(){
       return this.b;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       new b(p0).V(this.b);
    }
}
