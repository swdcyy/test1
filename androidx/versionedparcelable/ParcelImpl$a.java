package androidx.versionedparcelable.ParcelImpl$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.versionedparcelable.ParcelImpl;

public final class ParcelImpl$a implements Parcelable$Creator	// class@0009fc
{

    public void ParcelImpl$a(){
       super();
    }
    public ParcelImpl a(Parcel p0){
       return new ParcelImpl(p0);
    }
    public ParcelImpl[] b(int p0){
       ParcelImpl[] parcelImplAr = new ParcelImpl[p0];
       return parcelImplAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
