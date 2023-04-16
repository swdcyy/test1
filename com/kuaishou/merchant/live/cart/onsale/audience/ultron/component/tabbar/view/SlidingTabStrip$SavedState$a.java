package com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.component.tabbar.view.SlidingTabStrip$SavedState;

public class SlidingTabStrip$SavedState$a implements Parcelable$Creator	// class@00198d
{

    public void SlidingTabStrip$SavedState$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       SlidingTabStrip$SavedState savedState = PatchProxy.applyOneRefs(p0, this, SlidingTabStrip$SavedState$a.class, "1");
       if (savedState != PatchProxyResult.class) {
       }else {
          savedState = new SlidingTabStrip$SavedState(p0);
       }
       return savedState;
    }
    public Object[] newArray(int p0){
       SlidingTabStrip$SavedState[] savedStateAr = new SlidingTabStrip$SavedState[p0];
       return savedStateAr;
    }
}
