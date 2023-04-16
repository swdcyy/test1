package androidx.appcompat.widget.Toolbar$SavedState;
import androidx.customview.view.AbsSavedState;
import androidx.appcompat.widget.Toolbar$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;

public class Toolbar$SavedState extends AbsSavedState	// class@00062d
{
    public int d;
    public boolean e;
    public static final Parcelable$Creator CREATOR;

    static {
       Toolbar$SavedState.CREATOR = new Toolbar$SavedState$a();
    }
    public void Toolbar$SavedState(Parcel p0){
       super(p0, null);
    }
    public void Toolbar$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.d = p0.readInt();
       boolean b = (p0.readInt())? true: false;
       this.e = b;
       return;
    }
    public void Toolbar$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.d);
       p0.writeInt(this.e);
    }
}
