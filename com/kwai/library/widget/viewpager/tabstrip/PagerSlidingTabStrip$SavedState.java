package com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$SavedState;
import android.view.View$BaseSavedState;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$SavedState$a;
import android.os.Parcel;
import android.os.Parcelable;

public class PagerSlidingTabStrip$SavedState extends View$BaseSavedState	// class@000a89
{
    public int b;
    public static final Parcelable$Creator CREATOR;

    static {
       PagerSlidingTabStrip$SavedState.CREATOR = new PagerSlidingTabStrip$SavedState$a();
    }
    public void PagerSlidingTabStrip$SavedState(Parcel p0){
       super(p0);
       this.b = p0.readInt();
    }
    public void PagerSlidingTabStrip$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.b);
    }
}
