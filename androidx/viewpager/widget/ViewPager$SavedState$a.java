package androidx.viewpager.widget.ViewPager$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.viewpager.widget.ViewPager$SavedState;
import java.lang.ClassLoader;

public final class ViewPager$SavedState$a implements Parcelable$ClassLoaderCreator	// class@000a0f
{

    public void ViewPager$SavedState$a(){
       super();
    }
    public ViewPager$SavedState a(Parcel p0){
       return new ViewPager$SavedState(p0, null);
    }
    public ViewPager$SavedState b(Parcel p0,ClassLoader p1){
       return new ViewPager$SavedState(p0, p1);
    }
    public ViewPager$SavedState[] c(int p0){
       ViewPager$SavedState[] savedStateAr = new ViewPager$SavedState[p0];
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
