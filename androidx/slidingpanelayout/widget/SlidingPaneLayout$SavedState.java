package androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState;
import androidx.customview.view.AbsSavedState;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;

public class SlidingPaneLayout$SavedState extends AbsSavedState	// class@00098e
{
    public boolean d;
    public static final Parcelable$Creator CREATOR;

    static {
       SlidingPaneLayout$SavedState.CREATOR = new SlidingPaneLayout$SavedState$a();
    }
    public void SlidingPaneLayout$SavedState(Parcel p0,ClassLoader p1){
       super(p0, null);
       boolean b = (p0.readInt())? true: false;
       this.d = b;
       return;
    }
    public void SlidingPaneLayout$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.d);
    }
}
