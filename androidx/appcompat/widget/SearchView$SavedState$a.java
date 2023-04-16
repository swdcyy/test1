package androidx.appcompat.widget.SearchView$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.appcompat.widget.SearchView$SavedState;
import java.lang.ClassLoader;

public class SearchView$SavedState$a implements Parcelable$ClassLoaderCreator	// class@000615
{

    public void SearchView$SavedState$a(){
       super();
    }
    public SearchView$SavedState a(Parcel p0){
       return new SearchView$SavedState(p0, null);
    }
    public SearchView$SavedState b(Parcel p0,ClassLoader p1){
       return new SearchView$SavedState(p0, p1);
    }
    public SearchView$SavedState[] c(int p0){
       SearchView$SavedState[] savedStateAr = new SearchView$SavedState[p0];
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
