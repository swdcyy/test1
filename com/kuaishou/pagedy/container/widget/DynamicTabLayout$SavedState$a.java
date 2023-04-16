package com.kuaishou.pagedy.container.widget.DynamicTabLayout$SavedState$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout$SavedState;

public final class DynamicTabLayout$SavedState$a implements Parcelable$Creator	// class@000a72
{

    public void DynamicTabLayout$SavedState$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       DynamicTabLayout$SavedState savedState = PatchProxy.applyOneRefs(p0, this, DynamicTabLayout$SavedState$a.class, "1");
       if (savedState != PatchProxyResult.class) {
       }else {
          savedState = new DynamicTabLayout$SavedState(p0);
       }
       return savedState;
    }
    public Object[] newArray(int p0){
       DynamicTabLayout$SavedState[] savedStateAr = new DynamicTabLayout$SavedState[p0];
       return savedStateAr;
    }
}
