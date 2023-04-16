package com.kuaishou.live.widget.page2.ViewPager2$SavedState;
import android.view.View$BaseSavedState;
import com.kuaishou.live.widget.page2.ViewPager2$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class ViewPager2$SavedState extends View$BaseSavedState	// class@00102b
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewPager2$SavedState.class, "1")) {
          return;
       }
       this.b = p0.readInt();
       this.c = p0.readInt();
       this.d = p0.readParcelable(p1);
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(ViewPager2$SavedState.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ViewPager2$SavedState.class, "2")) {
          return;
       }
       super.writeToParcel(p0, p1);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeParcelable(this.d, p1);
       return;
    }
}
