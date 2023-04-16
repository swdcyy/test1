package androidx.fragment.app.FragmentState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.fragment.app.FragmentState;

public final class FragmentState$a implements Parcelable$Creator	// class@000795
{

    public void FragmentState$a(){
       super();
    }
    public FragmentState a(Parcel p0){
       return new FragmentState(p0);
    }
    public FragmentState[] b(int p0){
       FragmentState[] uFragmentSta = new FragmentState[p0];
       return uFragmentSta;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
