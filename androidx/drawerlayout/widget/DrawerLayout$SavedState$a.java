package androidx.drawerlayout.widget.DrawerLayout$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import java.lang.ClassLoader;

public final class DrawerLayout$SavedState$a implements Parcelable$ClassLoaderCreator	// class@00073a
{

    public void DrawerLayout$SavedState$a(){
       super();
    }
    public DrawerLayout$SavedState a(Parcel p0){
       return new DrawerLayout$SavedState(p0, null);
    }
    public DrawerLayout$SavedState b(Parcel p0,ClassLoader p1){
       return new DrawerLayout$SavedState(p0, p1);
    }
    public DrawerLayout$SavedState[] c(int p0){
       DrawerLayout$SavedState[] savedStateAr = new DrawerLayout$SavedState[p0];
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
