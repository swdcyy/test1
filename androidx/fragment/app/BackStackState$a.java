package androidx.fragment.app.BackStackState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.fragment.app.BackStackState;

public final class BackStackState$a implements Parcelable$Creator	// class@000770
{

    public void BackStackState$a(){
       super();
    }
    public BackStackState a(Parcel p0){
       return new BackStackState(p0);
    }
    public BackStackState[] b(int p0){
       BackStackState[] uBackStackSt = new BackStackState[p0];
       return uBackStackSt;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
