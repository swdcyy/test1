package androidx.recyclerview.widget.RecyclerView$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.recyclerview.widget.RecyclerView$SavedState;
import java.lang.ClassLoader;

public class RecyclerView$SavedState$a implements Parcelable$ClassLoaderCreator	// class@000884
{

    public void RecyclerView$SavedState$a(){
       super();
    }
    public RecyclerView$SavedState a(Parcel p0){
       return new RecyclerView$SavedState(p0, null);
    }
    public RecyclerView$SavedState b(Parcel p0,ClassLoader p1){
       return new RecyclerView$SavedState(p0, p1);
    }
    public RecyclerView$SavedState[] c(int p0){
       RecyclerView$SavedState[] savedStateAr = new RecyclerView$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object createFromParcel(Parcel p0,ClassLoader p1){
       return this.b(p0, p1);
    }
    public Object[] newArray(int p0){
       return this.c(p0);
    }
}
