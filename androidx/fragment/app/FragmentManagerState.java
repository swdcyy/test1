package androidx.fragment.app.FragmentManagerState;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManagerState$a;
import java.lang.Object;
import android.os.Parcel;
import androidx.fragment.app.FragmentState;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import androidx.fragment.app.BackStackState;
import java.lang.String;
import java.util.List;

public final class FragmentManagerState implements Parcelable	// class@000793
{
    public ArrayList b;
    public ArrayList c;
    public BackStackState[] d;
    public String e;
    public int f;
    public static final Parcelable$Creator CREATOR;

    static {
       FragmentManagerState.CREATOR = new FragmentManagerState$a();
    }
    public void FragmentManagerState(){
       super();
       this.e = null;
    }
    public void FragmentManagerState(Parcel p0){
       super();
       this.e = null;
       this.b = p0.createTypedArrayList(FragmentState.CREATOR);
       this.c = p0.createStringArrayList();
       this.d = p0.createTypedArray(BackStackState.CREATOR);
       this.e = p0.readString();
       this.f = p0.readInt();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeTypedList(this.b);
       p0.writeStringList(this.c);
       p0.writeTypedArray(this.d, p1);
       p0.writeString(this.e);
       p0.writeInt(this.f);
    }
}
