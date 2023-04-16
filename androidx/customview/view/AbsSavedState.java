package androidx.customview.view.AbsSavedState;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState$1;
import androidx.customview.view.AbsSavedState$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.IllegalArgumentException;
import java.lang.String;

public abstract class AbsSavedState implements Parcelable	// class@000734
{
    public final Parcelable b;
    public static final Parcelable$Creator CREATOR;
    public static final AbsSavedState c;

    static {
       AbsSavedState.c = new AbsSavedState$1();
       AbsSavedState.CREATOR = new AbsSavedState$a();
    }
    public void AbsSavedState(){
       super();
       this.b = null;
    }
    public void AbsSavedState(Parcel p0){
       super(p0, null);
    }
    public void AbsSavedState(Parcel p0,ClassLoader p1){
       super();
       Parcelable parcelable = p0.readParcelable(p1);
       if (parcelable != null) {
       }else {
          parcelable = AbsSavedState.c;
       }
       this.b = parcelable;
       return;
    }
    public void AbsSavedState(Parcelable p0){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("superState must not be null");
       }
       if (p0 == AbsSavedState.c) {
          p0 = null;
       }
       this.b = p0;
       return;
    }
    public void AbsSavedState(AbsSavedState$1 p0){
       super();
    }
    public final Parcelable a(){
       return this.b;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.b, p1);
    }
}
