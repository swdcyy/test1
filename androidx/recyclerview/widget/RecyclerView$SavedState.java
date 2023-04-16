package androidx.recyclerview.widget.RecyclerView$SavedState;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Class;
import android.os.Parcelable;

public class RecyclerView$SavedState extends AbsSavedState	// class@000885
{
    public Parcelable d;
    public static final Parcelable$Creator CREATOR;

    static {
       RecyclerView$SavedState.CREATOR = new RecyclerView$SavedState$a();
    }
    public void RecyclerView$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       if (p1 != null) {
       }else {
          p1 = RecyclerView$LayoutManager.class.getClassLoader();
       }
       this.d = p0.readParcelable(p1);
       return;
    }
    public void RecyclerView$SavedState(Parcelable p0){
       super(p0);
    }
    public void b(RecyclerView$SavedState p0){
       this.d = p0.d;
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeParcelable(this.d, 0);
    }
}
