package androidx.customview.view.AbsSavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.customview.view.AbsSavedState;
import java.lang.ClassLoader;
import android.os.Parcelable;
import java.lang.IllegalStateException;
import java.lang.String;

public final class AbsSavedState$a implements Parcelable$ClassLoaderCreator	// class@000733
{

    public void AbsSavedState$a(){
       super();
    }
    public AbsSavedState a(Parcel p0){
       return this.b(p0, null);
    }
    public AbsSavedState b(Parcel p0,ClassLoader p1){
       if (p0.readParcelable(p1) == null) {
          return AbsSavedState.c;
       }
       throw new IllegalStateException("superState must be null");
    }
    public AbsSavedState[] c(int p0){
       AbsSavedState[] uAbsSavedSta = new AbsSavedState[p0];
       return uAbsSavedSta;
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
