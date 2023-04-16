package androidx.viewpager.widget.ViewPager$SavedState;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.Object;
import android.os.Parcelable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class ViewPager$SavedState extends AbsSavedState	// class@000a10
{
    public int d;
    public Parcelable e;
    public ClassLoader f;
    public static final Parcelable$Creator CREATOR;

    static {
       ViewPager$SavedState.CREATOR = new ViewPager$SavedState$a();
    }
    public void ViewPager$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       if (p1 == null) {
          p1 = this.getClass().getClassLoader();
       }
       this.d = p0.readInt();
       this.e = p0.readParcelable(p1);
       this.f = p1;
       return;
    }
    public void ViewPager$SavedState(Parcelable p0){
       super(p0);
    }
    public String toString(){
       return "FragmentPager.SavedState{"+Integer.toHexString(System.identityHashCode(this))+" position="+this.d+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.d);
       p0.writeParcelable(this.e, p1);
    }
}
