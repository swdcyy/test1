package com.kuaishou.pagedy.container.widget.DynamicTabLayout$SavedState;
import android.view.View$BaseSavedState;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout$SavedState$a;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class DynamicTabLayout$SavedState extends View$BaseSavedState	// class@000a73
{
    public int b;
    public static final Parcelable$Creator CREATOR;

    static {
       DynamicTabLayout$SavedState.CREATOR = new DynamicTabLayout$SavedState$a();
    }
    public void DynamicTabLayout$SavedState(Parcel p0){
       super(p0);
       this.b = p0.readInt();
    }
    public void DynamicTabLayout$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(DynamicTabLayout$SavedState.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, DynamicTabLayout$SavedState.class, "1")) {
          return;
       }
       super.writeToParcel(p0, p1);
       p0.writeInt(this.b);
       return;
    }
}
