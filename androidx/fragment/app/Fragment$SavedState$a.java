package androidx.fragment.app.Fragment$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.fragment.app.Fragment$SavedState;
import java.lang.ClassLoader;

public final class Fragment$SavedState$a implements Parcelable$ClassLoaderCreator	// class@000778
{

    public void Fragment$SavedState$a(){
       super();
    }
    public Fragment$SavedState a(Parcel p0){
       return new Fragment$SavedState(p0, null);
    }
    public Fragment$SavedState b(Parcel p0,ClassLoader p1){
       return new Fragment$SavedState(p0, p1);
    }
    public Fragment$SavedState[] c(int p0){
       Fragment$SavedState[] savedStateAr = new Fragment$SavedState[p0];
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
