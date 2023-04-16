package androidx.appcompat.widget.AppCompatSpinner$SavedState;
import android.view.View$BaseSavedState;
import androidx.appcompat.widget.AppCompatSpinner$SavedState$a;
import android.os.Parcel;
import android.os.Parcelable;

public class AppCompatSpinner$SavedState extends View$BaseSavedState	// class@0005ed
{
    public boolean b;
    public static final Parcelable$Creator CREATOR;

    static {
       AppCompatSpinner$SavedState.CREATOR = new AppCompatSpinner$SavedState$a();
    }
    public void AppCompatSpinner$SavedState(Parcel p0){
       super(p0);
       boolean b = (p0.readByte())? true: false;
       this.b = b;
       return;
    }
    public void AppCompatSpinner$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeByte((byte)this.b);
    }
}
