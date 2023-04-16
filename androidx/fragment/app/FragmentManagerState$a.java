package androidx.fragment.app.FragmentManagerState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.fragment.app.FragmentManagerState;

public final class FragmentManagerState$a implements Parcelable$Creator	// class@000792
{

    public void FragmentManagerState$a(){
       super();
    }
    public FragmentManagerState a(Parcel p0){
       return new FragmentManagerState(p0);
    }
    public FragmentManagerState[] b(int p0){
       FragmentManagerState[] uFragmentMan = new FragmentManagerState[p0];
       return uFragmentMan;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
