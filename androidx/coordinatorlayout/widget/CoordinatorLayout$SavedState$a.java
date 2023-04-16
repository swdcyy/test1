package androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;
import java.lang.ClassLoader;

public final class CoordinatorLayout$SavedState$a implements Parcelable$ClassLoaderCreator	// class@0006c6
{

    public void CoordinatorLayout$SavedState$a(){
       super();
    }
    public CoordinatorLayout$SavedState a(Parcel p0){
       return new CoordinatorLayout$SavedState(p0, null);
    }
    public CoordinatorLayout$SavedState b(Parcel p0,ClassLoader p1){
       return new CoordinatorLayout$SavedState(p0, p1);
    }
    public CoordinatorLayout$SavedState[] c(int p0){
       CoordinatorLayout$SavedState[] savedStateAr = new CoordinatorLayout$SavedState[p0];
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
