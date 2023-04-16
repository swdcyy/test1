package androidx.appcompat.widget.AppCompatSpinner$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;

public class AppCompatSpinner$SavedState$a implements Parcelable$Creator	// class@0005ec
{

    public void AppCompatSpinner$SavedState$a(){
       super();
    }
    public AppCompatSpinner$SavedState a(Parcel p0){
       return new AppCompatSpinner$SavedState(p0);
    }
    public AppCompatSpinner$SavedState[] b(int p0){
       AppCompatSpinner$SavedState[] savedStateAr = new AppCompatSpinner$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
