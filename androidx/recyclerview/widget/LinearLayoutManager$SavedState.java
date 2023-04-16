package androidx.recyclerview.widget.LinearLayoutManager$SavedState;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager$SavedState$a;
import java.lang.Object;
import android.os.Parcel;

public class LinearLayoutManager$SavedState implements Parcelable	// class@000875
{
    public int b;
    public int c;
    public boolean d;
    public static final Parcelable$Creator CREATOR;

    static {
       LinearLayoutManager$SavedState.CREATOR = new LinearLayoutManager$SavedState$a();
    }
    public void LinearLayoutManager$SavedState(){
       super();
    }
    public void LinearLayoutManager$SavedState(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = p0.readInt();
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.d = b;
       return;
    }
    public void LinearLayoutManager$SavedState(LinearLayoutManager$SavedState p0){
       super();
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
    }
    public boolean a(){
       boolean b = (this.b >= null)? true: false;
       return b;
    }
    public void b(){
       this.b = -1;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.d);
    }
}
