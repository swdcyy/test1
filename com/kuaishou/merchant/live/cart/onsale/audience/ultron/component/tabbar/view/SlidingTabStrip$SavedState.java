package com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$SavedState;
import android.view.View$BaseSavedState;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$SavedState$a;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class SlidingTabStrip$SavedState extends View$BaseSavedState	// class@00198e
{
    public int b;
    public static final Parcelable$Creator CREATOR;

    static {
       SlidingTabStrip$SavedState.CREATOR = new SlidingTabStrip$SavedState$a();
    }
    public void SlidingTabStrip$SavedState(Parcel p0){
       super(p0);
       this.b = p0.readInt();
    }
    public void SlidingTabStrip$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(SlidingTabStrip$SavedState.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, SlidingTabStrip$SavedState.class, "1")) {
          return;
       }
       super.writeToParcel(p0, p1);
       p0.writeInt(this.b);
       return;
    }
}
