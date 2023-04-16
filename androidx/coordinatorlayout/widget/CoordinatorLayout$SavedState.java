package androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;
import androidx.customview.view.AbsSavedState;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;
import android.util.SparseArray;
import java.lang.Object;

public class CoordinatorLayout$SavedState extends AbsSavedState	// class@0006c7
{
    public SparseArray d;
    public static final Parcelable$Creator CREATOR;

    static {
       CoordinatorLayout$SavedState.CREATOR = new CoordinatorLayout$SavedState$a();
    }
    public void CoordinatorLayout$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       int i = p0.readInt();
       int[] ointArray = new int[i];
       p0.readIntArray(ointArray);
       Parcelable[] parcelableAr = p0.readParcelableArray(p1);
       this.d = new SparseArray(i);
       for (int i1 = 0; i1 < i; i1++) {
          this.d.append(ointArray[i1], parcelableAr[i1]);
       }
       return;
    }
    public void CoordinatorLayout$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       CoordinatorLayout$SavedState td = this.d;
       int i = 0;
       int i1 = (td != null)? td.size(): 0;
       p0.writeInt(i1);
       int[] ointArray = new int[i1];
       Parcelable[] parcelableAr = new Parcelable[i1];
       for (; i < i1; i = i + 1) {
          ointArray[i] = this.d.keyAt(i);
          parcelableAr[i] = this.d.valueAt(i);
       }
       p0.writeIntArray(ointArray);
       p0.writeParcelableArray(parcelableAr, p1);
       return;
    }
}
