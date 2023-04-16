package aegon.chrome.base.UnguessableToken$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import aegon.chrome.base.UnguessableToken;

public class UnguessableToken$a implements Parcelable$Creator	// class@00015d
{

    public void UnguessableToken$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       long l = p0.readLong();
       long l1 = p0.readLong();
       UnguessableToken unguessableT = (!l || !l1)? null: new UnguessableToken(l, l1);
       return unguessableT;
    }
    public Object[] newArray(int p0){
       UnguessableToken[] unguessableT = new UnguessableToken[p0];
       return unguessableT;
    }
}
