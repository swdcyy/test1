package androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a;
import java.lang.Object;
import android.os.Parcel;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.ArrayList;
import java.util.List;

public class StaggeredGridLayoutManager$SavedState implements Parcelable	// class@0008d5
{
    public int b;
    public int c;
    public int d;
    public int[] e;
    public int f;
    public int[] g;
    public List h;
    public boolean i;
    public boolean j;
    public boolean k;
    public static final Parcelable$Creator CREATOR;

    static {
       StaggeredGridLayoutManager$SavedState.CREATOR = new StaggeredGridLayoutManager$SavedState$a();
    }
    public void StaggeredGridLayoutManager$SavedState(){
       super();
    }
    public void StaggeredGridLayoutManager$SavedState(Parcel p0){
       int[] ointArray;
       super();
       this.b = p0.readInt();
       this.c = p0.readInt();
       boolean i = p0.readInt();
       this.d = i;
       if (i > 0) {
          ointArray = new int[i];
          this.e = ointArray;
          p0.readIntArray(ointArray);
       }
       i = p0.readInt();
       this.f = i;
       if (i > 0) {
          ointArray = new int[i];
          this.g = ointArray;
          p0.readIntArray(ointArray);
       }
       boolean b = false;
       i = (p0.readInt() == 1)? true: false;
       this.i = i;
       i = (p0.readInt() == 1)? true: false;
       this.j = i;
       if (p0.readInt() == 1) {
          b = true;
       }
       this.k = b;
       this.h = p0.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
       return;
    }
    public void StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState p0){
       super();
       this.d = p0.d;
       this.b = p0.b;
       this.c = p0.c;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.h = p0.h;
    }
    public void a(){
       this.e = null;
       this.d = 0;
       this.b = -1;
       this.c = -1;
    }
    public void b(){
       this.e = null;
       this.d = 0;
       this.f = 0;
       this.g = null;
       this.h = null;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.d);
       if (this.d > null) {
          p0.writeIntArray(this.e);
       }
       p0.writeInt(this.f);
       if (this.f > null) {
          p0.writeIntArray(this.g);
       }
       p0.writeInt(this.i);
       p0.writeInt(this.j);
       p0.writeInt(this.k);
       p0.writeList(this.h);
       return;
    }
}
