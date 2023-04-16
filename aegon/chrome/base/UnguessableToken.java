package aegon.chrome.base.UnguessableToken;
import android.os.Parcelable;
import aegon.chrome.base.UnguessableToken$a;
import java.lang.Object;
import java.lang.Class;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class UnguessableToken implements Parcelable	// class@00015e
{
    public final long b;
    public final long c;
    public static final Parcelable$Creator CREATOR;

    static {
       UnguessableToken.CREATOR = new UnguessableToken$a();
    }
    public void UnguessableToken(long p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public static UnguessableToken create(long p0,long p1){
       return new UnguessableToken(p0, p1);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 == null || (this.getClass() == p0.getClass() && (!p0.b - this.b && !p0.c - this.c))) {
          b = true;
       }
    label_0021 :
       return b;
    }
    public long getHighForSerialization(){
       return this.b;
    }
    public long getLowForSerialization(){
       return this.c;
    }
    public int hashCode(){
       UnguessableToken tc = this.c;
       UnguessableToken tb = this.b;
       return (((int)(tc ^ (tc >> 32)) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public final UnguessableToken parcelAndUnparcelForTesting(){
       Parcel parcel = Parcel.obtain();
       this.writeToParcel(parcel, 0);
       parcel.setDataPosition(0);
       parcel.recycle();
       return UnguessableToken.CREATOR.createFromParcel(parcel);
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeLong(this.b);
       p0.writeLong(this.c);
    }
}
