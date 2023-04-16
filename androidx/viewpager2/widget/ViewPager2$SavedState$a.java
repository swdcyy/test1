package androidx.viewpager2.widget.ViewPager2$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.viewpager2.widget.ViewPager2$SavedState;
import java.lang.ClassLoader;
import android.os.Build$VERSION;

public final class ViewPager2$SavedState$a implements Parcelable$ClassLoaderCreator	// class@000a2c
{

    public void ViewPager2$SavedState$a(){
       super();
    }
    public ViewPager2$SavedState a(Parcel p0){
       return this.b(p0, null);
    }
    public ViewPager2$SavedState b(Parcel p0,ClassLoader p1){
       ViewPager2$SavedState savedState = (Build$VERSION.SDK_INT >= 24)? new ViewPager2$SavedState(p0, p1): new ViewPager2$SavedState(p0);
       return savedState;
    }
    public ViewPager2$SavedState[] c(int p0){
       ViewPager2$SavedState[] savedStateAr = new ViewPager2$SavedState[p0];
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
