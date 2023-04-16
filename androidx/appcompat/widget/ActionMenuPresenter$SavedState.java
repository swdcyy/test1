package androidx.appcompat.widget.ActionMenuPresenter$SavedState;
import android.os.Parcelable;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState$a;
import java.lang.Object;
import android.os.Parcel;

public class ActionMenuPresenter$SavedState implements Parcelable	// class@0005c9
{
    public int b;
    public static final Parcelable$Creator CREATOR;

    static {
       ActionMenuPresenter$SavedState.CREATOR = new ActionMenuPresenter$SavedState$a();
    }
    public void ActionMenuPresenter$SavedState(){
       super();
    }
    public void ActionMenuPresenter$SavedState(Parcel p0){
       super();
       this.b = p0.readInt();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
    }
}
