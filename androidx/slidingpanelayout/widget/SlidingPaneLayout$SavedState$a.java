package androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState;
import java.lang.ClassLoader;

public final class SlidingPaneLayout$SavedState$a implements Parcelable$ClassLoaderCreator	// class@00098d
{

    public void SlidingPaneLayout$SavedState$a(){
       super();
    }
    public SlidingPaneLayout$SavedState a(Parcel p0){
       return new SlidingPaneLayout$SavedState(p0, null);
    }
    public SlidingPaneLayout$SavedState b(Parcel p0,ClassLoader p1){
       return new SlidingPaneLayout$SavedState(p0, null);
    }
    public SlidingPaneLayout$SavedState[] c(int p0){
       SlidingPaneLayout$SavedState[] savedStateAr = new SlidingPaneLayout$SavedState[p0];
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
