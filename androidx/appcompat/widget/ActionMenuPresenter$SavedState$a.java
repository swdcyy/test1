package androidx.appcompat.widget.ActionMenuPresenter$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;

public class ActionMenuPresenter$SavedState$a implements Parcelable$Creator	// class@0005c8
{

    public void ActionMenuPresenter$SavedState$a(){
       super();
    }
    public ActionMenuPresenter$SavedState a(Parcel p0){
       return new ActionMenuPresenter$SavedState(p0);
    }
    public ActionMenuPresenter$SavedState[] b(int p0){
       ActionMenuPresenter$SavedState[] savedStateAr = new ActionMenuPresenter$SavedState[p0];
       return savedStateAr;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
