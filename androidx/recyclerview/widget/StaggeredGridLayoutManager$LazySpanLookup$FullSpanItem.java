package androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;

public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable	// class@0008d2
{
    public int b;
    public int c;
    public int[] d;
    public boolean e;
    public static final Parcelable$Creator CREATOR;

    static {
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.CREATOR = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a();
    }
    public void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(){
       super();
    }
    public void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = p0.readInt();
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.e = b;
       int i = p0.readInt();
       if (i > 0) {
          int[] ointArray = new int[i];
          this.d = ointArray;
          p0.readIntArray(ointArray);
       }
       return;
    }
    public int a(int p0){
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem td = this.d;
       p0 = (td == null)? 0: td[p0];
       return p0;
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       return "FullSpanItem{mPosition="+this.b+", mGapDir="+this.c+", mHasUnwantedGapAfter="+this.e+", mGapPerSpan="+Arrays.toString(this.d)+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.e);
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem td = this.d;
       if (td != null && td.length > 0) {
          p0.writeInt(td.length);
          p0.writeIntArray(this.d);
       }else {
          p0.writeInt(0);
       }
       return;
    }
}
