package androidx.core.widget.NestedScrollView$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.core.widget.NestedScrollView$SavedState;

public class NestedScrollView$SavedState$a implements Parcelable$Creator	// class@00072a
{

    public void NestedScrollView$SavedState$a(){
       super();
    }
    public NestedScrollView$SavedState a(Parcel p0){
       return new NestedScrollView$SavedState(p0);
    }
    public NestedScrollView$SavedState[] b(int p0){
       NestedScrollView$SavedState[] savedStateAr = new NestedScrollView$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
