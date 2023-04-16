package androidx.appcompat.widget.Toolbar$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.appcompat.widget.Toolbar$SavedState;
import java.lang.ClassLoader;

public class Toolbar$SavedState$a implements Parcelable$ClassLoaderCreator	// class@00062c
{

    public void Toolbar$SavedState$a(){
       super();
    }
    public Toolbar$SavedState a(Parcel p0){
       return new Toolbar$SavedState(p0, null);
    }
    public Toolbar$SavedState b(Parcel p0,ClassLoader p1){
       return new Toolbar$SavedState(p0, p1);
    }
    public Toolbar$SavedState[] c(int p0){
       Toolbar$SavedState[] savedStateAr = new Toolbar$SavedState[p0];
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
