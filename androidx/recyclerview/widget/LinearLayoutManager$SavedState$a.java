package androidx.recyclerview.widget.LinearLayoutManager$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.recyclerview.widget.LinearLayoutManager$SavedState;

public class LinearLayoutManager$SavedState$a implements Parcelable$Creator	// class@000874
{

    public void LinearLayoutManager$SavedState$a(){
       super();
    }
    public LinearLayoutManager$SavedState a(Parcel p0){
       return new LinearLayoutManager$SavedState(p0);
    }
    public LinearLayoutManager$SavedState[] b(int p0){
       LinearLayoutManager$SavedState[] savedStateAr = new LinearLayoutManager$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
