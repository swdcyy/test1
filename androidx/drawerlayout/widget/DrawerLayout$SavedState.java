package androidx.drawerlayout.widget.DrawerLayout$SavedState;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;

public class DrawerLayout$SavedState extends AbsSavedState	// class@00073b
{
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public static final Parcelable$Creator CREATOR;

    static {
       DrawerLayout$SavedState.CREATOR = new DrawerLayout$SavedState$a();
    }
    public void DrawerLayout$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.d = 0;
       this.d = p0.readInt();
       this.e = p0.readInt();
       this.f = p0.readInt();
       this.g = p0.readInt();
       this.h = p0.readInt();
    }
    public void DrawerLayout$SavedState(Parcelable p0){
       super(p0);
       this.d = 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.d);
       p0.writeInt(this.e);
       p0.writeInt(this.f);
       p0.writeInt(this.g);
       p0.writeInt(this.h);
    }
}
