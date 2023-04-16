package androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a implements Parcelable$Creator	// class@0008d1
{

    public void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a(){
       super();
    }
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem a(Parcel p0){
       return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(p0);
    }
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] b(int p0){
       StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] lazySpanLook = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[p0];
       return lazySpanLook;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
