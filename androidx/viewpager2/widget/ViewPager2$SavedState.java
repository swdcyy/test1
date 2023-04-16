package androidx.viewpager2.widget.ViewPager2$SavedState;
import android.view.View$BaseSavedState;
import androidx.viewpager2.widget.ViewPager2$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;

public class ViewPager2$SavedState extends View$BaseSavedState	// class@000a2d
{
    public int b;
    public int c;
    public Parcelable d;
    public static final Parcelable$Creator CREATOR;

    static {
       ViewPager2$SavedState.CREATOR = new ViewPager2$SavedState$a();
    }
    public void ViewPager2$SavedState(Parcel p0){
       super(p0);
       this.a(p0, null);
    }
    public void ViewPager2$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.a(p0, p1);
    }
    public void ViewPager2$SavedState(Parcelable p0){
       super(p0);
    }
    public final void a(Parcel p0,ClassLoader p1){
       this.b = p0.readInt();
       this.c = p0.readInt();
       this.d = p0.readParcelable(p1);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeParcelable(this.d, p1);
    }
}
