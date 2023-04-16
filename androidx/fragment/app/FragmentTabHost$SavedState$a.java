package androidx.fragment.app.FragmentTabHost$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.fragment.app.FragmentTabHost$SavedState;

public final class FragmentTabHost$SavedState$a implements Parcelable$Creator	// class@000797
{

    public void FragmentTabHost$SavedState$a(){
       super();
    }
    public FragmentTabHost$SavedState a(Parcel p0){
       return new FragmentTabHost$SavedState(p0);
    }
    public FragmentTabHost$SavedState[] b(int p0){
       FragmentTabHost$SavedState[] savedStateAr = new FragmentTabHost$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
