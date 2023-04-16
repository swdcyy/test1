package androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState;

public class StaggeredGridLayoutManager$SavedState$a implements Parcelable$Creator	// class@0008d4
{

    public void StaggeredGridLayoutManager$SavedState$a(){
       super();
    }
    public StaggeredGridLayoutManager$SavedState a(Parcel p0){
       return new StaggeredGridLayoutManager$SavedState(p0);
    }
    public StaggeredGridLayoutManager$SavedState[] b(int p0){
       StaggeredGridLayoutManager$SavedState[] savedStateAr = new StaggeredGridLayoutManager$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
